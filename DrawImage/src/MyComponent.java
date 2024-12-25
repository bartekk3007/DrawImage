import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MyComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        String filename = "animal.jpg";
        Image image = new ImageIcon(filename).getImage();
        g.drawImage(image, 100, 100, null);
    }
    public Dimension getPreferredSize()
    {
        return new Dimension(640, 360);
    }
}