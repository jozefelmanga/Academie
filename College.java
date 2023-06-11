import java.util.ArrayList;
import java.util.List;

public class College {
    private int code_college;
    private String nom;
    private String adresse_site;
    private List<Departement> depts;

    public College(int c,String n,String a){
        this.code_college = c;
        this.nom = n;
        this.adresse_site = a;
        this.depts = new ArrayList<Departement>();
    }

    public int getCode_college() {
        return this.code_college;
    }

    public void setCode_college(int code_college) {
        this.code_college = code_college;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse_site() {
        return this.adresse_site;
    }

    public void setAdresse_site(String adresse_site) {
        this.adresse_site = adresse_site;
    }

    public List<Departement> getDepts() {
        return this.depts;
    }

    public void setDepts(List<Departement> depts) {
        this.depts = depts;
    }

    public void addDept(Departement d){
        depts.add(d);
    }

}
