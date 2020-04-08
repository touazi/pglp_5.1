package uvsq.fr.gl_exo5;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import  uvsq.fr.gl_exo5.PERSONNE.PERSONNEBuilder;
public class groupeTest {

	private PERSONNE p1,p2,p3;
	private GroupePersonnel g;
	@Before()
	public void setUp() {
	    p1 = new PERSONNEBuilder("TOUAZI", "LYLIA")
				.dateNaissance(LocalDate.parse("1997-04-22"))
				.fonction(fonction.directeur)
				.addNumeroTelephone(new NumeroTelephone( Type.fix_pro, "0667721012"))
				.build();	
	    p2 = new PERSONNEBuilder("hamouche", "koussaila")
				.dateNaissance(LocalDate.parse("1995-12-18"))
				.fonction(fonction.directeur)
				.addNumeroTelephone(new NumeroTelephone( Type.fix_perso, "0104050506"))
				.build();
	    p3 = new PERSONNEBuilder("Siham", "ouchen")
				.dateNaissance(LocalDate.parse("1995-01-12"))
				.fonction(fonction.directeur)
				.addNumeroTelephone(new NumeroTelephone( Type.fix_perso, "0666745923"))
				.build();
	    g=new GroupePersonnel();
		
	}
	
	@Test
	public void ajouetertest() {
		g.AjouterPersonnel(p1);
	    g.AjouterPersonnel(p2);
	    assertEquals(g.getlistepersonnel().size(), 2);
	}
	@Test
	public void suprimertest() {
		g.AjouterPersonnel(p1);
	    g.AjouterPersonnel(p2);
	    g.SuprimerPersonnel(p1);
	    assertEquals(g.getlistepersonnel().size(), 1);
	}
	 


	
}
