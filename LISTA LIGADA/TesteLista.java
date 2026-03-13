public class TesteLista {
    public static void main(String[] args) {
        Lista lista  = new Lista();
        Lista copia = new Lista();
        System.out.println("lista criada: " + lista);
        lista.insereInicio(10);
        lista.insereInicio(20);
        lista.insereInicio(30);
        System.out.println("lista depois das insercoes de inicio:");
        System.out.println(lista);
        System.out.println(lista.removeInicio() + " saiu do inicio");
        System.out.println("lista depois da remocao de inicio");
        System.out.println(lista);
        lista.insereFim(15);
        lista.insereFim(25);
        lista.insereFim(35);
        System.out.println("lista depois das insercoes de fim");
        System.out.println(lista);

        copia = lista.copia();
        System.out.println("aqui foi gerado a cópia dos nós anteriores");
        System.out.println(copia);

        System.out.println("aqui foi inserido mais um no fim e no início");
        lista.insereInicio(7);
        lista.insereFim(60);
        System.out.println(lista);
        System.out.println("Aqui foi alterado conteúdo principal, mantendo a copia como estava");
        System.out.println(copia);
        System.out.println(lista.buscaValor(20));
        System.out.println("Qual a quantidade de nós após a posição 3 da lista");
        System.out.println(lista.contarApos(10));
    }
}