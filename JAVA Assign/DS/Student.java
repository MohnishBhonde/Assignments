import java.util.*;
public class Student {
    static int SubjectA, SubjectB, SubjectC;

    static int StudentsTotalMarksInAllSubjects(int[] marks) {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += marks[i];


        }
        return sum;
    }

    static double AverageMarksInAllSubjects(int[] marks) {
        int sum = StudentsTotalMarksInAllSubjects(marks);
        double avg = sum / 3;
        return avg;
    }

    static int SubjectATotalByStudents(int[] marks) {
        int sum = 0;
        for (int i = 0; i < 9; i += 3) {
            sum += marks[i];

        }
        return sum;
    }

    static int SubjectBTotalBystudents(int[] marks) {
        int sum = 0;
        for (int i = 1; i < 9; i += 3) {
            sum += marks[i];
        }
        return sum;
    }

    static int SubjectCTotalByStudents(int[] marks) {
        int sum = 0;
        for (int i = 2; i < 9; i += 3) {
            sum += marks[i];

        }
        return sum;
    }

    static double SubjectAAvgMarksByStudents(int[] marks) {
        int sum = SubjectATotalByStudents(marks);
        double avg = sum / 3;
        return avg;


    }

    static double SubjectBAvgMarksByStudents(int[] marks) {
        int sum = SubjectBTotalBystudents(marks);
        double avg = sum / 3;
        return avg;
    }

    static double SubjectCAvgMarksByStudents(int[] marks) {
        int sum = SubjectCTotalByStudents(marks);
        double avg = sum / 3;
        return avg;
    }

    public static void main(String[] args) {
        int[] Student1 = new int[3];
        int[] Student2 = new int[3];
        int[] Student3 = new int[3];
        int[] marks = new int[9];
        int j = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks for Student1:");
        for (int i = 0; i <= 2; i++) {
            System.out.print("Subject: ");
            Student1[i] = input.nextInt();
            marks[j] = Student1[i];
            j++;

        }
        System.out.print("Enter the marks for Student2:");
        for (int i = 0; i <= 2; i++) {
            System.out.print("Subject: ");
            Student2[i] = input.nextInt();
            marks[j] = Student2[i];
            j++;
        }
        System.out.print("Enter the marks for Student3:");
        for (int i = 0; i <= 2; i++) {
            System.out.print("Subject: ");
            Student3[i] = input.nextInt();
            marks[j] = Student3[i];
            j++;
        }
        System.out.println(
                "Total marks of all the students in all subjects: " + StudentsTotalMarksInAllSubjects(marks));

        System.out.println(
                "Average marks of all the students in all subjects: " + AverageMarksInAllSubjects(marks));

        System.out.println(
                "Total marks scored by students in subject A: " + SubjectATotalByStudents(marks));
        System.out.println(
                "Average marks scored by students in subject A: " + SubjectAAvgMarksByStudents(marks));

        System.out.println(
                "Total marks scored by students in subject B: " + SubjectBTotalBystudents(marks));
        System.out.println(
                "Average marks scored by students in subject B: " + SubjectBAvgMarksByStudents(marks));

        System.out.println(
                "Total marks scored by students in subject C: " + SubjectCTotalByStudents(marks));
        System.out.println(
                "Average marks scored by students in subject C: " + SubjectCAvgMarksByStudents(marks));
    }

}
