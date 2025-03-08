/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dividindoxpory1116beecrowd;
import java.util.Scanner;
/**
 *
 * @author alxdr
 */
public class DividindoXporY1116Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();
        int c = 0;
        while (c < N) {
            float X = teclado.nextFloat();
            float Y = teclado.nextFloat();
            float result = 0;
            
            if(Y == 0){
                System.out.println("divisao impossivel");
            } else {
                result = X/Y;
                System.out.println(String.format("%.1f", result));
            }        
        c++;
        }
    }
    
}
