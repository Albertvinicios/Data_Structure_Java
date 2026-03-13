public class No { //classe utilizada para armazenar as informações e o ponteiro
    
    private Produto info; // inicial a informação pertence a classe produto, deve vir de lá
    private No proximo; //o proximo é o proximo da fila, ou seja, quando tem um valor, esse é o ponteiro
    //do próximo
    //o construtor padrão define
    public No (Produto produto) { //o no com parametro, recebendo a informação do produto
        info = produto; //e setando ela na info
    }
    public Produto getInfo() { //Método de pegar a informação da lista
        return info; //retornando ela
    }
    public No getProximo() { //método de pegar a referência do ponteiro
        return proximo; // retorna proximo
    }
    public void setProximo(No proximo) { //Método de setar para onde o ponteiro aponta
        this.proximo = proximo; //recebendo o próximo valor, recebendo parametro
    }
    @Override
    public String toString() {
        return "[" + info + "]"; //impressão da imformação do nó
    }
    
}
