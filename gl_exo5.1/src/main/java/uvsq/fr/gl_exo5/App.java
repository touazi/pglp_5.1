package uvsq.fr.gl_exo5;

import java.time.LocalDate;
import java.util.ArrayList;
import  uvsq.fr.gl_exo5.PERSONNE.PERSONNEBuilder;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     PERSONNE p1,p2;
    p1 = new PERSONNEBuilder("TOUAZI", "LYLIA")
			.dateNaissance(LocalDate.parse("1997-04-22"))
			.fonction(fonction.directeur)
			.addNumeroTelephone(new NumeroTelephone( Type.fix_pro, "0667721012"))
			.build();	
    p2 = new PERSONNEBuilder("hamouche", "koussaila")
			.dateNaissance(LocalDate.parse("1997-04-22"))
			.fonction(fonction.directeur)
			.addNumeroTelephone(new NumeroTelephone( Type.fix_perso, "0104050506"))
			.build();	
    GroupePersonnel g = new GroupePersonnel();
    g.AjouterPersonnel(p1);
    g.AjouterPersonnel(p2);
 
    System.out.println(g.getlistepersonnel().size());
    
}}
