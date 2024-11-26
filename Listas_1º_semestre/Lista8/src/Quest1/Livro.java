package Quest1;

public class Livro {
    private String autor;
    private int cpf;
    private String endereco;
    private int cnpj;
    private String editora;
    private String enderecoEditora;
    private int telefone;
    private String isbn;
    private String titulo;
    private int ano;

    public Livro(String autor, int cpf, String endereco, int cnpj, String editora, String enderecoEditora, int telefone, String isbn, String titulo, int ano) {
        this.autor = autor;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.editora = editora;
        this.enderecoEditora = enderecoEditora;
        this.telefone = telefone;
        this.isbn = isbn;
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEnderecoEditora() {
        return enderecoEditora;
    }

    public void setEnderecoEditora(String enderecoEditora) {
        this.enderecoEditora = enderecoEditora;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void mostrar(){
        System.out.println("Autor: " + autor);
        System.out.println("Cpf: " + cpf);
        System.out.println("Endereco: " + endereco);
        System.out.println("Cnpj: " + cnpj);
        System.out.println("Editora: " + editora);
        System.out.println("EnderecoEditora: " + enderecoEditora);
        System.out.println("Telefone: " + telefone);
        System.out.println("Isbn: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano: " + ano);
    }
}
