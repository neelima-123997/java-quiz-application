import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Java Quiz");
        int score = 0;

        // Question 1
        System.out.println("\n1. What is the size of int in Java?");
        System.out.println("a) 2 bytes\nb) 4 bytes\nc) 8 bytes\nd) 1 byte");
        String answer1 = sc.nextLine();
        if (answer1.equalsIgnoreCase("b")) {
            score++;
        }
        System.out.println("Your score is: " + score + "/1");

        // Question 2
        System.out.println("\n2. Which company developed Java?");
        System.out.println("a) Apple\nb) Microsoft\nc) Sun Microsystems\nd) Google");
        String answer2 = sc.nextLine();
        if (answer2.equalsIgnoreCase("c")) {
            score++;
        }
        System.out.println("Your score is: " + score + "/2");

        // Question 3
        System.out.println("\n3. What keyword is used to create an object?");
        System.out.println("a) create\nb) class\nc) object\nd) new");
        String answer3 = sc.nextLine();
        if (answer3.equalsIgnoreCase("d")) {
            score++;
        }
        System.out.println("Your score is: " + score + "/3");

        System.out.println("\nQuiz completed!");
        System.out.println("Your total score: " + score + "/3");

        sc.close();
    }
}
