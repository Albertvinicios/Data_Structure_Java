import java.util.Random;

public class TestePilha {
    public static void main(String[] args) {

        Pilha pilha = new Pilha(10);
        Random random = new Random();
        int ele = random.nextInt(10);
        
        do {
            if (random.nextBoolean()) {
                if (pilha.push(ele)){
                    System.out.println("empilhamento realizado com sucesso");
                }else{
                    System.out.println("falha no empilhamento");
                }
            }else{
                if (!pilha.estaVazia()){
                    System.out.println(pilha.pop() + " foi desempilhado");
                }else{
                }
            }
            System.out.println(pilha);
        }while(!pilha.estaVazia());
        System.out.println(pilha);
    }
}