
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Sara
 *
 */
public class TwitterPorukaTest {
	
	private TwitterPoruka poruka;
	private TwitterPoruka korisnik;

	/**
	 * @throws java.lang.Exception
	 */
	
	@Before
	public void setUp() throws Exception {
		
		poruka=new TwitterPoruka();
		korisnik=new TwitterPoruka();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		poruka=null;
		korisnik=null;
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test
	public void testSetKorisnik() {
		
		
		korisnik.setKorisnik("Zika");
		assertEquals("Zika", korisnik.getKorisnik());
	
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		korisnik.setKorisnik(null);
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test
	public void testSetPoruka() {
		poruka.setPoruka("Lep dan danas.");
		assertEquals("Lep dan danas.", poruka.getPoruka());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		poruka.setPoruka(null);
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
					}

}
