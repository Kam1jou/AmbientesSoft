import java.util.Scanner;

class Festa {
    private String responsavel;
    private int numConvidados;
    private double custo;

    public Festa(String responsavel, int numConvidados, double custo) {
        this.responsavel = responsavel;
        this.numConvidados = numConvidados;
        this.custo = custo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getNumConvidados() {
        return numConvidados;
    }

    public void setNumConvidados(int numConvidados) {
        this.numConvidados = numConvidados;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    public void mostra() {
        System.out.println("Responsável: " + responsavel);
        System.out.println("Número de convidados: " + numConvidados);
        System.out.println("Custo: R$" + custo);
    }
}
    
