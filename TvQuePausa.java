
package Bridge;

/**
 *
 * @author 0038181
 */
public class TvQuePausa extends ControleRemoto{

    private boolean pausada = false;
    
    public void unPause(){
        pausada = false;
    }
    public TvQuePausa(Dispositivo novo_) {
        super(novo_);
    }
    
    public void botaoNove(){
        System.out.println("TV Pausada!");
        pausada = true;
    }
}
