package example;

import java.util.Objects;
import java.util.Scanner;

public class Display {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which user you want. Human or Computer");
        String user = scanner.nextLine();
        System.out.println("Enter dimension of your data. 2D or 3D");
        String dimension=scanner.nextLine();

        if(user.equalsIgnoreCase("computer") && Objects.equals(dimension, "2D")){
            MeanSquaredValues msValues=new MeanSquaredValues(dimension);
            msValues.calculateValues();
            Computer comp = new Computer();
            comp.twoDGraph();
            comp.createPdfReport();
            comp.emailSubmission();
        }
        else if(user.equalsIgnoreCase("computer") && Objects.equals(dimension, "3D")){
            MeanSquaredValues msValues=new MeanSquaredValues(dimension);
            msValues.calculateValues();
            Computer comp = new Computer();
            comp.twoDGraph();
            comp.createPdfReport();
            comp.emailSubmission();
        }
        else if(user.equalsIgnoreCase("human") && Objects.equals(dimension, "2D")){
            MeanSquaredValues msValues=new MeanSquaredValues(dimension);
            msValues.calculateValues();
            Human human = new Human();
            human.twoDGraph();
            human.createPdfReport();
            human.emailSubmission();
        }
        else if(user.equalsIgnoreCase("human") && Objects.equals(dimension, "3D")){
            MeanSquaredValues msValues=new MeanSquaredValues(dimension);
            msValues.calculateValues();
            Human human = new Human();
            human.twoDGraph();
            human.createPdfReport();
            human.emailSubmission();
        }
        else throw new AssertionError("User and dimensions are incorrect");
	}
}
