import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" HOSPITAL APPOINTMENT SYSTEM ");
        System.out.println("=================================");

        System.out.print("Enter Patient Name: ");
        String patientName = sc.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctorName = sc.nextLine();

        System.out.print("Enter Appointment Date (DD-MM-YYYY): ");
        String date = sc.nextLine();

        try {
            FileWriter fw = new FileWriter("appointments.txt", true);

            fw.write("Patient Name: " + patientName + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Gender: " + gender + "\n");
            fw.write("Doctor: " + doctorName + "\n");
            fw.write("Date: " + date + "\n");
            fw.write("---------------------------------\n");

            fw.close();

            System.out.println("\nAppointment Booked Successfully!");
            System.out.println("Thank you for using the system.");

        } catch (IOException e) {
            System.out.println("Error while booking appointment.");
        }

        sc.close();
    }
}
