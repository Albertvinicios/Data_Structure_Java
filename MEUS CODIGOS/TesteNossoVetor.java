import java.util.Scanner;
public class TesteNossoVetor { 
    public static void main(String[] args) {
        int c; // variável
        NossoVetor nossoVetor; // atribuição de objeto na classe
        Scanner scanner = new Scanner(System.in); // Scanner
        System.out.print("qual o tamanho do vetor? "); 
        c = scanner.nextInt(); // tamanho do vetor escolhido
        nossoVetor = new NossoVetor(); // crição real do objeto com parametro c
        //nossoVetor.v[2] = -1; //  forma de definir tamanho e posição se publico
        nossoVetor.setPosicaoVetor(2, -1); // metodo para definir posição e o valor da posição.
        for (int i = 0; i < nossoVetor.getV().length; i++) { //getv acessa o vetor
            System.out.println(nossoVetor.getPosicaoVetor(i)); // percorre o vetor e pega a posição
        }
        System.out.println("nosso vetor: " + nossoVetor);
        scanner.close();


    }
}
    //int i = 5;
    //int v[] = new int[i];