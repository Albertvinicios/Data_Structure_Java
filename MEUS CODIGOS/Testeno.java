public class Testeno{
	public static void main(String[] args){
		No no1 = new No(10);
		No no2 = new No(10);


		no1.setProximo(no2); // alocou o espaço da memoria 2 no proximo da memoria 1
		no1.getProximo().setInfo(77); // usa 1 para alterar a 2
		System.out.println("  "+ no2.getInfo());

		no2.setProximo(no2); // seta o valor na memoria de no2 no proximo.
	}
}