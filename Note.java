public class Note {
    private double Note_controle;
    private Cours cours;
    private Etudiant etd;

    public Note(double Note_controle, Cours cours, Etudiant etd) {
        this.Note_controle = Note_controle;
        this.cours = cours;
        this.etd = etd;
        cours.addNote(this);
        etd.addNote(this);
    }

    public double getNote_controle() {
        return this.Note_controle;
    }

    public void setNote_controle(double Note_controle) {
        this.Note_controle = Note_controle;
    }

    public Cours getCours() {
        return this.cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Etudiant getEtd() {
        return this.etd;
    }

    public void setEtd(Etudiant etd) {
        this.etd = etd;
    }

}
