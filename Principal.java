package Bridge;

/**
 *
 * @author 0038181
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleRemoto tv1 = new TvQueFicaMuda(new TV(1, 100));
        ControleRemoto tv2 = new TvQuePausa(new TV(1, 200));
        ControleRemoto blueRayControle = new TvQueFicaMuda(new BlueRay(1, 10));
        ControleRemoto playStationControle = new TvQuePausa(new PlayStation(1, 5));

        System.out.println("Testando a TV que fica muda");
        tv1.botaoCinco();
        tv1.botaoSeis();
        tv1.botaoNove();
        
        System.out.println("Testando a TV que pausa");
        tv2.botaoCinco();
        tv2.botaoSeis();
        tv2.botaoNove();      
        

        System.out.println("Testando o BlueRay com controle que fica mudo");
        blueRayControle.botaoCinco();
        blueRayControle.botaoSeis();
        blueRayControle.botaoNove();

        System.out.println("Testando o PlayStation com controle que pausa");
        playStationControle.botaoCinco();
        playStationControle.botaoSeis();
        playStationControle.botaoNove();
    }

}
