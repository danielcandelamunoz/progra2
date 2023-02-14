package Ejercicios;
import java.util.*;
public class Ejercicio_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escoja un numero: ");
        int num;
        num = sc.nextInt();
        System.out.println(Suma(num)); 
        }
    public static int Suma(int n){
        if (n == 1 ){
            return 1;
        }else{
            return Suma(n-1);
        }
    }
}