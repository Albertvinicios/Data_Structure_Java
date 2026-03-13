public class minhaPilha {
    //Atributos
    private int[] vet;
    private int topu;

    //Métodos construtores
    public minhaPilha(){
        this.vet = new int[10];
        this.topu = -1;
    }
    public minhaPilha(int v){
        this.vet = new int[v];
        this.topu = -1;
    }
    public int[] getVet(){ //Métodos getters and Setters
        return vet; //ficam obsoletos, não necessitam ser utilizados
    }
    public void setVet(int[] v){ //e pior, pode estragar a pilha
        this.vet = v; //a pilha não pode dar acesso externo
    }
    public int getTopo(){ //ou seja coloquei no meu código
        return topu; //mas não é necessário
    }
    public void setTopo(int t){ 
        this.topu = t;
    }
    public boolean estaVazio(){
        if(topu == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean estaCheio(){
        if (topu == vet.length-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean meuPush(int element){
        if(estaCheio()){
            return false;
        }else{
            vet[++topu] = element; //o topo já atualiza automaticamente
            return true;
        }
    }
    public int[] meuPop(){
        int auxi[] = new int[topu--]; //com esses comandos o topo atualiza, sem precisar setar
        for(int i = 0; i < auxi.length;i++){
            auxi[i] = vet[i]; //no meu caso, resolvi copiar o vetor, para imprimir, com tamanho reduzido
        }
        setVet(auxi); //e setei ele
        return auxi;
    }
    public int veriTamanho(){
        return topu+1;
    }
    @Override
    public String toString(){
        String s = "";
        if(estaVazio()){
            s += "A pilha esta Vazia \n"; 
        }else{
            for(int i = 0; i < topu; i++){
                s += "|" +vet[i]+ "|->";
            }
        }
        return s;
    }
}