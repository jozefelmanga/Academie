class Personne{
    private int No_personne;
    private String nom;
    private String prenom;
    private int tel;
    private String mail;

    public Personne(int No_personne, String nom, String prenom, int tel, String mail) {
        this.No_personne = No_personne;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
    }
    
    public int getNo_personne() {
        return this.No_personne;
    }

    public void setNo_personne(int No_personne) {
        this.No_personne = No_personne;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTel() {
        return this.tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }    

    public void Afficher_fiche_signalitique(){
        System.out.println(No_personne+" "+nom+" "+prenom+" "+tel+" "+mail);
    }

}