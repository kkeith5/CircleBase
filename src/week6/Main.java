package week6;
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Cone cone1 = new Cone(5, 10 );
		//System.out.printf("The Cone volume = %.2f\n",cone1.volume());
		
		//Cylinder cy = new Cylinder(5,7);
	//	System.out.printf("The Cylinder volume = %.2f\n",cy.getVolume());
		
		
		
		//int result = Double.compare(cone1.volume(), (cy.getVolume()));
		
		/*if(cone1.volume()>cy.getVolume()){
			System.out.println("Cone is bigger ");
		}else if(cone1.volume()<cy.getVolume()) {
			System.out.println("Cylinder is bigger: ");
		}
		 else System.out.println("They are equal");
		 */
        
	
	
	
	
	
	//Array of types circleBase
	
	int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select number of shapes "));
	circleBase[]cB = new circleBase[num];
	

	for(int i = 0;i<num;i++) {
		int shape = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 for cone and 2 for cylinder: "));
		int radius = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter radius: "));
		int height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter height: "));
		
		
	
		if(shape == 1) {
			cB[i]= new Cone(radius,height);
			
		}
		else if(shape == 2) {
			cB[i] = new Cylinder(radius, height);
		}
		else {
			System.out.println("You entered an incorrect value: ");
		}
	}
	
	Double[]vol = new Double[num];
	
	for(int i=0;i<num;i++) {
		vol[i]= cB[i].volume();
		System.out.println("A shape of "+i+" has a volume of "+i+"_"+vol[i]+"");
	
	}
	
	java.util.Arrays.sort(vol);
	System.out.println("Smallest shape is: "+ vol[0]);
	System.out.println("Largest shape is: "+vol[vol.length-1]);
	
	
	
	}
}