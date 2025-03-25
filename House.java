/* This is a stub for the House class */
public class House extends Building {

  public House() {
    System.out.println("You have built a house: 🏠");
  }

  public static void main(String[] args) {
    new House();
  }
  private ArrayList<Student> residents = new ArrayList<Student>(); // The <Student> tells Java what kind of data we plan to store IN the ArrayList
    
    
  private boolean hasDiningRoom;
}
