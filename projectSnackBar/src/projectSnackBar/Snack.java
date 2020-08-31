package projectSnackBar;

public class Snack {

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name) {
        maxId ++;
        id = maxId;
        this.name = name;
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

    public void setCost(boolean cost) {
        this.cost = cost;
    }

    public void setVendingMachineId(int id) {
        this.id = id;
    }

    public int addQuantity(int add) {
        quantity = quantity + add;
    }

    public int buySnack(int numberOfSnacks) {
        return this.quantity * numberOfSnacks;        
    }

    public int getTotalCost(int quantity) {
        return cost * quantity;
    }

}