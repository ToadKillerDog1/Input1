/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;
import java.util.Scanner;
/**
 *
 * @author urban
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a;
	double b;

	Scanner odczyt = new Scanner(System.in);

	System.out.println("Podaj pierwszą liczbę: ");
          	a = odczyt.nextDouble();
                if(a<2.0){
                    System.out.println("Za mała liczba. Podaj większą");
                    a = odczyt.nextDouble();
                }
	System.out.println("Podaj drugą liczbę: ");
	  	b = odczyt.nextDouble();

	System.out.println(a+"+"+b+"= "+(a+b));
	System.out.println(a+"-"+b+"="+(a-b));
	System.out.println(a+"*"+b+"="+(a*b));
	System.out.println(a+"/"+b+"="+(a/b));
    }
    
}
