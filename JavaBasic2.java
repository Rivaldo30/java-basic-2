import java.util.Scanner;

public class JavaBasic2 {
    
    public static void  main(String [] args){

        String note;
        int score;
        char grade;

        Scanner console = new Scanner(System.in);

        System.out.println("Tuliskan score kamu!!");
        score = console.nextInt();

        if (score >= 80){
            grade = 'A';
            note = "Mantap!!";
        }
        else if (score >= 61){
            grade = 'B';
            note = "Mayan Mantap";
        }
        else if (score >= 41){
            grade = 'C';
            note = "Cukup Mantap";
        }
        else if (score >= 21){
            grade = 'D';
            note = "Ah Tak Mantap!!";
        }
        else {
            grade = 'E';
            note = "Main game terus!";
        }
        System.out.println("Nilai anda adalah: " + grade + '\n' + note);
    } 
}