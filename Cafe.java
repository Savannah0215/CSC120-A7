/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    
    public Cafe() {
        System.out.println("You have built a cafe: ☕");
        nCoffeeOunces = 80;
        nSugarPackets = 15;
        nCreams = 15;
        nCups = 15;
    }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams);
        int sellCoffee.nCups = nCups - 1
    
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups); 

    
    public static void main(String[] args) {
        new Cafe();
    }
    
}
