import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Departement {
    private int code_departement;
    private String nom;
    private List<Enseignant> ensg=new ArrayList<Enseignant>();
    private Enseignant chef;
    private College college;

    public Departement(int c,String n,College col){
        this.code_departement=c;
        this.nom=n;
        this.college=col;
        college.addDept(this);
    }

    public College getCollege() {
        return this.college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public int getCode_departement() {
        return this.code_departement;
    }

    public void setCode_departement(int code_departement) {
        this.code_departement = code_departement;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Enseignant> getEnsg() {
        return this.ensg;
    }

    public void setEnsg(List<Enseignant> ensg) {
        this.ensg = ensg;
    }

    public void addEnsg(Enseignant e){
        this.ensg.add(e);
    }

    public Enseignant getChef() {
        return this.chef;
    }

    public void setChef(Enseignant chef) {
        this.chef = chef;
    }

    public void Calculer_moyenne(){
        double m=0;
        Set<Cours> nc=new HashSet<Cours>(); 
        for(int i=0;i<ensg.size();i++){
            nc.add(ensg.get(i).getCours());
        }
        for(Cours i:nc){   
            double moyNC=0;
            for(Note j : i.getNotes()){
                moyNC=moyNC+j.getNote_controle();
            }
            moyNC=moyNC/i.getNotes().size();
            m=m+moyNC;
        }
        m=m/nc.size();
        System.out.println("la moyenne de departement "+getNom()+" est egale a "+m);
    }

    public Set<Cours> getSetOfCours(){
        Set<Cours> nc=new HashSet<Cours>(); 
        for(int i=0;i<ensg.size();i++){
            nc.add(ensg.get(i).getCours());
        }
        return nc;
    }

}
