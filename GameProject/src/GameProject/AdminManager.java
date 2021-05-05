package GameProject;

public class AdminManager {
	
	public void addCampaign(Admin admin) {
		
		System.out.println(
				"Kampanya Ismi: "+admin.getCampaignName()+
				" Kampanya Tarihi: "+admin.getCampaignDate()); 
	}
	
	public void reCreateCampaign(Admin admin) {
			admin.setId(10);
			admin.setUserName("Engin Demiro�");			
			admin.setCampaignName("Summer Sale Up To %75");
			admin.setCampaignDate("19.05.2021/02.07.2021");
			System.out.println("Kampanya "+ admin.getCampaignName() + " Olarak G�ncellendi");
	}
	
	public void deleteCampaign(Admin admin) {
			System.out.println(admin.getCampaignName() + " Kampanyas� Silindi");
	}

}
