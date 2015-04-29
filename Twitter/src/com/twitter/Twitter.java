package com.twitter;

import java.util.LinkedList;

import com.twitter.poruke.TwitterPoruka;

/**
 * Twitter klasa služi za unošenje nove poruke, vraćanje svih poruka ili poruka sa odgovarajući tag.
 * @author Sara  
 */

public class Twitter {

	/**
	 * atribut poruke koji predstavlja listu TwitterPoruke
	 */

	private LinkedList<TwitterPoruka> poruke = new LinkedList<TwitterPoruka>();

	/**
	 * metoda koja vraca listu svih poruka
	 * @return poruke kao listu
	 */

	public LinkedList<TwitterPoruka> vratiSvePoruke() {
		return poruke;
	}

	/**
	 *  metoda unosi korisnika i poruku u listu, i to na kraj.
	 * @param korisnik cija je poruka uneta
	 * @param poruka korisnika Twittera
	 * 
	 *           
	 */

	public void unesi(String korisnik, String poruka) {
		// Pravi se nova poruka i puni podacima.
		TwitterPoruka tp = new TwitterPoruka();
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);
		// Poruka se unosi u listu na kraj
		poruke.addLast(tp);
	}

	/**
	 *   metoda koja vraca niz poruka koje sadrze tag, i to do maxBroj ogranicenja.
	 * @param maxBroj gornja granica
	 * @param tag deo reci koji treba da sadrzi poruka
	 * @return lista poruka sa tagom
	 * @throws java.lang.RuntimeException kada je tag null ili je prazan
	 * 
	 *       
	 */
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) {
		if (tag == null || tag.isEmpty())
			throw new RuntimeException("Morate uneti tag");
		// Ako je maxBroj <=0, vraca maxBroj se postavlja na 100 poruka
		if (maxBroj <= 0)
			maxBroj = 100;
		// Pomocna promenljiva koja predstavlja brojac upisanih poruka
		int brojac = 0;
		// Pomocni niz koja predstavlja rezultat pretrage tj. sadrzace
		// sve poruke koje u sebi imaju zadati tag
		TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];
		// Pretrazuju se poruke i traze se one koje sadrze tag.
		// Ako se nadje neka takva, i ako nije prekoracen maxBroj
		// ona se upisuje u niz. Ako je prekoracen maxBroj,pretraga
		// se prekida.
		for (int i = 0; i < poruke.size(); i++)
			if (poruke.get(i).getPoruka().indexOf(tag) != -1)
				if (brojac < maxBroj) {
					rezultat[brojac ] = poruke.get(i);
					brojac++;
				} else
					break;
		return rezultat;
	}
}
