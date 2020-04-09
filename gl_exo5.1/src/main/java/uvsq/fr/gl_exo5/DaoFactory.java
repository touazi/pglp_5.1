package uvsq.fr.gl_exo5;

public class DaoFactory {
	public static DAO<PERSONNE> getPersonneDAO ( ) {
		return new PersonneDaO ( ) ;
		}

}
