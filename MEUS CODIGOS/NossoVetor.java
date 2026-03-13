import java.util.Random;
// POO aula Estrutura de Dados
public class NossoVetor {
    // atributos
    private int[] v; // atributo vetor  
    private int ocupacao; // ocupacao do vetor

    // blocos especiais de construção de objetos
    // 1. padrão contrutor
    public NossoVetor() {
        v = new int[10]; // inicializa com valor 10
        ocupacao = 0; // por clareza inicializa em 0 ou posição 0
    }
    // 2. segundo construtor
    public NossoVetor(int capacidade) {    // com parametro, definido pelo usuário.
        v = new int[capacidade]; // [definine a capacidade do vetor e retorna.]
        ocupacao = 0; // ocupação permanece em 0.
    }

    // acessa posição vetor, getter posiçao com parametro.
    public int getPosicaoVetor(int posicao) { // pegar a posição, caso seja necessário
        return v[posicao];  // como é vetor tem que estar entre []!!
    }

    // altera posição do vetor
    public void setPosicaoVetor(int posicao, int valor) { //seta um valor na posição
        v[posicao] = valor; //ex seta o valor -1 na posição 2
    }

    // acessa o vetor
    public int[] getV() { //acessa o vetor v, pega se for necessário
        return v; // acessa o vetor v
    }
    public NossoVetor copia(){
        NossoVetor copia = new NossoVetor(this.v.length);
        for(int i = 0; i < this.v.length; i++){
            copia.v[i] = this.v[i];
        }
        copia.ocupacao = this.ocupacao;
        return copia;
    }

    public boolean estaVazio() { // utilizar esse metodo para verificar se a ocupação  está vazia!
        return ocupacao == 0; // se estiver vazio retorna 0 na ocupação.
    }

    public boolean estaCheio() { // utilizar esse metodo para verificar se a ocupação da  está cheia!
        return ocupacao == v.length; // se for verdade, retorna o tamanho do vetor na ocupação
    }

    private void dobra() {
        int[] vLocal = new int[v.length * 2];
        for (int i=0; i<ocupacao; i++)
            vLocal[i] = v[i];
             v = vLocal;
        }

    private void reduzirMetade() {
        int[] vLocal = new int[v.length / 2];
        for (int i=0; i < ocupacao; i++)
            vLocal[i] = v[i];
            v = vLocal;
         }
    // faz o redimensionamento do vetor
    private void redimensiona(int novoTamanho) { // vai redimensionar o vetor
        int[] vLocal = new int[novoTamanho]; //inicia a criação de um novo vetor vLocal
        for (int i = 0; i < ocupacao; i++) // preenche a posição do vetor vLocal de acordo com a ocupação
            vLocal[i] = v[i]; // e os valores agora são iguais
        v = vLocal; // posições dos vetores, agora são iguais
    }

    // inserir um elemento no vetor
    public void insereElemento(int elemento) { //metodo feito para aumentar, inserir elemento na caixa
        if (estaCheio()) // caso esteja cheia
            redimensiona(v.length * 2); // chama o redimensionamento, multiplicado por 2, altera o tamanho da caixa
        v[ocupacao++] = elemento; // o tamanho do vetor aumenta, e a ocupação passa para o próximo elemento.
    }

    // remover o último elemento, se não estiver vazio
    public int remove() { // remover elemento do vetor
        if (!estaVazio()) { // se não estiver vazio
            ocupacao--; // a ocupação - a ultima posição preenchida do vetor
            if (v.length > 4 && ocupacao <= v.length / 4) // se o tamanho do vetor for maior que 4 e a ocupação menor ou igual ao tamanho do vetor
                redimensiona(v.length / 2);         // sobre 4, então redimensiona e divide o novo tamanho por 2
            return v[ocupacao]; // retorna a nova ocupação redimencionada.
        }
        return -1; // -1 posição de ocupação, empurrando todos os ementos preenchidos para esquerda.
    }

    // verificar se um elemento está ou não no vetor: busca simples
    public boolean contem(int x) { // compara a condição, se tem o numero no vetor
        for (int i = 0; i < ocupacao; i++) // percorre o vetor
            if (v[i] == x) // se a algum i for igual a ocupação 
                return true; // então é verdadeiro
        return false; // se não é falso
    }

    public boolean buscaBinaria(int x) { // metodo de busca binária, recebe um parametro
        int ini = 0, fim = v.length - 1; // criação de duas variáveis, ini = 0, e fim o tamanho do vetor -1
        while (ini <= fim) { // enquanto o ini for menor ou igual ao fim
            int meio = (ini + fim) / 2; // variação meio criada, media entre ini e fim
            if (x == v[meio]) // se o parametro for igual ao vetor no meio
                return true; // a condição é verdadeira
            if (x > v[meio]) // se o parametro for maior que vetor na media
                ini = meio + 1; // inicios é igual ao meio + 1 para verificar a próxima posição
            else
                fim = meio - 1; // se o fim for igual ao meio -1
        }                       //nada acontece
        return false; // e a condição é falsa, consite em procurar a variável x de maneira mais rápida.
    }

