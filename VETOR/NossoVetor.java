import java.util.Random;

public class NossoVetor {
    private int[] v; //iniciação do vetor na classe Nosso vetor atributo v
    private int ocupacao; //ocupação do vetor

    // blocos especiais de construção de objetos
    // 1. padrão
    public NossoVetor() {
        v = new int[10]; //atribuição da construtor padrão, vetor de tamanho 10
        ocupacao = 0; // por clareza
    }

    public NossoVetor(int capacidade) { //construtor com parâmetro, 
    //onde o usuário pode escolher o tamanho do vetor
        v = new int[capacidade]; //sendo a capacidade
        ocupacao = 0; //ocupação permanece zero, pois ela só altera quando existe elementos
    }

    // acessa posição vetor
    public int getPosicaoVetor(int posicao) { //acessa posição x
        return v[posicao];
    }

    // altera posição do vetor
    public void setPosicaoVetor(int posicao, int valor) { //insere o valor na determinada posição
        v[posicao] = valor; //alterando o consteúdo anterior e atribuindo nessa posição um novo valor.
    }

    // acessa o vetor
    public int[] getV() {//acessa e retorna o vetor V
        return v;
    }

    public boolean estaVazio() { //Método para verificar se o vetor está vazio
        return ocupacao == 0; //verifica se a ocupação está zero, e o retorno é true ou false
    } //sendo a condição de true ser igual a 0, e a de false ser diferente de 0

    public boolean estaCheio() { //método para verificar se o vetor está cheio
        return ocupacao == v.length; //se a ocupação estiver no tamanho do vetor, retorna verdadeiro
        //se não retorna falso.
    }

    public void dobra(){ //retorno vazio, método para dobrar tamanho do vetor
        int[] vLocal = new int[v.length * 2]; //inicializa um novo vetor de tamanho dobrado
        for (int i=0; i<ocupacao; i++){ //percorre o vetor até a ocupação, 
        // ou seja, até onde tem elementos
            vLocal[i] = v[i]; //enquanto atribui os valores anteriores para o vetor v
            v = vLocal; //atribui o vetor v para o vetor vLocal, ou seja, o vetor v agora 
            // tem o dobro do tamanho
        }
    }

    public void reduzirMetade() { //reduz pela metade o tamanho do vetor
        int[] vLocal = new int[v.length / 2]; //inicializa novo vetor, com metade do tamanho de v
        for (int i=0; i < ocupacao; i++){ //percorre o vetor atribuindo os valores anteriores
            vLocal[i] = v[i]; //aqui atribui os valores
            v = vLocal; //e aqui faz o v principal receber o vetor vlocal pela metade
        }
    }
    // faz o redimensionamento do vetor
    private void redimensiona(int novoTamanho){ //definir novo tamanho, passado por parametro
        int[] vLocal = new int[novoTamanho]; //inicializa com novo tamanha recebido
        for (int i = 0; i < ocupacao; i++) // percorre o vetor até a ocupação, ou seja, 
        // até onde tem elementos
            vLocal[i] = v[i]; //atribui os valores do vetor antigo
            v = vLocal; //atribui o valor do v principal no local com novo tamanho
    }

    // inserir um elemento no vetor
    public void insereElemento(int elemento) { //elemento passado por parâmetro para ser inserido
        if (estaCheio()) //se estiver cheio, redimensiona para o dobro do tamanho
            redimensiona(v.length * 2); //por garantia.
        v[ocupacao++] = elemento;//aqui insere o elemento na posição da ocupação, 
        // e depois incrementa a ocupação
    }

    // remover o último elemento, se não estiver vazio
    public int remove() { //remover elemento
        if (!estaVazio()) { //se não estiver vazio, ou seja, se tiver elementos para remover
            ocupacao--; //reduz a ocupação, ou seja, a posição do último elemento
            if (v.length > 4 && ocupacao <= v.length / 4)//se o tamanho do vetor for maior que 4
            //e a ocupação for menor ou igual a um quarto do tamanho do vetor
                redimensiona(v.length / 2); //somente nesse caso, reduz pela metade o tamanho do vetor
            return v[ocupacao]; //retorna o valor do ultimo elemento
        }
        return -1; //se não tiver elementos para remover, 
        // retorna -1 ou algum valor que indique que não tem elementos
    }

    // verificar se um elemento está ou não no vetor: busca simples
    public boolean contem(int x) { //verificar se o elemento x está no vetor
        for (int i = 0; i < ocupacao; i++) //recebe x, e percorre o vetor até a ocupação, ou seja, até onde tem elementos
            if (v[i] == x) //se o vetor em alguma posição encontrar o elemento x, retorna verdadeiro
                return true;
        return false;//se não retorna false
    }

    public boolean buscaBinaria(int x) {//método para busca binária, algoritmo de busca eficiente para vetores ordenados
        int ini = 0, fim = v.length - 1; //define o início e o fim do vetor para a busca
        while (ini <= fim) { //enquando o início for menor ou igual ao fim
        //ou seja, enquanto tiver elementos para verificar
            int meio = (ini + fim) / 2; //calcula o meio do vetor
            if (x == v[meio]) //se o x estiver no meio, valor encontrado, retorna verdadeiro
                return true; 
            if (x > v[meio]) //se x for maior que o valor do meio
            //então o início da busca passa a ser o meio + 1 
                ini = meio + 1; //até encontrar o valor ou esgotar os elementos para verificar
            else //se não se o x for menor que o meio, então o fim da busca passa a ser o meio - 1
                fim = meio - 1; 
        } //se não se o início for menor ou igual ao fim, ou seja, se não tiver mais elementos para verificar.
        return false; //se o looping não encontrar o valor, o retorno é falso.
    }

