package paket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class album {

	private pesma[] Pesme;

	public album(String fajl) throws IOException {
		BufferedReader b = new BufferedReader(new FileReader(fajl));
		int br = Integer.parseInt(b.readLine().trim());
		Pesme = new pesma[br];
		for (int i = 0; i < br; i++) {
			String linija = b.readLine();
			String[] tokeni = linija.split(" , ");

			String ime = tokeni[0].trim();
			double rejting = Double.parseDouble(tokeni[1].trim());
			Pesme[i] = new pesma(ime, rejting);
		}
		b.close();
	}

	public pesma[] getPesme() {
		return Pesme;
	}

	public void setPesme(pesma[] pesme) {
		Pesme = pesme;
	}

	void najboljeOcenjena() {
		String s = "";
		double brojac = 0;
		for (int i = 0; i < Pesme.length; i++) {
			if (Pesme[i].getRejting() > brojac) {
				s = Pesme[i].getIme();
				brojac = Pesme[i].getRejting();
			}
		}

		System.out.println("Najbolje ocenjena pesma se zove:" + s + "i ocena joj je:" + brojac);
	}
}
