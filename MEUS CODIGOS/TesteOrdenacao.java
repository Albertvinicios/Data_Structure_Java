import java.util.Scanner;
public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // criação do scanner!
        System.out.print("digite a capacidade do vetor, 0 encerra: ");
        int capacidade = scanner.nextInt(); // escolha da capacidade pelo usuário.


        NossoVetor nossoVetor = new NossoVetor(capacidade); 
        //NossoVetor nossoVetorbub = new NossoVetor(capacidade);
        //NossoVetor nossoVetorins = new NossoVetor(capacidade);
        //NossoVetor nossoVetorsel = new NossoVetor(capacidade);
        NossoVetor nossoVetorqui = new NossoVetor(capacidade);
        nossoVetor.preencheVetor(); // chama o metodo de preenchimento randomico do vetor.

        for(int i = 0; i <= 14; i++) { // looping de menu

            //System.out.println("");
            //nossoVetorbub = nossoVetor.copia();
            //System.out.println("--------------------------------------------");
            //System.out.println("vetor original:\n" + nossoVetorbub); // escrever o + chama o metodo toString como nossoVetor.toString();
            //System.out.println("");
            //long ini = System.nanoTime(); // inicio da contagem de tempo
            //nossoVetorbub.bubbleSort(); // chamada do metodo de ordenação bubbleSort, texta de 2 em 2 e ve se vai encaixando.
            //long fim = System.nanoTime();// fim da contagem de tempo da execução do buble.
            //System.out.println("Bubble sort capacidade \n" + capacidade + "| tempo: " + (fim - ini) + " ns"); // impressão do tempo real para o procedimento de sort
            //System.out.println("");
            //System.out.println("Vetor ordenado pelo Bubble:\n" + nossoVetorbub); // impressão do vetor ordenado
            //System.out.println("--------------------------------------------");

            //nossoVetor.preencheVetor(); // nova randomização do vetor
            //nossoVetorins = nossoVetor.copia();
            //System.out.println("--------------------------------------------");
            //System.out.println("vetor original:\n" + nossoVetorins); // impressão do novo vetor
            //System.out.println("");
            //long ini = System.nanoTime(); // inicio da execusão do metodo isertionSort
            //nossoVetorins.insertionSort(); // execução do métoro de Ordenação insertion
            //long fim = System.nanoTime(); // final da execução do método insertion
            //System.out.println("Insertion capacidade \n" + capacidade + "| tempo: " + (fim - ini) + " ns"); // do tamanho do vetor e do tempo de execução
            //System.out.println("");
            //System.out.println("Vetor ordenado pelo Insertion:\n" + nossoVetorins); // impressão do vetor ordenado
            //System.out.println("--------------------------------------------");

            //nossoVetor.preencheVetor();
            //nossoVetorsel = nossoVetor.copia();
            //System.out.println("--------------------------------------------");
            //System.out.println("vetor original: \n:" + nossoVetorsel);
            //System.out.println("");
            //long ini = System.nanoTime();
            //nossoVetorsel.selectionSort();
            //long fim = System.nanoTime();
            //System.out.println("Selection: Capacidade: \n"+ capacidade + "| tempo: " + (fim-ini) + " ns");
            //System.out.println("");
            //System.out.println("Vetor Ordenado pelo selectionSort \n" + nossoVetorsel);
            //System.out.println("--------------------------------------------");

            //nossoVetor.preencheVetor();
            nossoVetorqui = nossoVetor.copia();
            //System.out.println("--------------------------------------------");
            //System.out.println("vetor original \n: " + nossoVetorqui);
            //System.out.println("");
            long ini = System.nanoTime();
            nossoVetorqui.quickSort(0, nossoVetor.tamanho()-1);
            long fim = System.nanoTime();
            System.out.println("Quick Capacidade: \n"+ capacidade + "| tempo: " + (fim-ini) + " ns");
            //System.out.println("");
            //System.out.println("vetor ordenado pelo Quicksort: \n" + nossoVetorqui);
            //System.out.println("--------------------------------------------");

            //ini = System.nanoTime();// repete o teste
            //nossoVetor.quickSort(0, nossoVetor.tamanho()-1); //estoura a pilha!!
            //fim = System.nanoTime();; // stackoverflow
            //System.out.println("Quick 2 Capacidade: \n"+ capacidade + "| tempo: " + (fim-ini) + " ms"); // simulação
            //System.out.println("vetor ordenado pelo Quicksort: \n" + nossoVetor);

        }
            //System.out.println("\ndigite o tamanho do novo vetor, 0 encerra: "); // novo valor para continuação do programa
            //capacidade = scanner.nextInt(); // capacidade nova escolida pelo usuário
        
        scanner.close();// fechamento do Scanner.
    }
}