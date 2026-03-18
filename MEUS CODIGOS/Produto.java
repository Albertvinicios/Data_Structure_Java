public class Produto { //Classe para representar um produto
//onde cada produto tem um código, um nome e um estoque
    //Atributos
    private int codigo;
    private String nome;
    private int estoque;

    public Produto (int codigo, String nome) { //construtor para inicializar o produto
    //onde o estoque é inicializado com 0
        this.codigo = codigo;
        this.nome = nome;
    }
    //Métodos getters and Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEstoque() {
        return estoque;
    }
    //Método de impressão
    @Override
    public String toString() {
        return "codigo=" + codigo + ", nome=" + nome + ", estoque=" + estoque;
    }
    //método de atualização de estoque, onde o valor pode ser positivo ou negativo
    //ou seja, pode ser uma entrada ou uma saída de estoque
    public void atualizaEstoque (int valor) {
        if (estoque + valor < 0)
            estoque = 0;
        else 
            estoque = estoque + valor;
    }
}