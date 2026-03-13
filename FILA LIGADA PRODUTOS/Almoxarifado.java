import java.util.Scanner;

public class Almoxarifado {
    public static void main(String[] args) {
        Produto[] prateleira = new Produto[100]; //instancia um vetor de tamanho 100, que pertence a produto
        FilaLigadaProdutos esteira = new FilaLigadaProdutos(); //e uma esteira que recebe a fila
        Scanner scanner = new Scanner(System.in); //atribuição do scanner

        for (int i=0; i<3; i++) { //preenchendo 3 informações da fila
            System.out.println("digite o codigo"); //com código
            int codigo = scanner.nextInt(); 
            System.out.println("digite o nome"); //nome
            scanner.nextLine();
            String nome = scanner.nextLine();
            Produto p = new Produto(codigo, nome); //e instanciando a cada passa um novo produto, passando os parametros
            esteira.enfileirar(p); //e envilando o produto no final
        }

        System.out.println("Esteira pronta:"); //quando acabar a esteira está pronta
        System.out.println(esteira); //imprime pra gente ve, quais produtos estão nela

        System.out.println("\nDigite o nome de um produto para buscar:"); //e procura um produto la
        String nomeBusca = scanner.nextLine(); //digita o nome

        Produto encontrado = esteira.buscarPorNome(nomeBusca); //instancia um novo produto, chamado encontrado
        //que vai receber o resultado da busca na esteira
        if (encontrado != null) { //se for encontrado, ou não for nulo
            System.out.println("Produto encontrado: " + encontrado); //produto encontrado, e a posição, que é encontrado
        } else { //se não
            System.out.println("Produto NÃO encontrado na esteira."); //é nulo, ou seja não foi encontrado nada
        }
        
        int i =0;
        System.out.println ("\nindo para prateleira:"); 
        while (!esteira.estaVazia()) { //até ela estar vazia
            Produto p = esteira.desenfileirar(); //o produto p vai ser desenfileirado da esteira
            System.out.println("quanto chegou de " + p.getNome()); //imprimir o nome do produto
            int quantidade = scanner.nextInt(); // vai perguntar quanto chegou desse produto
            p.atualizaEstoque(quantidade); //colocando o valor, ele atualiza o estoque
            prateleira[i++] = p; //a prateleira de tamanho 100, recebe uma por uma a informação
        }
        System.out.println("prateleira arrumada:"); //com a prateleira arrumada
        for (int j=0; j < i; j++) { //vamos imprimir
            System.out.println("posicao " + j + ": " + prateleira[j]); //imprime a posição na prateleira
        } //e imprimi a prateleira
          int totalEstoque = 0;//para pegar o total do estoque a soma

        for (int j = 0; j < i; j++) { //imprime
            totalEstoque += prateleira[j].getEstoque(); //e pega cada valor da proteleira somando
        }

        System.out.println("\nTotal do estoque (Exercício 4): " + totalEstoque); //imprime o total do estoque

        scanner.close();
    }
}
