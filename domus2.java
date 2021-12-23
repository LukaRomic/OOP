package blok;
	
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	
	public class NizArtikla {
	
		private Artikl[] niz;
	
		public NizArtikla(Artikl[] niz) {
			this.niz = niz;
		}
	
		public NizArtikla(String fajl) throws IOException {
			BufferedReader br = new BufferedReader(new FileReader(fajl));
			int brArtikla = Integer.parseInt(br.readLine().trim());
			niz = new Artikl[brArtikla];
	
			for (int i = 0; i < brArtikla; i++) {
				String linija = br.readLine();
				String[] tokeni = linija.split(",");
				
				String ime = tokeni[0].trim();
				int cena = Integer.parseInt(tokeni[1].trim());
				int id = Integer.parseInt(tokeni[2].trim());
				
				niz[i]=new Artikl(ime,cena,id);
			}
			
			br.close();
		}
	
		Artikl[] getNiz() {
			return niz;
		}
	
		public Artikl najeftiniji() {
			int br = 100000;
			Artikl a = new Artikl();
			for (int i = 0; i < niz.length; i++) {
				if (niz[i].getCena() < br) {
					br = niz[i].getCena();
					a.setIme(niz[i].getIme());
					a.setCena(niz[i].getCena());
					a.setId(niz[i].getId());
				}
	
			}
			return a;
		}
	
		public Artikl najskuplji() {
			int br = 0;
			Artikl a = new Artikl();
			for (int i = 0; i < niz.length; i++) {
				if (niz[i].getCena() > br) {
					br = niz[i].getCena();
					a.setIme(niz[i].getIme());
					a.setCena(niz[i].getCena());
					a.setId(niz[i].getId());
				}
			}
			return a;
		}
	}
