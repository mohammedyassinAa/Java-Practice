import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Etudiant> filiere_A  = new ArrayList<Etudiant>();
		
		Etudiant etudiant1 = new Etudiant("L232323" , "Mohammed yassine ", 17);
		Etudiant etudiant2 = new Etudiant("L242424" , "Ismail ", 17);
		Etudiant etudiant3 = new Etudiant("L232323" , "ouass ", 14);
		Etudiant etudiant4 = new Etudiant("L242424" , "zaid ", 17);
		filiere_A.add(etudiant1);
		filiere_A.add(etudiant2);
		filiere_A.add(etudiant3);
		filiere_A.add(etudiant4);
		List<Etudiant> Admis_A = new ArrayList<Etudiant>();
		List<Etudiant> redoublants_A = new ArrayList<Etudiant>();
		List<Etudiant> ratrrapage_A = new ArrayList<Etudiant>();

//		filiere
		for(Etudiant i: filiere_A) {
			if(i.getMoyenne()>=10) {
				Admis_A.add(i);
			}
			else if(i.getMoyenne()>=7) {
				ratrrapage_A.add(i);
			}
			else if(i.getMoyenne()<7) {
				redoublants_A.add(i);
			}
		}

	//Parcours 
	for (Etudiant e : filiere_A ) {
		System.out.println(e);
		
	}
}
// mooyenne
		  public static double calculerMoyenneGenerale(List<Etudiant> etudiants) {
		        double somme = 0;
		        for (Etudiant etudiant : etudiants) {
		            somme += etudiant.getMoyenne();
		        }
		        return somme / etudiants.size(); 
		        }
}


	
