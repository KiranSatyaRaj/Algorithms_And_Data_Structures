import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        // better way to write
        switch (empID) {
            case 1 -> System.out.println("alice");
            case 2 -> System.out.println("bob");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
