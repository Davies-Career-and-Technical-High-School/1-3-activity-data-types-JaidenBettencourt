import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      // correct answers: q1 = true, q2 = true, q3 = false
      System.out.println("Python is better than java, true or false?");
      boolean q1 = scan.nextBoolean();

      System.out.println("Jaiden is Mr Mazzones favorite student other than Hex, true or false?");
      boolean q2 = scan.nextBoolean();

      System.out.println("Baby yoda is from the Harry Potter book series, true or false");
      boolean q3 = scan.nextBoolean();

      System.out.println(" ");
      System.out.println("The answers:");
      System.out.println("Question one- your answer: "+ q1+ ". Correct answer: true.");
      System.out.println("Question two- your answer: "+ q2+ ". Correct answer: true.");
      System.out.println("Question three- your answer: "+ q3+ ". Correct answer: false.");
    }
}