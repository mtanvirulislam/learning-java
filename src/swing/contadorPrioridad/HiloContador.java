package swing.contadorPrioridad;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tanvir
 */
public class HiloContador implements Runnable {

    private Numero numero;
    private String nombre;
    private Thread thread;
    private boolean parar;

    public HiloContador(Numero n, String nombre) {
        this.numero = n;
        this.nombre = nombre;
        this.parar = false;
        this.thread = new Thread(this, nombre);
        thread.setPriority(Thread.NORM_PRIORITY);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    public void setParar(boolean parar) {
        this.parar = parar;
    }
    
    
    
    @Override
    public void run() {
        while (true) {
            if (parar==false) {
                numero.ponerNumero(nombre);
            }else{
                Thread.currentThread().interrupt();
            }
        }
    }

}

class Numero {

    private Boolean _iniciar;
    private int numero;
    private final JLabel jLabel;

    public Numero(JLabel jl) {
        this.numero = 0;
        this.jLabel = jl;
        this._iniciar = false;
    }

    public Boolean getIniciar() {
        return _iniciar;
    }

    public void setIniciar(Boolean _iniciar) {
        this._iniciar = _iniciar;
    }

    public synchronized void ponerNumero(String n) {
        try {
            while (!_iniciar) {
                wait();
            }
            jLabel.setText("" + numero);

            numero++;
        } catch (InterruptedException ex) {
            Logger.getLogger(Numero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized void iniciar() {
        _iniciar = true;
        notify();
    }

    public void parar() {
        _iniciar = false;
    }

}
