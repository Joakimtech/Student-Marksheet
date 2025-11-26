import java.util.Scanner;

public class StudentMarksheet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // printing the header
        System.out.println("========================================================================");
        System.out.println("           Dedan Kimathi University of Technology");
        System.out.println("           School of Computer Science and IT");
        System.out.println("           Department of Computer Science");
        System.out.println("           Academic Year: 2024/2025");
        System.out.println("           STUDENT MARKSHEET (SECOND YEAR RESULTS)");
        System.out.println("========================================================================");
        System.out.println();

        // getting student 1 information
        System.out.println("Enter details for Student 1:");
        System.out.print("Registration Number: ");
        String reg1 = input.nextLine();
        System.out.print("Full Name: ");
        String name1 = input.nextLine();
        System.out.print("CCS2201 Marks: ");
        double ccs2201_1 = input.nextDouble();
        System.out.print("CCS2202 Marks: ");
        double ccs2202_1 = input.nextDouble();
        System.out.print("CCS2203 Marks: ");
        double ccs2203_1 = input.nextDouble();
        System.out.print("CCS2204 Marks: ");
        double ccs2204_1 = input.nextDouble();
        System.out.print("CCS2205 Marks: ");
        double ccs2205_1 = input.nextDouble();
        System.out.print("CCS2206 Marks: ");
        double ccs2206_1 = input.nextDouble();
        System.out.print("CCS2211 Marks: ");
        double ccs2211_1 = input.nextDouble();
        input.nextLine();

        // calculating total and average for student 1
        double total1 = ccs2201_1 + ccs2202_1 + ccs2203_1 + ccs2204_1 + ccs2205_1 + ccs2206_1 + ccs2211_1;
        double average1 = total1 / 7;

        // getting student 2 information
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Registration Number: ");
        String reg2 = input.nextLine();
        System.out.print("Full Name: ");
        String name2 = input.nextLine();
        System.out.print("CCS2201 Marks: ");
        double ccs2201_2 = input.nextDouble();
        System.out.print("CCS2202 Marks: ");
        double ccs2202_2 = input.nextDouble();
        System.out.print("CCS2203 Marks: ");
        double ccs2203_2 = input.nextDouble();
        System.out.print("CCS2204 Marks: ");
        double ccs2204_2 = input.nextDouble();
        System.out.print("CCS2205 Marks: ");
        double ccs2205_2 = input.nextDouble();
        System.out.print("CCS2206 Marks: ");
        double ccs2206_2 = input.nextDouble();
        System.out.print("CCS2211 Marks: ");
        double ccs2211_2 = input.nextDouble();
        input.nextLine();

        // calculating total and average for student 2
        double total2 = ccs2201_2 + ccs2202_2 + ccs2203_2 + ccs2204_2 + ccs2205_2 + ccs2206_2 + ccs2211_2;
        double average2 = total2 / 7;

        // getting student 3 information
        System.out.println("\nEnter details for Student 3:");
        System.out.print("Registration Number: ");
        String reg3 = input.nextLine();
        System.out.print("Full Name: ");
        String name3 = input.nextLine();
        System.out.print("CCS2201 Marks: ");
        double ccs2201_3 = input.nextDouble();
        System.out.print("CCS2202 Marks: ");
        double ccs2202_3 = input.nextDouble();
        System.out.print("CCS2203 Marks: ");
        double ccs2203_3 = input.nextDouble();
        System.out.print("CCS2204 Marks: ");
        double ccs2204_3 = input.nextDouble();
        System.out.print("CCS2205 Marks: ");
        double ccs2205_3 = input.nextDouble();
        System.out.print("CCS2206 Marks: ");
        double ccs2206_3 = input.nextDouble();
        System.out.print("CCS2211 Marks: ");
        double ccs2211_3 = input.nextDouble();
        input.nextLine();

        // calculating total and average for student 3
        double total3 = ccs2201_3 + ccs2202_3 + ccs2203_3 + ccs2204_3 + ccs2205_3 + ccs2206_3 + ccs2211_3;
        double average3 = total3 / 7;

        // getting student 4 information
        System.out.println("\nEnter details for Student 4:");
        System.out.print("Registration Number: ");
        String reg4 = input.nextLine();
        System.out.print("Full Name: ");
        String name4 = input.nextLine();
        System.out.print("CCS2201 Marks: ");
        double ccs2201_4 = input.nextDouble();
        System.out.print("CCS2202 Marks: ");
        double ccs2202_4 = input.nextDouble();
        System.out.print("CCS2203 Marks: ");
        double ccs2203_4 = input.nextDouble();
        System.out.print("CCS2204 Marks: ");
        double ccs2204_4 = input.nextDouble();
        System.out.print("CCS2205 Marks: ");
        double ccs2205_4 = input.nextDouble();
        System.out.print("CCS2206 Marks: ");
        double ccs2206_4 = input.nextDouble();
        System.out.print("CCS2211 Marks: ");
        double ccs2211_4 = input.nextDouble();
        input.nextLine();

        // calculating total and average for student 4
        double total4 = ccs2201_4 + ccs2202_4 + ccs2203_4 + ccs2204_4 + ccs2205_4 + ccs2206_4 + ccs2211_4;
        double average4 = total4 / 7;

        // getting student 5 information
        System.out.println("\nEnter details for Student 5:");
        System.out.print("Registration Number: ");
        String reg5 = input.nextLine();
        System.out.print("Full Name: ");
        String name5 = input.nextLine();
        System.out.print("CCS2201 Marks: ");
        double ccs2201_5 = input.nextDouble();
        System.out.print("CCS2202 Marks: ");
        double ccs2202_5 = input.nextDouble();
        System.out.print("CCS2203 Marks: ");
        double ccs2203_5 = input.nextDouble();
        System.out.print("CCS2204 Marks: ");
        double ccs2204_5 = input.nextDouble();
        System.out.print("CCS2205 Marks: ");
        double ccs2205_5 = input.nextDouble();
        System.out.print("CCS2206 Marks: ");
        double ccs2206_5 = input.nextDouble();
        System.out.print("CCS2211 Marks: ");
        double ccs2211_5 = input.nextDouble();

        // calculating total and average for student 5
        double total5 = ccs2201_5 + ccs2202_5 + ccs2203_5 + ccs2204_5 + ccs2205_5 + ccs2206_5 + ccs2211_5;
        double average5 = total5 / 7;

        // now printing the marksheet table
        System.out.println("\n\n");
        System.out.println("Student Score Sheet");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Reg No.\t\tFull Name\t\t\t\t\t\tCCS 2201\t\t\t\t\t\t\tCCS 2202\t\t\t\t\t\tCCS 2203\t\t\t\t\t\tCCS 2204\t\t\t\t\t\t\tCCS 2205\t\t\t\t\t\tCCS 2206\t\t\t\t\t\t\t\tCCS 2211\t\t\t\t\tTOTALS\t\t\t\t\t\tAVERAGE\t\t\t\tSTATUS\t\t\t\tGRADE");
        System.out.println("------------------------------------------------------------------------------------------------");

        // printing student 1 data
        System.out.println(reg1 + "\t\t" + name1 + "\t\t" + ccs2201_1 + "\t\t" + ccs2202_1 + "\t\t" + ccs2203_1 + "\t\t" + ccs2204_1 + "\t\t" + ccs2205_1 + "\t\t" + ccs2206_1 + "\t\t" + ccs2211_1 + "\t\t" + total1 + "\t\t" + average1 + "\t\t\t\t");

        // printing student 2 data
        System.out.println(reg2 + "\t\t" + name2 + "\t\t" + ccs2201_2 + "\t\t" + ccs2202_2 + "\t\t" + ccs2203_2 + "\t\t" + ccs2204_2 + "\t\t" + ccs2205_2 + "\t\t" + ccs2206_2 + "\t\t" + ccs2211_2 + "\t\t" + total2 + "\t\t" + average2 + "\t\t\t\t");

        // printing student 3 data
        System.out.println(reg3 + "\t\t" + name3 + "\t\t" + ccs2201_3 + "\t\t" + ccs2202_3 + "\t\t" + ccs2203_3 + "\t\t" + ccs2204_3 + "\t\t" + ccs2205_3 + "\t\t" + ccs2206_3 + "\t\t" + ccs2211_3 + "\t\t" + total3 + "\t\t" + average3 + "\t\t\t\t");

        // printing student 4 data
        System.out.println(reg4 + "\t\t" + name4 + "\t\t" + ccs2201_4 + "\t\t" + ccs2202_4 + "\t\t" + ccs2203_4 + "\t\t" + ccs2204_4 + "\t\t" + ccs2205_4 + "\t\t" + ccs2206_4 + "\t\t" + ccs2211_4 + "\t\t" + total4 + "\t\t" + average4 + "\t\t\t\t");

        // printing student 5 data
        System.out.println(reg5 + "\t\t" + name5 + "\t\t" + ccs2201_5 + "\t\t" + ccs2202_5 + "\t\t" + ccs2203_5 + "\t\t" + ccs2204_5 + "\t\t" + ccs2205_5 + "\t\t" + ccs2206_5 + "\t\t" + ccs2211_5 + "\t\t" + total5 + "\t\t" + average5 + "\t\t\t\t");

        System.out.println("================================================================================================");

        input.close();
    }
}