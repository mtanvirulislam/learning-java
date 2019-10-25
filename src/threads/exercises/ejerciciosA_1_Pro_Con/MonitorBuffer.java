package threads.exercises.ejerciciosA_1_Pro_Con;
public class MonitorBuffer {
	private int buffer[] = new int[45];
	
	private int siguiente = 0;

	private static int consumidores = 0;
	public boolean producir = true;
	
	public synchronized int consumir() { // Método para consumir
		while(producir){ 
			try {
				wait();
			} catch( InterruptedException e ) {;}
		}
		
		siguiente--; 
		consumidores++; //
		if(consumidores == 5) {
			producir = true;
			consumidores  = 0;
			notify();
		}
	
		// Devuelve la letra al thread consumidor
		return( buffer[siguiente] );
	}
	
	public synchronized void producir(int numero) { // Método para producir
		while(!producir) { 
			try { 
				wait(); 
			} catch( InterruptedException e ) {;}
		}
		buffer[siguiente++] = numero; 
		notifyAll();
	}
	
	
}
