import java.util.ArrayList;
/* This is a stub for the House class */
public class House extends Building {
  private ArrayList<Student> residents = new ArrayList<Student>(); // The <Student> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  public House() {
    System.out.println("You have built a house: 🏠");
  }

  public static void main(String[] args) {
    new House();
  }

  public boolean getHasDiningRoom() {
    return hasDiningRoom;   
  }  
  
  public boolean isResident(Student s) {
    isResident(Student s) = residents.contains(Student s)
    return isResident(Student s);
  }
  
  public int getnResidents() {
    return residents;
  }

  public void moveIn(Student s) {
    residents.add(Student s);
  }
  
  public Student moveOut(Student s) { // return the Student who moved out
    residents.remove(Student s);
  }  
}
