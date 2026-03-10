package app;

import javax.swing.JFrame;

import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class HelloWorld extends JFrame{
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
    	System.out.println("OS: " + os);
        
    	if("Linux".equals(os)) {
    		System.load("/usr/lib/jni/libopencv_java460.so");
    	}
        
        Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("mat = " + mat.dump());
    }
}
