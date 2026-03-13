public class meuNo {
    // Atributos
    public int info;
    public meuNo proxi;

    //Construtores
    public meuNo(){
        this.info = 0;
        this.proxi = null;
    }
    public meuNo(int i){
        this.info = i;
    }
    //Métodos getters and Setters
    public int getInfo(){
        return info;
    }
    public void setInfo(int i){
        this.info = i;
    }
    public meuNo getProxi(){
        return proxi;
    }
    public void setProxi(meuNo p){
        this.proxi = p;
    }
    //Método de impressão
    @Override
    public String toString() {
        return "[ " + info + " ]"; //imprime a informação.
    }
}
