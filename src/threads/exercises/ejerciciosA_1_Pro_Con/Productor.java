package threads.exercises.ejerciciosA_1_Pro_Con;


public class Productor extends Thread{
	private MonitorBuffer buffer;
	private int id;
	private int[] numeros;
	private int i = 0;

	public Productor(int id, MonitorBuffer buffer, int[] numeros){
		this.id = id; 
		this.buffer = buffer;
		this.numeros = numeros;
	}

	public void run() {
		try {
			sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("comienza productor " + id);
		while(i < numeros.length ) {
			System.out.println("productor " + id + " quiere poner " + numeros[i]);
			for(int z = 0; z < 5; z++){
				buffer.producir(numeros[i]);
			}
			
			buffer.producir = false;
			System.out.println("productor " + id + " escribe en el buffer" + numeros[i]);
			i++;
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		 
	}

}

