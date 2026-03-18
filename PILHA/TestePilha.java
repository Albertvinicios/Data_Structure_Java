import java.util.Random;

public class TestePilha { //teste da pilha
    public static void main(String[] args) { //método principal para testar a pilha da professora
        Pilha pilha = new Pilha(10); //pilha com capacidade para 10 elementos
        Random random = new Random(); //inicialização do objeto random para gerar números aleatórios
        int ele = random.nextInt(10); //geração de um número aleatório entre 0 e 9
        //onde esse número é o elemento a ser empilhado
        
        do { //teste de condição do while, testa depois faz o looping se necessário
            if (random.nextBoolean()) { //se o próximo booleano aleatório for true, empilha o elemento
                if (pilha.push(ele)){ //se o empilhamento for bem sucedido, ou seja
                //se a pilha não estiver cheia
                    System.out.println("empilhamento realizado com sucesso");
                }else{ //se não
                    System.out.println("falha no empilhamento");
                }
            }else{ //se ele não estiver vazia
                if (!pilha.estaVazia()){
                    System.out.println(pilha.pop() + " foi desempilhado"); //desempilha
                }else{
                }
            }
            System.out.println(pilha); //printa a pilha a cada iteração do loop
            //para verificar o estado da pilha
        }while(!pilha.estaVazia()); //quando ela for diferente de vazia, ou seja
        //enquanto ela tiver elementos, o loop continua
        System.out.println(pilha); //printa a pilha no final, para verificar que ela está vazia
        //aplica-se em casos de necessidade de sorteio, onde o número sorteado é o elemento a ser empilhado
        //ou seja, o número sorteado é o elemento a ser desempilhado.
    }
}