public class Recursao { //Modelos de Recursão
    static double fatorial (int n) { //Método Statico que significa que pode ser chamado
    //sem a necessidade de criar um objeto da classe Recursao
        if (n <= 1) return 1; //recursão de cauda, ou seja, se n for menor ou igual a 1
        // retorna 1, onde o fatorial de 0 e 1 é igual a 1
        //a chamada recursiva é a última operação realizada na função
        return n * fatorial(n-1); //se não for 1 passa o numero multiplicando a recursão de n-1, ou seja
        //o fatorial de n é igual a n multiplicado pelo fatorial de n-1
        //ao fim da recursão, o resultado é calculado e retornado para a chamada original.
    }
    static int fibonacci (int n) {//método para calcular o n-ésimo número da sequência de Fibonacci
        if (n <= 1) return 1; //semelhante ao fatorial, se n for menor ou igual a 1, retorna 1
        //onde o primeiro e segundo número da sequência de Fibonacci é 1
        return fibonacci(n-1) + fibonacci(n-2); //porém fibonacci é a soma dos dois números anteriores
        //ou seja, o n-ésimo número da sequência de Fibonacci
        //é igual a soma do (n-1)-ésimo e do (n-2)-ésimo número da sequência de Fibonacci
    }
    static void exibe1aN(int i, int n) {//método para exibir os números de 1 a n
    //onde i é o número atual e n é o número final
        System.out.println(i); //exibe o número atual
        if (i < n)  exibe1aN(i+1, n); //se o número atual for menor que o número final
        //chama a função recursivamente, ordem crescente
    }
    static void exibe1aN (int n){ //método para exibir os números de 1 a n
    //onde n é o número final, mesmo nome de método, mas assinatura diferente. concento POO
        if (n>1) exibe1aN(n-1);//nesse caso ordem decrescente, onde se n for maior que 1
        //chama a função recursivamente com n-1
        System.out.println(n);//exibe o número atual, onde o número atual é n, ou seja, o número final
    }
    //somar os valores de 1 a n
    static int soma1aN (int n) { //método para somar os valores de 1 a n
        if (n==0) return 0; //se n for igual a 0, retorna 0, onde a soma de 1 a 0 é igual a 0
        return n + soma1aN(n-1); //se n for diferente de 0, retorna n mais a soma de 1 a n-1
        //ou seja, a soma de 1 a n é igual a n mais a soma de 1 a n-1
    }
    static int soma1aN (int i, int n) { //método para somar os valores de 1 a n
    //onde i é o número atual e n é o número final
        if (i==n) return n; //se i for igual a n, retorna n
        //onde a soma de 1 a n é igual a n
        return i + soma1aN(i+1, n); //retorna i mais a soma de i+1 a n, ou seja
        //a soma de 1 a n é igual a i mais a soma de i+1 a n
    }
    static int somaVetor (int[] v, int i) { //método para somar os valores de um vetor
    //onde v é o vetor e i é o índice atual
        if (i == v.length-1) return v[i];//se i for igual ao último índice do vetor
        //retorna o valor do vetor nesse índice
        return v[i] + somaVetor(v, i+1); //se i for diferente do último índice do vetor
        //retorna o valor do vetor nesse índice, somando com a soma dos valores do vetor
        //a partir do próximo índice
    }
    static int potencia (int base, int expoente) { //método para calcular a potência de um número
        if (expoente == 0) return 1; //em java pode se usar Math.pow(base, expoente)
        //para calcular a potência de um número, mas esse método também pode ser implementado
        //usando recursão, se o expoente for 0, o valor é 1
        return base * potencia(base, expoente-1); //se não multiplica a base pela recursão
        //da base com o expoente diminuído de 1
        //ou seja, a potência de um número..
    }
    static int multiplicacao (int fator1, int fator2) {//método para multiplicar dois números usando recursão
        if (fator1 == 0 || fator2 == 0) return 0;//se o fator1 ou o fator2 for igual a 0
        // retorna 0, onde a multiplicação de qualquer número por 0 é igual a 0
        return fator1 + multiplicacao(fator1, fator2-1);//se não, retorna o fator1 mais a multiplicação do fator1 com o fator2
        //diminuído de 1 a cada Recursão do último fator, ou seja, a multiplicação de dois números é igual
        //a soma do primeiro número
    }
    public static void main(String[] args) { //método principal
    //para testar os métodos recursivos staticos implementados
        for (int i=0; i <= 5; i++)
            System.out.printf("fatorial de %d = %.0f\n", i ,fatorial(i));
        for (int i=0; i <= 10; i++)
            System.out.println ("Fibonacci em " + i + " = " + fibonacci(i));
        exibe1aN(1, 5);
        exibe1aN(5);
        System.out.println(soma1aN(4));
        System.out.println(soma1aN(1, 4));
        int[] v = {1, 2, 3, 4};
        System.out.println(somaVetor(v,0));
        System.out.println(potencia(3, 4));
        System.out.println(multiplicacao(3, 4));
    }
}
