import java.util.Random;

public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(); //cria um objeto da classe pilha
        Random random = new Random(); //cria um objeto da classe random
        do {
            if (random.nextBoolean()) { //se a condição randomica for verdade
                pilha.push(random.nextInt(10*10)); //push com valor randomico
            }
            else { //se for falso 
                if (!pilha.estaVazia()) // e a pilha nao estiver vazia
                    System.out.println(pilha.pop() + " foi desempilhado"); //desempilha
            }
            System.out.println(pilha); //imprime a pilha ao final
        } while (!pilha.estaVazia()); //dura enquanto a pilha não estiver vazia
    }
}
