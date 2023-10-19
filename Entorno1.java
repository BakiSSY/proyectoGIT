import java.util.Scanner;

public class Entorno1{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);

        float nota;
        String calificación;

        System.out.print("Introduce tu nota: ")
        while!(scan.hasNextFloat() || (nota=scan.nextFloat())>10 || nota<0){
            scan.nextLine();
            System.out.print("Introduce tu nota: ");
        }
        scan.nextLine();

        if(nota>4.99){
            if(nota<6){
                calificaión="aprobado";
            }else if(nota<7){
                calificación="bien";
            }else if(nota<9){
                calificación="notable";
            }else{
                calificación="sobresaliente";
            }
        }else{
            calificación="aprobado";
        }

        System.out.println("La calificacion es " + calificacion);
    }
}