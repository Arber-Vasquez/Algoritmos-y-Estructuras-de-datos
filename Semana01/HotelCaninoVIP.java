package Semana01;
import java.util.Scanner;
public class HotelCaninoVIP {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int habs[][] = {
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
        };
        int entrada;
        do{
            System.out.println("Bienvenido al Hotela canino, indique que desea realizar: ");
            System.out.println("1. Registrarse \n");
            System.out.println("2. Mostrar disponibilidad\n");
            System.out.println("3. Salir\n");
            System.out.println("4.Encontrar primera habitacion libre\n ");
            System.out.print("Ingrese su opcion: ");
            entrada = sc.nextInt();
            switch(entrada){
                case 1:
                    System.out.println("En que piso (1-3): ");
                    int piso = sc.nextInt();
                    System.out.println("En que habitacion (1-4): ");
                    int habitacion = sc.nextInt();
                    piso--;
                    habitacion--;
                    if(piso>=0 && piso<3 && habitacion>=0 && habitacion<4){
                        if(habs[piso][habitacion]==1){
                            System.out.println("Habitacion no disponible");
                        }else{
                            habs[piso][habitacion]=1;
                            System.out.println("Registro exitoso");
                        }
                    }else{
                        System.out.println("No existe la habitacion requerida");
                    }
                    break;
                case 2:
                    for(int i=0; i<3; i++){
                        //System.out.println((i+1) + " ");
                        for(int j=0; j<4; j++){
                            System.out.print(habs[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Hasta pronto..");
                    break;
                    
                case 4:
                    boolean encontrada = false;
                    for(int i=0; i<3; i++){
                        for(int j=0; j<4; j++){
                            if(habs[i][j] == 0){
                                System.out.println("Habitacion libre encontrada en el piso: " + (i+1) + " habitacion " + (j+1));
                                encontrada = true;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    
            }
        }while(entrada != 3);
        sc.close();
    }
}