package mainapp;

import utils.MathUtils;              // import class
import static utils.MathUtils.*;     // import static members

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using imported class
        MathUtils mu = new MathUtils();

        // Using static import (no class name needed)
        System.out.println("PI: " + PI);                    // from MathUtils
        System.out.println("Square of 5: " + square(5));    // from MathUtils

	}

}
