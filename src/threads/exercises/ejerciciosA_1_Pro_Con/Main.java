package threads.exercises.ejerciciosA_1_Pro_Con;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int[] numImpares = {1,3,5,7,9};
		int[] numPares = {0,2,3,4,6,8};
		MonitorBuffer buffer = new MonitorBuffer();
		
		Productor prod1 = new Productor(1, buffer, numPares);
		Productor prod2 = new Productor(2, buffer, numImpares);
		Consumidor cons1 = new Consumidor(0, buffer);
		Consumidor cons2 = new Consumidor(1, buffer);
		Consumidor cons3 = new Consumidor(2, buffer);
		Consumidor cons4 = new Consumidor(3, buffer);
		Consumidor cons5 = new Consumidor(4, buffer);
		System.out.println("buffer inicializado");
		System.out.println("comienza el programa");
		
		cons1.start();
		cons2.start();
		cons3.start();
		cons4.start();
		cons5.start();
		
		prod1.start();
		prod2.start();
		cons1.join();
		cons2.join();
		cons3.join();
		cons4.join();
		cons5.join();
		
	}

}
