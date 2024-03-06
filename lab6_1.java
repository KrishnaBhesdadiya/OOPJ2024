import java.util.Scanner;
class Student{
    int id_no;
    int no_of_subject_registered;
    String []subject_code;
    int []subject_credits;
    String []grade_obtained;
    double spi;

    public Student(){
        Scanner sc=new Scanner();
        System.out.println("Enter id_no");
        id_no = sc.nextInt();
        System.out.println("Enter no_of_subject_registered");
        no_of_subject_registered = sc.nextInt();
        subject_code = nextInt(no_of_subject_registered);
        subject_credits = nextInt(no_of_subject_registered);
        grade_obtained = nextInt(no_of_subject_registered);

        for(int i=0;i< no_of_subject_registered;i++){
            System.out.println( " Enter subject_code for student"+(i+1));
            subject_code [i]=sc.nextInt();
            System.out.println( " Enter subject_credits for student"+(i+1));
            subject_credits [i]=sc.nextInt();
            System.out.println( " Enter grade_obtained for student"+(i+1));
            grade_obtained [i]=sc.nextInt();
        }
    }

    public void Calculation_spi(){
        double totalcredits=0;
        int temp=0;
        for(int i=0;i<grade_obtained.length;i++){
            totalcredits+=subject_credits[i];
            int gradeW=0;
            if(grade_obtained[i].equals(anObject:"A")){

            }
        }
    }
}
public class lab6_1 {
    public static void main(String[] args) {
        
    }
}
