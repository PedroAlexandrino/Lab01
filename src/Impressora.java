import java.util.Scanner;

public class Impressora {
    public int capacidadeTinteiro;
    public int impressoesTinteiro;
    public int maximoImpressoes;
    public int tinteirosUtilizados;
    public int  totalImpressoes;

    public Impressora(int maximoImpressoes){
        this.maximoImpressoes = maximoImpressoes;
        this.capacidadeTinteiro = 5;
        this.tinteirosUtilizados++;
    }

    public void impressao(String texto){
        impressoesTinteiro++;
        System.out.println(texto);
        capacidadeTinteiro --;
        totalImpressoes++;
        System.out.println(impressoesTinteiro + "Impressoes Tinteiro");
        if(impressoesTinteiro<=capacidadeTinteiro){
            System.out.println(impressoesTinteiro + "Impressoes Tinteiro");
            System.out.println(capacidadeTinteiro + "Capacidade Tinteiro");
            System.out.println("Vai ser necessário trocar tinteiro");
            Scanner sn = new Scanner(System.in);
            int newCapacidade = sn.nextInt();
            trocaTinteiro(newCapacidade);
        }
    }

    public void trocaTinteiro(int capacidadeTinteiro){
        impressoesTinteiro=0;
        this.capacidadeTinteiro=capacidadeTinteiro;
        tinteirosUtilizados++;
    }


    public int getCapacidadeTinteiro() {
        return capacidadeTinteiro;
    }

    public void setCapacidadeTinteiro(int capacidadeTinteiro) {
        this.capacidadeTinteiro = capacidadeTinteiro;
    }

    public int getImpressoesTinteiro() {
        return impressoesTinteiro;
    }

    public void setImpressoesTinteiro(int impressoesTinteiro) {
        this.impressoesTinteiro = impressoesTinteiro;
    }

    public int getMaximoImpressoes() {
        return maximoImpressoes;
    }

    public void setMaximoImpressoes(int maximoImpressoes) {
        this.maximoImpressoes = maximoImpressoes;
    }
}
