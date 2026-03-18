public class NovoTeste {
    public static void main(String[] args) {
        NossoVetor nVetor = new NossoVetor(4);
        for (int i=1; i<=36; i++) {
            nVetor.insereElemento(i);
            System.out.println(nVetor);
        NossoVetor nVetor = new NossoVetor(4); //criando um vetor
        //com capacidade para 4 elementos
        for (int i=1; i<=36; i++) { //inserindo 36 elementos no vetor, ou seja
        //mais do que a capacidade inicial
            nVetor.insereElemento(i); //o método insereElemento é responsável por 
            //inserir um elemento no vetor, e se estiver cheio, aumenta a capaciadade
            System.out.println(nVetor); //printa o vetor a cada inserção para mostrar
            //o crescimento do vetor
        }
    }
}
