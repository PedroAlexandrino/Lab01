public class Main {
    public static void main(String[] args){
    Impressora impressora1 = new Impressora(10);
     impressora1.impressao("Texto 1");
     impressora1.impressao("Texto 2");
     impressora1.impressao("Texto 3");
     impressora1.impressao("Texto 4");
     impressora1.impressao("Texto 5");
     System.out.println(impressora1.getCapacidadeTinteiro());
     System.out.println(impressora1.getImpressoesTinteiro());
        System.out.println(impressora1.totalImpressoes+"TotalImpress");
    }
}
