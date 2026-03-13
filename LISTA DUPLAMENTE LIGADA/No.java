public class No<E> { //classe nó que contém um tipo genérico instanciado no elemento E <E>
    //Atributos da lista dupla, acrescentando o ponteiro anterior
    private E elemento; //o elemento que é recebido, ou a informação não tem tipo definido é genérico
    private No<E> anterior; //o próximo e o anterior entram dentro do conceito de lista ligada
    private No<E> proximo; //e o anterior e o próximo tem o mesmo tipo

    public No (E elemento) { //o contrutor, recebe o elemento
        this.elemento = elemento;
        //mas por clareza o anterior e o proximo recebem null, dois ponteiros
    }
    public E getElemento() { //para pegar um elemento do tipo E
        return elemento;
    }
    public No<E> getAnterior () { //para pegar o anterior tipo No<E>
        return anterior;
    }
    public No<E> getProximo () { //para pegar o próximo
        return proximo;
    }
    public void setElemento (E elemento) { //para setar o elemento recebe o parâmetro tipo e
        this.elemento = elemento;
    }
    public void setAnterior (No<E> anterior) { //para apontar para o anterior 
        this.anterior  = anterior;
    }
    public void setProximo (No<E> proximo) { //para apontar para o próximo
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        return "[" + elemento + "]"; //para imprimir nó
    }
    
}