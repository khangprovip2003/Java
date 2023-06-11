
package java2;
import java.util.Scanner;
public class Java2 {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      double value = Double.parseDouble(sc.nextLine());
        
  double fractional_part = value % 1;
  double integral_part = value - fractional_part;  
  System.out.print("\nOriginal value: "+value);
  System.out.print("\nIntegral part: "+integral_part);
  System.out.print("\nFractional part: "+fractional_part);
  System.out.println();  
  }
    
    
}
