import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class EFScaleComponent extends JComponent {
	
	private static final long serialVersionUID = 1L;
	private Polygon p;
	Color  c;
  public EFScaleComponent (int[] x, int[] y, Color c){
	  p = new Polygon();
	  p.xpoints = x;
	  p.ypoints = x;
	  p.npoints = x.length;
	  this.c = c;
	
	 }
	 public void paintComponent(Graphics g){
		 g.setColor(Color.BLUE);
         g.drawPolygon(p);
	}
			
	  
	  
  }

