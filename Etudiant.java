import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Etudiant extends Personne {
    private int Anne_entree;
    private List<Note> notes = new ArrayList<Note>();

    public Etudiant(int no, String n, String p, int t, String m, int Anne_entree) {
        super(no, n, p, t, m);
        this.Anne_entree = Anne_entree;
    }

    public int getAnne_entree() {
        return this.Anne_entree;
    }

    public void setAnne_entree(int Anne_entree) {
        this.Anne_entree = Anne_entree;
    }

    public List<Note> getNotes() {
        return this.notes;
    }

    public void addNote(Note n) {
        this.notes.add(n);
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public void Calculer_moyenne() {
        double m = 0;
        for (int i = 0; i < notes.size(); i++) {
            m = m + notes.get(i).getNote_controle();
        }
        m = m / notes.size();
        System.out.println("la moyenne d etudiant " + super.getPrenom() + " est egale a " + m);
    }

    public void Afficher_mat_sans_note() {

        if (notes.isEmpty()) {
            System.out.println("l'etudiant " + super.getPrenom() + " n'a pas du note dans toutes les matieres");
        } else {
            System.out.println("la liste des cours sans notes pour l'etudiant " + super.getPrenom() + " est:");
            Set<Cours> allCours = notes.get(0).getCours().getEnsg().get(0).getDep().getSetOfCours();
            Set<Cours> etudCours = new HashSet<Cours>();
            for (int i = 0; i < notes.size(); i++) {
                etudCours.add(notes.get(i).getCours());
            }
            allCours.removeAll(etudCours);
            for (Cours i : allCours)
                System.out.println(i.getLibelle_cours());
        }

        // List<Enseignant> listEnseignants =notes.get(0).getCours().getEnsg() ;
    }

}
