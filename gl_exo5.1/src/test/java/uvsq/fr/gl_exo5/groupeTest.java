package uvsq.fr.gl_exo5;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import uvsq.fr.gl_exo5.PERSONNE.PERSONNEBuilder;

public class groupeTest {

	private PERSONNE p1, p2;
	private GroupePersonnel g;

	@Before()
	public void setUp() {
		p1 = new PERSONNEBuilder("TOUAZI", "LYLIA").dateNaissance(LocalDate.parse("1997-04-22"))
				.fonction(Fonction.directeur).addNumeroTelephone(new NumeroTelephone(Type.fixpro, "0667721012"))
				.build();
		p2 = new PERSONNEBuilder("lllll", "koussaila").dateNaissance(LocalDate.parse("1995-12-18"))
				.fonction(Fonction.directeur).addNumeroTelephone(new NumeroTelephone(Type.fixperso, "0104050506"))
				.build();
		g = new GroupePersonnel();

	}

	@Test
	public void ajouetertest() {
		g.ajouterPersonnel(p1);
		g.ajouterPersonnel(p2);
		assertEquals(g.getlistepersonnel().size(), 2);
	}

	@Test
	public void suprimertest() {
		g.ajouterPersonnel(p1);
		g.ajouterPersonnel(p2);
		g.suprimerPersonnel(p1);
		assertEquals(g.getlistepersonnel().size(), 1);
	}

}
