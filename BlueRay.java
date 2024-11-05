
package Bridge;


public class BlueRay extends Dispositivo {

    public BlueRay(int estado_, int maximo_) {
        estado = estado_;
        maximo = maximo_;
    }

    @Override
    public void botaoCinco() {
        System.out.println("Rebobinando o BlueRay");
        estado--;
    }

    @Override
    public void botaoSeis() {
        System.out.println("Avançando o BlueRay");
        estado++;
    }  
        
}
