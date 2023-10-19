import java.util.Scanner;

public class Entorno11{
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int numero1, numero2,resultado;
		float resultadoF;
		char operacion,respuesta;
		do{
			do{
				System.out.print("operación: ");
				numero1=scan.nextInt();
				operacion=scan.next().charAt(0);
				numero2=scan.nextInt();
				
			}while(operacion!='+' && operacion!='-' && operacion!='*' && operacion!='/');
			switch(operacion){
				case '+':
					resultado=Sumar(numero1,numero2);
					System.out.println("Resultado: " + resultado);
					break;
				case '-':
					resultado=Restar(numero1,numero2);
					System.out.println("Resultado: " + resultado);
					break;
				case '*':
					resultado=Multiplicar(numero1,numero2);
					System.out.println("Resultado: " + resultado);
					break;
				case '/':
					if(numero2!=0){
						resultadoF=Dividir(numero1,numero2);
						System.out.println("Resultado: " + resultadoF);
					}else{
						System.out.println("Error, no puedes dividr entre 0");
					}
					break;
				default:
					System.out.println("Que te follen!!"); 
			}
			System.out.print("Deseas realizar otra operación? introduce S para si: ");
			respuesta=scan.next().charAt(0);
			System.out.println();
			if(respuesta!='S' && respuesta!='s'){
				System.out.println("Que te follen!! Panzon Cruasant"); 
			}
		}while(respuesta=='S' || respuesta=='s' || numero2==0);
	}
	
	static int Sumar(int x, int y){
		int resultado;
		resultado=x+y;
		return resultado;
	}
	static int Restar(int x, int y){
		int resultado;
		resultado=x-y;
		return resultado;
	}
	static int Multiplicar(int x, int y){
		int resultado;
		resultado=x*y;
		return resultado;
	}
	static float Dividir(int x, int y){
		float resultado, yF;
		yF=y;
		resultado=x/yF;
		return resultado;
	}
}