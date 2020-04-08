package uvsq.fr.gl_exo5;

public class NumeroTelephone implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Type type;
	private String telephone;
	
	
	public NumeroTelephone(Type type, String telephone) {
		this.type = type;
		this.telephone = telephone;
	}



	public Type getType() {
		return type;
	}
	public String getTelephone() {
		return telephone;
	}


	

	
	
}
