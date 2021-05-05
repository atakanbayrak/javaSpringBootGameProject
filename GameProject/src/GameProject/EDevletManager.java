package GameProject;

public class EDevletManager {
	
	public void controlEDevlet(Gamer gamer) {		
		
		System.out.println(
				"Ýsim: "+gamer.getFirstName()+
				" Soyisim: "+gamer.getLastName()+
				" TC No: "+gamer.getNationalIdentity()+
				" Dogum Yili: "+gamer.getDogumYili());
		System.out.println("E-Devlet Bilgileriniz Uyuþuyor, Ýþlemlerinize Devam Edebilirsiniz.");
	}
}
