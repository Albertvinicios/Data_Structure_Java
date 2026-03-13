public class Produto {//classe produto
    //Atributos
    private int codigo;//Código do produto  
    private String nome; //nome do produto
    private int estoque; //e quantidade de estoque
	
    public Produto (int codigo, String nome) { //Construtor do produto
        this.codigo = codigo; //recebe o codigo e atribui
        this.nome = nome; //recebe o nome e atribui
        //construtor de estoque padrao 0;
    }
    public int getCodigo() {  //método de pegar código
        return codigo;
    }
    public void setCodigo(int codigo) { //método de setar o código
        this.codigo = codigo;
    }
    public String getNome() { //método de pegar nome
        return nome;
    }
    public void setNome(String nome) { //e método de setar o nome
        this.nome = nome;
    }
    public int getEstoque() { //mentodo de pegar o estoque
        return estoque;
    }
    @Override
    public String toString() { //impressão do produto
        return "codigo=" + codigo + ", nome=" + nome + ", estoque=" + estoque;
    }
    public void atualizaEstoque (int valor) { //método de setar o estoque, com cálculos
        if (estoque + valor < 0) //recebe o valor, se o estoque mais o valor, for menor que 0
            this.estoque = 0; //o estoque é 0, ou seja se você digitar um número negativo ele joga 0
            //ou se subtrair mais do que existe no estoque ele retorna 0
        else //se não, ou seja se a soma for maior que 0
            estoque = estoque + valor;//o estoque atualiza com valor enviado + o estoque existe
    }
}