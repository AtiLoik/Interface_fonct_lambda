package presentation;

import metier.*;
public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		etudiant e = new etudiant();

		e.AffichEtudiant(()->{System.out.println("Je suis un étudiant lambda");});
		
//		Ietudiant task = ()->{System.out.println("Je suis un 3e étudiant");};	
//		etudiant Ietudiant = () -> {System.out.println("Je suis un 4e etudiant");};
	}

}
