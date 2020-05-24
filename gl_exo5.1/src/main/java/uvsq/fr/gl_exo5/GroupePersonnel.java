package uvsq.fr.gl_exo5;

import java.util.ArrayList;
/**.
 * class GroupePersonnel.
 *
 * @author lylia touazi
 */
public class GroupePersonnel implements
ComportementPersonne, java.io.Serializable {
	/**constatnte mille.*/
	static final int MILLE = 1;
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**l'id du groupe.*/
	private int idGroupe;
	/**listepersonnel.*/
	private ArrayList<ComportementPersonne> listepersonnel;
	/**Constructeur GroupePersonnel.
	 * */
	public GroupePersonnel() {
		listepersonnel = new ArrayList<ComportementPersonne>();
		idGroupe = 1 + (int) (Math.random() * ((MILLE - 1) + 1));
	}
	/**Constructeur GroupePersonnel.
	 * @param listepersonnell la liste des personne
	 * */
	public GroupePersonnel(
			final ArrayList<ComportementPersonne>
	listepersonnell) {
		this.listepersonnel = listepersonnell;
	}
	/**methode AjouterPersonnel.
	 * @param p la personne a ajouter.*/
	public final void ajouterPersonnel(
			final ComportementPersonne p) {
		this.listepersonnel.add(p);
	}
	/**methode SuprimerPersonnel.
	 * @param p la personne a suprimer.*/
	public final void suprimerPersonnel(
			final ComportementPersonne p) {
		if (this.listepersonnel.contains(p)) {
			this.listepersonnel.remove(p);
		}
	}
	/**
	 * La methode getlistepersonnel.
	 *
	 * @return la liste des personne.
	 */
	public final ArrayList<ComportementPersonne> getlistepersonnel() {
		return this.listepersonnel;
	}
	/**methode getId.
	 * @return id groupe.*/
	public final String getId() {
		return idGroupe + " ";
	}
	/** la methode print. */
	public final void print() {
		// TODO Auto-generated method stub
		for (ComportementPersonne p : listepersonnel) {
			p.print();
		}
	}
}
