public class Lista {

    private No primeiro; //atributo primeiro valor
    //construtor é só o padrão
    //não teremos get e set, pois o atributo primeiro não é de interesse externo
    public boolean estaVazia() {
        return primeiro == null; // se estiver nulo está vazio
    }
    public void insereInicio (int info) { //para inserir no início da lista, semelhante ao push
        No novoNo = new No(info); //inicia um novo nó com a informação
        if (!estaVazia()) { //se não estiver vazia
            novoNo.setProximo(primeiro); //o novo no instancia o valor 
        }
        primeiro = novoNo; //se estiver vazia o primeiro recebe o valor direto
    }
    public int removeInicio () { //semelhante ao pop
        if (estaVazia()) return -1; //pode-se lançar uma excessão
        int temp = primeiro.getInfo(); // variável pega a informação do primeiro
        primeiro = primeiro.getProximo(); //e o primeiro aponta para próximo, fazendo a referencia do anterior se perder
        return temp; //retorna o valor do valor descartado
    }
    //Método de inserir Fim
    public void insereFim (int info) { //insere no final, diferente da pilha
        No novoNo = new No(info); //instancia um novo no com a informação
        if (estaVazia()) { // se estiver vazia
            primeiro = novoNo; // e o primeiro recebe esse valor, porque ele é inicio e fim
        }
        else { //se não
            No atual = primeiro; // o atual recebe o valor do primeiro, para percorrer sem danificar
            while (atual.getProximo() != null) { //vai até o último, enquanto não for nulo
                atual = atual.getProximo(); // ele vai passando para o próximo
            }
            atual.setProximo(novoNo); //quando o próximo for nulo, ele recebe o valor do novo nó com a informação
        }
    }
    //Método de remover Fim
    public int removeFim() { //para remover o fim
        if (estaVazia()) { //se estiver vazia é impossível
            return -1; //retorna -1 ou excessão
        }
        else if (primeiro.getProximo() == null) {//tem um só
            int temp = primeiro.getInfo(); //inicia uma variável que pega a informação
            primeiro = null; //seta a lista para nula, caso tenha um só
            return temp; //esse valor é perdido
        }
        else { //se não, ou seja se tiver mais de 1
            No atual = primeiro; //inicia um no com valores do primeiro
            while (atual.getProximo().getProximo() != null) { //e enquanto o proximo do proximo for diferente de nulo
                atual = atual.getProximo(); // ele percorre
            }
            int temp = atual.getProximo().getInfo(); //quando chegar pega a o proximo e a informação
            atual.setProximo(null); //e seta o atual para nulo
            return temp; //retorna o valor perdido
        }
    }
    //Método de copia do vetor!.
    public Lista copia() {

    Lista nova = new Lista();// nova lista vazia
    if (estaVazia()) return nova;// se a original estiver vazia, retorna lista vazia

    No atual = this.primeiro;// percorre a original
    No ultimoNovo = null;// será usado para encadear a nova lista

    while (atual != null) {
        No novoNo = new No(atual.getInfo());// cria novo nó com o mesmo valor

        if (nova.estaVazia()) {  
            nova.primeiro = novoNo;// primeiro nó da nova lista
            ultimoNovo = novoNo;
        } else {
            ultimoNovo.setProximo(novoNo);// liga encadeamento na nova lista
            ultimoNovo = novoNo;// avança o último da nova
        }
        atual = atual.getProximo();// avança na lista original
    }
    return nova;
    }
    //Método de busca de valor na lista
    public int buscaValor(int x) {
    No atual = primeiro; // o atual recebe o primeiro da lista
    int indice = 0; //e o índice inicia em 0, vai ser a referencia de busca

    while (atual != null) { //dura enquanto não chega no fim da lista
        if (atual.getInfo() == x) { //se o atual for igual a informação
            return indice;  // encontrou o valor retorna o indice
        } //se não
        atual = atual.getProximo(); //o atual recebe o próximo da lista
        indice++; //conta a posisão quando avança na lista
        }
    return -1; // não encontrou
    }

    public int contarApos(int x){ //método para contar quantos elementos existem após a posição do valor x 
        if(estaVazia()){  //se estiver vazia, não tem o que contar
            return 0; //retorna 0
        }else{ //se não
            int cont = 0; //inicia o contador em 0 
            int pos = 1; //na posição 1 do índice, ou seja, o primeiro elemento da lista
            No atual = primeiro;  //atual recebe o primeiro da lista para percorrer sem danificar o primeiro
            while(atual != null && pos < x){ //percorrer a lista até chegar na posição do valor x
            //ou seja, enquanto o atual for diferente de null e a posição for menor que x
                atual = atual.getProximo(); //é assim que passa para o próximo da lista.
                pos++; //a posição vai contando até chegar na posição do valor x
                //ou seja, o índice do valor x
            }
            if(atual == null){ //se passar do número desejado, a posição não existe.
                System.out.println("Posição maior do que a lista");
            }else{ //se não ela existe.
                atual = atual.getProximo(); //ai você tinha que lembrar de passar para o próximo da lista.
                while(atual != null){ //fazendo looping denovo.
                    atual = atual.getProximo(); 
                    ++cont; //e ai sim contando a posição
                }
            }
        return cont; //pra só aqui retornar.
        }
    }
    //Método de sobrescrever
    @Override
    public String toString (){
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
