package GameProject;

public class Gamer {
	
	private int id;
	private String firstName;
	private String lastName;
	private int dogumYili;	
	private int yas;	
	private String nationalIdentity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas, int dogumYili) {
		this.yas = 2021 - dogumYili;
	}	
	public int getDogumYili() {
		return dogumYili;
	}
	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	
	
	
	
	
}
