import javax.swing.JFrame;

public class frame extends JFrame{
    frame()
    {
        this.setTitle("Snake n'food");

        this.add(new panel());
        
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
    }
}
