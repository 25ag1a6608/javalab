import java.util.Scanner;
public class ScholarshipSystem { 
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter scholarship category: ");
        String category = sc.nextLine();

        double income = 0;
        int amt = 0;
        boolean eligible = false;
        // merit
        if (category.equalsIgnoreCase("Merit")) {
            if (cgpa >= 8.5 && attendance >= 90) {
                eligible = true;
                amt = 25000;
            }
            else if (cgpa >= 7.5 && attendance >= 85) {
                eligible = true;
                amt = 15000;
            }
        }
        // sports
        else if (category.equalsIgnoreCase("Sports")) {
            if (cgpa >= 6.0 && attendance >= 75) {
                eligible = true;
                amt = 20000;
            }
        }
        // need based
        else if (category.equalsIgnoreCase("Need-based")) {
            System.out.print("Enter annual family income: ");
            income = sc.nextDouble();
            if (income < 50000 && attendance >= 75) {
                eligible = true;
                amt = 10000;
            }
        }
        else {
            System.out.println("Invalid scholarship category.");
        }
        //result
        System.out.println("\nScholarship Results:");
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Category: " + category);
        if (eligible) {
            System.out.println("Status: Eligible");
            System.out.println("Scholarship Amount: Rs." + amt);
        }
        else {
            System.out.println("Status: Not Eligible");
        }
        sc.close();
    }
}