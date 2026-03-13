public class NovoTeste {
    public static void main(String[] args) {
        NossoVetor nVetor = new NossoVetor(4); // cria o objeto vetor com tamanho 4
        for (int i=1; i<36; i++) { // percorre o vetor até atingir 36 posições
            nVetor.insereElemento(i); // chama o método insere elemento, para aumentar tamanho vetor
            System.out.println(nVetor); // além de ir usando o remove, para puxar os preenchidos para esquerda
        };// no final printa todos os vetores.
    }
}