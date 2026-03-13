public class No { //definição de nó, espaço da memoria para gravar informações
    //Atributos
    private int info; //informações inteiras
    private No proximo; //próximo aponta para null
    //só construímos um nó se for para armazenar uma informação
    public No (int info) { //construtor do nó
        this.info = info; //informação passada por parâmetro
        this.proximo = null; //por clareza
    }
    public int getInfo() { //métodos getters and setters padrão
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) { //direciona valor do próximo, para instância
        this.proximo = proximo; 
    }
    @Override
    public String toString() {
        return "[ " + info + " ]"; //impressão do nó
    }
}
