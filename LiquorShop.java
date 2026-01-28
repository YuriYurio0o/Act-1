import java.util.Scanner;
public class LiquorShop {
    public static void main(String[] args) {
        String drinkName;
        int price;

        Scanner scan = new Scanner(System.in);
        Liquor firstDrink = new Liquor();
        Liquor secondDrink = new Liquor();

        System.out.print("Enter Liquor Name: ");
        drinkName = scan.nextLine();
        System.out.print("Enter Price: ");
        price = scan.nextInt();

        firstDrink.setdrinkName(drinkName);
        firstDrink.setPrice(price);

        scan.nextLine();

        System.out.print("Enter Liquor Name: ");
        drinkName = scan.nextLine();
        System.out.print("Enter Price: ");
        price = scan.nextInt();

        secondDrink.setdrinkName(drinkName);
        secondDrink.setPrice(price);

        System.out.println("\nFirst Liquor:");
        System.out.println("Name: " + firstDrink.getdrinkName());
        System.out.println("Price: P" + firstDrink.getPrice());

        System.out.println("\nSecond Liquor:");
        System.out.println("Name: " + secondDrink.getdrinkName());
        System.out.println("Price: P" + secondDrink.getPrice());
    }
}
