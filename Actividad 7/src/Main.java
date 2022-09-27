import java.util.Scanner;

public class Main {

    static int n;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("¿Cuántos números desea calcular? ");
        n = scan.nextInt();

        System.out.println("Números primos: ");
        calcularNumerosPrimos();
        System.out.println("");

        System.out.println("Sucesión de Fibonacci: ");
        calcularSucesion();

    }
    public static void calcularNumerosPrimos(){

        int i = 0;
        int repetidor = 0;
        int x = 1;
        int j = 0;

        while (repetidor<n){
            i = i+1;
             x = 1;

             j = 0;
            while (x<=i){
                if (i%x==0){
                    j=j+1;
                }
                x=x+1;
            }
            if (j==2){
                System.out.print(i+", ");
                repetidor=repetidor+1;
            }
        }
    }
    public static void calcularSucesion(){

        int a=0;
        int b = 1;
        int c;
    for (int i=0; i<n; i++){
        System.out.print(a+", ");
        c = a+b;
        a = b;
        b=c;


    }
    }

}
