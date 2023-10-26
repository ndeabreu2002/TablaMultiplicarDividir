//Nelson De Abreu
//Escribir un programa en Java que genere la tabla de multiplicar y de dividir de un número que el usuario ingrese previamente

import java.util.Scanner;

public class TablaMultiplicarDividir{

    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese un Numero: ");
        int num= scanner.nextInt();

        System.out.println("Tabla de Multiplicar de "+num+":");
        for (double i=1; i<=10; i++){
            double resuladomultiplicacion=num*i;
            System.out.println(num+"x"+i+"="+resuladomultiplicacion);
        }

        System.out.println("");

        System.out.println("Tabla de Dividir de "+num+":");
        for (double i=1; i<=10; i++){
            double resultadodivicion=num/i;
            System.out.println(num+"/"+i+"="+resultadodivicion);
        }
    }
    


}
