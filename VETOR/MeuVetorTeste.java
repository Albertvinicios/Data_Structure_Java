public class MeuVetorTeste {
    public static void main(String[] args){

        MeuVetor m1 = new MeuVetor();
        MeuVetor m2 = new MeuVetor(10);

        m1.preVetor();
        m2.preVetor();

        System.out.println(m1);
        System.out.println(m2);

        MeuVetor m3 = new MeuVetor(m2);
        m3.removeUltimo();
        System.out.println(m3);

        m1.removeUltimo();
        System.out.println(m1);

        MeuVetor m4 = new MeuVetor(10);
        System.out.println(m4);
        m4.insereUltimo(50);
        m4.insereUltimo(20);
        System.out.println(m4);
    }   
}