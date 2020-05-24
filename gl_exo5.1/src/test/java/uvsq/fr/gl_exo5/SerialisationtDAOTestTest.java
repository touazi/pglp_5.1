package uvsq.fr.gl_exo5;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import uvsq.fr.gl_exo5.PERSONNE.PERSONNEBuilder;

public class SerialisationtDAOTestTest {
	private PERSONNE personne, personne2, personne3, personne4, personne5;
	private GroupePersonnel groupe, groupe2, groupe3;

	@Before()
	public void setUp() {
		personne = new PERSONNEBuilder("TOUAZI", "LYLIA").dateNaissance(LocalDate.parse("1997-04-22"))
				.fonction(Fonction.chargerdemission)
				.addNumeroTelephone(new NumeroTelephone(Type.portable, "0667721010"))
				.addNumeroTelephone(new NumeroTelephone(Type.fixpro, "0667721012")).build();

		personne2 = new PERSONNEBuilder("hamouche", "koussaila").dateNaissance(LocalDate.parse("1997-04-22"))
				.fonction(Fonction.directeur).addNumeroTelephone(new NumeroTelephone(Type.fixperso, "0104050506"))
				.build();
		personne5 = new PERSONNEBuilder("hh", "hh").dateNaissance(LocalDate.parse("1994-04-22"))
				.fonction(Fonction.vendeur).addNumeroTelephone(new NumeroTelephone(Type.fixperso, "dddd")).build();
		groupe = new GroupePersonnel();
		groupe2 = new GroupePersonnel();
		groupe.ajouterPersonnel(personne);
		groupe.ajouterPersonnel(personne2);
		groupe3 = new GroupePersonnel();
		groupe3.ajouterPersonnel(personne);
		groupe3.ajouterPersonnel(personne2);
		groupe3.ajouterPersonnel(personne5);
	}

	@Test
	public void test() {
		DAO<PERSONNE> personneDao = DaoFactory.getPersonneDAO();
		personne3 = personneDao.create(personne2);
		assertTrue(personne2.getFonction() == personne3.getFonction());
		personne3 = personneDao.update(personne);
		assertFalse(personne2.getFonction() == personne3.getFonction());
	}

	@Test
	public void test2() {
		DAO<PERSONNE> personneDao = DaoFactory.getPersonneDAO();
		personne3 = personneDao.create(personne2);
		personne4 = personneDao.read("hamouche");
		assertEquals(personne2.getNom(), personne4.getNom());
		assertEquals(personne2.getPrenom(), personne4.getPrenom());
		assertEquals(personne2.getFonction(), personne4.getFonction());
		assertEquals(personne2.getDateNaissance(), personne4.getDateNaissance());
	}

	@Test
	public void testgroupe() {
		DAO<GroupePersonnel> groupeDao = DaoFactory.getGroupeDAO();
		groupe2 = groupeDao.create(groupe);
		assertEquals(2, groupe2.getlistepersonnel().size());
	}

	@Test
	public void testgroupe2() {
		DAO<GroupePersonnel> groupeDao = DaoFactory.getGroupeDAO();
		groupe2 = groupeDao.create(groupe);
		assertEquals(2, groupe2.getlistepersonnel().size());
		groupe2 = groupeDao.create(groupe3);
		assertEquals(3, groupe2.getlistepersonnel().size());

	}
}
