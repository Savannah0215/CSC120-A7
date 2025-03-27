import java.util.Hashtable
public class Library extends Building {
    private Hashtable<String, boolean> collection; 
    public Library() {
      System.out.println("You have built a library: 📖");
    }
  
    public static void main(String[] args) {
      new Library();
    }
  
  }
