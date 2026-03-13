import java.util.Random;
import java.util.Scanner;

public class MeuVetor {
    Scanner input = new Scanner(System.in);
    // Atributos 
    private int vet[];
    private int ocupa;
     
    // Construtores
    // Construtor padrão 1.
    public MeuVetor(){
        this.vet = new int[5];
        this.ocupa = 0;
    }
    // Segundo Construtor 2.
    public MeuVetor(int tamanho){
        this.vet = new int[tamanho];
        this.ocupa = 0;
    }
    // Terceiro Construtor Cópia
    public MeuVetor(MeuVetor v){
        this.vet = v.vet;
        this.ocupa = vet.length;
    }
    //Métodos Getters and Setters, acessos.
    public int[] getVet(){
        return this.vet;
    }
    public void setVet(int[] v){
        this.vet = v;
    }
    public int getOcupa(){
        return this.ocupa;
    }
    public void setOcupa(int o){
        this.ocupa = o;
    }
    //Métodos funções
    public int verificaOcupa(){
        int v[] = getVet();
        int soma = 0;
        if(!estaVazia()){
            for(int i = 0; i < v.length; i++){
                soma++;
            }
            int ocupa = soma + getOcupa();
            setOcupa(ocupa);
            return ocupa;
        }else{
            return 0;
        }
    }
    //Método para verificar se está vazia, método dificil
    public boolean estaVazia(){ //aqui também podemos usar a ocupação
        int soma = 0; //já verificar a ocupação e se ela for 0, então está vazia.
        for(int i = 0; i < vet.length; i++){
            soma += vet[i];
        }
        if(soma != 0){
            return false; 
        }else{
            return true;
        }
    }
    //Método para verificar se está cheia, compliquei, da pra fazer bem mais simples.
    public boolean estaCheia(){ //pode comparar a condição se a ocupação for do tamanho
        int soma = 0;  //do vetor, é porque então ele está cheio.
        boolean cheia = false;
        if(estaVazia()){
            return false;
        }else{
            for(int i = 0; i < vet.length; i++){
                if(vet[i] != 0){
                    soma++;
                }
            }
            if(soma == vet.length){
                cheia = true;
            }
            if(cheia == true){
                return true;
            }else{
                return false;
            }
        }
    }
    //Método para preencher vetor
    public void preVetor(){
        int v[] = getVet();
        Random random = new Random();
        for(int i = 0; i < v.length; i++){
            v[i] = random.nextInt(vet.length * 5); 
        }
        setOcupa(v.length);
    }
    //Método para remover o último elemento
    public void removeUltimo(){
        int v[] = new int[vet.length-1]; 
        if(!estaVazia()){
            for(int i = 0; i < v.length; i++){
                v[i] = vet[i];
            }
            setVet(v);
            setOcupa(v.length);
        }
    }
    public void insereUltimo(int valor){
        int v[] = new int[ocupa+1];
        for(int i = 0; i < ocupa; i++){
            v[i] = vet[i];
        }
        v[ocupa] = valor;
        setVet(v);
        setOcupa(v.length);
    }
    //Método de impressão
    @Override
    public String toString(){
        String s = "Ocupação: "+ getOcupa() + " Tamanho: "+ vet.length + " Está Vazia: "+ estaVazia()+ 
        " Está Cheia: "+ estaCheia()+ " Vetor: |"; 
        for(int i = 0; i < vet.length; i++){
            s += vet[i] + "||";
        }
        return s;  
    }
}
