public class ListaDupla <E>{// chegamos no nosso desafio, lista dupla
    //a lista dupla contem um tipo generico E instanciado na classe No
    private No<E> primeiro; //o primeiro pertence a esse tipo generico também
    private No<E> ultimo; //e o último também padrão, a diferença é no ponteiro
    //construtor padrão
    public boolean estaVazia() { //se estiver vazia, retorna null
        return primeiro == null;
    }
    public void insereInicio(E elemento) { //método para inserção no início
        No<E> novo = new No<E>(elemento); //novo nó é criado, com mesmo tipo
        if (estaVazia()) { //se a lista está vazia
            ultimo = novo; //o último recebe o novo
            //e depois o primeiro vai receber também o novo valor
        }else { //se não está vazia
            novo.setProximo(primeiro); //atualiza os ponteiros, o novo aponta para o proximo com valor do primeiro
            primeiro.setAnterior(novo); //e o anterior aponta para o primeiro, recebendo o valor novo
        }
        primeiro = novo; //em ambos o primeiro recebe o novo nó
    }   
    public void insereFim(E elemento) { //para inserir no final
        No<E> novo = new No<E>(elemento); //cria-se  um novo nó que recebe o parâmetro
        if (estaVazia()) { //se estiver vazia 
            primeiro = novo; //o primeiro recebe o novo, e o último também
        }else{ //se não
            novo.setAnterior(ultimo); //atualiza os ponteiros o novo aponta para anterior com valor do ultimo
            ultimo.setProximo(novo); //e o ultimo aponta para o próximo recebendo o novo valor
        }
        ultimo = novo; //e no fim o ultimo recebe o no do novo em ambos os casos.
    }  
    public E removeInicio() {// método para remover no início 
        if (estaVazia()) return null; //se estiver vazia retorna null, não existe
        E temp = primeiro.getElemento(); //se não esta vazia, temp pega o valor do primeiro
        if (primeiro == ultimo) { //se o primeiro for igual ao último, ou seja só tem 1
            primeiro = null; //seta em nulo, ambos que o coletor libera o restante
            ultimo  = null; //tanto primeiro como último
        }else{ //se não
            primeiro = primeiro.getProximo(); //o primeiro aponta para o próximo
            primeiro.setAnterior(null); //e atualiza o ponteiro anterior como nulo
        }
        return temp; //retorna o valor retirado
    }
    public E removeFim() { //método para remover o final
        if (estaVazia()) return null; // se estiver vazia null
        E temp = ultimo.getElemento(); //se não a variável pega o ultimmo valor
        if (primeiro == ultimo) { //se o primeiro e o ultimo são o mesmo, só tem 1 nó
            primeiro = null; //a remoção seta os dois para nulo
            ultimo  = null; //primeiro e último
        }else{ //se não
            ultimo = ultimo.getAnterior(); //o último pega a posição anterior
            ultimo.setProximo(null); //e o próximo vira o fim
        }
        return temp; //retorna o valor retirado
    }
    public boolean contains (E elemento) { //método para verificar se o elemento está na lista
        if (estaVazia()) return false; //se estiver vazia retorna que não está, afinal nem tem lista
        No<E> runner = primeiro; // se não está vazia, variável recebe o valor do primeiro para percorrer
        while (runner != null) { //condição para percorrer a lista até o final para quando acha, se achar
            if (runner.getElemento().equals(elemento)) return true; //se o elemento que procura está na lista retorna true 
            runner = runner.getProximo(); //se não vai para o próximo
        } //se no final não encontrar
        return false; //retorna falso, não encontrou a condição
    }
    //Método para inverter a lista duplamente ligada
    public void inverter() {
    if (estaVazia() || primeiro == ultimo) return; //se esta vazia ou só tem um elemento
    //não existe lista para inverter
    //se nenhuma dessas condições
    No<E> atual = primeiro; //o atual recebe o primeiro da lista para percorrer
    No<E> temp = null; //variável recebe o null
    // percorre toda a lista trocando anterior <-> proximo
    while (atual != null) { //enquanto atual não chegar no nulo, percorre inteira
        temp = atual.getAnterior();// a variável temporaria recebe a posição anterior do atual
        atual.setAnterior(atual.getProximo());// troca de ponteiros o anterior vira o proximo
        atual.setProximo(temp);// e seta o valor do anterior no próximo
        atual = atual.getAnterior();// avança (antigo proximo) e o atual recebe o anterior novamente
    }

    // após a troca dos ponteiros, ajusta primeiro e ultimo
    temp = primeiro; //temp atualiza como primeiro
    primeiro = ultimo; // o primeiro como ultimo
    ultimo = temp; //e o ultimo como temp
    }
    @Override
    public String toString () {//método de impressão
        if (estaVazia()) return "lista vazia"; //se estiver vazia
        No<E> runner = primeiro; // variável de percorrer, recebendo a primeira posição da lista
        String s = "// - "; //concatenar o retorno
        while (runner != null) { //percorre a lista enquanto não chega no nulo
            s += runner.toString() + " - "; //imprime concatenando com os valores 
            runner = runner.getProximo(); //e avança para o próximo
        }
        s += "//"; //finalizando dessa forma 
        return s; //e retornando s
    }
}