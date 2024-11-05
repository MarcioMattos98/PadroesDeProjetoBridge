
package Bridge;

/**
 *
 * @author 0038181
 */
public class TvQueFicaMuda extends ControleRemoto {
    private boolean mute;
    
    private void unMute(){
        mute = false;
    }
    
    public TvQueFicaMuda(Dispositivo _disp){
        super(_disp);
    }

    @Override
    public void botaoNove() {
        System.out.println("TV ficou muda!");
        mute = true;
    }
}
