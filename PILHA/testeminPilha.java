public class testeminPilha {
    public static void main(String[] args){
        minhaPilha p1 = new minhaPilha(10);
        minhaPilha p2 = new minhaPilha();

        p1.meuPush(10);
        p2.meuPush(5);
        p1.meuPush(15);
        p1.meuPush(25);
        p1.meuPush(100);
        p2.meuPush(50);
        System.out.println(p1);
        System.out.println(p2);

        p1.meuPop();
        p2.meuPop();

        System.out.println(p1);
        System.out.println(p2);
    }
}