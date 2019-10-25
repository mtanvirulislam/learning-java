package threads.exercises.ejerciciosA_1_Pro_Con;


public class Consumidor extends Thread{
	 private MonitorBuffer buffer;
	 private int id;
	 public Consumidor(int id, MonitorBuffer b) {
		 this.id = id;
		 buffer = b;
	 }
	 public void run() {
		 int numero; 
		 System.out.println("comienza consumidor " + id);
		 while(true){
			 numero = buffer.consumir();
			 System.out.println("Consumidor " + id +" saca" + numero);
			 try { 
				 sleep(2000);
			 } catch( InterruptedException e ) {;}
		 }
		 
		
	 }
}
