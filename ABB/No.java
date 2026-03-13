public class No {
    //Atributos do nó da árvore binária
    private int info; //contendo a informação padrão
    private No esquerda; //porém os ponteiros são descritos como esquerda e direita
    private No direita; //de fato apontam para os lados em seu conceito, definindo maior e menor
    //seus construtores 
    public No (int info) {
        this.info = info;//a informação é setada normalmente
        //e seus ponteiros são nulls inicialmente
    }
    public No getEsquerda() { //metodos getters and setters normais
        return esquerda;
    }
    public void setEsquerda(No esquerda){ //set o valor a esquerda 
        this.esquerda = esquerda;
    }
    public No getDireita(){ //pegar ponteiro da direita
        return direita;
    }
    public void setDireita(No direita) { //seta o ponteito para direita
        this.direita = direita;
    }
    public int getInfo() { //pega a informação 
        return info;
    }
    @Override
    public String toString() {
        return "[" + info + "]"; //to string para imprimir informações do nó
    }
}

