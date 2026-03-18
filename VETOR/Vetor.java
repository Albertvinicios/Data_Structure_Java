public class Vetor {
    public static void main(String[] args) {
        int[] v = new int[5]; //criando um vetor de inteiros com capacidade para 5 elementos
        for (int i = 0; i < 15; i++) { //tentando acessar 15 posições do vetor, 
        //ou seja, mais do que a capacidade
            System.out.printf("%d ", v[i]); //isso vai gerar um erro de 
            //ArrayIndexOutOfBoundsException,
        }
        v[3] = 10;
    }
}
