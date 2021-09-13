import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people?");
        int num_people = scanner.nextInt();
        System.out.println("How many pizzas do you have?");
        int pizzas = scanner.nextInt();
        System.out.println("How many slices per pizza?");
        int slices = scanner.nextInt();
        int total = pizzas*slices;
        int slice_per_person = total / num_people;
        int remainder = total % num_people;
        System.out.println(num_people+" people with "+pizzas+" pizzas. "+total+" slices");
        System.out.println("Each person gets "+slice_per_person+" pieces of pizza.");
        System.out.println("There are "+remainder+" leftover pieces.");
    }
}
