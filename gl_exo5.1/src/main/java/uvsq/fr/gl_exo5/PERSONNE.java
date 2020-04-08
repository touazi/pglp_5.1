package uvsq.fr.gl_exo5;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public final class PERSONNE implements ComportementPersonnel,java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String nom ;
	private final String prenom ;
	private final fonction fonction ;
	private final LocalDate dateNaissance;
	private final List<NumeroTelephone> numerosTelephone;
public static class PERSONNEBuilder {
		
		
		private final String nom;
		private final String prenom;
	
		private LocalDate dateNaissance = null;
		private List<NumeroTelephone> numerosTelephone = new ArrayList<NumeroTelephone>();
		private fonction fonction;
		
		public PERSONNEBuilder(String nom, String prenom) {
			this.prenom = prenom;
			this.nom = nom;
		}
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
	
	private PERSONNE(PERSONNEBuilder builder) {
	
		nom = builder.nom;
		prenom = builder.prenom;
		fonction = builder.fonction;
		dateNaissance = builder.dateNaissance;
		numerosTelephone = builder.numerosTelephone;
	}



	public String getNom() {
		return nom;
	}

	
	public String getPrenom() {
		return prenom;
	}


	public fonction getFonction() {
		return fonction;
	}


	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	
	public List<NumeroTelephone> getNumerosTelephone() {
		return numerosTelephone;
	}



	public void print() {
		// TODO Auto-generated method stub
		System.out.println("  Je suis "+this.nom+" "+this.prenom+"  née le  "+this.dateNaissance +" et je travaille comme "+this.fonction) ;

	}
	

	
}
