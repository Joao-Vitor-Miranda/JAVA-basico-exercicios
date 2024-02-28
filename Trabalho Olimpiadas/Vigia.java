import java.util.*;

public class Vigia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nESTACAO, nCOMANDOS, proxESTACAO;
        int comando = 1, cont = 0;

        System.out.println("Numeros de estação");
        nESTACAO = in.nextInt();
        System.out.println("Numeros de comandos");
        nCOMANDOS = in.nextInt();
        System.out.println("proxima estação de carregamento");
        proxESTACAO = in.nextInt();

        for (int i = 0; i < nCOMANDOS; i++) {
            if (comando == proxESTACAO) {
                cont++;
            }

            System.out.println("Insira um comando \n 1 - sentido horario\n-1 - sentido anti horario");
            comando += in.nextInt();

            if (comando > nESTACAO) {
                comando = 1;
            }
            if (comando == 0) {
                comando = nESTACAO;
            }
        }

        if (comando == proxESTACAO) {
            cont++;
        }

        System.out.println(cont);
        in.close();
    }
}
