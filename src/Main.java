import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float suma_mayor=0,suma_menor=0,prom_mayor=0,media_menor=0;
        int conteo_mayor=0,conteo_menor=0,conteo_igual=0;
        int n=0;
        System.out.println("Bienvenido a su lista de estudiantes \n"
        +"porfavor ingrese la cantidad de estudiantes que va a ingresar");
        n=entrada.nextInt();
        int numero[] = new int[n];
        int i=0;
        for (i=0; i<n; i++) {

            System.out.println(" porfavor ingrese la edad de su estudiante ");
            numero[i] = entrada.nextInt();
            if (numero[i]==5) {
                conteo_igual++;
            } else if (numero[i]>5) {
                suma_mayor += numero[i];
                conteo_mayor++;
            }
            else {
                suma_menor += numero[i];
                suma_menor++;
            }
        }
      if (conteo_mayor==0){
          System.out.println("no se puede sacar la media");
      }
      else {
          prom_mayor=suma_mayor/n;
          System.out.println("el promedio es: "+prom_mayor);
      }

     if (conteo_menor==0){
         System.out.println("no se puede sacar la media de los numenos menores");
     }
     else {
         media_menor=suma_menor/conteo_menor;
         System.out.println("la media es: "+media_menor);
     }
        System.out.println("la cantidad de personas con una edad de 5 años es: "+conteo_igual);
    }
}