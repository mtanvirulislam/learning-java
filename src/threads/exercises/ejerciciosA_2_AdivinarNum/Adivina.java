package threads.exercises.ejerciciosA_2_AdivinarNum;
import java.util.Random;

public class Adivina {
    private Random rand = new Random();
    private int pensado = rand.nextInt(Protocol.MAXINT);

    public Adivina() {
	System.out.println("El servidor ha elegido el: " + pensado);
    }

    public int intento(int n) {
	if (n == pensado)
	    return Protocol.ACIERTO;
	else if (n < pensado)
	    return Protocol.ESMAYOR;
	return Protocol.ESMENOR;
    }

    public int estima() {
	return rand.nextInt(Protocol.MAXINT);
    }
}
