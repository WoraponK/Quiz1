import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        student s1 = new student(1, "Worapon", 2022, 3.67);
        s1.showDetails();
        s1.updateStudentInfo();
        s1.showDetails();
    }
}

class student {
    int ID, admissionYear;
    String Name;
    double GPA;
    
    public student(int ID, String Name, int admissionYear, double GPA) {
        this.ID = ID;
        this.Name = Name;
        this.admissionYear = admissionYear;
        this.GPA = GPA;
    }

    public void updateStudentInfo() {
        Scanner keyboard = new Scanner(System.in);
    
        System.out.print("-------- Enter New ID: ");
        ID = keyboard.nextInt();

        System.out.print("-------- Enter New Name: ");
        Name = keyboard.next();

        System.out.print("-------- Enter New Admission Year: ");
        admissionYear = keyboard.nextInt();

        System.out.print("-------- Enter New GPA: ");
        GPA = keyboard.nextDouble();

        System.out.print("-------- Updated Successfully!\n");
        keyboard.close();
    }

    public void showDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + Name);
        System.out.println("Admission Year: " + admissionYear);
        System.out.println("GPA: " + GPA);
    }

};