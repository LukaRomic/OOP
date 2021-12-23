package blok;
	
	public class Artikl {
	
		private String ime;
		private int cena;
		private int id;
	
		static int br = 0;
	
		Artikl() {
			this.ime = "voda";
			this.cena = 30;
			this.id = br;
			br++;
		}
	
		Artikl(String ime, int cena,int id) {
			this.ime = ime;
			this.cena = cena;
			this.id = id;
		}
	
		void setIme(String ime) {
			this.ime = ime;
		}
	
		void setCena(int cena) {
			this.cena = cena;
		}
	
		void setId(int id) {
			this.id = id;
		}
	
		String getIme() {
			return ime;
		}
	
		int getCena() {
			return cena;
		}
	
		int getId() {
			return id;
		}
	
		public String toString() {
			return "Artikl ime:" + ime + ", cena=" + cena + ", id=" + id;
		}
	
	}
