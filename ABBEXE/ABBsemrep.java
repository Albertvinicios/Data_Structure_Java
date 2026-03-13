package ABBEXE;

public class ABBsemrep {
    //Atributos
    private No raiz;
    //Lembremos que temos somente o construtor padrão

    //Métodos Funções
    public boolean estaVazia(){
        return raiz == null;
    }
    //insere o primeiro elemento da Arvore
    public void insere(int i){
        if(estaVazia()){
            raiz = new No(i);
        }else{
            insereRec(raiz, i);
        }
    }
    //utiliza recursão para verificar a posição e se vai para esquerda ou direita.
    private void insereRec(No atual, int i){
 
        if (i == atual.getInfo()) {// se o valor for igual
            atual.incrementaOcorrencias();//não cria um nó, e sim incrementa ocorrencia
            return; // não cria outro nó!!
        }

        if(i > atual.getInfo()){ //vou para direita
            if(atual.getDireita() == null){ // se a posição da direita estiver Vazia
                No novo = new No(i);
                atual.setDireita(novo); // a posisão da direita recebe o valore
            }else{ // se não
                insereRec(atual.getDireita(), i); // verifica a próxima posição
            }
        }else{      // Vou para esquerda
            if(atual.getEsquerda() == null){ // se a posição da esquerda estiver vazia
                No novo = new No(i); //instancia do novo no na posição i
                atual.setEsquerda(novo); //a posição atual recebe esse valor
            }else{ //se não
                insereRec(atual.getEsquerda(), i);// entra na recursão novamente, e compara.
            }
        }
    }

    public String percorreEmOrdem(){ // percorre em ordem

        if(estaVazia()){ // se estiver vazia
            return "Arvore Vazia";
        }else{ //se não
            return percorreEmOrdemRec(raiz); //chama o método recursivo
        }
    }
    private String percorreEmOrdemRec(No atual){ //método recursivo recebe a raiz atual
        if(atual != null){ // e se for diferente de nula
        return 
            percorreEmOrdemRec(atual.getEsquerda()) + atual + " " + percorreEmOrdemRec(atual.getDireita()); // percorre a arvore        
        }else{ // partindo da esquerda para depois direita, utilizando o mesmo método recursivo, se não
            return ""; // retorna uma string vazia, finalizando o percorrimento da arvore
        }
    }

    public boolean buscaBinaria(int i){ // busca valor na arvore
        if(estaVazia()){ // se estiver vaziu
            return false; // não existe número a verificar
        }else{ // se não
            return buscaBinariaRec(i, raiz); // entra na recursão, valor desejado, e a raiz da árvore
        }
    }

    private boolean buscaBinariaRec(int i, No atual){ //método recursivo
        if(i == atual.getInfo()){ // se o valor desejado, for o valor do nó
            return true; // retorna que existe o valor
        }else if(i > atual.getInfo()){ //se não se hora de procurar, se for maior 
            if(atual.getDireita() == null){ // procura na direita, eliminando a parte esquerda da busca, que tem valor menor
                return false; //se o valor na direita for nulo, e não foi encontrado retorna falso
            }else{ // se não
                return buscaBinariaRec(i, atual.getDireita()); //verifica a posição entrando novamente na recursão
            }
        }else if(i <= atual.getInfo()){ // repete o modelo para verificar a esquerda
            if(atual.getEsquerda() == null){ 
                return false;
            }else{
                return buscaBinariaRec(i, atual.getEsquerda());
            }
        }else{ //no fim se não tem nada na esquerda e nem na direita
            return false; // o número não foi encontrado, retorna falso
        }
    }

    public int contarNos() { //modelo para contar nós
        return contarNosRec(raiz); // recebe raiz inicial
    }

    private int contarNosRec(No atual) { // e entra na recursão
        if (atual == null) { // se for nulo, não existe nenhum nó
            return 0; //retornando zero
        } else { // se não
            return 1 + contarNosRec(atual.getEsquerda()) + contarNosRec(atual.getDireita());
            //soma 1 e realiza o percorrimento da arvore, da esquerda da direita, somando 1 a cada nó verificado
        }
    }

    public int contarVezes(int valor) { // verifica repetições
        return contarVezesRec(raiz, valor); //recebe a raiz e o valor
    }

    private int contarVezesRec(No atual, int valor) { // entrando na recursão
        if (atual == null) { //se a arvore for nula
            return 0; //não existe arvore, portando nenhuma repetição do número
        }else { //se não
            int soma = 0;//variável de soma recebe 0
            if (atual.getInfo() == valor) { //e se o valor do atual for igual ao valor escolhido
                soma = atual.getOcorrencias(); //a soma recebe as ocorrencias do número
            }else{
            } //se não não faz nada aqui
            //mas no outro se não
            return soma + contarVezesRec(atual.getEsquerda(), valor) + contarVezesRec(atual.getDireita(), valor);
            //e se não, a soma, percorre a árvore novamente até encontrar o valor
        }
    }

