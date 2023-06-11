import java.util.ArrayList;
import java.util.List;

public class Salle {
    private int No_salle;
    private String nom;
    private int capacite;
    private List<Cours> cours=new ArrayList<Cours>();

    public Salle(int No_salle, String nom, int capacite) {
        this.No_salle = No_salle;
        this.nom = nom;
        this.capacite = capacite;
    }

    public int getNo_salle() {
        return this.No_salle;
    }

    public void setNo_salle(int No_salle) {
        this.No_salle = No_salle;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return this.capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public List<Cours> getCours() {
        return this.cours;
    }

    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }

    public void addCours(Cours c){
        this.cours.add(c);
    }
}
