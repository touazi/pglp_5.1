package uvsq.fr.gl_exo5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>"L'implementation de la class imuable personne.</b> une personne a :
 * <ul>
 * <li>nom</li>
 * <li>prenom</li>
 * <li>fonction</li>
 * <li>dateNaissance</li>
 * <li>numerosTelephone:il peut avoir plusieur numerosTelephone</li>
 * </ul>
 * Cette class du Pattern build.
 *
 * @author TOUAZI,Lylia
 */

public final class PERSONNE implements
ComportementPersonne, java.io.Serializable {
/**
 * * a default serial version ID.
 */
private static final long serialVersionUID = 1L;
/**
 * Le nom de la personne.
 *
 */
private final String nom;
/**
 * Le prenom de la personne.
 *
 */
private final String prenom;
/**
 * la fonction de la personne.
 *
 */
private final Fonction fonction;
/**
 * La date de naissance de la personne.
 */
private final LocalDate dateNaissance;
/**
 * La liste des numéro de telephone de la personne.
 */
private final List<NumeroTelephone> numerosTelephone;

/**
 * <b>"L'implementation de la class builder personne.</b>
 **/
public static class PERSONNEBuilder {
	/**
	 * Le nom de la personne.
	 * @see PERSONNEBuilder#PERSONNEBuilder(String, String)
	 */
	private final String nom;
	/**
	 * Le prenom de la personne.
	 * @see PERSONNEBuilder#PERSONNEBuilder(String, String)
	 */
	private final String prenom;
	/**
	 * La date de naissance de la personne.
	 */
	private LocalDate dateNaissance = null;
	/**
	 * La liste des numéro de telephone de la personne.
	 */
	private List<NumeroTelephone> numerosTelephone =
			new ArrayList<NumeroTelephone>();
	/**
	 * la fonction de la personne.
	 */
	private Fonction fonction;

	/**
	 * Constructeur PERSONNEBuilder.
	 * <p>
	 * A la construction builder personne pour le nom et le prenom.
	 * </p>
	 * * @param nomm Le nom de la PERSONNEBuilder.
	 *
	 * @param prenomm Le prenom de la PERSONNEBuilder.
	 */
	public PERSONNEBuilder(final String nomm,
			final String prenomm) {
		this.prenom = prenomm;
		this.nom = nomm;
	}

	/**
	 * méthode fonction.
	 * * @param fonctionn La fonction de
	 *  la PERSONNEBuilder.
	 *
	 * @return PERSONNEBuilder.
	 */
	public final PERSONNEBuilder
	fonction(final Fonction fonctionn) {
		this.fonction = fonctionn;
		return this;
	}

	/**
	 * méthode dateNaissance.
	 * @param dateNaissancee La date Naissance de la
	 * PERSONNEBuilder.
	 *
	 * @return PERSONNEBuilder.
	 */
	public final PERSONNEBuilder
	dateNaissance(final LocalDate dateNaissancee) {
		this.dateNaissance = dateNaissancee;
		return this;
	}

	/**
	 * méthode addNumeroTelephone.
	 * * @param numeroTelephonee Le numero Telephone de
	 * la PERSONNEBuilder.
	 *
	 * @return PERSONNEBuilder.
	 */
	public final PERSONNEBuilder
	addNumeroTelephone(final
			NumeroTelephone numeroTelephonee) {
		this.numerosTelephone.add(numeroTelephonee);
		return this;
	}

	/**
	 * methode build.
	 *
	 * @return personne.
	 */
	public final PERSONNE build() {
		return new PERSONNE(this);
	}
}

/**
 * Constructeur PERSONNE.
 *  cette méthode renvoie un nouvel objet de la classe
 * personne,il copie les valeurs des
 *  champs du générateur vers lui-même..
 *
 * @param builder c'est l'objet pour le
 *  quel on veux crée un nouveau objet.
 */
private PERSONNE(final PERSONNEBuilder builder) {
	nom = builder.nom;
	prenom = builder.prenom;
	fonction = builder.fonction;
	dateNaissance = builder.dateNaissance;
	numerosTelephone = builder.numerosTelephone;
}

/**
 * La methode getNom.
 *
 * @return le getNom de la personne.
 */
public String getNom() {
	return this.nom;
}

/**
 * La methode getPrenom.
 *
 * @return le premon de la personne.
 */
public String getPrenom() {
	return this.prenom;
}

/**
 * La methode getFonction.
 *
 * @return la fonction de la personne.
 */
public Fonction getFonction() {
	return this.fonction;
}

/**
 * La methode getDateNaissance.
 *
 * @return la date de naissance de la personne.
 */
public LocalDate getDateNaissance() {
	return this.dateNaissance;
}

/**
 * La methode getNumerosTelephone.
 *
 * @return la liste des numéro de télephone de la personne.
 */
public List<NumeroTelephone> getNumerosTelephone() {
	return numerosTelephone;
}

/** la methode print. */
public void print() {
	System.out.println("  Je suis "
+ this.nom + " "
+ this.prenom + "  née le  "
+ this.dateNaissance
+ " et je travaille comme "
+ this.fonction);
}
}
