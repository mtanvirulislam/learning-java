package threads.exercises.ejerciciosA_2_AdivinarNum;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorNumeros {
	public static void main(String[] args) {
		// Puerto de escucha
		int port = 8989;

		// Inicia un socket escuchando en el puerto dado
		// Crea una hebra para atender cada petición
		try {
			ServerSocket socketServer = new ServerSocket(port);
			System.out.println("Servidor Iniciado .. !!\n");
			while (true) {
				HebraServidor h = new HebraServidor(socketServer.accept());
				h.start();
			}
		} catch (IOException e) {
			System.err.println("Error al escuchar en el puerto " + port);
		}
	}
}

class HebraServidor extends Thread {
	private Socket socketServicio;
	private BufferedReader inReader;
	private PrintWriter outPrinter;

	// Constructor de una hebra, dado un socket.
	HebraServidor(Socket socketServicio) {
		this.socketServicio = socketServicio;

		// Obtiene los flujos de escritura/lectura
		try {
			InputStreamReader isr = new InputStreamReader(socketServicio.getInputStream());
			inReader = new BufferedReader(isr);
			outPrinter = new PrintWriter(socketServicio.getOutputStream(), true);
		} catch (IOException e) {
			System.err.println("Error al leer los flujos.");
		}
	}

	public void run() {
		Adivina adivinador = new Adivina();
		Boolean finalizado = false;

		while (!finalizado) {
			// Lee un intento del cliente
			int resultado = 0;

			try {
				int datoRecibido = Integer.parseInt(inReader.readLine());
				System.out.println("El servidor ha recibido un intento del cliente: " + datoRecibido);
				resultado = adivinador.intento(datoRecibido);
				if (resultado == 0)
					System.out.println("El cliente ha acertado.");
			} catch (IOException e) {
				System.err.println("Error al leer los flujos.");
			}

			// Envía la respuesta del servidor
			outPrinter.println(resultado);
			finalizado = (resultado == 0);

			// Intenta adivinar al cliente
			if (!finalizado) {
				int estimacion = adivinador.estima();
				System.out.println("El servidor estima el numero: " + estimacion);
				outPrinter.println(estimacion);

				// Lee respuesta del cliente
				try {
					int respuesta = Integer.parseInt(inReader.readLine());

					switch (respuesta) {
					case Protocol.ACIERTO:
						System.out.println("Acierto del servidor");
						break;
					case Protocol.ESMAYOR:
						System.out.println("Error del servidor");
						break;
					case Protocol.ESMENOR:
						System.out.println("Error del servidor");
						break;
					}

					finalizado = (respuesta == Protocol.ACIERTO);
				} catch (IOException e) {
					System.err.println("Error al leer los flujos.");
				}
			}
		}
	}
}
