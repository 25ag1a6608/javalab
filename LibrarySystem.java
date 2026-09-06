import java.util.Scanner;
import java.io.FileWriter;
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter book name: ");
        String book = sc.nextLine();
        System.out.println("\n1. Borrow Book");
        System.out.println("2. Return Book");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("Borrowed successfully");
            System.out.println("Student: " + name);
            System.out.println("Book: " + book);
        }
        else if (choice == 2) {
            System.out.print("Enter late days: ");
            int days=sc.nextInt();
            int fee=days*5;
            System.out.println("Book returned successfully!");
            System.out.println("Late Fee: ₹"+fee);
        }
        else {
            System.out.println("Invalid choice.");
        }
        try {
            FileWriter file=new FileWriter("library.txt");
            file.write("Student: "+name +"\n");
            file.write("Book: "+book +"\n");
            file.close();
            System.out.println("Record saved");
        }
        catch (Exception e) {
            System.out.println("File error");
        }
        sc.close();
    }
}