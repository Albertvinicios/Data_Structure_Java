public class Recursao {

    static double fatorial (int n) { // metodo para calcular fatorial, com valor de retorno Double
        if (n <= 1){
         return 1; // se o valor recebido, for menor ou igual a 1, retorne 1.
        }else{
        return n * fatorial(n-1);// o fatorial é ele mesmo vezes o  número fatorial anterior.
        } //se não retorne o valor recebido menos o método fatorial do numero menos 1.
    }
    static int fibonacci (int n) { // recebe o número no parametro
        if (n <= 1) return 1; // se n <= 1 ou seja 0 ou 1, retorna 1.
        return fibonacci(n-1) + fibonacci(n-2); // fibonatti é o metodo fibonacci do n-1 + o metodo fibonacci do n-2
    }
    static void exibe1aN(int i, int n) { // metodo recursivo de printar a soma de um número até chegar no limite
        System.out.println(i); // printando a entrada i
        if (i < n)  exibe1aN(i+1, n); // se i < n chama o metodo de volta somando 1 na posição i.
    }
    static void exibe1aN (int n) { // metodo recursivo que conta valores até chegar no limite.
        if (n>1) exibe1aN(n-1); // se o n recebido for maior que 1 chama o metodo com um valore menor
        System.out.println(n);// printa o valor de n de forma recursiva por conta da pilha
    }
    
    static int soma1aN (int n) { // metodo para somar de forma recursiva
        if (n==0) return 0; // se n == 0, retorna 0
        return n + soma1aN(n-1); // se nao soma o valor com o n-1
    }
    static int soma1aN (int i, int n) { // metodo de soma recursiva com 2 parametros
        if (i==n) return n; // se i == ao limite, retorna o limite
        return i + soma1aN(i+1, n); // retorna i + com a recursão somada
    }
    static int somaVetor (int[] v, int i) {//faz o mesmo que as outras somas, mas com vetor
        if (i == v.length-1) return v[i];// parametro i limite definido, e v vetor., se i = ao tamanho do vetor-1
        return v[i] + somaVetor(v, i+1); // retorna o vetor, se não retorna o vetor e a recursão soma
    }
    static int potencia (int base, int expoente) { // recursão de potencia, dois parametros
        if (expoente == 0) return 1; // se o expoente for 0 retorna 1
        return base * potencia(base, expoente-1); // se não multiplica a base * o metodo com o expoente descrescendo.
    }
    static int multiplicacao (int fator1, int fator2) { // recebe os valores a multiplicar, o fator 2 é o dator de multiplicação
        if (fator1 == 0 || fator2 == 0) return 0; // se algum for 0 o valor é 0, // ele descresce e o outro somase.
        return fator1 + multiplicacao(fator1, fator2-1); // se não o fator 1 soma a multiplicação
    }
    public static void main(String[] args) {
        //for (int i=0; i <= 10; i++)
             //System.out.printf("fatorial de %d = %.0f\n", i ,fatorial(i));
        //for (int i=0; i <= 10; i++)
             //System.out.println ("Fibonacci em " + i + " = " + fibonacci(i));
        //exibe1aN(1, 5);
        //exibe1aN(5);
        //System.out.println(soma1aN(4));
        //System.out.println(soma1aN(1, 4));
        //int[] v = {1, 2, 3, 4};
        //System.out.println(somaVetor(v,0));
        //System.out.println(potencia(3, 4));
        //System.out.println(multiplicacao(3, 4));
    }
}


// Recursão
// ----> Ocorre quando um procedimento faz chamadas a ele mesmo;
// Permite repetir código (quase todo laço pode ser escrito na forma de recursão.)
// a primeira coisa a ser definida é o critério de parada.
// caso base
// um exemplo didático : calcular fatorial de um número.
// N! fatorial = 1 , n <= 1
// n.(n-1)!, n > 1
// 4! = 4 x 3!
// 3! = 4 x 3 x 2!
// 2! = 4 x 3 x 2 x 1!
// 1! = 4 x 3 x 2 x 1 = 24
// esse exemplo estoura o valor do inteiro,  e lança valor errado.
// vamos fazer fibonacci
// fib(n) = { 1, n <= 1}
		//	{fib(n-1) + fib(n-2),}
		// n > 1 com numeros naturais
// o número negativo é estouro do int também
// teia recursion ou recursao de calda, fibonacci e exibev2 empilha mais, a exibe1 não, faz o que tem que fazer e conta
// não tem que guardar operações na memoria para depois utilizar
// sobrecarga utiliza o mesmo metodo, com parametros diferentes.