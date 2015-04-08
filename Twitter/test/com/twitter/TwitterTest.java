package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

public class TwitterTest {

	private Twitter tviter;
	private TwitterPoruka por;
	private LinkedList<TwitterPoruka> lista;
	
	
	@Before
	public void setUp() throws Exception {
		tviter=new Twitter();
		por=new TwitterPoruka();
		lista=new LinkedList<TwitterPoruka>();
	}

	@After
	public void tearDown() throws Exception {
		tviter=null;
		por=null;
		lista=null;
	}



	@Test
	public void testUnesi() {		
		por.setKorisnik("Mika");
		por.setPoruka("Pada kisa danas");
		tviter.unesi(por.getKorisnik(), por.getPoruka());
		
		lista.addLast(por);
		assertEquals(lista, tviter.vratiSvePoruke());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPoruke() {
		
		por.setKorisnik("Pera");
		por.setPoruka("Lep dan danas");
		
		TwitterPoruka por2 = new TwitterPoruka();
		
		por2.setKorisnik("Jova");
		por2.setPoruka("Sunce sija danas");
		
		TwitterPoruka por3 = new TwitterPoruka();
		
		TwitterPoruka[] triPoruke = new TwitterPoruka[3];
		
		triPoruke[0] = por;
		triPoruke[1] = por2;
		triPoruke[2] = por3;
		tviter.unesi(por.getKorisnik(), por.getPoruka());
		tviter.unesi(por2.getKorisnik(), por2.getPoruka());
		tviter.unesi(por3.getKorisnik(), por3.getPoruka());
		
		
		assertArrayEquals(triPoruke, tviter.vratiPoruke(3, "danas"));
		
	}
	

	
	@Test
	public void testVratiSvePoruke() {
		
		
		assertEquals(lista, tviter.vratiSvePoruke());
		
	}
}
