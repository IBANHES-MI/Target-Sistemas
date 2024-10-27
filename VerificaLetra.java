import java.util.Scanner;

public class VerificaLetra {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String texto = scanner.nextLine();
        
        int contagemAMinusc = 0;
        int contagemAMajusc = 0;

      
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
     
            if (letra == 'a') {
                contagemAMinusc++;
            } else if (letra == 'A') {
                contagemAMajusc++;
            }
        }

       
        if (contagemAMinusc > 0 || contagemAMajusc > 0) {
            System.out.println("A letra 'a' minúscula aparece " + contagemAMinusc + " vez(es).");
            System.out.println("A letra 'A' maiúscula aparece " + contagemAMajusc + " vez(es).");
        } else {
            System.out.println("A letra 'a' não está presente na string.");
        }
        scanner.close();
    }
}
