package GameProject;

public class EDevletManager {
	
	public void controlEDevlet(Gamer gamer) {		
		
		System.out.println(
				"�sim: "+gamer.getFirstName()+
				" Soyisim: "+gamer.getLastName()+
				" TC No: "+gamer.getNationalIdentity()+
				" Dogum Yili: "+gamer.getDogumYili());
		System.out.println("E-Devlet Bilgileriniz Uyu�uyor, ��lemlerinize Devam Edebilirsiniz.");
	}
}
