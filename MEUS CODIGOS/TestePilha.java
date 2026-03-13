import java.util.Random;
public class TestePilha{
		public static void main(String[] args){
		Pilha pilha = new Pilha(5); // criação e atribuição de valor a pilha
		Random random = new Random(); // iniciação do random
		do { // estrutura de repetição
			if (random.nextBoolean()){ // se seleciona um booleano
				if (pilha.push(random.nextInt(10))){ // pilha push. 
					System.out.println("empilhamento realizado com sucesso!");
				}else{
					System.out.println("falha no empilhamento!");
				}
			}else{
				System.out.println(pilha.pop() + "foi desimpilhado!");
			}
			System.out.println(pilha);
		}while(!pilha.estaVazia());
	}
}