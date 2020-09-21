package projectSnackBar;

public class Main {

    //instantiates objects

    private static void instantiateData() {

        //instantiates 2 customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob",33.14);
        //instantiates 3 vending machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");
        //instantiates 5 snacks
        Snack chips = new Snack("Chips", 36, 1.75, 1);
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);
        Snack soda = new Snack("Soda", 24, 2.50, 2);
        Snack water = new Snack("Water", 20, 2.75, 2);

        //Processing #1
        jane.buySnacks(3,soda.getCost());
        soda.buySnack(3);
        System.out.println("Customer 1 cash on hand " + "$" +jane.getCashOnHand());
        System.out.println("Quantity of snack 4 is " +soda.getQuantity());

        //Processing #2
        jane.buySnacks(1,pretzel.getCost());
        pretzel.buySnack(1);
        System.out.println("Customer 1 cash on hand " + "$" +jane.getCashOnHand());
        System.out.println("Quantity of snack 3 is " +pretzel.getQuantity());

        //Processing #3
        bob.buySnacks(2,soda.getCost());
        soda.buySnack(2);
        System.out.println("Customer 2 cash on hand " + "$" + bob.getCashOnHand());
        System.out.println("Quantity of snack 4 is " +soda.getQuantity());

        //Processing #4
        jane.addCash(10);
        System.out.println("Customer 1 cash on hand " + "$" + jane.getCashOnHand());

        //Processing #5
        jane.buySnacks(1,chocolateBar.getCost());
        chocolateBar.buySnack(1);
        System.out.println("Customer 2 cash on hand " + "$" + jane.getCashOnHand());
        System.out.println("Quantity of snack 4 is " +chocolateBar.getQuantity());

        //Processing #6
        pretzel.addQuantity(12);
        System.out.println("Quantity of snack 3 is " +pretzel.getQuantity());
        
        //Processing #7
        bob.buySnacks(3,pretzel.getCost());
        pretzel.buySnack(3);
        System.out.println("Customer 1 cash on hand " + "$" + bob.getCashOnHand());
        System.out.println("Quantity of snack 3 is " +pretzel.getQuantity());


    }


    public static void main(String[] args) {

        instantiateData();
    }
    

}