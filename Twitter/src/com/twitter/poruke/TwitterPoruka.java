package com.twitter.poruke;

/**
 * 
 * @author Sara
 * @version 1.0 prva verzija koda
 * 
 */

public class TwitterPoruka {

	/**
	 * U klasu ubaceni atributi:
	 * <ul>
	 * <li>korisnik
	 * <li>poruka
	 * </ul>
	 */

	private String korisnik;
	private String poruka;

	/**
	 * 
	 * @return metoda vraca vrednost atributa korisnik
	 */

	public String getKorisnik() {
		return korisnik;
	}

	/**
	 * 
	 * @param korisnik
	 *            metoda podesava vrednost atributa korisnik na unetu vrednost
	 */

	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik.equals(""))
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}

	/**
	 * 
	 * @return metoda vraca vrednost atributa poruka
	 */

	public String getPoruka() {
		return poruka;
	}

	/**
	 * 
	 * @param poruka
	 *            metoda podesava vrednost atributa poruka na unetu vrednost
	 */

	public void setPoruka(String poruka) {
		if (poruka == null || poruka.length() > 140)
			throw new RuntimeException(
					"Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}

	/**
	 * toString metoda za atribute korisnik i poruka
	 */

	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}
}
