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
		// OYUN ADI // ADMÝN MANAGER KALDI
		gamer.setId(2);
		
		System.out.println(gamer.getFirstName() +" "+ gamer.getLastName() + " Kullanýcýya Güncellendi");
		
	}
	
	public void deleteGamer(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " Isým/Soy Isýmlý Kullanýcý Silindi");
	}
	
	
}
