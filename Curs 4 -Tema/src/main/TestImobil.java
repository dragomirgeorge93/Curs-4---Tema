package main;

public class TestImobil {

	public static void main(String[] args) {
		
		Imobil vila = new Imobil();
		Imobil resedinta = new Imobil("vila cu etaj", 240000);
		Imobil garaj = new Imobil("garaj cu 4 locuri de parcare", 1,9300);
		
		vila.setTipVila("vila in afara Bucurestiului");
		vila.setNrEtaje(3);
		vila.setPret(170000);
		System.out.println("Detin o " + vila.getTipVila() + " cu " + vila.getNrEtaje() + " etaje, care momentan valoreaza " + vila.getPret()+ " euro." );
		System.out.println("Urmeaza sa construiesc o alta " + resedinta.getTipVila()+ " care ma va costa "+ resedinta.getPret() + " euro");
		System.out.println("Cea de-a doua vila va dispune de un " + garaj.getTipVila() + ", cu " + garaj.getNrEtaje() + " etaj, valorand "+ garaj.getPret());
		

	}

}