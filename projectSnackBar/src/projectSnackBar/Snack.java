package projectSnackBar;

public class Snack {

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId ++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setVendingMachineId(int id) {
        this.id = id;
    }

    public int addQuantity(int add) {
       return this.quantity = quantity + add;
    }

    public int buySnack(int numberOfSnacks) {
        return this.quantity = this.quantity-numberOfSnacks;        
    }

    public double getTotalCost(int quantity) {
       return  this.cost * quantity;
    }

}