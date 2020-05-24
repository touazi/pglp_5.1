package uvsq.fr.gl_exo5;

import uvsq.fr.gl_exo5.PERSONNE.PERSONNEBuilder;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonnelTest {
	private PERSONNE personne;
	
	@Before()
	public void setUp() {
		personne = new PERSONNEBuilder("TOUAZI", "LYLIA")
				.dateNaissance(LocalDate.parse("1997-04-22"))
				.fonction(Fonction.directeur)
				.addNumeroTelephone(new NumeroTelephone( Type.fixperso, "0104050506"))
				.addNumeroTelephone(new NumeroTelephone( Type.portable, "0667721010"))
				.addNumeroTelephone(new NumeroTelephone( Type.fixpro, "0667721012"))
				.build();	
		
		
	}
	
	
	@Test()
	public void testGetNom() {
		assertEquals(personne.getNom(), "TOUAZI");
	}
	
	@Test()
	public void testprenom() { assertEquals(personne.getPrenom(), "LYLIA");}
	
	@Test()
	public void testfonction() { assertEquals(personne.getFonction(), Fonction.directeur);}
	@Test()
	public void testfonction1() {
		NumeroTelephone t=new NumeroTelephone (Type.fixperso,"0667721012");
		assertEquals(t.getTelephone(),"0667721012");}
	public void testfonction2() {
		NumeroTelephone t=new NumeroTelephone (Type.fixperso,"0667721012");
		assertEquals(t.getType(),Type.fixperso);}
	@Test()
	public void testdatedenaissane() {
		assertEquals(personne.getDateNaissance(),LocalDate.parse("1997-04-22"));
	}
	 @After
	  public void nettoyer() throws Exception {
	    personne = null;
	  }
}