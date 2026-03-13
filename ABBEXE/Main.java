package ABBEXE;

import java.util.Random;
public class Main {
    public static void main(String[] args){
        ABBsemrep abbs = new ABBsemrep();
        ABBcomrep abbc = new ABBcomrep();
        Random random = new Random();
        int n;
        for(int i = 1; i <= 200; i++){

            n = random.nextInt(100);
            //System.out.print("|"+n +"|");
            abbs.insere(n);
            abbc.insere(n);
        }
        //System.out.println("");

        //System.out.println(abbs.percorreEmOrdem());
        //System.out.println("");
        //System.out.println(abbc.percorreEmOrdem());
        n = random.nextInt(100);
        if(abbs.buscaBinaria(n)){
            System.out.println(" ");
            System.out.println(n + "-> Está Na Arvore");
        }else{
            System.out.println(" ");
            System.out.println(n + "-> Não está na Arvore");
        }
        //System.out.println();
         //if(abbc.buscaBinaria(n)){
            //System.out.println(n + " Está Na Arvore");
        //}else{
            //System.out.println(n +" Não está na Arvore");
        //}
        //System.out.println();

        //Log na base N a lógica é LOG na base 2 de n, igual ao quick Sort.

        //Exercicios 
        // construir um Método para cada Tarefa A seguir

        //primeiro, contar o Número de Nós de uma Arvore.
        System.out.println("Qtde de nos sem repetição: " + abbs.contarNos());
        System.out.println("Qtde de nos com repetição: " + abbc.contarNos()); //Modelo que conta nós, considerarando repetições
        //o resultado, sempre vai ser a quantidade de elementos na árvore, diferente do modelo que cada a repetição, não considera um novo nó.

        //contar quantas vezes um valor N aparece na Arvore!
        int valorTeste = 50; // nesse caso usei o 50, mas poderia utilizar o n prédefinido aleátorio.
        System.out.println("O valor " + valorTeste + " aparece "+ abbs.contarVezes(valorTeste) + " vezes");
        System.out.println("O valor " + valorTeste + " aparece "+ abbc.contarVezes(valorTeste) + " vezes");

        //Calcular a altura de uma arvore, qual é o máximo dos níveis, 1 mais a altura do restante da Arvore!
        System.out.println("Altura da arvore sem repetição: " + abbs.altura()); 
        System.out.println("Altura da arvore com repetição: " + abbc.altura()); 
        
        //Contar o número de folhas de uma Arvore!
        System.out.println("Folhas sem repetição: " + abbs.contarFolhas());
        System.out.println("Folhas com repetição: " + abbc.contarFolhas());

        //Encontrar o menor Elemento da Arvore!
        System.out.println("Menor elemento: " + abbs.menor());
        System.out.println("Menor elemento: " + abbc.menor()); // por conta da ordenação o menor elemento, é sempre o primeiro
        //mas a lógica é encontrar o elemento mais a esquerda, pois sempre é o menor, retorna -1, se estiver vazia!

        //Encontrar o maior Elemento da Arvore!
        System.out.println("Maior elemento: " + abbs.maior());
        System.out.println("Maior elemento: " + abbc.maior()); // mesma lógica do anterior, só que para direita
        // buscando sempre o maior, retorna -1 se estiver vazia.

        //Calcular a soma dos Elementos de uma Arvore;
        System.out.println("Soma dos elementos sem repetição: " + abbs.soma());
        System.out.println("Soma dos elementos com repetição: " + abbc.soma());// conta cada elemento e soma de forma recursiva

        //Implementar o percurso Pré Ordem.
        //System.out.println("Pré Ordem sem repetição: "+ abbs.percorrePreOrdem());
        //System.out.println("Pré Ordem com repetição"+ abbc.percorrePreOrdem()); //imprime o nó inicial, depois esquerda, e depois direita
        //com as repetições embutidas, criando uma ordem, esquerda enquanto tiver esquerda, direita e se tiver esquerda, se não direita
        //assim por diante a partir do nó

        //Implementar o percurso Pós Ordem.
        //System.out.print("Pós-ordem: ");//nesse caso o nó é o último, as comparações são feitas a partir do nó
        //abbs.posOrdem(); //imprimindo todos os elementos da esquerda, e subindo, depois esquerda denovo e sobe ao imprimindo a raiz
        //System.out.println(); 
        //abbc.posOrdem();

        
        //(VALENDO UM PONTO!! **********){

        //iMPLEMENTAR A ARVORE BINARIA SEM REPETIÇÃO: CADA NO ARMAZENA O ELEMENTO E O NÚMERO DE VEZES.
        //implementação realizado na classe ABB sem repetição e com, incluindo ocorrencias no nó, e não implementando um novo nó, 
        //quando o valor for igual, utilizando o método incrementa ocorrencias.

        //VALENDO OOUTRO PONTO!!-+-!  UTILIZAR 200 ELEMENTOS  A CHANCE DE REPETIR É MAIOR
        //feito, e realmente, ocorrem, muitas repetições, foi colocado a quantidade ao lado

        //EXERCICIO, IMPLEMENTE OU FAÇA TESTES COM A ARVORE DE TAMANHO 200 COM ELEMENTOS DE 0 A 99
        //COMPARANDO A ALTURA DOS DOIS MODELOS, UM COM REPETIÇÃO DE NÚMEROS, E O OUTRO SEM, AUMENTA A OCORRENCIA MAS NÃO CONTA NA ARVORE.
        //O MESMO SELETOR RANDOMICO SE APLICA AOS DOIS MODELOS, UM QUE PEGA REPETIÇÃO MAS NÃO EXTENDE A ARVORE.
        //os testes constatam, que o a árvore sem repetições é bem menor que a com repetições, diminuindo seu tamanho
        //a quantidade de nós e folhas, alterando também, a soma, que por não contar as repetições, também diminui.
    }   
}
