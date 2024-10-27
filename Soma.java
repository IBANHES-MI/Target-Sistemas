public class Soma {
    public static void main(String[] args) {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1;  
            SOMA = SOMA + K;  
        }

        // 77
        System.out.println(SOMA);
    }
}
