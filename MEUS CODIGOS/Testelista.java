public class Testelista{
	public static void main(String[] args){

		Lista lista = new Lista();
		System.out.println("Lista criada: "+lista);
		lista.insereInicio(10);
		lista.insereInicio(20);
		lista.insereInicio(30);
		System.out.println("lista depois das inserções de inicio: ");
		System.out.println(lista);
		System.out.println(lista.removeInicio()+ "Saiu do inicio");
		System.out.println(lista);
		lista.insereFim(15);
		lista.insereFim(25);
		lista.insereFim(35);
		System.out.println(lista);
		lista.removeFim();
		System.out.println("Removendo valor no final");
		System.out.println(lista);
	}
}