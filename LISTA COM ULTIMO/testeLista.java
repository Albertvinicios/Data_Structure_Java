public class testeLista {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.insereInicio(30);
        lista.insereInicio(20);
        lista.insereInicio(10);

        System.out.println("Original: ");
        System.out.println(lista);

        lista.insereAntes(99, 0);  // antes do primeiro
        lista.insereAntes(77, 2);  // antes da posição 2
        lista.insereAntes(55, 10); // posição além do tamanho → fim

        System.out.println("Após inserções: ");
        System.out.println(lista);
    }
}