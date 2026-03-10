package app;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class Camera extends JFrame{

	public Camera() {
		
		setSize(new Dimension(650, 560));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		String operationalSystem = System.getProperty("os.name");
		
		if("Linux".equals(operationalSystem)) {
			System.load("/usr/lib/jni/libopencv_java460.so");
		}
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Camera camera = new Camera();
			}
		});
	}
}
