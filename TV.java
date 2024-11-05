
package Bridge;

/**
 *
 * @author 0038181
 */
public class TV extends Dispositivo{
    
    public TV(int estado_, int maximo_){
        estado = estado_;
        maximo = maximo_;
    }

    @Override
    public void botaoCinco() {
        System.out.println("Canal Down");
        estado--;
    }

    @Override
    public void botaoSeis() {
        System.out.println("Canal UP");
        estado++;
    }
}
