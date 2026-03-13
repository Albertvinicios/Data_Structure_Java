public class No { //classe no criada relacionando com a pilha
    private int info; //atributo de informação e o próximo
    private No proximo; //Próximo pertence a classe No
    //só construímos um nó se for para armazenar uma informação
    public No (int info) { //Construtor diferente do padrão recebe a informação
        this.info = info; //e seta
        this.proximo = null; //por clareza o próximo recebe valor null, ou vazio
    }
    public int getInfo() { //getters and setters
        return info;     // pega informação
    }
    public void setInfo(int info) { //seta a informação
        this.info = info;
    }
    public No getProximo() { //pega o próximo
        return proximo; 
    }
    public void setProximo(No proximo) { //seta o próximo, define diferente de null
        this.proximo = proximo; //recebe o novo valor
    }
    @Override
    public String toString() {
        return "[ " + info + " ]"; //imprime a informação.
    }
}
