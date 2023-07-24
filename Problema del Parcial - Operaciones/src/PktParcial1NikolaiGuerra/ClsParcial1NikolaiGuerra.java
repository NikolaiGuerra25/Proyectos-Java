package PktParcial1NikolaiGuerra;

import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class ClsParcial1NikolaiGuerra 
{
	//CONSTRUCCION DEL OBJETO DE LECTURA (objLeer)
	Scanner objLeer = new Scanner(System.in);
	
	//VARIABLES
	static int numero1=0, numero2=0, numero3=0, numeroMayor=0;
	static float promedio=0, divisionNum1Num2Num3=0;
	
	//METODO PROMEDIO
	public float mtdPromedio(int numero1, int numero2, int numero3)
	{
		DecimalFormat df = new DecimalFormat("#.00");
		promedio=(float)(numero1+numero2+numero3)/3;
		return promedio;
	}
	
	//METODO DIVIDIR
	public void mtdDividir(int numero1, int numero2, int numero3)
	{
		if (numero3!=0)
		{
			DecimalFormat df = new DecimalFormat("#.00");
			divisionNum1Num2Num3=(float)(numero1+numero2)/numero3;
			System.out.println("La division entre los 3 numeros es: "+df.format(divisionNum1Num2Num3));
		}	
		else
			System.out.println("NO SE PUEDE DIVIDIR ENTRE 0");
	}
	
	//METODO MAYOR
	public int mtdMayor(int numero1, int numero2, int numero3)
	{
		if (numero1>numero2 && numero1>numero3)
			numeroMayor=numero1;
		else
		{
			if (numero2>numero1 && numero2>numero3)
				numeroMayor=numero2;
			else 
				numeroMayor=numero3;
		}
		return numeroMayor;
	}
	
	//MAIN
	public static void main(String[] args) throws IOException 
	{
		//CONSTRUCCION DEL OBJETO DE LECTURA (objLeer)
		Scanner objLeer = new Scanner(System.in);
						
		//CONSTRUCCION DEL OBJETO DE LLAMADO (callObject)
		ClsParcial1NikolaiGuerra callObject = new ClsParcial1NikolaiGuerra();
		
		//FORMATO DECIMAL
		DecimalFormat df = new DecimalFormat("#.00");
		
		//VARIABLES
		int opcion=0;
		int mayorPrint=0;
		float promedioPrint=0;
		
		//INICIO DEL CODIGO
		while (opcion!=4)
		{
			System.out.println("\nSeleccione una de las siguientes Opciones: ");
			System.out.println("|----------------------------------------------------|");
			System.out.println("| 1. Calcular el promedio de los 3 números leidos    |");
			System.out.println("| 2. Calcular la división entre los números leidos   |");
			System.out.println("| 3. Buscar el número mayor de los 3 números leidos  |");
			System.out.println("| 4. FINALIZAR                                       |");
			System.out.println("|----------------------------------------------------|");
			System.out.println("Ingrese la Opcion a Ejecutar");
			opcion=objLeer.nextInt();
			
			//DECISIONES
			switch (opcion)
			{
			case 1:
				//INICIO DEL CODIGO
				System.out.println("Ingrese 3 números aleatorios: ");
				numero1=objLeer.nextInt();
				numero2=objLeer.nextInt();
				numero3=objLeer.nextInt();
				
				//LLAMADO DE FUNCION
				promedioPrint=callObject.mtdPromedio(numero1, numero2, numero3);
				
				//IMPRESION
				System.out.println("El promedio de los 3 numeros es: "+df.format(promedioPrint));
				continue;
				
			case 2:
				//INICIO DEL CODIGO
				System.out.println("Ingrese 3 números aleatorios: ");
				numero1=objLeer.nextInt();
				numero2=objLeer.nextInt();
				numero3=objLeer.nextInt();
				
				//LLAMADO E IMPRESION DE LA FUNCION
				callObject.mtdDividir(numero1, numero2, numero3);
				continue;
				
			case 3:
				//INICIO DEL CODIGO
				System.out.println("Ingrese 3 números aleatorios: ");
				numero1=objLeer.nextInt();
				numero2=objLeer.nextInt();
				numero3=objLeer.nextInt();
				
				//LLAMADO DE FUNCION
				mayorPrint=callObject.mtdMayor(numero1, numero2, numero3);
				
				//IMPRESION
				System.out.println("El número mayor de los 3 leidos es: "+mayorPrint);
				continue;
				
			case 4:
				System.out.println("La Ejecución del Programa se ha Cancelado");
				break;
			
			default:
				System.out.println("\nOpcion Incorrecta\n");
				continue;
			}
		}
	}
}
