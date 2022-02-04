import java.io.*;
import java.util.Scanner;

public class AssignmentJ11Q3 {
    public static void main(String[] args) throws IOException {
        // File path is passed as parameter
        File file = new File("D:\\Capgemini Assignments\\JAVA Assignments\\Student_List.txt");

        Scanner sc = new Scanner(file);

        int count = 0;
        while (sc.hasNextLine()){
            String string = sc.nextLine();

            if(string.length()!=0){
                System.out.println(string.trim());
                count++;
            }
        }
        System.out.println("Total number of students present in the txt file are: "+count);

        sc.close();
    }
}
