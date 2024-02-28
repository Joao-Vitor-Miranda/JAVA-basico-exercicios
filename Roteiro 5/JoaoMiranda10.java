import java.util.*;

public class JoaoMiranda10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int custo = 0, origem, destino = 0,Cidades;

        System.out.println("Numero de cidades do percuso:");
        Cidades = ler.nextInt();
        int[][] matPERCURSO = new int[Cidades][Cidades];
        int[] vetPERCURSO = new int[Cidades];

        int[][] matP = new int[Cidades][Cidades];
        int[] vetP = new int[Cidades];

        System.out.println("Insira o custo da rota:");
        for (int i = 0; i < matP.length; i++) {
            for (int j = 0; j < matP[i].length; j++) {
                System.out.print("  ");
                matP[i][j] = ler.nextInt();

            }
            System.out.println();
        }

        System.out.println("Insira a rota que o caminhão irá tomar: ");
        for (int i = 0; i < vetP.length; i++) {
            System.out.print("  ");
            vetPERCURSO[i] = ler.nextInt();

            if (vetPERCURSO[i] < 0 || vetP[i] > 3) {
                System.out.println("Valor fora do padrão!!!");
                System.exit(0);
            }
        }

        for (int i=1; i<Cidades; i++) {
            origem=destino;
            destino=vetP[i];
            custo+=matP[origem][destino];
        }

        System.out.println("Custos total do intinerario: " + custo);

    }
}
