package solidPrinciples;

import java.util.Objects;
import java.util.Scanner;

public class Display {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which user you want. Human or Computer");
        String user = scanner.nextLine();
        System.out.println("Enter dimension of your data. 2D or 3D");
        String dimension=scanner.nextLine();
        ProcessData.process(user, dimension);


    }
}
