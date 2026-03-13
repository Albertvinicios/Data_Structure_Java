public class No{ 
	
	private int info; 
	private No proximo; // exemplo de definição de classe recursiva
	// só construindo um nó se for para armazenar informação.

	//contrutor
	public No(int info){  
		this.info = info; 
		this.proximo = null; // por clareza.
	}

	//geters e setters
	public int getInfo(){
		return info;
	}
	public void setInfo(int info){
		this.info = info;
	}
	public No getProximo(){
		return proximo;
	}
	public void setProximo(No proximo){
		this.proximo = proximo;
	}

	//tipo tostring
	@Override
	public String toString(){
		return "[ "+info+ " ]";
	}
}

// no1 = no2 o valor de no2 perde a referencia de memoria. 
// no1 == no2 é referencia de memoria, o correto é usar equals, utilizado para String.
// listas encadeadas, pequenos vetores que se ligam
//versos vetor padrão, vetor grande que na hora de inserir e ordenar, demandam tempo.
// lista com marcador do primeiro, ou do último, ou ambos e por último circular.
// circular, tem ligação de primeiro e última, mas circula, pode ir pra cima ou pra baixo, retorna ao ponto
// primeiro só permite para um sentido e para
// último também
// duplo faz o mesmo que o circular para baixo ou para cima, mas não retorna ao ponto inicial.
// tem cusco, paga o preço da embalagem, 4bytes + a variável de alocação ou encadeamento da lista 8 bytes.