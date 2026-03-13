public class Produto { //classe produto
    private int codigo; //produto vai ter código
    private String nome; //nome
    private int estoque; //e quantidade no estoque

    public Produto (int codigo, String nome) { //construtor do produto
        this.codigo = codigo; //com parametro inteiro codigo
        this.nome = nome; //e string nome
    }
    public int getCodigo() { //métodos padrões getters e setters
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
    @Override
    public String toString() {//método de impressão polimorifismo puro
        return "codigo=" + codigo + ", nome=" + nome + ", estoque=" + estoque;
    }
    public void atualizaEstoque (int valor) { //método para atualizar a quantidade de estoque
        if (estoque + valor < 0) // se o estoque + o valor adicionado for menor que 0
            estoque = 0; //o estoque é 0
        else //se não
            estoque = estoque + valor;//o estoque atualiza somando com valor;
    }
}