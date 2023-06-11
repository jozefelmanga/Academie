import java.util.ArrayList;
import java.util.List;


public class Cours {
    private int No_cours;
    private String libelle_cours;
    private Salle salle;
    private List<Note> notes = new ArrayList<Note>();
    private List<Enseignant> ensg = new ArrayList<Enseignant>();

    public Cours(int No_cours, String libelle_cours, Salle salle) {
        this.No_cours = No_cours;
        this.libelle_cours = libelle_cours;
        this.salle = salle;
        salle.addCours(this);
    }

    public int getNo_cours() {
        return this.No_cours;
    }

    public void setNo_cours(int No_cours) {
        this.No_cours = No_cours;
    }

    public String getLibelle_cours() {
        return this.libelle_cours;
    }

    public void setLibelle_cours(String libelle_cours) {
        this.libelle_cours = libelle_cours;
    }

    public Salle getSalle() {
        return this.salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public List<Note> getNotes() {
        return this.notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
    
    public void addNote(Note n){
        this.notes.add(n);
    }

    public void addEnsg(Enseignant e){
        this.ensg.add(e);
    }

    public List<Enseignant> getEnsg() {
        return this.ensg;
    }

    public void setEnsg(List<Enseignant> ensg) {
        this.ensg = ensg;
    }

    public void Calculer_moyenne(){
        double m=0;
        for(int i=0;i<notes.size();i++){
            m=m+notes.get(i).getNote_controle();
        }
        m=m/notes.size();
        System.out.println("la moyenne du cours "+getLibelle_cours()+" est egale a "+m);
    }
}
