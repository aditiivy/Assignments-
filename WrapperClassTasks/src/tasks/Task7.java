package tasks;

import java.util.ArrayList;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] temps = {"36", "38", "40"}; 
	     ArrayList<Double> fahrenheitTemps = new ArrayList<>();
	     
	     for (String t : temps) { 
	            int celsius = Integer.parseInt(t); 
	            double f = (celsius * 9.0 / 5) + 32; 
	            fahrenheitTemps.add(f); 
	        } 
	    
	     System.out.println("Fahrenheit Temps: " + fahrenheitTemps); 

	}

}
