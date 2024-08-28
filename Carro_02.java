package POO;
public class Carro_02 {

	public static void main(String[] args) {
		
		Carro_01 carro1 = new Carro_01();
		Carro_01 carro2 = new Carro_01();
		Carro_01 carro3 = new Carro_01();
		Carro_01 carro4 = new Carro_01();
		
		
		carro1.setCor("roxo");
		carro1.setPorta(4);
		carro1.setRodas(4);
		carro1.settipoCarro("Esportivo");
		
		
		carro2.setCor("prata");
		carro2.setnumPorta(5);
		carro2.setnumRodas(4);
		carro2.settipoCarro("Carro popular");
		
		
		carro3.setCor("vermelha");
		carro3.setnumPorta(6);
		carro3.setnumRodas(4);
		carro3.settipoCarro("SUVs");
		
		
		carro4.setCor("preto");
		carro4.setnumPorta(0);
		carro4.setnumRodas(6);
		carro4.settipoCarro("Camionete");
		
		
		System.out.println("-----Carro 1-----");
		System.out.println(carro1.getCor());
		System.out.println(carro1.getnumPorta());
		System.out.println(carro1.getnumRodas());
		System.out.println(carro1.gettipoCarro());
		
		
		System.out.println("-----Carro 2-----");
		System.out.println(carro2.getCor());
		System.out.println(carro2.getnumPorta());
		System.out.println(carro2.getnumRodas());
		System.out.println(carro2.gettipoCarro());
		
		
		System.out.println("-----Carro 3-----");
		System.out.println(carro3.getCor());
		System.out.println(carro3.getnumPorta());
		System.out.println(carro3.getnumRodas());
		System.out.println(carro3.gettipoCarro());
		
		
		System.out.println("-----Carro 4-----");
		System.out.println(carro4.getCor());
		System.out.println(carro4.getnumPorta());
		System.out.println(carro4.getnumRodas());
		System.out.println(carro4.gettipoCarro());
		}
		}