package paket;

public class pesma {
	private izvodjac Izvodjac;
	private String ime;
	private double rejting;

	pesma() {
		this.ime = "Vlone";
		this.rejting = 0;
	}
	pesma(String ime, double rejting) {
		this.ime = ime;
		this.rejting = rejting;
	}
	pesma(String ime, double rejting, izvodjac Izvodjac) {
		this.ime = ime;
		this.rejting = rejting;
		this.Izvodjac = Izvodjac;
	}

	public izvodjac getIzvodjac() {
		return Izvodjac;
	}

	public void setIzvodjac(izvodjac izvodjac) {
		Izvodjac = izvodjac;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public double getRejting() {
		return rejting;
	}

	public void setRejting(double rejting) {
		this.rejting = rejting;
	}

	@Override
	public String toString() {
		return "pesma, Izvodjac:" + Izvodjac + ", ime:" + ime + ", rejting:" + rejting;
	}
	void Ocenite(int ocena) {
		rejting=ocena;
		System.out.println("Pesma je ocenjena sa ocenom:"+ocena);
	}
		
		
	}

