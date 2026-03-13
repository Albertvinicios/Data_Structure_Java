public class minhaPilhaLig {
    //Atributos herdados da classe meuNo
    public meuNo topo;
    //Construtores
    public minhaPilhaLig(){
        this.topo = null;
    }
    //getters and setters
    //nesse caso tudo está herdado
    //não sendo necessário inicializar getters and Setters.
    public boolean estaVazio(){
        if(topo == null){
            return true;
        }else{
            return false;
        }
    }
    public void meuPush(int info){
        meuNo atual = new meuNo(info);
        if(estaVazio()){
            topo = atual;
        }else{
            atual.setProxi(topo);
            topo = atual;
        }
    }
    public int meuPop(){
        if(estaVazio()){
            return -1;
        }else{
            int temp = topo.getInfo();
            topo = topo.getProxi();
            return temp;
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
