
package Bridge;

/**
 *
 * @author 0038181
 */
public abstract class ControleRemoto {
    private Dispositivo disp;
    
    public ControleRemoto(Dispositivo novo_){
        disp = novo_;
    }
    
    public void botaoCinco(){
        disp.botaoCinco();
    }
    
    public void botaoSeis(){
        disp.botaoSeis();
    }
    
    public void feedbackDispositivo(){
        disp.feedBackDispositivo();
    }
    
    public abstract void botaoNove();
}
