package uvsq.fr.gl_exo5;

import java.util.ArrayList;

public class GroupePersonnel implements ComportementPersonnel  {
	final ArrayList<ComportementPersonnel> listepersonnel ;
	public GroupePersonnel() {
		listepersonnel = new ArrayList<ComportementPersonnel>();
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
	
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
			for (ComportementPersonnel p :listepersonnel) {
				p.print(); 
				}
			}





  

}
