public class meuTeste {
    public static void main(String[] args) {
    minhaPilhaLig p = new minhaPilhaLig();
    p.meuPush(10);
    p.meuPush(20);
    p.meuPush(30);
    System.out.println(p); // saída: [ 30 ] -> [ 20 ] -> [ 10 ] -> \\

    int x = p.meuPop();       // x == 30
    System.out.println(x);
    System.out.println(p);
    }
}
