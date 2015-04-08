
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
	

	/**
	 * @throws java.lang.Exception
	 */
	
	@Before
	public void setUp() throws Exception {
		
		poruka=new TwitterPoruka();
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		poruka=null;
		
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test
	public void testSetKorisnik() {
		
		
		poruka.setKorisnik("Zika");
		assertEquals("Zika", poruka.getKorisnik());
	
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		poruka.setKorisnik(null);
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
		poruka.setKorisnik("Jovan");
		poruka.setPoruka("Pada sneg");
		assertEquals("KORISNIK:" + "Jovan" + " PORUKA:" + "Pada sneg",poruka.toString());
		
	}

}
