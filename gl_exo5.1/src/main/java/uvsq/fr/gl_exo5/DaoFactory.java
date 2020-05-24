package uvsq.fr.gl_exo5;

/**
 * interface DaoFactory.
 *
 * @author Lylia touazi
 */
public class DaoFactory {
/**
 * getPersonneDAO.
 *
 * @return getPersonneDAO.
 */
public static DAO<PERSONNE> getPersonneDAO() {
return new PersonneDaO();
}

/**
 * getGroupeDAO.
 *
 * @return getGroupeDAO.
 */
public static DAO<GroupePersonnel> getGroupeDAO() {
return new GroupeDao();
}

}
