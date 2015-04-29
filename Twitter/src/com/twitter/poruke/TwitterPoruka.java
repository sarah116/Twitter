package com.twitter.poruke;

/**
 * Klasa koja predstavlja Twitter poruku.
 * @author Sara
 * @version 1.0 prva verzija koda
 * 
 */

public class TwitterPoruka {

	/**
	 * Atribut korisnik Twittera
	 */

	private String korisnik;
	
	/**
	 * Atribut poruka korisnika Twittera
	 */

	private String poruka;

	/**
	 * 
	 * @return korisnik vrednost atributa korisnik kao String
	 */

	public String getKorisnik() {
		return korisnik;
	}

	/**
	 *   Metoda podesava vrednost atributa korisnik na unetu vrednost.
	 * @param korisnik postavlja novu vrednost atributa
	 * @throws java.lang.RuntimeException  ako je uneto ime korisnika null ili prazan String
	 *          
	 */

	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik.equals(""))
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}

	/**
	 * Metoda vraca vrednost atributa poruka
	 * @return poruka na Twitteru kao String
	 */

	public String getPoruka() {
		return poruka;
	}

	/**
	 * Metoda podesava vrednost atributa poruka na unetu vrednost.
	 * @param poruka na Twitteru kao String
	 * @throws java.lang.RuntimeException ako je uneta vrednost poruke null ili duza od 140 karaktera
	 *           
	 */

	public void setPoruka(String poruka) {
		if (poruka == null || poruka.length() > 140)
			throw new RuntimeException(
					"Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}

	/**
	 * Metoda vraca atribute korisnik i poruka kao String
	 * return String korisnika i njegove poruke na Twitteru
	 */

	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}
	
	public boolean equals(Object o) {
		if (o instanceof TwitterPoruka) {
			TwitterPoruka tvitpor = (TwitterPoruka) (o);
	
			if(korisnik.equals(tvitpor.getKorisnik()) && poruka.equals(tvitpor.getPoruka())) {
				return true;
			}
			else { 
				return false;
			}
		} else {
			return false;
		}
	}
}
