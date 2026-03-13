import java.util.Scanner;

public class TesteAltura { //mais para testar altura, saber altura da árvore
    public static void main(String[] args){

        ABB abb = new ABB(); //cria-se um novo objeto de abb
        Scanner scanner = new Scanner(System.in); //scanner
        for (int i=1; i<=5; i++) { // e faremos a insersão nesse caso com 1000 valores
            abb.insere(scanner.nextInt()); //produção de 1000 valores digitados kkk,
            //pode ser usado o random para criar diversos valores
        }
        try { //usado para capturar a exception em caso de arvore vazia
            System.out.println("altura = " + abb.altura()); 
        }
        catch (ExcecaoArvoreVazia e){ //pegando aqui
            e.printStackTrace(); //e imprimindo a mensagem
        }
        System.out.println("numero de nos: " + abb.contarNos());
        scanner.close(); //feito para mostrar quantos nós a arvore tem
    }
}
