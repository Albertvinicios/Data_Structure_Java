	public class Pilha{ 
		// implementação de pilhas utilizando vetores
		//Rodrigo Bossini
		// tipoa abstratos de Dados
		// int(4b) : -2 [-2 -1 + - */ %
		// pilha é uma abstração que o último que entra é o primeiro a sair.
		// exemplo pilhas de cartas, e pilha de potes 
		// inseri em cima, remove em cima
		// empilhar() push, desempilhar() pop, verificar tamanho(), vazia() ou cheia()
		// andre backes aulas
		// Univesp Estrutura de Dados pilha implementação de Estática
		// pré incremento ++i e pós incremento i++
		private int topo; // atributo topo da pilha
		private int[] v; // atributo vetor
		
		public Pilha(){ //construtor determinando o tamanho da pilha 10
			this.v = new int[10];
			this.topo = -1;
		}
		public Pilha (int capacidade){ // construtor com parametro
			this.topo = -1;				// o topo começa em -1 vazia
			this.v = new int[capacidade];// vetor criado com a capacidade definida
		}
		public boolean estaVazia(){ // método para dizer se a pilha está vazia
			return topo == -1; // se ela estiver vazia o topo é menos 1 e a condição é verdadeira
			//return topo == -1? true : false;
		}
		public boolean estaCheia(){ // se a pilha estiver cheia
			return topo == v.length -1; // se o valor do topo for igual ao valor do vetor - 1
			// retorna também verdadeira ou false
		}
		public boolean push (int elemento){ //comparação com parametro 
			if(estaCheia()) // se a pilha estiver cheia
				return false; // retorne falso
			v[++topo] = elemento; //se não some 1 ao topo da pilha e atribua o retorno ao parametro, incremento 
			return true; // retorne verdadeiro
		}
		public int pop(){ // entrada do pop, retirada do valor do topo da pilha
			int aux = v[topo--]; // cria uma variável de auxilio, ela vai ser igual ao vetor[topo--] decresce o valor
				return aux; // retorne o novo valor da pilha
		}
		public int tamanho(){ // verifica o tamanho da pilha
			return topo+1; // retorna o topo da pilha + 1, porque ela começa em 0
		}
		@Override // sobrecreveu o método toString 
		public String toString(){ // 
			String s = ""; // atribuição de string a variável s
			if (estaVazia()) s += "estavazia"; // se a pilha estiver vazia, escreve estavazia
			else // se não
				for (int i = topo; i >= 0; i--) // o loop percorre o vetor do topo até em baixo
					s += v[i] + "\n"; // imprime o valor do vetor com linha quebrada
			s += "--------\n"; // e no final linhas
			return s; // retorna a quem chamou o toString
		}
	}