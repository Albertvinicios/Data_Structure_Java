package ABBEXE;

public class ABBcomrep {
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
        if(i > atual.getInfo()){ //vou para direita, nesse caso não verifica se o valor é igual, insere de qualquer forma na árvore
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
    public String percorreEmOrdem(){
        if(estaVazia()){
            return "Arvore Vazia";
        }else{
            return percorreEmOrdemRec(raiz);
        }
    }
    private String percorreEmOrdemRec(No atual){
        if(atual != null){
        return 
            percorreEmOrdemRec(atual.getEsquerda()) + atual + " " + percorreEmOrdemRec(atual.getDireita());        
        }else{
            return "";
        }
    }
    public boolean buscaBinaria(int i){
        if(estaVazia()){
            return false;
        }else{
            return buscaBinariaRec(i, raiz);
        }
    }
    private boolean buscaBinariaRec(int i, No atual){
        if(i == atual.getInfo()){
            return true;
        }else if(i > atual.getInfo()){
            if(atual.getDireita() == null){
                return false;
            }else{
                return buscaBinariaRec(i, atual.getDireita());
            }
        }else if(i <= atual.getInfo()){
            if(atual.getEsquerda() == null){
                return false;
            }else{
                return buscaBinariaRec(i, atual.getEsquerda());
            }
        }else{
            return false;
        }
    }
    public int contarNos() {
        return contarNosRec(raiz);
    }

    private int contarNosRec(No atual) {
        if (atual == null) {
            return 0;
        } else {
            return 1 + contarNosRec(atual.getEsquerda()) + contarNosRec(atual.getDireita());
        }
    }
    public int contarVezes(int valor) {
        return contarVezesRec(raiz, valor);
    }

    private int contarVezesRec(No atual, int valor) {
        if (atual == null){
            return 0;
        }else{
            int soma = 0; //nesse caso não se usa as ocorrencia, já que em tese, não se calcula isso 
             //em estruturas com repetição
            if (atual.getInfo() == valor) { //se o valor for igual
                soma = 1; //soma 1
            }
            return soma //e vai percorrendo a árvore
                    + contarVezesRec(atual.getEsquerda(), valor)
                    + contarVezesRec(atual.getDireita(), valor);
        }
    }
    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(No atual) {
        if (atual == null) {
            return 0; // altura de árvore vazia
        } else {

            int altEsq = alturaRec(atual.getEsquerda());
            int altDir = alturaRec(atual.getDireita());

            if (altEsq > altDir) {
                return 1 + altEsq;
            } else {
                return 1 +altDir;
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

        // se NÃO tem esquerda E NÃO tem direita → é folha
        if (atual.getEsquerda() == null && atual.getDireita() == null) {
            return 1;
        } else {
            // não é folha, continua contando
            return contarFolhasRec(atual.getEsquerda()) + contarFolhasRec(atual.getDireita());
        }
    }
    public int menor() {
        if (estaVazia()) {
            return -1;
        }
        No atual = raiz;

        while (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
        }

        return atual.getInfo();
    }

    public int maior() {
        if (estaVazia()) {
            return -1;
        }
        No atual = raiz;

        while (atual.getDireita() != null) {
            atual = atual.getDireita();
        }

        return atual.getInfo();
    }
    public int soma() {
        return somaRec(raiz);
    }   

    private int somaRec(No atual) {
        if (atual == null) {
            return 0;
        } else {
            return atual.getInfo()
                    + somaRec(atual.getEsquerda())
                    + somaRec(atual.getDireita());
        }
    }
    public String percorrePreOrdem() {
        if (estaVazia()) {
            return "Arvore vazia";
        } else {
            return percorrePreOrdemRec(raiz);
        }
    }

    private String percorrePreOrdemRec(No atual) {
        if (atual == null) {
            return "";
        } else {
            return atual + " "  // raiz
                + percorrePreOrdemRec(atual.getEsquerda())
                + percorrePreOrdemRec(atual.getDireita());
        }
    }
    public void posOrdem() {
        posOrdem(raiz);
    }

    private void posOrdem(No atual) {
        if (atual != null) {
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.print("[" + atual.getInfo() + "] ");
        }
    }
}   