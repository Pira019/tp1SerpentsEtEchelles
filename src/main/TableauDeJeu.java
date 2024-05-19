package main;
public class TableauDeJeu {
	
    private Tuile[] Tableau = new Tuile[100];         //Le tableau de jeu

    TableauDeJeu()
    {
    	for(int i=0;i<100;i++)
    		Tableau[i]=new Tuile(i);
    	
    	Tableau[98].makeSpecialType(53);
    	Tableau[69].makeSpecialType(54);
    	Tableau[51].makeSpecialType(41);
    	Tableau[24].makeSpecialType(1);    	
    	Tableau[94].makeSpecialType(71);   

    	Tableau[5].makeSpecialType(24);
    	Tableau[10].makeSpecialType(39);
    	Tableau[59].makeSpecialType(84);
    	Tableau[45].makeSpecialType(89);    	
    	Tableau[16].makeSpecialType(68);  
    
    }

   protected Tuile[] getTableau() {
    	return Tableau;
    	
    }
   
 //verifier si la position est superieur à la taille du Tuile(99) 
   protected boolean verifierPosition(int nouvellePosition) {
	   return nouvellePosition > Tableau.length -1;
   }
   
   //// retourner la position si c'est un serpent ou non
   protected int verifierEtModifierPosition(int position) {
	   Tuile tuille = Tableau[position];
	   if(tuille.isType()) {
		   return tuille.getDestination();
	   }
	   return position;
   }
   
   protected boolean estGagnant(int position) {
	   return position == Tableau.length - 1;
   }

}


    