public class Academie {
    public static void main(String[] args) {
        College c1=new College(1, "ibn sina", "maamoura nabeul");
        Departement d1=new Departement(1, "info", c1);
        Departement d2=new Departement(2, "gpr", c1);
        Departement d3=new Departement(3, "gestion", c1);
        Salle s1=new Salle(1, "A1", 50);
        Salle s2=new Salle(2, "A2", 50);
        Salle s3=new Salle(3, "B1", 30);
        Salle s4=new Salle(4, "B2", 30);
        Salle s5=new Salle(5, "C1", 40);
        Salle s6=new Salle(6, "C2", 40);
        Salle s7=new Salle(7, "D1", 45);
        Cours cours1=new Cours(111, "spring boot", s1);
        Cours cours2=new Cours(112, "JAVA", s2);
        Cours cours3=new Cours(211, "chimie organique", s3);
        Cours cours4=new Cours(311,"finance",s5);
        Enseignant ens1=new Enseignant(100, "bahloul", "mounir", 25631214, "mounir123@gmail.com", "2022-03-25", cours1, d1);
        Enseignant ens2=new Enseignant(55, "sankouh", "samir", 21699914, "sankouh123@gmail.com", "2020-05-25", cours3, d2);
        Enseignant ens3=new Enseignant(66, "boufili", "mehrez", 556312550, "mehrez616@gmail.com", "2021-12-01", cours2, d1);
        Etudiant etud1=new Etudiant(1, "zayet", "oumayma", 99000000, "oumaymazayet@gmail.com", 2021);
        Etudiant etud2=new Etudiant(2, "ben salem", "youssef", 56000000, "youssefbensalem@gmail.com", 2021);
        Note n1=new Note(16, cours1, etud1);
        // Note n2=new Note(14, cours2, etud1);
        Note n3=new Note(17, cours1, etud2);
        Note n4=new Note(15, cours2, etud2);
        etud1.Calculer_moyenne();
        etud2.Calculer_moyenne();
        cours1.Calculer_moyenne();
        cours2.Calculer_moyenne();
        d1.Calculer_moyenne();
        etud1.Afficher_mat_sans_note();
    }
}
