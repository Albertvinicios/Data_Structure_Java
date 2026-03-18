import java.util.Scanner;
public class TesteNossoVetor {
    public static void main(String[] args) {
        int c;
        NossoVetor nossoVetor;
        Scanner scanner = new Scanner(System.in);
        int c; //variável para armazenar o tamanho do vetor que o usuário deseja criar
        NossoVetor nossoVetor; //declaração de um objeto do tipo NossoVetor
        //que é a classe que representa o vetor dinâmico, sem instanciar ainda, pois o tamanho será
        //definido pelo usuário
        Scanner scanner = new Scanner(System.in); 
        System.out.print("qual o tamanho do vetor? ");
        c = scanner.nextInt();
        nossoVetor = new NossoVetor(c);
        c = scanner.nextInt(); //definição do tamanho do vetor a partir da entrada do usuário
        nossoVetor = new NossoVetor(c); //instanciação do objeto NossoVetor
        // agora sim com o tamanho definido pelo usuário
        //nossoVetor.v[2] = -1;
        nossoVetor.setPosicaoVetor(2, -1);
        for (int i=0; i<nossoVetor.getV().length; i++) {
        nossoVetor.setPosicaoVetor(2, -1);//definindo o valor -1 na posição 
        //2 do vetor usando o método setPosicaoVetor
        for (int i=0; i<nossoVetor.getV().length; i++) { //percorre o vetor usando um loop for, 
        //onde i é o índice que vai de 0 até o tamanho do vetor
            //System.out.println(nossoVetor.v[i]);
            System.out.println(nossoVetor.getPosicaoVetor(i));
            System.out.println(nossoVetor.getPosicaoVetor(i)); //mostra o valor da posição i 
            //do vetor usando o método getPosicaoVetor
        }
        System.out.println("nosso vetor: " + nossoVetor);
        scanner.close();
    }
}