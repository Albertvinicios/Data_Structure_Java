class ExcecaoArvoreVazia extends Exception {
    public ExcecaoArvoreVazia (String msg) { //classe feita para lançar exceptions
        super(msg); //em caso da arvore estar vazia
    }
}