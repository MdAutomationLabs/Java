import javax.swing.JFrame;

public class FaceViewer {

	public static void main(String[] args) {
		// Md Ahmed
		JFrame frame = new JFrame("Face");
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FaceComponent object = new FaceComponent();
		frame.add(object);
		object.drawing();
	}

}