    public int altura() { // método para verificar altura da árvore
        return alturaRec(raiz); //chama a recursão e envia a raiz
    }

    private int alturaRec(No atual) {
        if (atual == null){ //se a raiz atual for nula
            return -1; // altura de árvore vazia, você pode retornar uma excesão, como no exemplo da ABB
        }else{ //optei por não utilizar aqui, se não

            int altEsq = alturaRec(atual.getEsquerda()); //percorre a arvore, esquerda e depois direita
            int altDir = alturaRec(atual.getDireita()); //chamando a recursão para verificar e empilhando

            if (altEsq > altDir) { //se a altura esquerda é maior que a direita
                return 1 + altEsq; // soma 1 na altura esquerda
            } else { //se não
                return 1 + altDir; //soma 1 na altura direita, ao final, resulta em sua altura total.
            }
        }
    }

    public int contarFolhas() {
        return contarFolhasRec(raiz);
    }

    private int contarFolhasRec(No atual) {
        if (atual == null) {
            return 0;
        }

        // se NÃO tem esquerda E NÃO tem direita é folha
        if (atual.getEsquerda() == null && atual.getDireita() == null) {
            return 1;
        }else{
            // não é folha, continua contando chamando a recursão novamente
            return contarFolhasRec(atual.getEsquerda()) + contarFolhasRec(atual.getDireita());
        }
    }

    public int menor(){ //verifica o menor elemento da arvore

        if (estaVazia()){
            return -1; // se ta vazia, menos 1, não existe nó, pode ser utilizado excesão também
        }
        No atual = raiz; // atual recebe a raiz

        while (atual.getEsquerda() != null){ //repetição que se o elemento da esquerda for, diferente de null
            atual = atual.getEsquerda(); //percorre a arvore
        } //quando looping acaba, chagamos no final da parte esquerda na arvore

        return atual.getInfo();//imprimindo menor número
    }

    public int maior(){ //verifica o maior número da arvore

        if (estaVazia()){ //se está vazia
            return -1; //excesão ou menos 1
        }
        No atual = raiz;//espelha o menor porém, indo para direita

        while (atual.getDireita() != null){  
            atual = atual.getDireita();//ao final, você terá o meior número, ponta direita da árvore
        }

        return atual.getInfo(); //retorna o último elemento
    }

    public int soma() {
        return somaRec(raiz);
    }   

    private int somaRec(No atual){
        if (atual == null){ //ainda utilizando conceito recursivo para percorrimento
            return 0; //se estiver vazia a soma é 0
        }else{
            return atual.getInfo() //se não atual ou raiz, recebe cada valor da esquerda e soma a informação
                    + somaRec(atual.getEsquerda())
                    + somaRec(atual.getDireita());
        }
    }

    public String percorrePreOrdem(){ //aqui foi onde tive mais dificuldade
        if(estaVazia()){ //precisei entender esses conceitos 
            return "Arvore vazia"; // pré ordem e pós ordem, se vazia 
        } else { //se não
            return percorrePreOrdemRec(raiz); //percorre recursivo
        }
    }

    private String percorrePreOrdemRec(No atual){ //recebe o valor 
        if(atual == null){ //se for nulo, retorna string vazia
            return ""; //fim da árvore
        }else{ //se não
            return atual + " "  // o valor atual printa com espaço, a esquerda e depois a direita
                + percorrePreOrdemRec(atual.getEsquerda()) //a ordem aqui é raiz, esquerda, e depois volta com a direita
                + percorrePreOrdemRec(atual.getDireita()); //diferente da pós ordem
        }
    }

    public void posOrdem(){ //pós ordem
        posOrdem(raiz);
    }

    private void posOrdem(No atual) { //recebe o atual
        if (atual != null) { // se for diferente de null, ele percorre até o final, antes de printar
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.print("[" + atual.getInfo() + "] "); //imprime de baixo pra cima Esquerda, direita, e raiz.
        }
    }
}

class No {
    // Atributos
    private int info;
    private int ocorrencias;  //adicionei ocorrencias, para contar as repetições
    private No esquerda;
    private No direita;
    
    //Construtores
    public No(int info){
        this.info = info;
        this.ocorrencias = 1; 
    }

    public int getOcorrencias(){
        return ocorrencias;
    }

    public void incrementaOcorrencias(){
        ocorrencias++;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    //imprime a árvore com ás ocorrencias
    @Override
    public String toString() {
        return "[" + info + "|" + ocorrencias + "x]";
    }
}