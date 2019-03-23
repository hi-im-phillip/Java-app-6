package hr.java.vjezbe.entitet;

public abstract class Osoba {
	
	private String ime;
	private String prezime;
	
	
	public Osoba(String imeOsobe, String prezimeOsobe) {
		
		this.ime = imeOsobe;
		this.prezime = prezimeOsobe;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	

}
