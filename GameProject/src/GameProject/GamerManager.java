package GameProject;


public class GamerManager extends Gamer{
	
	
	
	public void addGamer(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() +" "+gamer.getLastName()+ " Eklendi");
		
	}
	
	public void reCreateGamer(Gamer gamer, Product product) {
		
		gamer.setId(2);
		gamer.setFirstName("Sude");
		gamer.setLastName("Ozkanoglu");
		gamer.setDogumYili(2002);
		gamer.setNationalIdentity("22222222222");		
		gamer.setYas(gamer.getDogumYili(),gamer.getYas());
		product.setGameName("The Sims4");
		product.setProductPrice("75TL");
		// OYUN ADI // ADM�N MANAGER KALDI
		gamer.setId(2);
		
		System.out.println(gamer.getFirstName() +" "+ gamer.getLastName() + " Kullan�c�ya G�ncellendi");
		
	}
	
	public void deleteGamer(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " Is�m/Soy Is�ml� Kullan�c� Silindi");
	}
	
	
}
