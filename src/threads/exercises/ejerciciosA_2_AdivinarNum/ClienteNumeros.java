package threads.exercises.ejerciciosA_2_AdivinarNum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteNumeros {
    private static int port = 8989;
    private static String host = "localhost";
    private static PrintWriter outPrinter;
    private static BufferedReader inReader;
    
    public static void main(String[] args) {
	try {
	    // Crea un socket y los flujos
	    Socket socketServicio = new Socket(host,port);
	    InputStreamReader isr = new InputStreamReader(socketServicio.getInputStream());
	    outPrinter = new PrintWriter(socketServicio.getOutputStream(), true);
	    inReader = new BufferedReader(isr);

	    // Empieza el juego
	    jugar();
	    
	    // Cierra el socket
	    socketServicio.close();
	}
	catch (UnknownHostException e) {
	    System.err.println("Error: Nombre de host no encontrado.");
	} catch (IOException e) {
	    System.err.println("Error de entrada/salida al abrir el socket.");
	}
    }

    public static void jugar() {
	Boolean finalizado = false;

	// Pide número al jugador
	Scanner in = new Scanner(System.in);
	System.out.println("Escribe tu numero: ");
	int num = in.nextInt();
	
	try {
	    while (!finalizado) {	    
		// Escribe intento del cliente
		System.out.println("Adivina al servidor: ");
		int n = in.nextInt();
		outPrinter.println(n);

		// Lee respuesta del servidor
		int respuesta = Integer.parseInt(inReader.readLine());
		switch (respuesta) {
		case Protocol.ACIERTO: System.out.println("�Acierto!"); break;
		case Protocol.ESMAYOR: System.out.println("El numero es mayor"); break;
		case Protocol.ESMENOR: System.out.println("El numero es menor"); break;
		}

		finalizado = (respuesta == Protocol.ACIERTO);

		if (!finalizado) {
		    // Lee predicción del servidor
		    int prediccion = Integer.parseInt(inReader.readLine());
		    System.out.println("El servidor ha hecho la prediccion: " + prediccion);
		    int resultado = Protocol.ACIERTO;
		    if (prediccion > num)
			resultado = Protocol.ESMAYOR;
		    if (prediccion < num)
			resultado = Protocol.ESMENOR;

		    // Envía respuesta
		    outPrinter.println(resultado);
		    if (resultado == Protocol.ACIERTO) {
			System.out.println("El servidor ha acertado el numero");
			finalizado = true;
		    }
		}
	    }
	}
	catch (IOException e) {
	    System.err.println("Error de lectura del cliente");
	}
    }
}
