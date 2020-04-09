package uvsq.fr.gl_exo5;


import java.util.ArrayList;

public class GroupePersonnel implements ComportementPersonnel,java.io.Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int  IdGroupe;
	final ArrayList<ComportementPersonnel> listepersonnel ;
	public GroupePersonnel() {
		listepersonnel = new ArrayList<ComportementPersonnel>();
		IdGroupe=1 + (int)(Math.random() * ((1000 - 1) + 1));
	}
	
	
	public GroupePersonnel(ArrayList<ComportementPersonnel> listepersonnel){
		this.listepersonnel=listepersonnel;}

	public void AjouterPersonnel(ComportementPersonnel p) {
		this.listepersonnel.add(p);}
	
	

	public void SuprimerPersonnel(ComportementPersonnel p) {
		if(this.listepersonnel.contains(p)) {
		this.listepersonnel.remove(p);}
		}

	
	public ArrayList<ComportementPersonnel> getlistepersonnel() {
		return this.listepersonnel;}
public String getId() {
	return IdGroupe+" ";
}
	public void print() {
		// TODO Auto-generated method stub
		for (ComportementPersonnel p :listepersonnel) {
			p.print(); 
			}
		
	}
}
