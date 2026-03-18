public class minhaPilhaLig {//minha pilha ligada, onde cada nó tem um valor inteiro
//e um ponteiro para o próximo nó
    //Atributos herdados da classe meuNo
    public meuNo topo;
    //Construtores
    public minhaPilhaLig(){ //construtor para inicializar a pilha vazia, onde o topo é null
        this.topo = null;
    }
    //getters and setters
    //nesse caso tudo está herdado de outras classes
    //não sendo necessário inicializar getters and Setters.
    public boolean estaVazio(){ //Método para verificar se a pilha está vazia
    //onde a pilha está vazia se o topo for null.
        if(topo == null){ //se for igual a null
            return true; //está vazia
        }else{ //se não
            return false; //não está vazia
        }
    }
    public void meuPush(int info){//Método para adicionar elemento a pilha
        meuNo atual = new meuNo(info); //instancia um novo nó chamado atual
        //com a informação passada como parâmetro
        if(estaVazio()){ //se estiver vazia, ou seja, se o topo for null
            topo = atual; //o primeiro elemento vai ser o atual
        }else{ //se não
            atual.setProxi(topo); //atual aponta para o topo
            //ou seja, o próximo elemento do atual é o topo
            topo = atual; //após apontar, o topo passa a ser o atual, ou seja, o novo elemento da pilha
        } 
    }
    public int meuPop(){ //Método para remover elemento da pilha, onde o elemento removido é o topo
        if(estaVazio()){ //se estiver vazia, não tem o que remover
            return -1; //retorna menos -1 para indicar que a pilha está vazia
        }else{ //se não estiver vazia, ou seja, se o topo for diferente de null
            int temp = topo.getInfo(); //armazena o valor do topo em uma variável temporária
            topo = topo.getProxi();//aponta o topo para o próximo elemento, ou seja null
            //ou seja, o próximo elemento passa a ser o topo null, o valor anterior perde a referencia
            //ou seja, é removido da pilha.
            return temp; //retorna o valor do topo que foi removido, ou seja
            //o valor armazenado na variável temporária
        }
    }
    @Override //Método de impressão
    public String toString () {
        String s = "";
        if (estaVazio()) s += "pilha vazia";
        else { //se não estiver vazia
            meuNo impre = topo; //inicializa um objeto da classe NO e diz que é o primeiro já instanciado
            while (impre != null) { //enquanto for diferente de null, vai até o final da pilha
                s = s + impre + " -> "; // e imprime o valor do atual
                impre = impre.getProxi(); //e depois passa para o próximo, sem danificar o primeiro
            }
            s += "\\\\"; // para fins de design
        }
        return s + "\n"; 
    }

}
