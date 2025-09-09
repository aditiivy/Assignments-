package main;

import com.utils.MathUtils;
//Static import
import static com.utils.MathUtils.PI;
import static com.utils.MathUtils.square;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using PI directly: " + PI);               // static import
        System.out.println("Square of 4: " + square(4));              // static import
        System.out.println("Using full class: " + MathUtils.square(5)); // regular import

	}

}
