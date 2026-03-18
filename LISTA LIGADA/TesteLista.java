public class TesteLista {
    public static void main(String[] args) {
        //Teste da lista
        Lista lista  = new Lista(); //criação da lista instanciação
        Lista copia = new Lista(); //criação de uma nova lista para testar o método de cópia
        System.out.println("lista criada: " + lista); //print da lista criada
        //onde o método toString é chamado para mostrar o conteúdo da lista.

        lista.insereInicio(10); //inserção de um nó no início da lista, onde o valor do nó é 10,20,30
        lista.insereInicio(20);
        lista.insereInicio(30);
        System.out.println("lista depois das insercoes de inicio:");
        System.out.println(lista);

        System.out.println(lista.removeInicio() + " saiu do inicio");//teste do método de remoção do início da lista
        //onde o valor removido é mostrado
        System.out.println("lista depois da remocao de inicio");
        System.out.println(lista);
        //teste de inserção no fim da lista, onde o valor do nó é 15,25,35
        lista.insereFim(15);
        lista.insereFim(25);
        lista.insereFim(35);
        System.out.println("lista depois das insercoes de fim");
        System.out.println(lista);
        //teste da lista copia da primeira
        copia = lista.copia(); //teste do método de cópia, onde a nova lista recebe os mesmos valores da primeira
        //mas são objetos diferentes, ou seja, alterações em uma não afetam a outra
        System.out.println("aqui foi gerado a cópia dos nós anteriores");
        System.out.println(copia);

        System.out.println("aqui foi inserido mais um no fim e no início");
        lista.insereInicio(7);
        lista.insereFim(60);
        System.out.println(lista);
        System.out.println("Aqui foi alterado conteúdo principal, mantendo a copia como estava");
        System.out.println(copia); //mostra a difença da lista após inserções na principal
        System.out.println(lista.buscaValor(20)); //teste da busca do valor na lista
        System.out.println("Qual a quantidade de nós após a posição 3 da lista");
        System.out.println(lista.contarApos(10)); //teste do método de contar quantos nós existem após a posição do valor 10, onde o valor 10 é o terceiro nó da lista, ou seja
        //a contagem começa a partir do próximo nó, ou seja, do quarto nó da lista.
    }
}