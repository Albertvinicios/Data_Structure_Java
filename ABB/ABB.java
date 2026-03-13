public class ABB {
    private No raiz;
    //lembremos que temos somente o construtor padrão

    public boolean estaVazia(){ //se estiver vazia retorna vazia  
        return raiz == null;
    }
    public void insere (int i) { //método para inserir na arvore
        if (estaVazia())  //se estiver vazia 
            raiz = new No(i); //a raiz recebe o valor informado 
        else //se não estiver vazia 
            insereRec(raiz, i);//chama o método insereRec
    }

    private void insereRec (No atual, int i){//o método para inserir recursivo, verifica o maior e menor e determina
        if (i > atual.getInfo()) {//se a informação for maior que a raiz
            if (atual.getDireita() == null){ //se atual na posição direita 
                No novo = new No(i); //cria um novo no que recebe a informação e aponta para direita
                atual.setDireita(novo); //o atual agora aponta para direita 
            }
            else 
                insereRec(atual.getDireita(), i); //se não for maior, chama o método recursivo novamente
        }
        else {//se não for maior vai para esquerda
            if (atual.getEsquerda() == null) {  //se o valor atual da esquerda for null
                No novo = new No(i); //insere na esquerda
                atual.setEsquerda(novo); //aponta o atual com a informação nova
            }
            else //se não for null
                insereRec(atual.getEsquerda(), i); //verifica o lado esquerdo, quando chegar no nulo implementa
        } //
    }

    public String percorreEmOrdem () {//método de ordenação 
        if (estaVazia()) return "arvore vazia"; //se estiver vazia retorna arvore vazia
        return percorreEmOrdemRec(raiz); //se não, percorre em ordem recursiva
    }
    private String percorreEmOrdemRec (No atual) { //percorre em ordem recursiva, recebendo valor da raiz
        if (atual != null) //se a raiz não for nula
            return  //retorna 
                percorreEmOrdemRec(atual.getEsquerda()) + //recursividade em ordem 
                atual + " " + //primeiro esquerda toda a esquerda e depois toda direita
                percorreEmOrdemRec(atual.getDireita());
        else 
            return ""; //retorna 
    }
    //
    public boolean buscaBinaria (int i) {
        if (estaVazia()) return false;
        return buscaBinariaRec(i, raiz);
    }
    private boolean buscaBinariaRec (int i, No atual) {
        if (i == atual.getInfo()) return true;
        if (i > atual.getInfo()) {
            if (atual.getDireita() == null) return false;
            return buscaBinariaRec(i, atual.getDireita());
        }
        else {
            if (atual.getEsquerda() == null) return false;
            return buscaBinariaRec(i, atual.getEsquerda());
        }
    }
    public int altura () throws ExcecaoArvoreVazia{
        if (estaVazia()) 
            throw new ExcecaoArvoreVazia("arvore vazia");
        return altura_rec (raiz);
    }
    private int altura_rec (No atual) {
        if (atual == null) return -1;
        int altEsq = altura_rec(atual.getEsquerda());
        int altDir = altura_rec(atual.getDireita());
        // if (altEsq > altDir) return altEsq + 1;
        // return altDir + 1;
        //outra possibilidade
        return altEsq > altDir ? altEsq + 1 : altDir + 1;
        //mais uma
        // return 1 + Math.max(altDir, altEsq);
        // outra
        // return 1 + Math.max(altura_rec(atual.getDireita()), altura_rec(atual.getEsquerda()));
    }
    public int contarNos() { //Métodos de contar nós da professora
        return contarNosRec(raiz);
    }
    private int contarNosRec(No atual) {
        if (atual == null){
            return 0;
        } 
        else{
            return 1 + contarNosRec(atual.getEsquerda()) + contarNosRec(atual.getDireita());
        }
    }
    //Método de verificação se é estritamente binária
    public boolean estritamenteBinaria() {
        return estritamenteBinariaRec(raiz);
    }
    //Método recursivo de verificação
    private boolean estritamenteBinariaRec(No atual) {
        if (atual == null) return true;

        boolean temEsq = atual.getEsquerda() != null;
        boolean temDir = atual.getDireita() != null;

        // regra fundamental: não pode ter 1 filho
        if (temEsq != temDir) return false;

        // recursão nos dois lados
        return estritamenteBinariaRec(atual.getEsquerda()) &&
            estritamenteBinariaRec(atual.getDireita());
    }
    //Método para contar números em intervalos
    public int contarIntervalo(int a, int b) {
        return contarIntervaloRec(raiz, a, b);
    }
    //utilizando recursao
    private int contarIntervaloRec(No atual, int a, int b) {
    if (atual == null) {
        return 0;
    }

    // Se o valor atual é menor que A, ignore a esquerda
    if (atual.getInfo() < a) {
        return contarIntervaloRec(atual.getDireita(), a, b);
    }

    // Se o valor atual é maior que B, ignore a direita
    if (atual.getInfo() > b) {
        return contarIntervaloRec(atual.getEsquerda(), a, b);
    }

    // O valor está entre A e B → conta +1 e continua nas duas direções
    return 1 
         + contarIntervaloRec(atual.getEsquerda(), a, b)
         + contarIntervaloRec(atual.getDireita(), a, b);
    }
    public int contarNo(){ //Meu Método de contar nós
        if(estaVazia()){
            System.out.println("Não existe nenhum nó");
            return -1;
        }else{
            return contarNoRec(raiz);
        }
    }
    private int contarNoRec(No atual){
        if(atual != null){
            return 1 +contarNoRec(atual.getDireita())+
            contarNoRec(atual.getEsquerda());
        }else{
            return 0;
        }
    }
}