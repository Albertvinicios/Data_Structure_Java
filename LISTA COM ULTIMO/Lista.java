public class Lista {
    //Atributos
    private No primeiro;//nesse caso são dois apontadores o primeiro padrão ou inicio
    private No ultimo; //e o último para referencia de última posição

    //construtor é só o padrão
    //não teremos get e set, pois os atributos primeiro e último não são de interesse externo
    public boolean estaVazia() { //se estiver vazia retorna null
        return primeiro == null;
    }
    public void insereInicio (int info) { //para inserir no início
        No novoNo = new No(info); //cria novoNo com a informação
        if (estaVazia()) { //e se estiver vazia
            ultimo = novoNo; //o último recebe o valor do novo nó, e o primeiro também
        }
        else { //se não estiver vazia
            novoNo.setProximo(primeiro); //o próximo aponta para o novo nó e recebe o primeiro valor
        }
        primeiro = novoNo; //o primeiro recebe em ambos os casos, o valor do novo nó
    }
    public int removeInicio () { //para remover o início
        if (estaVazia()) return -1; //se estiver vazia retorna -1 ou exception, não tem como
        //se não
        int temp = primeiro.getInfo(); // varíavel salva o valor do primeiro
        primeiro = primeiro.getProximo(); //o primeiro pega o valor do próximo, assim o valor antigo perde referência
        if (estaVazia()) //se após remover, ela ficar vazia 
            ultimo = null; //o último fica nullo assim como primeiro
        return temp; //após a conclusão retorna o valor retirado, para apresentar.
    }
    public void insereFim (int info) { //Método para inserir no fim
        No novoNo = new No(info); //cria novoNo
        if (estaVazia()) //se estiver vazia 
            primeiro = novoNo; //o primeiro recebe o novo No, o último também
        ultimo = novoNo; //se não somente o último recebe o novoNo
    }
    public int removeFim() {//para remover no final
        if (estaVazia()) return -1; //se estiver vazia, retorna -1
        if (primeiro == ultimo) {//se não se o primeiro for == ao último, ou seja se só tiver 1 elemento na lista
            int temp = primeiro.getInfo(); // o valor inteiro salva a informação do primeiro
            primeiro = null; //nesse caso a lista fica vazia
            ultimo = null; //sendo setando primeiro null e ultimo null
            return temp; // e retornando o valor retirado
        }else { //se nenhuma dessas condições
            No atual = primeiro; // referencia atual salva o primeiro
            while (atual.getProximo().getProximo() != null) { //e percorre a lista, para pegar o penúltimo nó
                atual = atual.getProximo(); //quando o próximo do próximo for nulo
            }
            int temp = ultimo.getInfo(); // essa varíável pega a informação do último, pra ser limpa pela memoria
            ultimo = atual; //o último vira o penultimo, deixando o último para ser limpo
            atual.setProximo(null); //e atualizamo o ponteiro para último
            return temp; // retorna o valor que foi retirado
        }
    }
    //Método de inserção por referência 
    public void insereAntes(int info, int pos) {// método de inserir antes das posições desejadas
    No novo = new No(info); //cria um objeto para alocar a informação

    // Caso 1: inserir no início (posição 0 ou menor)
    if (pos <= 0 || estaVazia()) { //se a posição for menor que 0 ou está vazia
        if (estaVazia()) { //se estiver vazia
            primeiro = novo; //coloca o objeto no início
            ultimo = novo; //e o último também
        } else { //se não estiver vazia
            novo.setProximo(primeiro); //o ponteiro aponta para nova informação
            primeiro = novo; //e o primeiro recebe o novo nó com a info e o null
        }
        return; //e interrompe parando aqui
    } //se nenhuma das condições acima for satisfeita

    // Percorrer até a pos anterior a desejada ser encontrada ou até ficar nulo
    No atual = primeiro; //salva o primeiro valor
    No anterior = null; //não existe ainda
    int indice = 0; //inicia em 0 para contar as posições

    while (atual != null && indice < pos) { //enquanto o atual não for nulo, e o indice for menor que a posição
        anterior = atual; //e o valor anterior recebe o atual salva
        atual = atual.getProximo();//atual passa para o próximo, percorrendo a lista
        indice++; //e soma o quanto percorre,ou seja entra antes.
    } //para quando atingir a posição ou quando for null
    //após percorrer
    // Caso 2: inserir no meio
    if (atual != null) { //se o atual não for nulo,significa que a posição uma antes da desejada, foi encontrada
        anterior.setProximo(novo); //encontrou, então seta o valor na posição
        novo.setProximo(atual); //e o novo recebe o novo recebe a posição desejada
        return; //atualizando os ponteiros e inserindo no meio, para aqui
    }
    //se a posição desejada não foi alcançada, e chegamos no null, ou insere no último
    // Caso 3: inserir no fim (pos >= tamanho) //inserir no último
    ultimo.setProximo(novo); //caso a posição desejada seja maior que o tamanho
    ultimo = novo; //procura o último e seta ele com novo valor, e o ultimo recebe o novo
    //atualizando os ponteiros.
    }
      @Override
    public String toString () {
        String s = "";
        if (estaVazia()) s += "lista vazia";
        else {
            No atual = primeiro;
            while (atual != null) { //vai até o fim
                s = s + atual + " -> ";
                atual = atual.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }
}
