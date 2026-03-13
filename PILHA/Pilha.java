//implementação de pilhas utilizando vetor
public class Pilha {

    private int topo; // a pilha da professora contem
    private int[] v; //um topo e um vetor

    public Pilha () { //o primeiro contrutor sem parâmetros contem tamanho 10
        this(10);
    }
    public Pilha (int capacidade) { //o construtor com parâmetro
        topo = -1; //seta o topo em -1
        v = new int[capacidade]; //e você pode definir sua capacidade
    }
    public boolean estaVazia () { //sem getters e setters, fiz eles na minha
        return topo == -1; // Método está vazia se essa condição for verdadeira, está vazia
        //return topo == -1 ? true : false; //utilizando a estrutura de ternário intrisica
    }
    public boolean estacheia () { //se estiver cheia
        return topo == v.length - 1; //utiliza o ternário também e verifica se o topo está no máximo
    }
    public boolean push (int elemento) { //Método para colocar um elemento na pilha
        if (estacheia()){ //se estiver cheia
            return false; //não pode colocar
        }else{ //se não estiver cheia
            v[++topo] = elemento; //aumenta um elemento no topo e coloca o elemento, acrescenta primeiro
            return true; //retornando a condição verdadeira 
        }
    }

    public int pop() { //o pop é para tirar um elemento da pilha,
        int aux = v[topo--]; //o auxiliar recebe o vetor com um elemento a menos
        return aux; //retorna o vetor
    }
    public int tamanho () { //para saber o tamanho da pilha
        return topo+1; //retorna o topo +1
    }
    @Override //Método de impressão
    public String toString () { // toString 
        String s = ""; // inicializa o que será devolvido
        if (estaVazia()) s += "esta vazia\n"; //se estiver vazia, imprime s
        else //se não
            for (int i=topo; i>=0; i--) // looping de impressão do vetor pilha
                s += v[i] + "\n"; //após a impressão
        return s + "----------\n"; // retorna o obrigatório.
    }
}
