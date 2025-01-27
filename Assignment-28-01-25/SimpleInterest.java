import java.util.Scanner;

class SimpleInterest {
    public void simpleinterest(int principal, int rate, int time) {
        System.out.println("The Simple Interest is " + (principal * rate * time) / 100 + " for P=" + principal + ", R=" + rate + ", T=" + time);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        int p = sc.nextInt();

        System.out.print("Enter Rate of Interest (R): ");
        int r = sc.nextInt();

        System.out.print("Enter Time (T): ");
        int t = sc.nextInt();

        // Create an instance of SimpleInterest
        SimpleInterest obj = new SimpleInterest();
        obj.simpleinterest(p, r, t); // Call the non-static method using the object
    }
}


