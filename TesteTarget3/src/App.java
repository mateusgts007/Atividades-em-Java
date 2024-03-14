public class App {
    public static void main(String[] args) {
        // Sequência a)
        int proximoA = proximoElementoA(7);
        System.out.println("a) Próximo elemento: " + proximoA);

        // Sequência b)
        int proximoB = proximoElementoB(64);
        System.out.println("b) Próximo elemento: " + proximoB);

        // Sequência c)
        int proximoC = proximoElementoC(36);
        System.out.println("c) Próximo elemento: " + proximoC);

        // Sequência d)
        int proximoD = proximoElementoD(64);
        System.out.println("d) Próximo elemento: " + proximoD);

        // Sequência e)
        int proximoE = proximoElementoE(8);
        System.out.println("e) Próximo elemento: " + proximoE);

        // Sequência f)
        int proximoF = proximoElementoF(19);
        System.out.println("f) Próximo elemento: " + proximoF);
    }

    // Sequência a)
    public static int proximoElementoA(int ultimo) {
        return ultimo + 2;
    }

    // Sequência b)
    public static int proximoElementoB(int ultimo) {
        return ultimo * 2;
    }

    // Sequência c)
    public static int proximoElementoC(int ultimo) {
        int raiz = (int) Math.sqrt(ultimo);
        return (raiz + 1) * (raiz + 1);
    }

    // Sequência d)
    public static int proximoElementoD(int ultimo) {
        int raiz = (int) Math.sqrt(ultimo) + 1;
        return raiz * raiz;
    }

    // Sequência e)
    public static int proximoElementoE(int ultimo) {
        // Sequência de Fibonacci
        int anterior = 5;
        int atual = 8;
        while (atual <= ultimo) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual;
    }

    // Sequência f)
    public static int proximoElementoF(int ultimo) {
        return ultimo + 1;
    }
}
