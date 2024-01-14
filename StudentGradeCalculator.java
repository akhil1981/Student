import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter no of subject");

        int ns = Sc.nextInt();
        int total = 0;

        for(int i = 0; i<ns; i++){
            System.out.println("Enter marks obtained in " +(1+i)+":");
            int mark = Sc.nextInt();
            total += mark;

        }
        double averp = (double) total/ns;
        char Grade;
        if(averp>=90){
            Grade = 'o';
        }
        else if (averp>=80){
            Grade = 'a';
        }
        else if (averp>=70){
            Grade ='b';
        }
        else if (averp>=60) {
            Grade = 'c';
        }
        else if (averp>=50) {
            Grade = 'd';
        }
        else if (averp>=40) {
            Grade = 'e';
        }
        else {
            Grade = 'f';
        }
        System.out.println("Total marks scored is" + total);
        System.out.println("Average Percentage Gained is" + averp + "%");
        System.out.println("Grade:" + Grade);
    }
}
