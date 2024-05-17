package main;
import java.util.LinkedList;
import java.util.Random;
 
public class SerpentsEtEchelles {

	public static void main(String[] args) { 
		
		int nbrJoueur = verifierLeNbrDeJoueur(Integer.parseInt(args[0]));
		
		System.out.println(args[0]);
		TableauDeJeu tableau = new TableauDeJeu();
		LinkedList<Joueur> joueurs = new LinkedList<Joueur>();
		boolean finDepartie = false;
		Joueur joueurCourrant=null;
		 
         //à faire: lire le nombre de joueurs dans la ligne de commandes, les ajouter dans la liste chainée.
	    while (nbrJoueur != 0) { 
			joueurs.add(new Joueur()); 
			nbrJoueur --;
		}         
        		
	    //À faire, tant qu'aucun joueur n'atteint la case 100, la bouche principale du jeu fait avancer le joueur courrant. 
	    //Chaque itéaration de la boucle correspond au tour de 1 joueur.    
	    // pendant son tour, le joueur role, un 1 (1-6) avance du nombre de cases indiqué, et, si il tombe sur un serpent ou une échelle, 
	    //suis celle-ci. 
	   
	  //  tant
	    while(!finDepartie){  
	    	
	    	for (Joueur joueurCourrant_ : joueurs) { 
	    		
	    		joueurCourrant = joueurCourrant_;
	    		
	    		System.out.println("Tour de " + joueurCourrant.getNom() ); 
	    		
	    		//calculer la nouvelle position du joueur courent 
	    		int nouvellePosition = joueurCourrant.getPosition() +  rouleLeDe();
	    		
	    		//voir la valuer de de System.out.println(roulerDe);
	    		
	    		//verifier si la position est superieur à 99
	    		if(nouvellePosition > tableau.getTableau().length-1) {
	    			nouvellePosition = genererAleatoire();
	    		}
	    		// modifier la position
	    		if(tableau.getTableau()[nouvellePosition].isType()) {	    			
	    			joueurCourrant.setPosition(tableau.getTableau()[nouvellePosition].getDestination());
	    		}else {
	    			joueurCourrant.setPosition(nouvellePosition);
	    		}    		
	    		
				if (joueurCourrant.getPosition() == tableau.getTableau().length - 1) {
					finDepartie = true;
					break;
				}
	   		 
		    	System.out.println("Le joureur  " + joueurCourrant.getNom() + " a atteint la tuile " + joueurCourrant.getPosition() ); 
			} 
	   }	
	    
	    if (finDepartie) {
	    	System.out.println("Le joueur " + joueurCourrant.getNom() + " a gagné position : " + joueurCourrant.getPosition());
		}
 

 	    	
	}//main

	//retourne un nombre entre 1 et 6 (inclusivement) de manière équiprobable.
	public static int rouleLeDe() 
	{ 		
		Random rand = new Random();
		return rand.nextInt(6) + 1;
	}
	
	//Une exception est lancée si le paramètre passé au programme n’est pas un nombre entre 1 et 6
	public static int verifierLeNbrDeJoueur(int nbrJoueur) 
	{
		if(nbrJoueur >=1 && nbrJoueur <=6) {
			return nbrJoueur;
		}
		throw new IllegalArgumentException("nombre de joueur incorrect");
	}
	
	public static int genererAleatoire() {
		 // Génère un nombre aléatoire entre 95 et 99 inclusivement
		return new Random().nextInt(96,99);
	}
	
	
	
}// class 
