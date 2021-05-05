package GameProject;

public class ProductManager {
	
	public void saleProduct(Gamer gamer, Product product) {
		
		System.out.println(
				gamer.getFirstName() +
				" "+ gamer.getLastName() +
				" Kullanicisi " + product.getGameName() +
				" Oyununu Satin Aldi");
	}
}
