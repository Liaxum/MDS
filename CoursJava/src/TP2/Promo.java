package TP2;

public class Promo {
    public static void main(String[] args) {
        TDGroup TD1 = new TDGroup("TD1", 10);
        TDGroup TD2 = new TDGroup("TD2", 10);

        Student Alexis = new Student(1, "Alexis", "Muguet");
        Student Paul = new Student(2, "Paul", "Marais");
        Student Clement = new Student(3, "Clement", "Petre");
        Student Gauthier = new Student(4, "Gauthier", "Mauche");
        Student Jordan = new Student(5, "Jordan", "Laroche");
        Student Romain = new Student(6, "Romain", "Texier");

        TD1.addStudent(Alexis);
        TD1.addStudent(Paul);
        TD1.addStudent(Clement);
        TD1.addStudent(Gauthier);
        TD2.addStudent(Jordan);
        TD2.addStudent(Romain);

        displayTDS(TD1, TD2);

        Paul.setName("John");

        System.out.println("Change Paul to John");
        displayTDS(TD1, TD2);

        TD1.removeStudent(Gauthier.getId(), Gauthier.getName(), Gauthier.getNickname());
        TD2.removeStudent(Romain.getId(), Romain.getName(), Romain.getNickname());
        TD1.addStudent(Romain);
        TD2.addStudent(Gauthier);
        System.out.println("Permute");
        displayTDS(TD1, TD2);

    }

    public static void displayTDS(TDGroup TD1, TDGroup TD2) {
        System.out.println("TD1 students: ");
        TD1.display();
        System.out.println();
        System.out.println("TD2 students: ");
        TD2.display();
        System.out.println();

    }
}
