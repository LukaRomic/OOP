package paket;

public class izvodjac {
	private String ime;
	private String prezime;
	private int brPratilaca;

	izvodjac() {
		this.ime = "Luka";
		this.prezime = "Romic";
		this.brPratilaca = 100;
	}

	izvodjac(String ime, String prezime, int brPratilaca) {
		this.ime = ime;
		this.prezime = prezime;
		this.brPratilaca = brPratilaca;
	}

	@Override
	public String toString() {
		return "izvodjac, ime:" + ime + ", prezime:" + prezime + ", brPratilaca:" + brPratilaca;
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

	public int getBrPratilaca() {
		return brPratilaca;
	}

	public void setBrPratilaca(int brPratilaca) {
		this.brPratilaca = brPratilaca;
	}

}
