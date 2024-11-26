package Quest1;

public class Novo extends Imovel {
    private double adicional;

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public double getPrecoComAdicional() {
        return getPreco() + adicional;
    }

    public void imprimeAdicional() {
        System.out.println("Adicional no preço: R$ " + adicional);
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public void imprimeInformacoes() {
        super.imprimeInformacoes();
        System.out.println("Preço com adicional: R$ " + getPrecoComAdicional());
    }
}

