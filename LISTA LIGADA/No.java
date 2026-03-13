public class No {
    private int info; //construtor do no tem info
    private No proximo; //e o proximo valor
    //só construímos um nó se for para armazenar uma informação
    public No (int info) { //construtor recebe a informação
        this.info = info; //e seta no nó
        this.proximo = null; //por clareza, o próximo ainda é null
    }
    public int getInfo() { //pega informação do nó
        return info;
    }
    public void setInfo(int info) { //seta informação do no
        this.info = info;
    }
    public No getProximo() { //pega o valor do próximo 
        return proximo; //no final estará null
    }
    public void setProximo(No proximo) { //seta o valor do proximo
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        return "[ " + info + " ]"; //Método de impressão
    }
}
