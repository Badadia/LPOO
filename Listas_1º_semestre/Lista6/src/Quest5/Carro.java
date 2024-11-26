package Quest5;

public class Carro {
    private double eficiencia;
    private double combustivel;

    public Carro(double eficiencia, double combustivel) {
        this.eficiencia = eficiencia;
        this.combustivel = combustivel;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(double eficiencia) {
        this.eficiencia = eficiencia;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public void Andar(double km){
        double gasto = km/eficiencia;
        if(gasto <= combustivel){
            this.combustivel -= gasto;
            System.out.println("Distância percorrida!");
            System.out.println("Combustivel restante: " + combustivel + " Litros");
        } else {
            System.out.println("Não é possivel percorrer essa distância! Reabasteça o carro!");
        }
    }

    public void Reabastecer(double litros){
        this.combustivel += litros;
        System.out.println("Combustivel atual: " + this.combustivel + " Litros");
    }
}
