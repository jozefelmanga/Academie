public class Enseignant extends Personne{
    private String date_prise_de_fonction;
    private boolean Indice;
    private Cours cours;
    private Departement dep;

    public Enseignant(int no,String n,String p,int t,String m,String date_prise_de_fonction, Cours cours, Departement dep) {
        super(no,n,p,t,m);
        this.date_prise_de_fonction = date_prise_de_fonction;
        this.Indice = false;
        this.cours= cours;
        this.dep=dep;
        dep.addEnsg(this);
        cours.addEnsg(this);
    }

    public String getDate_prise_de_fonction() {
        return this.date_prise_de_fonction;
    }

    public void setDate_prise_de_fonction(String date_prise_de_fonction) {
        this.date_prise_de_fonction = date_prise_de_fonction;
    }

    public boolean getIndice() {
        return this.Indice;
    }

    public void setIndice(boolean Indice) {
        this.Indice = Indice;
    }

    public Cours getCours() {
        return this.cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Departement getDep() {
        return this.dep;
    }

    public void setDep(Departement dep) {
        this.dep = dep;
    }
    
}
