package Quest1;

public class Velho extends Imovel {
    private double desconto;

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getPrecoComDesconto() {
        return getPreco() - desconto;
    }

    public void imprimeDesconto() {
        System.out.println("Desconto no preço: R$ " + desconto);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public void imprimeInformacoes() {
        super.imprimeInformacoes();
        System.out.println("Preço com desconto: R$ " + getPrecoComDesconto());
    }
}

