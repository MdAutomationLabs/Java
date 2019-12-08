import javax.swing.JFrame;

public class FilledFrameViewer2
{
   public static void main(String[] args)
   {
     JFrame frame = new FilledFrame();
     frame.setTitle("A frame with two components");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
   }
}
