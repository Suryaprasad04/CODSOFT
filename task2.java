import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scanner.nextLine();
        System.out.print("Enter the number of subjects: ");
        int numSub = scanner.nextInt();

        int total = 0;
        int marks;
        for (int i = 1; i <= numSub; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            marks = scanner.nextInt();
            total += marks;
        }
        scanner.close();
        double avgPer;
        avgPer=(double) total / numSub;
        char grade;
        if (avgPer >= 90) {
            grade = 'A';

        } else if (avgPer >= 80) {
            grade = 'B';


        } else if (avgPer >= 70) {
            grade = 'C';


        } else if (avgPer >= 60) {
            grade = 'D';


        } else if (avgPer >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
            System.out.println("Total Marks: " + total);
            System.out.println("Average Percentage: " + avgPer + "%");
            System.out.println("Sorry "+name+" You have failed in this Examination by securing " +grade+ " grade,Better luck next time!!!");
            return;
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + avgPer + "%");
        System.out.println("Congragulations "+name+ "You have secured " + grade+ " in this Examination");
    }
}

