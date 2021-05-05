package GameProject;

public class CampaignManager {

	public void getCampaignManager(Admin[] admin) {
		
		System.out.println("Aktif Kampanyalar Listeleniyor...");
		for (Admin admins : admin) {
			System.out.println(admins.getCampaignName());
		}
	}
}
