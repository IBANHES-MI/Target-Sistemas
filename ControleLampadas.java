import java.util.Random;

public class ControleLampadas {

    
    static class Lampada {
        private String nome;
        private boolean estado; 
        private boolean quente; 

        public Lampada(String nome) {
            this.nome = nome;
            this.estado = false; 
            this.quente = false; 
        }

        public String getNome() {
            return nome;
        }

        public boolean isEstado() {
            return estado;
        }

        public boolean isQuente() {
            return quente;
        }

        public void acender() {
            this.estado = true;
            this.quente = true; 
        }

        public void apagar() {
            this.estado = false;
            this.quente = false; 
        }

        public void esfriar() {
            this.quente = false; 
        }
    }

    
    static class Interruptor {
        private Lampada lampada;

        public Interruptor(Lampada lampada) {
            this.lampada = lampada;
        }

        public void ligar() {
            lampada.acender();
        }

        public void desligar() {
            lampada.apagar();
        }

        public Lampada getLampada() {
            return lampada;
        }
    }

    public static void main(String[] args) {
     
        Lampada lampada1 = new Lampada("Lâmpada 1");
        Lampada lampada2 = new Lampada("Lâmpada 2");
        Lampada lampada3 = new Lampada("Lâmpada 3");

      
        Interruptor interruptorA = new Interruptor(lampada1);
        Interruptor interruptorB = new Interruptor(lampada2);
        Interruptor interruptorC = new Interruptor(lampada3);


        System.out.println("Ligando o Interruptor A...");
        interruptorA.ligar();

        
        try {
            Thread.sleep(10); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       
        System.out.println("Desligando o Interruptor A e ligando o Interruptor B...");
        interruptorA.desligar();
        interruptorB.ligar();

        System.out.println("\nIndo até a sala das lâmpadas...\n");

        verificarLampadas(interruptorA, interruptorB, interruptorC);
    }

    public static void verificarLampadas(Interruptor interruptorA, Interruptor interruptorB, Interruptor interruptorC) {
  
        if (interruptorB.getLampada().isEstado()) {
            System.out.println(interruptorB.getLampada().getNome() + " está ACESA.");
        }

  
        if (!interruptorA.getLampada().isEstado() && interruptorA.getLampada().isQuente()) {
            System.out.println(interruptorA.getLampada().getNome() + " está APAGADA e QUENTE.");
        }

        if (!interruptorC.getLampada().isEstado()) {
            System.out.println(interruptorC.getLampada().getNome() + " está APAGADA e FRIA.");
        }
    }
}
