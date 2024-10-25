
public class Etudiant {
	private String CNE;
	private String Nom ;
	private double Moyenne ;
	private int classement  ;
	private String decision ;
//	definir les atributs obligatoires lors de la creation d'un objet et reserver le stockage memoire 

	public Etudiant ( String cne , String nom ,double moyenne ) {
		CNE = cne ;
		Nom = nom ;
		Moyenne = moyenne ;	
	}
	public double getMoyenne() {
		return Moyenne ;
	}
	public String getNom() {
		return  Nom ;
	}
	public String getCne() {
		return CNE ;
	}
	public int getClassement() {
        return classement;
    }

    public void setClassement(int classement) {
        this.classement = classement;
    }
    
	
}
