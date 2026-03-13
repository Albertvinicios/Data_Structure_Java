public class FilaLigadaProdutos { //utiliza o sistema fifo, first in, first out
    //atributos que fazem refência ao nó, sendo o primeiro da lista e o último 
    private No primeiro; //ou seja o primeiro a entrar é o primeiro a sair
    private No ultimo; //o último a entrar, é o último a sair
    //construtor padrão, instancia inicialmente como null, se não houver ninguém 
    //Método se está vazia
    public boolean estaVazia(){ //método que verifica se estivar vazia
        return primeiro==null; //se for null 
    }
    public void enfileirar (Produto produto) { //inserção de fim, recebe a informação do produto
        No novo = new No(produto); //cria um novo objeto e coloca o valor nele,e ele aponto para o nulo
        if (estaVazia()){ 
            primeiro = novo; //se estiver vazia, o primeiro vira ele
    
        }else{
            ultimo.setProximo(novo); //se não estiver vazia o proximo vai apontar para o novo
            ultimo = novo; //e o último recebe o novo
        }
    }

    public Produto desenfileirar () { //Método desinfilerar
        if (estaVazia()) return null; //se estiver vazia não tem o que desinfilerar
        Produto temp = primeiro.getInfo(); //se não inicia a variável temp pega o primeiro valor
        primeiro = primeiro.getProximo(); //o primeiro vai receber o próximo da lista
        if (primeiro == null) //se não tiver proximo, a lista acabou
            ultimo = null; //então o ultimo também é null
        return temp; //retornando o valor que foi retirado da fila
    }
    //Método para soma de estoque
    public int somaEstoque() {
    if (estaVazia()) return 0; //se estiver vazio, não tem estoque

    int soma = 0; // inteiro para contar
    No atual = primeiro; //o atual recebe o primeiro numero da lista

    while (atual != null) { //enquanto não for nulo percorre a lista
        Produto p = atual.getInfo(); //o produto p salva a informação atual
        soma += p.getEstoque(); //e soma o estoque
        atual = atual.getProximo(); //e o atual passa para o próximo até chegar no nulo
        }
    return soma; //ao final devolve a soma
    }
    //Método para buscar por argumento
    public Produto buscarPorNome(String nome) { //passa o nome por parâmetro
    No atual = primeiro; // atual recebe o primeiro

    while (atual != null) { //enquanto não for nulo, vai percorrer para procurar
        if (atual.getInfo().getNome().equalsIgnoreCase(nome)) { //se a informação atual, o nome for igual a string passada
            return atual.getInfo();  //retorna a informação atual
        } //se não
        atual = atual.getProximo(); //vai para o próximo até encontrar
    } //ao final, se não encontrar
    return null; //retorna null, não encontrou o argumento.
}
    @Override 
    public String toString (){ //método de impressão
        if (estaVazia()) return "Nao chegou o carregamento"; //se está vazia não tem nada 
        String s = ""; //se não, atribui s
        No atual = primeiro; // e diz que o atual é igual ao primeiro, para percorrer sem falhar
        while (atual != null) { //enquanto o atual não chegar no ponteiro null
            s += atual.getInfo() + " -> "; //o s concatena com a informação do atual, ou da lista
            atual = atual.getProximo(); //e ela passa para o proximo, até chegar no nulo
        } //quando tiver percorrido tudo
        return s + "//"; //imprime essa informação com a seta e isso no final
    }
}