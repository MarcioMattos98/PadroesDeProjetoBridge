
package Bridge;

/**
 *
 * @author 0038181
 */
public class PlayStation extends Dispositivo{

    public PlayStation(int estado_, int maximo_) {
        estado = estado_;
        maximo = maximo_;
    }

    @Override
    public void botaoCinco() {
        System.out.println("Iniciando um novo jogo no Play");
        estado--;
    }

    @Override
    public void botaoSeis() {
        System.out.println("Pausando o jogo no Play");
        estado++;
    }
    
    
    
}
