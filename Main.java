import java.util.Scanner;

public class Main {
    public class Variable {
        public static int i = 0, n = 1;
    }

    public static void main(String[] args) {
        System.out.println("Task one: sum of two numbers\nEnter two numbers: ");
        sum();

        System.out.println("\nTask two: Even number?\nEnter number: ");
        evenNum();

        System.out.println("\nTask three: output numbers from 1 to N\nEnter number: ");
        cycle();

        System.out.println("\n\nTask four: sum numbers from 1 to N\nEnter number: ");
        sumOfCycleNumbers();

        System.out.println("\nTask fife: read numbers from keyboard\nEnter number > 0");
        enterNumInTerminal();

        System.out.println("\n" + "HOMEWORK" + "\n");

        System.out.println("Task one: perimeter and area of a rectangle");
        perimetrAreaRectangle();

        System.out.println("Task two: Rating output");
        ratingOutput();

        System.out.println("Task three: Output of the multiplication table for the number N\nEnter N");
        Variable.i = 10;
        Variable.n = new Scanner(System.in).nextInt();
        OutputMultiplicationTable(Variable.i);

        System.out.println("Task **********\nFibonacci numbers\nEnter N:");
        Variable.n = new Scanner(System.in).nextInt();
        System.out.println(fibonachiNumbers(Variable.n));
    }

    public static void sum(){
        Variable.n = new Scanner(System.in).nextInt() + new Scanner(System.in).nextInt();
        System.out.println("sum = " + Variable.n);
    }

    public static void evenNum(){
        if (new Scanner(System.in).nextInt() % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number isn't event");
        }
    }

    public static void cycle(){
        Variable.n = new Scanner(System.in).nextInt();
        for (Variable.i = 1; Variable.i <= Variable.n; Variable.i ++){
            System.out.print(Variable.i + "\t");
        }
    }

    public static void sumOfCycleNumbers(){
        Variable.i = 0;
        Variable.n = new Scanner(System.in).nextInt();
        while (1 <= Variable.n){
            Variable.i += Variable.n--;
        }
        System.out.println("Sum of cycle numbers: " + Variable.i);
    }

    public static void enterNumInTerminal(){
        do {
            System.out.println(Variable.n = new Scanner(System.in).nextInt());
        } while (Variable.n > 0);
    }

    public static void perimetrAreaRectangle(){
        System.out.print("Enter length: ");
        Variable.n = new Scanner(System.in).nextInt();
        System.out.print("Enter width: ");
        Variable.i = new Scanner(System.in).nextInt();
        System.out.println("Area rectangle = " + (Variable.n * Variable.i) + "\n" + "Perimetr rectangle = " + ((Variable.n + Variable.i) * 2) + "\n");
    }

    public static void ratingOutput(){
        System.out.print("Enter point: ");
        Variable.n = new Scanner(System.in).nextInt();
        switch (
                 ((Variable.n >= 90 && Variable.n <= 100) ? 1 : 0) + ((Variable.n >= 75 && Variable.n <= 89) ? 2 : 0) +
                 ((Variable.n >= 50 && Variable.n <= 74) ? 3 : 0) + ((Variable.n >= 30 && Variable.n <= 49) ? 4 : 0) +
                 ((Variable.n >= 0 && Variable.n <= 29) ? 5 : 0)
        ){
            case 1 -> System.out.println("Rating A");
            case 2 -> System.out.println("Rating B");
            case 3 -> System.out.println("Rating C");
            case 4 -> System.out.println("Rating D");
            case 5 -> System.out.println("Rating F");
            default -> System.out.println("You entered non-existent points");
        }
    }

    public static void OutputMultiplicationTable(int n){
        if (n == 0) {
            return;
        }
        OutputMultiplicationTable(n - 1);
        System.out.print(Variable.n + " x " + n + " = " + Variable.n * n + "\n");
    }

    public static int fibonachiNumbers(int n){
        if (n < 0) {
            return 1;
        }
        return fibonachiNumbers(n - 1)  + fibonachiNumbers(n - 2);
    }
}