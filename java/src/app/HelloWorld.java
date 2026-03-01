package app;

import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class HelloWorld {
    public static void main(String[] args) {
        System.load("/usr/lib/jni/libopencv_java460.so");
        
        Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("mat = " + mat.dump());
    }
}