    // devolver o número de elementos na lista
    public int tamanho() { //método de buscar o tamanho. 
        return ocupacao;
    }

    public void preencheVetor() { //método de preencher o Vetor
        Random random = new Random(); //utilização do Random para preencher o vetor de forma aleatória
        for (int i = 0; i < v.length; i++) { //perconrrendo o vetor
            v[i] = random.nextInt(v.length * 10); //atribuindo em cada posição do vetor, um valor inteiro 
            //aletório
        }
        ocupacao = v.length; //retornando ao final o tamanho da ocupação
    }

    public void bubbleSort() { //Algoritmo de ordenação Bubble Sort, que é um algoritmo 
    //simples de ordenação, mas não é eficiente para grandes conjuntos de dados
        for (int i = 1; i < v.length; i++){//percorre o vetor a partir do segundo elemento
            for (int j = 0; j < v.length - i; j++){//percorre o vetor até o elemento antes do último elemento
            //não ordenado
                if (v[j] > v[j + 1]) { //realiza a comparação entre o elemento atual e o próximo elemento
                    int aux = v[j]; //se o elemento atual for maior que o próximo elemento, realiza a troca
                    v[j] = v[j + 1]; //o elemento atual recebe o valor do próximo elemento
                    v[j + 1] = aux;//o próximo elemento recebe o valor do elemento atual
                    //que foi armazenado na variável auxiliar
                }//Assim ordenando todo Vetor, do menor para o maior.
            }
        }
    }

    public void selectionSort() { //Algoritmo de ordenação Selection Sort 
    // que é um algoritmo simples de ordenação,
        for (int i = 0; i < v.length - 1; i++) { //percorre o vetor até o penúltimo elemento
            int pos = i; //inicializa a posição do menor elemento como a posição atual
            for (int j = i + 1; j < v.length; j++)//percorre o vetor a partir do próximo elemento, 
            //para encontrar o menor elemento
                if (v[j] < v[pos])//se o elemento na posição j for menor que o elemento na posição pos
                //atualiza a posição do menor elemento
                    pos = j;//pos recebe a posição do menor elemento encontrado
            if (pos != i) {//se a posição do menor elemento for diferente da posição atual 
            // realiza a troca
                int aux = v[pos];
                v[pos] = v[i];
                v[i] = aux;
            }
        }
    }
    int partition (int p, int r) { //método para partição do Quick Sort 
    //que é um algoritmo de ordenação eficiente para grandes conjuntos de dados 
		int x = v[r]; //escolhe o último elemento como pivô, recebeu por parametro
        //o índice do início e do fim do vetor 
        int i = p-1; //inicializa o índice do menor elemento como p-1
		for(int j = p; j < r; j++) { //percorre o vetor do índice p até o índice r-1
	     	if (v[j] <= x) { //se o elemento na posição j for menor ou igual ao pivô
	            i = i + 1; //incrementa o índice do menor elemento
	          	int aux = v[i]; //realiza a troca entre o elemento na posição i e o elemento na posição j
	 	  	    v[i] = v[j]; 
                v[j] = aux;
            }
        }
        i = i + 1; //após
        int aux = v[r]; //realiza a troca entre o elemento na posição i e o pivô
		v[r] = v[i]; //o elemento na posição r recebe o valor do elemento na posição i
		v[i] = aux; //o elemento na posição i recebe o valor do pivô
		return i; //retorna o índice do pivô após a partição
    }
    void quickSort (int p, int r) { //método para o Quick Sort
    //recebe por parâmetro o índice do início e do fim do vetor
        //System.out.println ("\np = " + p + ", r = " + r);
        if (p < r) {  //se o índice do início for menor que o índice do fim
        //ou seja, se tiver elementos para ordenar
            int q = partition(p, r); //realiza a partição do vetor e recebe o índice do pivô.
            //System.out.println ("\nq = " + q);
            quickSort(p, q-1); //chama recursivamente o Quick Sort
            // para ordenar a sublista à esquerda do pivô
            quickSort(q+1, r); //chama recursivamente o Quick Sort
            //para ordenar a sublista à direita do pivô
        }
    }
    void insertionSort() { //Algoritmo de ordenação Insertion Sort
    // que é um algoritmo eficiente para pequenos conjuntos de dados
        for (int j = 1; j < v.length; ++j) { //percorre o vetor a partir do segundo elemento
            int x = v[j]; //armazena o valor do elemento atual em uma variável x
            int i; //inicializa o índice i como j-1, ou seja
            //o índice do elemento anterior ao elemento atual
            for (i = j - 1; i >= 0 && v[i] > x; --i) //enquanto o índice i for maior ou igual a 0
            //e o elemento na posição i for maior que x
                v[i + 1] = v[i]; //desloca o elemento na posição i para a posição i+1
            v[i + 1] = x; //insere o valor de x na posição i+1, ou seja, na posição correta do elemento atual
        }
    }

    @Override //Método de impressão 
    public String toString() { //para mostrar o conteúdo do vetor, a ocupação e o tamanho do vetor
        String s = "tamanho = " + v.length + "\nocupacao = " + ocupacao + "\n"; //inicializa a string
        //com o tamanho e a ocupação do vetor
        for (int i = 0; i < v.length; i++) { //percorre o vetor para mostrar os elementos
            s += v[i] + " "; //adiciona cada elemento do vetor à string, separado por espaço
        }
        return s; //retorna a string formatada com as informações do vetor.
    }
}
