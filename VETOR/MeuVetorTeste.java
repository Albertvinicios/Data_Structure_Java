public class MeuVetorTeste {
    public static void main(String[] args){

        MeuVetor m1 = new MeuVetor(); //intanciação do objeto meu vetor
        MeuVetor m2 = new MeuVetor(10); 

        m1.preVetor(); //preenchendo vetor de forma randomica conforme o método preVetor
        m2.preVetor();

        System.out.println(m1);
        System.out.println(m2);

        MeuVetor m3 = new MeuVetor(m2); //atribuindo os valores do vetor m2 para o vetor m3
        m3.removeUltimo();
        System.out.println(m3); //mostrando vetor m3 recebido

        m1.removeUltimo(); //removendo o último elemento do vetor m1
        System.out.println(m1);

        MeuVetor m4 = new MeuVetor(10); //criando um vetor m4 com tamanho 10
        // mas sem preencher, ou seja, vazio
        System.out.println(m4); //mostrando
        m4.insereUltimo(50); //inserindo na última posição o valor 50
        m4.insereUltimo(20); //inserindo na última posição o valor 20
        System.out.println(m4); //printando mostra 50,20.
    }   
}