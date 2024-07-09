
/**
 * GUI-JAVA
 */
import javax.swing.JOptionPane;
public class GUI_JAVA {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name please");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Berapa Usiamu?"));

        if (age > 20 ) {
            JOptionPane.showMessageDialog(null,"Wahh kamu sudah dewasa ya semangat kerjanya");
        }else{
            JOptionPane.showMessageDialog(null, "Waktumu masih banyak jangan sia-siakan ya ");
        }
    }
    
}