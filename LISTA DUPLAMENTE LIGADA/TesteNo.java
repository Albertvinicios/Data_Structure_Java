public class TesteNo {
    public static void main(String[] args) {
        No<Integer> no1 = new No<>(10);
        System.out.println(no1);

        No<String> no2 = new No<>("hello, world");
        System.out.println(no2);

        No<Produto> no3 = new No<Produto>(new Produto (100, "Martelo"));
        System.out.println(no3);
    }
}