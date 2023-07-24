package PktSemestral;

import java.awt.Color;
import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import ArchCalculoSemestral.ClsCalculoSemestral;
import javax.swing.ImageIcon;

public class ArchNotasSemestral 
{
	public static void main(String[] args) throws IOException
	{
		UIManager UI;
		UI = null;
		UI.put("OptionPane.background", new Color(26, 188, 156));
		UI.put("Panel.background", new Color(163, 228, 215));
		ImageIcon lista = new ImageIcon("src/img/notas.png");
		
		//ARREGLO DE OBJETO 
		ArrObjSemestral array[] = new ArrObjSemestral[5];
		
		//OBJETO DE LLAMADO
		ClsCalculoSemestral callObject = new ClsCalculoSemestral();
		
		//CREAR JTEXTAREA PARA MOSTRAR LA SALIDA
		JTextArea textArea = new JTextArea();
		
		//VARIABLES
		int notaParcial1=0, notaParcial2=0, notaParcial3=0, notaLaboratorio1=0, notaLaboratorio2=0, notaLaboratorio3=0, notaSemestral=0, folio=0, asiento=0, x, porcentajeTotal, contFracasos=0;
		int arrayPorcentaje[] = new int [5];
		String notaFinal;
		String arrayNota[] = new String [5];
		
		//BIENVENIDA
		JOptionPane.showMessageDialog(null, "Bienvenidos al programa para calcular la nota final de un estudiante", "Programa: Calcular Nota Final", 0, lista);
		
		//INICIO DEL CODIGO
		for (x=0; x<array.length; x++)
		{
			//INTRODUCCION DE DATOS 
			String tomo = JOptionPane.showInputDialog("Est. #"+(x+1)+" Ingrese el tomo de su cedula");
			if (tomo==null)
				System.exit(0);
			folio = Integer.parseInt(JOptionPane.showInputDialog("Est. #"+(x+1)+" Ingrese el folio de su cedula"));
			asiento = Integer.parseInt(JOptionPane.showInputDialog("Est. #"+(x+1)+" Ingrese el asiento de su cedula"));
			String primerApellido = JOptionPane.showInputDialog("Est. #"+(x+1)+" Ingrese su primer apellido");
			String segundoApellido = JOptionPane.showInputDialog("Est .#"+(x+1)+" Ingrese su segundo apellido");
			String primerNombre = JOptionPane.showInputDialog("Est. #"+(x+1)+" Ingrese su primer nombre");
			String segundoNombre = JOptionPane.showInputDialog("Est. #"+(x+1)+" Ingrese su segundo nombre");
			notaParcial1 = Integer.parseInt(JOptionPane.showInputDialog("Est. #"+(x+1)+" Ingrese la nota de su primer (#1) parcial"));
			notaParcial2 = Integer.parseInt(JOptionPane.showInputDialog("Est. #"+(x+1)+" Ingrese la nota de su segundo (#2) parcial"));
			notaParcial3 = Integer.parseInt(JOptionPane.showInputDialog("Est. #"+(x+1)+" Ingrese la nota de su tercer (#3) parcial"));
			notaLaboratorio1 = Integer.parseInt(JOptionPane.showInputDialog("Est. #"+(x+1)+" Ingrese la nota de su primer (#1) laboratorio"));
			notaLaboratorio2 = Integer.parseInt(JOptionPane.showInputDialog("Est. #"+(x+1)+" Ingrese la nota de su segundo (#2) laboratorio"));
			notaLaboratorio3 = Integer.parseInt(JOptionPane.showInputDialog("Est. #"+(x+1)+" Ingrese la nota de su tercer (#3) laboratorio"));
			notaSemestral = Integer.parseInt(JOptionPane.showInputDialog("Est. #"+(x+1)+" Ingrese la nota de su semestral"));
			
			//GUARDAR DATOS EN EL ARRAY
			array[x] = new ArrObjSemestral(tomo, folio, asiento, primerApellido, segundoApellido, primerNombre, segundoNombre, notaParcial1, notaParcial2, notaParcial3, notaLaboratorio1, notaLaboratorio2, notaLaboratorio3, notaSemestral);
			
			//PROMEDIO
			porcentajeTotal=(int)callObject.MtdPromedio(array[x].getNotaParcial1(), array[x].getNotaParcial2(), array[x].getNotaParcial3(), array[x].getNotaLaboratorio1(), array[x].getNotaLaboratorio2(), array[x].getNotaLaboratorio3(), array[x].getNotaSemestral());
			arrayPorcentaje[x]=porcentajeTotal;
			
			//NOTA FINAL
			notaFinal=callObject.MtdNota(porcentajeTotal);
			arrayNota[x]=notaFinal;
			
			//IMPRIMIR INDIVIDUAL
			JOptionPane.showMessageDialog(null, 
					"--------Informacion del Estudiante---------"
					+"\nEstudiante #"+(x+1)
					+"\nCedula: "+array[x].getTomo()+" - "+array[x].getFolio()+" - "+array[x].getAsiento()
					+"\nNombre: "+array[x].getPrimerApellido()+" "+array[x].getSegundoApellido()+", "+array[x].getPrimerNombre()+" "+array[x].getSegundoNombre()
					+"\n-----------------Parciales-------------------"
					+"\nParcial #1: "+array[x].getNotaParcial1()
					+"\nParcial #2: "+array[x].getNotaParcial2()
					+"\nParcial #3: "+array[x].getNotaParcial3()
					+"\n---------------Laboratorios------------------"
					+"\nLaboratorio #1: "+array[x].getNotaLaboratorio1()
					+"\nLaboratorio #2: "+array[x].getNotaLaboratorio2()
					+"\nLaboratorio #3: "+array[x].getNotaLaboratorio3()
					+"\n-----------------Semestral-------------------"
					+"\nSemestral: "+array[x].getNotaSemestral()
					+"\n-------------Evaluacion Final----------------"
					+"\nPromedio: "+porcentajeTotal
					+"\nNota Final: "+notaFinal
					+"\n---------------------------------------------",
					"Registro Individual de Estudiante", 0, lista);
		}
		
		//ESTABLECER LA PRIMERA LINEA DE TEXTO EN AREATEXTOSALIDA
		textArea.append("#\tNombre\t\tCedula\tParciales\t\t\tLaboratorios\t\t\tSemestral\tPromedio\tNota Final\n");
		textArea.append("\t\t\t\tPacial 1\tParcial 2\tParcial 3\tLab 1\tLab 2\tLab 3\n");
		for (x=0; x<array.length; x++)
		{
			//ANEXAR UNA LINEA DE TEXTO A AREATEXTOSALIDA
			textArea.append((x+1)+"\t"+array[x].getPrimerApellido()+" "+array[x].getSegundoApellido()+" "+array[x].getPrimerNombre()+" "
		            +array[x].getSegundoNombre()+"\t"+ array[x].getTomo()+"-"+array[x].getFolio()+"-"+ array[x].getAsiento()+"\t"
		            +array[x].getNotaParcial1()+"\t"+array[x].getNotaParcial2()+"\t"+array[x].getNotaParcial3()+"\t"
		            +array[x].getNotaLaboratorio1()+"\t"+array[x].getNotaLaboratorio2()+"\t"+array[x].getNotaLaboratorio3()+"\t"+array[x].getNotaSemestral()+
		           "\t"+arrayPorcentaje[x]+"\t"+arrayNota[x]+"\n");
		}
		//MOSTRAR RESULTADOS
		textArea.append("\nPorcentaje de Fracasos: "+callObject.MtdProcFracasos()+" %");
		JOptionPane.showMessageDialog(null, textArea, "Registro General de los Estudiantes", 0, lista);
	}
}
