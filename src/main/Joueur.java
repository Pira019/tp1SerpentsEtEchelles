package main;

public class Joueur {

	public static int compteurDeJoueurs =0;
	private  int  nom;
	private int position;
	
	 Joueur(){
		nom= compteurDeJoueurs ++;
		position = 0;
		System.out.println("Ajout du joueur " + nom);
	}
	
	
	int getNom() {
		
		return nom;
	}


	public int getPosition() {
		return position;
	}


	public void setPosition(int position) {
		this.position = position;
	} 

}
