package PktPrincipal;

import java.awt.Color;
import java.io.IOException;
import java.util.Scanner;
import PktCaracteristicaNumeros.clsCaracteristicaNumeros;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ClsMenuPrincipal 
{
	public static void main(String[] args) throws IOException
	{
		UIManager UI;
		 //Declaracion de variables
		int base=0,exponente=0,opcion=0;
		int primo=0;
		int cifra=0;
		int perfecto=0;
		int invertir;
		long cifras;
		int ulam;
		int abundante;
		int armstrong;
		int impar;
		int factorial;
		int NAmigo1,NAmigo2;
		int capicua;
		//Creacion de llamados
		ClsMenuPrincipal ObjLlamar =new ClsMenuPrincipal();
		clsCaracteristicaNumeros calculos= new clsCaracteristicaNumeros();
		Scanner ObjLeer=new Scanner(System.in);
		//Construccion del menu
		do 
		{
			UI = null;
			UI.put("OptionPane.background", new Color(44, 164, 134));
			UI.put("Panel.background", new Color(105, 225, 131));
			opcion = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "----------------------Menu Pricipal----------------------\n"
					+ "|1.Calcular Potencia\n"
					+ "|2.Comprobar si es un numero Primo\n"
					+ "|3.Comprobar si es un numero Perfecto\n"
					+ "|4.Invertir el numero ingresado\n"
					+ "|5.Cantidad de Cifras\n"
					+ "|6.Imprimir Conjetura Ulam de un numero\n"
					+ "|7.Comprobar si es un numero Abundante\n"
					+ "|8.Comprobar si es un numero Armstrong\n"
					+ "|9.Comprobar si es un numero Impar\n"
					+ "|10.Calcular Factorial\n"
					+ "|11.Comprobar si dos numeros son Amigos\n"
					+ "|12.Comprobar si el numero es Capicua\n"
					+ "|13.Salir\n\n"
					+ "Selecciona una opcion"));
			switch(opcion) 
			{
			case 1:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero (base)"));
				exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero (exponente)"));
				JOptionPane.showMessageDialog(null, "El resultado es:"+calculos.mtdEnteroPotencia(base, exponente));
				continue;
			case 2:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				primo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero de el cual quieras saber si es primo o no"));
				JOptionPane.showMessageDialog(null, "La respuesta es:"+calculos.mtdCalc_Primo(primo));
				continue;
			case 3:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				perfecto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero el cual quieras saber si es perfecto o no"));
				JOptionPane.showMessageDialog(null, "La respuesta es:"+calculos.MtdCalc_Perfecto(perfecto));
				continue;
			case 4:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				invertir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero el cual quieras conocer su resultado invertido"));
				JOptionPane.showMessageDialog(null, "La respuesta es:"+calculos.MtdCalc_Invertir(invertir));
				continue;
			case 5:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				cifras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero el cual quieras conocer su cantidad de cifras"));
				JOptionPane.showMessageDialog(null, "La respuesta es:"+calculos.MtdCalc_Cifras(cifras));
				continue;
			case 6:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				ulam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero el cual quieras conocer su conjetura Ulam"));
			
				calculos.MtdCalc_Ulam (ulam);
				continue;
			case 7:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				abundante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero el cual quieras saber si es abundante o no"));
				JOptionPane.showMessageDialog(null, "La respuesta es:"+calculos.MtdCalc_Abundante(abundante));
				continue;
			case 8:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				armstrong = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero el cual quieras saber si es armstrong o no"));
				JOptionPane.showMessageDialog(null, "La respuesta es:"+calculos.MtdCalc_Armnstrong(armstrong));
				continue;
			case 9:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				impar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero el cual quieras saber si es impar o no"));
				JOptionPane.showMessageDialog(null, "La respuesta es:"+calculos.MtdCalc_Impar(impar));
				continue;
			case 10:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				factorial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero el cual quieras conocer su factorial"));
				JOptionPane.showMessageDialog(null, "La respuesta es:"+calculos.MtdCalc_Factorial(factorial));
				continue;
			case 11:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				NAmigo1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero, para saber si son amigos"));
				NAmigo2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero, para saber si son amigos"));
				JOptionPane.showMessageDialog(null, "La respuesta es:"+calculos.MtdCalc_Amigos(NAmigo2, NAmigo1));
				continue;
			case 12:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				capicua = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero el cual quieras saber si es capicua o no"));
				JOptionPane.showMessageDialog(null, "La respuesta es:"+calculos.MtdCalc_Capicua(capicua));
				continue;
			case 13:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				JOptionPane.showMessageDialog(null, "Hasta la proxima!");
				break;
			default:
				UI = null;
				UI.put("OptionPane.background", new Color(44, 164, 134));
				UI.put("Panel.background", new Color(105, 225, 131));
				JOptionPane.showMessageDialog(null, "Opcion Incorrecta,Intente seleccionar otro numero");
				continue;
			}
		}while(opcion!=13);
	}
}
