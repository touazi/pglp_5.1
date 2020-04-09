package uvsq.fr.gl_exo5;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 * <b>"L'implementation de la class imuable personne.</b>
 * une personne a :
 * <ul>
 * <li>nom</li>
 * <li>prenom</li>
 * <li>fonction</li>
 * <li>dateNaissance</li>
 * <li>numerosTelephone:il peut avoir plusieur numerosTelephone</li>
 * </ul>
 * Cette class  du  Pattern build.
 * @author TOUAZI,Lylia
 */

public final class PERSONNE implements ComportementPersonnel , java.io.Serializable {
/**
	 * a default serial version ID
	 */
	private static final long serialVersionUID = 1L;
/**
 * Le nom de la personne.
 *
 * */
	private final String nom;
/**
 * Le prenom de la personne.
 *
 * */
	private final String prenom;
/**
 * la fonction de la personne.
 *
 * */
	private final fonction fonction;
/**
 * La date de naissance de la personne.
 * */
	private final LocalDate dateNaissance;
/**
 * La liste des numéro de telephone de la personne. 
 * */
	private final List<NumeroTelephone> numerosTelephone;
/**
 * <b>"L'implementation de la class builder personne.</b>
 **/
	public static class PERSONNEBuilder {
		/**
		 * Le nom de la personne.
		 * */
		private final String nom;
		/**
		 * Le prenom de la personne.
		 * */
		private final String prenom;
		/**
		 * La date de naissance de la personne.
		 * */
		private LocalDate dateNaissance = null;
		/**
		 * La liste des numéro de telephone de la personne.
		 * */
		private List<NumeroTelephone> numerosTelephone = new ArrayList<NumeroTelephone>();
		/**
		 * la fonction de la personne.
		 * */
		private fonction fonction;
	    /**
	     * Constructeur PERSONNEBuilder.
	     * <p>
	     * A la construction builder personne pour le nom et le prenom.
	     * </p>
	     * * @param nom.
	     * Le nom de la PERSONNEBuilder.
	     * @param prenom.
	     * Le prenom de la PERSONNEBuilder.
	     */
		public PERSONNEBuilder(String nom , String prenom) {
			this.prenom = prenom;
			this.nom = nom;
			}
	    /**
	     * méthode fonction.
	     * * @param fonction.
	     * La fonction de la PERSONNEBuilder.
	     * @return
	     * PERSONNEBuilder.
	     */
		public PERSONNEBuilder fonction( fonction fonction) {
			this.fonction = fonction;
			return this;
			}	
		
		public PERSONNEBuilder dateNaissance(LocalDate dateNaissance) {
			this.dateNaissance = dateNaissance;
			return this;
			}
		public PERSONNEBuilder addNumeroTelephone(NumeroTelephone numeroTelephone) {
			this.numerosTelephone.add(numeroTelephone);
			return this;
			}
		public PERSONNE build() {
			return new PERSONNE(this);
			}
		}
	/**Constructeur PERSONNE.
	 * cette méthode renvoie un nouvel objet de la classe personne,il copie les valeurs des champs du générateur vers lui-même..
	 * @param builder
	 * c'est l'objet pour le quel on veux crée un nouveau objet.
	 * */ 
	
	private PERSONNE(PERSONNEBuilder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		fonction = builder.fonction;
		dateNaissance = builder.dateNaissance;
		numerosTelephone = builder.numerosTelephone;
		}
	/**La methode getNom.
	 * @return
	 * le getNom de la personne.
	 * */ 
	public String getNom() {
		return nom;
		}
	/**La methode getPrenom.
	 * @return
	 * le premon de la personne.
	 * */
	public String getPrenom() {
		return prenom;
		}
	/**La methode getFonction.
	 * @return
	 * la fonction de la personne.
	 * */
	public fonction getFonction() {
		return fonction;
		}
	/**La methode getDateNaissance.
	 * @return
	 * la date de naissance de la personne.
	 * */
	public LocalDate getDateNaissance() {
		return dateNaissance;
		}
	/**La methode getNumerosTelephone.
	 * @return
	 * la liste des numéro de télephone de la personne.*/
	public List<NumeroTelephone> getNumerosTelephone() {
		return numerosTelephone;
		}
	/**la methode print.*/
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("  Je suis "+this.nom+" "+this.prenom+"  née le  "+this.dateNaissance +" et je travaille comme "+this.fonction) ;
		}
	}