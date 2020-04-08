package uvsq.fr.gl_exo5;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import uvsq.fr.gl_exo5.PERSONNE.PERSONNEBuilder;

public class SerialisationtTest {
	private NumeroTelephone num;
	private PERSONNE personne,personne2;
	private GroupePersonnel groupe ;
	private boolean bool;
	@Before()
	public void setUp() {
		 bool = true;
		 num=new NumeroTelephone(Type.portable,"0666721065");
		personne = new PERSONNEBuilder("TOUAZI", "LYLIA")
				.dateNaissance(LocalDate.parse("1997-04-22"))
				.fonction(fonction.directeur)
				.addNumeroTelephone(new NumeroTelephone( Type.portable, "0667721010"))
				.addNumeroTelephone(new NumeroTelephone( Type.fix_pro, "0667721012"))
				.build();
	
		personne2 = new PERSONNEBuilder("hamouche", "koussaila")
				.dateNaissance(LocalDate.parse("1997-04-22"))
				.fonction(fonction.directeur)
				.addNumeroTelephone(new NumeroTelephone( Type.fix_perso, "0104050506"))
				.build();
		groupe = new GroupePersonnel();
		groupe.AjouterPersonnel(personne);
		groupe.AjouterPersonnel(personne2);
		
	}
	@Test
	public void portable() throws IOException {
		NumeroTelephone numtest = null;
		ObjectOutputStream oos;
		ObjectInputStream ois;
		oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
		ois = new ObjectInputStream(new FileInputStream("test.txt"));
		try {

			
			
				oos.writeObject(num);
				numtest = (NumeroTelephone) ois.readObject();

			
		} catch (ClassNotFoundException | IOException error) {
			error.printStackTrace();
		}
		finally {
			oos.close();
			ois.close();
		}
		assertEquals(num.getTelephone(), numtest.getTelephone());
		assertEquals(num.getType(), numtest.getType());
		
	}
	@Test
	public void testpersonne1() throws IOException {
		boolean bool = true;
		ObjectOutputStream oos = null;
			try {
				final FileOutputStream fichier = new FileOutputStream("test1.txt");
				oos = new ObjectOutputStream(fichier);
				oos.writeObject(personne);
				oos.flush();
				bool = true;
			} catch (IOException e) {
				e.printStackTrace();
				bool = false;
				assertEquals( bool , false);
			} finally {
				assertEquals(bool , true);
				
					if (oos != null) {
						oos.flush();
						oos.close();
						}

		      }}
@Test
public void testpersonne2() throws FileNotFoundException, IOException {
	PERSONNE personnetest = null;
ObjectOutputStream oos;
ObjectInputStream ois;
oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
ois = new ObjectInputStream(new FileInputStream("test.txt"));
try {

	
	
		oos.writeObject(personne);
		personnetest = (PERSONNE) ois.readObject();

	
} catch (ClassNotFoundException | IOException error) {
	error.printStackTrace();
}
finally {
	oos.close();
	ois.close();
}
assertEquals(personne.getNom(), personnetest.getNom());
assertEquals(personne.getPrenom(), personnetest.getPrenom());
assertEquals(personne.getFonction(), personnetest.getFonction());
assertEquals(personne.getDateNaissance(), personnetest.getDateNaissance());
}
@Test
public void testgroup1() throws IOException {	

ObjectOutputStream oos = null;
try {
	final FileOutputStream fichier = new FileOutputStream("test1.txt");
	oos = new ObjectOutputStream(fichier);
	oos.writeObject(groupe);
	oos.flush();
	bool = true;
} catch (IOException e) {
	e.printStackTrace();
	bool = false;
	assertEquals( bool , false);
} finally {
	assertEquals(bool , true);
	
		if (oos != null) {
			oos.flush();
			oos.close();
			}

  }}

@Test
public void testgroup2() throws FileNotFoundException, IOException {
	GroupePersonnel groupetest = null;
ObjectOutputStream oos;
ObjectInputStream ois;
oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
ois = new ObjectInputStream(new FileInputStream("test.txt"));
try {

	
	
		oos.writeObject(groupe);
		groupetest = (GroupePersonnel) ois.readObject();

	
} catch (ClassNotFoundException | IOException error) {
	error.printStackTrace();
}
finally {
	oos.close();
	ois.close();
}
assertEquals(2, groupetest.getlistepersonnel().size());

}
}

