package PktProyecto2;

import java.util.Random;
import java.io.IOException;
import java.text.DecimalFormat;
import PktCaracteristicaNumeros.clsCaracteristicaNumeros;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;

public class ClsPrincipalProyecto2 
{
	public static void main(String[] args) throws IOException
	{
		UIManager UI;
		UI = null;
		UI.put("OptionPane.background", new Color(26, 188, 156));
		UI.put("Panel.background", new Color(163, 228, 215));
		ImageIcon lista = new ImageIcon("src/img/icono.png");
		
		//NUMERO RANDOM
		Random random = new Random();
		
		//OBJETO DE LLAMADO
		clsCaracteristicaNumeros callObject = new clsCaracteristicaNumeros();
		
		//FORMATO DECIMAL
		DecimalFormat df = new DecimalFormat("#.00");
		
		//VARIABLES
		int hTrabajadas=0, mesCumpleaños=0, x=1, diaCumpleaños=0, salarioTotalInv=0, salarioReal=0, salInvertido=0, sumaDigito=0, continuar;
		float bono=50, salarioNormal=0, salarioTotal=0, pagoHora=0, bonoAcumulado=0, salTotalAcumulado=0, salRealAcumulado=0;
		
		//INICIO DEL CODIGO 
		
		//BIENVENIDA
		JOptionPane.showMessageDialog(null, "Bienvenidos al programa para calcular el salario de los trabajadores", "Programa: Calcular el salario", 0, lista);
		
		do
		{	
			//INTRODUCCION DE DATOS 
			String nombre = JOptionPane.showInputDialog("#"+x+" Ingrese su nombre");
			if (nombre==null)
				System.exit(0);
			diaCumpleaños = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dia de cumpleaños (1-31)"));
			do
			{
                if (diaCumpleaños<0 || diaCumpleaños>31) 
                {
                    JOptionPane.showMessageDialog(null,"Dia incorrecto\nVuelva a introducir el dia de nacimiento","Error",JOptionPane.ERROR_MESSAGE);
                    diaCumpleaños = Integer.parseInt(JOptionPane.showInputDialog("Ingresa su dia de nacimiento (1-31)"));
                }
            }while(diaCumpleaños<0 || diaCumpleaños>31);
			mesCumpleaños = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su mes de cumpleaños (1-12)"));
			do 
	        {
				if (mesCumpleaños<0 || mesCumpleaños>12) 
				{
					JOptionPane.showMessageDialog(null,"Mes incorrecto\nVuelva a introducir el Mes de nacimiento","Error",JOptionPane.ERROR_MESSAGE);
					mesCumpleaños = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes de nacimiento (1-12)"));
	            }
	        }while (mesCumpleaños<0 || mesCumpleaños> 12);
			pagoHora = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el pago por hora"));
			hTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
			
			//NUMERO RANDOM
			int numRand1 = random.nextInt(8500 + 250) + 250;
			int numRand2 = random.nextInt(8500 + 250) + 250;
			
			//BONIFICACION
			sumaDigito=callObject.fnSumaDigito(diaCumpleaños);
			if (callObject.MtdCalc_Perfecto(sumaDigito)=='S')
				bono=(float)(bono+50.00);
			if (callObject.mtdCalc_Primo(mesCumpleaños)=='S')
				bono=(float)(bono+30.00);
			if (callObject.MtdCalc_Amigos(numRand1, numRand2)=='S')
				bono=(float)(bono+100.00);
			if (callObject.MtdCalc_Armnstrong(numRand2)==true || callObject.MtdCalc_Armnstrong(numRand1)==true)
				bono=(float)(bono+150.00);
			
			//SALARIO TOTAL
			salarioNormal=hTrabajadas*pagoHora;
			salarioTotal=salarioNormal+bono;
			salarioTotalInv=(int)salarioTotal;
			salInvertido=(int)callObject.MtdCalc_Invertir(salarioTotalInv);
			if (salInvertido>salarioTotal)
				salarioReal=salInvertido;
			else
				salarioReal=(int)salarioTotal;
			
			//CONTADOR Y ACUMULACION
			bonoAcumulado+=bono;
			salTotalAcumulado+=salarioTotal;
			salRealAcumulado+=salarioReal;
			x++;
			
			//IMPRESION
			JOptionPane.showMessageDialog(null, 
					"-------Salario Mensual--------"
					+"\n----------------------------------"
					+"\nNombre del trabajador: "+nombre
					+"\n----------------------------------"
					+"\nMontos "
					+"\n----------------------------------"
					+"\nSalario normal: $"+df.format(salarioNormal)
					+"\nBonificaciones: $"+df.format(bono)
					+"\nSalario Total: $"+df.format(salarioTotal)
					+"\nSalarios Real: $"+df.format(salarioReal)
					+"\n----------------------------------",
					"Registro por Persona",0, lista);
			
			//SEGUIR O SALIR DEL PROGRAMA
			continuar = JOptionPane.showConfirmDialog(null, "¿Desea calcular el salario de otro trabajador?", "Seleccione una opcion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
			//RESET BONO
			bono=50;
			
		}while (continuar==JOptionPane.YES_OPTION);
		
		//IMPRESION DE TOTALES GENERALES
		JOptionPane.showMessageDialog(null, 
				"-------Totales Generales--------"
				+"\n----------------------------------"
				+"\nBonificaciones Totales: $"+df.format(bonoAcumulado)
				+"\nSalario Total Acumulado: $"+df.format(salTotalAcumulado)
				+"\nSalarios Real Acumulado: $"+df.format(salRealAcumulado)
				+"\n----------------------------------",
				"Registro Total",0, lista);
	}
}