    // devolver o número de elementos na lista
    public int tamanho() { // retorno inteiro da ocupação, verifica a oculpação
        return ocupacao;
    }

    public void preencheVetor() { //metodo que preenche o vetor randomico.
        Random random = new Random(); // cria o objeto para randomizar
        for (int i = 0; i < v.length; i++) { // for de preenchimento do vetor
            v[i] = random.nextInt(v.length * 10); // preenchimento, com fator de multiplicação
                                                    // possibilitando menos repetições, por isso *10
        }
        ocupacao = v.length; //a ocupação assume o valor vetor.
    }

    public void bubbleSort() { // metodo de ordenação bubble
        for (int i = 1; i < v.length; i++) { // cria duas variáveis, uma percorre o vetor iniciando em 1 que calcula as passadas
            for (int j = 0; j < v.length - i; j++) { // outra percorre o vetor iniciando em 0 enquanto j < vetor - i(externo) ex v(5) - 1 = 4
                if (v[j] > v[j + 1]) { // se vetor[j]  for maior que vetor[j+1] ou seja, o mesmo vetor uma posição a frente, 
                    int aux = v[j]; // o auxiliar é criado para salvar o vetor[j]
                    v[j] = v[j + 1];// o vetor[j] passa a ser o vetor[[j+1]] 
                    v[j + 1] = aux; //que por sua vez retorna ao valor auxiliar e a conta recomeça
                }                   // até o vetor ser completado
            }
        }
    }

    public void selectionSort() { // ordenação por seleção
        for (int i = 0; i < v.length - 1; i++) { //lopp externo, mas com valor da posição atual
            int pos = i; // diferente do bubble, que é o valor futuro.
            for (int j = i + 1; j < v.length; j++) // lopp interno procura o menor valor
                if (v[j] < v[pos]) // ao longo do vetor, se v[j] for menor v[[i]]
                    pos = j; // a posição menor vai para j
            if (pos != i) { // se a posição for diferente de i
                int aux = v[pos]; // cria o auxiliar e salva a posição atual
                v[pos] = v[i]; // a posição atual vai para o valor de i
                v[i] = aux; // e salva no auxiliar
            }
        }
    }

    public void insertionSort() {
        for (int j = 1; j < v.length; ++j) { // loop externo percorre o vetor do 2 até o ultimo
            int x = v[j]; // vamos inserir a parde já ordenada aqui
            int i; // variavel criada para novo loop
            for (i = j - 1; i >= 0 && v[i] > x; --i) // loop
                v[i + 1] = v[i]; // desloca os valores maiores que x para direita
            v[i + 1] = x; // a posição correta é inserida no x
        }
    }

    public int partition(int p, int r){ //utiliza recursão, divisão e conquista, particiona vetor
        int x = v[r]; // x recebe o vetor na última posição
        int i = p-1; // i recebe p-1, p é a primeira posição
            for(int j = p;j < r; j++){ // laço para percorrer vetor j
                if(v[j] <= x){ // se o vetor j for menor ou igual ao vetor na última posição
                    i = i+1; // i avança uma posição no vetor
                    int aux = v[i]; // variável de troca recebe o i+1
                    v[i] = v[j]; // vetor na posição i recebe a troca
                    v[j] = aux; // e o j recebe o i
                }
            }
        i = i + 1; // saiu do laço, i avança 1
        int aux = v[r]; // e o auxilizar troca a posição final
        v[r] = v[i]; // novamente
        v[i] = aux;
        return i; // e retorna i

    }

    public void quickSort(int p, int r){
        //System.out.println("\n p = "+p+", r = "+ r);
        if(p < r){ // enquanto v for menor que r
            int q = partition(p , r); // particiona
            //System.out.println("\nq = "+ q);
            quickSort(p, q-1); // e chama o método
            quickSort(q+1, r); // para quando for ordenado.
        }
    }
    
    public String toString() { // resposável pela impressão do vetor, utilizado com +nossoVetor
        String s = "tamanho = " + v.length + "\nocupacao = " + ocupacao + "\n" + "\n"; // imprime a capacidade e ocupação
        for (int i = 0; i < v.length; i++) { // for para impressão!!
            s += "["+ v[i] +"]"; // o valor de s é igual ao vetor, e s é impresso!
        }
        System.out.println("");
        return s;// retorna tudo ao nossoVetor quando concatenado com +.
    }
}

//quicksort, é o algoritmo mais rápido, não tem como ser mais rápido,
// a força está na divisão, na quebra do Vetor, a hora que junta já ordena
// já o MergeSort quebra na metade e conquista, a combinação dos resultados.
// na API do Java já vem o MergeSort
//o problema do QuickSort é o Estouro de Pilha 
// e o problema do Mergesort é a duplicação do uso de memória, copia cada vez que duplica.
//back tracking é uma técnica de recursividade, estratégias de uso.
//problema da N-Rainhas, menor problema é o 4x4, backtrackingum paso atrás para ganhar impulso.
// quem ordena o vetor é a recursão, o partion só particiona o vetor.
// em cada passada você reduz o número de elementos, por isso ganha em processamento.
//Estudo sobre o quick, o logaritmo da base 2 32 = 5;