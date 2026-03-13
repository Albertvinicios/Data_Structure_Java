import java.util.Random;

public class Main {
    // public static void main(String[] args) {
    //     ABB abb = new ABB();
    //     try {
    //         System.out.println("altura da arvore nova: " + abb.altura());
    //     } catch (ExcecaoArvoreVazia excecaoArvoreVazia) {
    //         excecaoArvoreVazia.printStackTrace();
    //     }

    //     Random random = new Random();
    //     int n;
    //     for (int i = 1; i <= 20; i++) {
    //         n = random.nextInt(100);
    //         System.out.print(n + " ");
    //         abb.insere(n);
    //     }
    //     System.out.println();
    //     System.out.println(abb.percorreEmOrdem());
    //     n = random.nextInt(100);
    //     if (abb.buscaBinaria(n)) {
    //         System.out.println(n + " esta na arvore");
    //     } else {
    //         System.out.println(n + " nao esta na arvore");
    //     }
    //     try {
    //         System.out.println("altura da arvore: " + abb.altura());
    //     } catch (ExcecaoArvoreVazia excecaoArvoreVazia2) {
    //         excecaoArvoreVazia2.printStackTrace();
    //     }

    // }
public static void main(String[] args){
    ABB abb = new ABB();

    try {
        System.out.println("altura da arvore nova: " + abb.altura());
    } catch (ExcecaoArvoreVazia e) {
        System.out.println(e.getMessage());
    }

    Random random = new Random();
    int n;
    for (int i = 1; i <= 20; i++) {
        n = random.nextInt(100);
        System.out.print(n + " ");
        abb.insere(n);
    }

    System.out.println();
    System.out.println(abb.percorreEmOrdem());

    n = random.nextInt(100);
    if (abb.buscaBinaria(n)) {
        System.out.println(n + " esta na arvore");
    } else {
        System.out.println(n + " nao esta na arvore");
    }

    try {
        System.out.println("altura da arvore: " + abb.altura());
    } catch (ExcecaoArvoreVazia e) {
        System.out.println(e.getMessage());
    }

    System.out.println("A árvore é estritamente binária? " + abb.estritamenteBinaria());

    int a = 20;
    int b = 50;
    int qtd = abb.contarIntervalo(a, b);
    System.out.println("Quantidade de valores entre " + a + " e " + b + ": " + qtd);

    System.out.println("A quantidade de nós é: "+abb.contarNo());
    System.out.println("A quantidade de nós é: "+abb.contarNos());
    }
}
