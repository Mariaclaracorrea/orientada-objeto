package POO;

public class Aviao02 {

	public static void main(String[] args) {
		Aviao aviao = new Aviao();
		
		aviao.setempresa("GOL");
		aviao.setrodas(12);
		aviao.setCor("Preto");
		aviao.setpeso(590);
		aviao.setaltura(12.19);
		
	System.out.println("------Aviao------");
	
	System.out.println(aviao.getempresa());
	
	System.out.println(aviao.getrodas()+" rodas");
	
	System.out.println(aviao.getCor());
	
	System.out.println(aviao.getpeso()+" 1 Tonelada");
	
	System.out.println(aviao.getaltura()+" metros");
		}
}

		


	


