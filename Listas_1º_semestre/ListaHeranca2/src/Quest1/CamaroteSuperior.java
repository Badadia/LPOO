package Quest1;

public class CamaroteSuperior extends VIP {
    private double valorAdicionalSuperior;

    public CamaroteSuperior(double valor, double valorAdicional, double valorAdicionalSuperior) {
        super(valor, valorAdicional);
        this.valorAdicionalSuperior = valorAdicionalSuperior;
    }

    public double getValorCamaroteSuperior() {
        return getValorVIP() + valorAdicionalSuperior;
    }

    public double getValorAdicionalSuperior() {
        return valorAdicionalSuperior;
    }

    public void setValorAdicionalSuperior(double valorAdicionalSuperior) {
        this.valorAdicionalSuperior = valorAdicionalSuperior;
    }
}

