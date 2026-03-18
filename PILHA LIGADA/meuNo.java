public class meuNo {//classe para representar um nó de uma pilha ligada, onde cada nó tem um valor inteiro
//e um ponteiro para o próximo nó
    // Atributos
    public int info;
    public meuNo proxi;

    //Construtores
    public meuNo(){
        this.info = 0;//inicializa o valor do nó com 0, onde 0 é um valor padrão para um nó vazio
        this.proxi = null;//ponteiro para o próximo nó
        //onde null indica que não há próximo nó, ou seja, é o último nó da pilha
    }
    public meuNo(int i){
        this.info = i;
    }
    //Métodos getters and Setters
    public int getInfo(){
        return info;
    }
    public void setInfo(int i){
        this.info = i;
    }
    public meuNo getProxi(){
        return proxi;
    }
    public void setProxi(meuNo p){
        this.proxi = p;
    }
    //Método de impressão
    @Override
    public String toString() {
        return "[ " + info + " ]"; //imprime a informação.
    }
}
