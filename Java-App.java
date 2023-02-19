import java.util.Scanner;
class Name{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        fn = sc.nextLine();
        System.out.println("Enter your last name: ");
        ln = sc.nextLine();
        System.out.println("Full name: "+fn+" "+ln);
    }
}