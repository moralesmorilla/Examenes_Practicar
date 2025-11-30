import java.util.Scanner;

public class PruebaClinica {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var m1 = new Mascota("Dogi","buldog",2,1.2);
        var m2 = new Mascota("Dogo","buldogi",1,3.1);
        var m3 = new Mascota("Doga","buldoga",4,2.0);
        var c = new ClinicaVeterinaria("Perreria",m1,m2,m3);
        int opcion;
        do{
            System.out.println("1");

            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            opcion= sc.nextInt();
            switch (opcion){
                case 1:

                case 2:
                case 3:
                case 4:
                    System.out.println("Saliendo");
                    break;
            }

        }while(opcion!=4);


    }
    private static  void imprimirpesoPromedio(ClinicaVeterinaria c){

    }
}
