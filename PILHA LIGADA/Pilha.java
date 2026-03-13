public class Pilha {
    private No primeiro; //tem relacionamento entre a classe no e pilha , com atributo primeiro
    //sendo do tipo da classe no, ou seja herda os atributos de no que são info e primeiro.
    //construtor é só o padrão
    //não teremos get e set, pois o atributo primeiro não é de interesse externo
    //Assim como na pilha original também não tinha.
    public boolean estaVazia() { // verifica se está vazia
        return primeiro == null; //se o primeiro valor for nulo, retorna true
        //se não retorna falso, modo de comparação ternária
    }
    public void push (int info) { //pega a info do no
        No novoNo = new No(info); //cria um objeto da classe no que recebe a informação
        if (!estaVazia()) //se não estiver vazia
            novoNo.setProximo(primeiro); // a informação seta o valor do próximo o proximo fica nulo
        primeiro = novoNo; //e o primeiro recebe a informação.
    }
    public int pop () { //para desempilhar 
        if (estaVazia()) return -1; //se estiver vazia retorna -1 ou um excessão
        int temp = primeiro.getInfo(); //um valor inteiro recebe a informação do primeiro que é info, auxiliar
        primeiro = primeiro.getProximo(); //e o primeiro, pega a informação do próximo
        return temp; //retorna a informação do primeiro
    }
    @Override //Método de impressão
    public String toString () {
        String s = "";
        if (estaVazia()) s += "pilha vazia";
        else { //se não estiver vazia
            No atual = primeiro; //inicializa um objeto da classe NO e diz que é o primeiro já instanciado
            while (atual != null) { //enquanto for diferente de null, vai até o final da pilha
                s = s + atual + " -> "; // e imprime o valor do atual
                atual = atual.getProximo(); //e depois passa para o próximo, sem danificar o primeiro
            }
            s += "\\\\"; // para fins de design
        }
        return s + "\n"; 
    }
}
