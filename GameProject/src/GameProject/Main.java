package GameProject;



public class Main {
		
	public static void main(String[] args) {
		
		CampaignManager campaignManager = new CampaignManager();
		Product product1 = new Product();
		Gamer gamer1 = new Gamer();
		Admin admin1 = new Admin();
		Admin admin2 = new Admin();
		AdminManager adminManager = new AdminManager();
		GamerManager gamerManager = new GamerManager();
		ProductManager productManager = new ProductManager();
		EDevletManager eDevletManager = new EDevletManager();
		
		gamer1.setId(1);
		gamer1.setFirstName("Atakan");
		gamer1.setLastName("Bayrak");
		gamer1.setDogumYili(2001);
		gamer1.setNationalIdentity("111111111111");
		gamer1.setYas(21,gamer1.getDogumYili());	
		
		product1.setGameName("BF1");
		product1.setProductPrice("150TL");
		gamerManager.addGamer(gamer1);
		gamerManager.reCreateGamer(gamer1,product1);
		gamerManager.deleteGamer(gamer1);
		
		eDevletManager.controlEDevlet(gamer1);	
		productManager.saleProduct(gamer1, product1);
		
		admin1.setId(1);
		admin1.setUserName("Atakan Bayrak");
		admin1.setCampaignName("Winter Game Sale Up To %50");
		admin1.setCampaignDate("30.11.2021/18.02.2021");
		
		admin2.setId(2);
		admin2.setUserName("Ayca Bayrak");
		admin2.setCampaignName("Fall Game Sale Up To %50");
		admin2.setCampaignDate("30.09.2021/30.11.2021");
		
		adminManager.addCampaign(admin1);
		adminManager.reCreateCampaign(admin1);
		adminManager.deleteCampaign(admin1);
		
		Admin[] admins = {admin1,admin2};
		
		campaignManager.getCampaignManager(admins);
	}
}
