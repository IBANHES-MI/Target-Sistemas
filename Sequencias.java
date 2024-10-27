public class Sequencias {
    public static void main(String[] args) {
        // Sequência a)
        int a = 1;
        System.out.print("a) ");
        for (int i = 0; i < 5; i++) {
            System.out.print(a + " ");
            a += 2; 
        }
        System.out.println(a); 

        // Sequência b)
        System.out.print("b) ");
        int b = 2;
        for (int i = 0; i < 6; i++) {
            System.out.print(b + " ");
            b *= 2; 
        }
        System.out.println(b); 

        // Sequência c)
        System.out.print("c) ");
        for (int i = 0; i < 7; i++) {
            System.out.print(i * i + " "); 
        }
        System.out.println(7 * 7); 

        // Sequência d)
        System.out.print("d) ");
        for (int i = 2; i <= 8; i += 2) {
            System.out.print(i * i + " "); 
        }
        System.out.println(10 * 10); 

        // Sequência e)
        System.out.print("e) ");
        int f1 = 1, f2 = 1;
        System.out.print(f1 + " " + f2 + " "); 
        for (int i = 2; i < 6; i++) {
            int f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
        System.out.println(f1 + f2); 

        // Sequência f)
        System.out.print("f) ");
        int[] seqF = {2, 10, 12, 16, 17, 18, 19};
        for (int num : seqF) {
            System.out.print(num + " ");
        }
        System.out.println(20); 
    }
}
