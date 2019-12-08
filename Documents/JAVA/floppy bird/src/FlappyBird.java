import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird implements ActionListener, // an interface with one method
MouseListener,
KeyListener// implements mouse clicking feature.
{

	public static FlappyBird flappyBird;
	public final int WIDTH = 1500, HEIGHT = 700;
	public Render renderer;
	public Rectangle bird;
	public int ticks,score;
	public double ymotion;
	public boolean gameOver, started ;
	public ArrayList<Rectangle> columns; // This <> shows type of array
	public Random rand;
	public FlappyBird() 
	
	{

	
		JFrame jframe = new JFrame();
		
		renderer = new Render();
		rand = new Random();
		Timer timer = new Timer(20,this);
		
		
		jframe.add(renderer);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.addMouseListener(this);
		jframe.addKeyListener(this);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setResizable(true);
		jframe.setVisible(true);
		jframe.setTitle("Flappy Bird");
		bird = new Rectangle(WIDTH / 2 -10, HEIGHT / 2 - 10, 20, 20);  // size of bird
		columns = new ArrayList<Rectangle>();
		addColumn(true);
		addColumn(true);
		addColumn(true);
		addColumn(true);
		
		timer.start();
	}
	
	public void addColumn(boolean start) {
		int space = 300;
		int width = 100;
		int height = 50 + rand.nextInt( 300);
		
		if (start) {
			
		
		columns.add(new Rectangle(WIDTH + width + columns.size() * 300 , HEIGHT - height -150, width , height)); // bottom columns
		columns.add(new Rectangle(WIDTH + width + (columns.size() - 1) * 300 ,0,width, HEIGHT - height - space)); //  top columns
		} else {
			columns.add(new Rectangle(WIDTH + width + columns.get(columns.size() -1).x  + 600, HEIGHT - height -120, width , height)); 
			columns.add(new Rectangle(WIDTH + width + columns.get(columns.size() -1).x,0,width, HEIGHT - height - space)); 
		}
		
		
	}
	
	public void paintColumn(Graphics g,Rectangle column) {
		g.setColor(Color.green.darker());
		g.fillRect(column.x, column.y, column.width, column.height);
	}
	
	public void jump() //causes the bird jump
	{
		if (gameOver) {
			
			bird = new Rectangle(WIDTH / 2 -10, HEIGHT / 2 - 10, 20, 20);  // size of bird
			columns.clear();
			ymotion  = 0;
			score = 0;
			addColumn(true);
			addColumn(true);
			addColumn(true);
			addColumn(true);
			
			gameOver = false;
		}
		if (!started) {
			started  = true;
		}else if (!gameOver) 
		{
			if(ymotion > 0)   // causes the bird to jump
			
			{
				ymotion = 0;
			}
			ymotion -=50;
		}
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		
		int speed = 7;
		ticks++;
		
		
		if(started)
		{
		for (int i = 0; i < columns.size(); i++)
		{
			Rectangle column = columns.get(i);   // moves the columns
			column.x -= speed;
		}
		
		
		
		if (ticks % 2 == 0 && ymotion < 15) 
		{
			ymotion =+ 5 ; // speed of bird falling
		}
		
	
		
	
	// also makes the columns produced infinite amount of times
	for (int i = 0; i < columns.size(); i++)
	{
		Rectangle column = columns.get(i);   // removes the columns when they reach the side
	
		if (column.x + column.width < 0) 
		{
		columns.remove(column);
		}
	}
	
	
	
	
	for (int i = 0; i < columns.size(); i++)
	{
		Rectangle column = columns.get(i);   // removes the columns when they reach the end side
	
		if(column.x + column.width < 0)
		{
			columns.remove(column);
			
			if (column.y == 0) {
				addColumn(true);
			}
		}				
	}
	bird.y += ymotion;
	for (Rectangle column : columns)
	{
		if(column.y == 0 && bird.x + bird.width / 2 > column.x + column.width /2 - 10 && bird.x + bird.width / 2 < column.x + column.width / 2 + 1) 
		{
			score++;
		}
		if(column.intersects(bird))
		{
			gameOver = true;
			bird.x = column.x - bird.width;
		}
	}
	
	if (bird.y > HEIGHT -100 || bird.y < 0 ) {
	
	
		gameOver = true;
	}
	
	if (bird.y + ymotion >= HEIGHT - 150) 
	{
		bird.y = HEIGHT -150 - bird.height;
	}
	}
	
	renderer.repaint();
	
}


	
	
	


	
	public void repaint(Graphics g) {
	g.setColor(Color.cyan);   // set background color
	g.fillRect(0, 0, WIDTH, HEIGHT);

	g.setColor(Color.orange);  // setting the ground
	g.fillRect(0, HEIGHT -150, WIDTH, 150); 
	
	g.setColor(Color.green);  // setting the ground
	g.fillRect(0, HEIGHT -150, WIDTH, 20); 
	
	g.setColor(Color.red);   // set flappy bird avatar
	g.fillRect(bird.x,bird.y,bird.width,bird.height);
	
	for(Rectangle column : columns) 
	{
	
	 paintColumn(g, column);
	}
	g.setColor(Color.white);
	g.setFont(new Font( "Arial" , 1,100));
	 if (!started) {
		 g.drawString("Click to start. ", 100,HEIGHT / 2);
	 }
	 if (gameOver) {
		 g.drawString("Game Over! ", 100,HEIGHT / 2);
	 }
	  if (!gameOver && started) {
		  g.drawString(String.valueOf(score), WIDTH / 2 -20, 200);
	  }
	}
	
	public static void main(String [] args) {
	flappyBird = new FlappyBird();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		jump();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			jump() ;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			jump() ;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}



}

