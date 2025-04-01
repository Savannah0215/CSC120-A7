/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces = 80; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets = 15; // The number of sugar packets remaining in inventory
    private int nCreams = 15; // The number of "splashes" of cream remaining in inventory
    private int nCups = 20; // The number of cups remaining in inventory
    
    public Cafe() {
        System.out.println("You have built a cafe: ☕");
    }
    
    public void setCoffee(int nCoffeeOunces) {
        int Coffee = nCoffeeOunces;
    }
    
    public void setSugar(int nSugarPackets) {
        int Sugar = nSugarPackets;
    }
    
    public void setCream(int nCreams) {
        int Cream = nCreams;
    }

    public void setCups(int nCups) {
        int nCups = nCups;
    }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (Cups >= 1 && Coffee >= size && Sugar >= nSugarPackets && Cream >= nCreams) {
            nCups = nCups - 1;
            
        } else {
            System.out.println("Restocking supplies...");
            Cafe.restock (80, 15, 15, 20);
        }
    }
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups); 

    
    public static void main(String[] args) {
        Cafe CampusCafe = new Cafe();
        CampusCafe.setCoffee(80);
        CampusCafe.setSugar(15);
        CampusCafe.setCream(15);
        CampusCafe.setCups(20);
    }
    
}
