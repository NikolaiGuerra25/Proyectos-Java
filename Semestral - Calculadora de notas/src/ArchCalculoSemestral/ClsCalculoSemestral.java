package ArchCalculoSemestral;

public class ClsCalculoSemestral 
{
	//VARIABLES GLOBALES
	static int contadorF=0, contadorA=0, totalEst=0;
	static float porcentajeParciales=0, porcentajeLaboratorios=0, porcentajeSemestral=0, porcentajeFracasos=0, sumaPorcentajes=0;
	
	public float MtdPromedio(int notaParcial1, int notaParcial2, int notaParcial3, int notaLaboratorio1, int notaLaboratorio2, int notaLaboratorio3, int notaSemestral)
	{	
		porcentajeParciales=(float)(notaParcial1+notaParcial2+notaParcial3)*30/300;
		porcentajeLaboratorios=(float)(notaLaboratorio1+notaLaboratorio2+notaLaboratorio3)*35/300;
		porcentajeSemestral=(float)(notaSemestral*0.35);
		sumaPorcentajes=(porcentajeParciales+porcentajeLaboratorios+porcentajeSemestral);
		return sumaPorcentajes;
	}
	
	public String MtdNota(int porcentajeTotal)
	{
		if (porcentajeTotal==0)
		{
			return "Sin Evaluacion";
		}
		
		if (porcentajeTotal>=1 && porcentajeTotal<=60)
		{
			contadorF=contadorF+1;
			return "F";
		}
		
		if (porcentajeTotal>=61 && porcentajeTotal<=70)
		{
			contadorF=contadorF+1;
			return "D";
		}
		
		if (porcentajeTotal>=71 && porcentajeTotal<=80)
		{
			contadorA=contadorA+1;
			return "C";
		}
		
		if (porcentajeTotal>=81 && porcentajeTotal<=90)
		{
			contadorA=contadorA+1;
			return "B";
		}
		
		if (porcentajeTotal>=91 && porcentajeTotal<=100)
		{
			contadorA=contadorA+1;
			return "A";
		}
		
		return null;
	}
	
	public float MtdProcFracasos()
	{
		totalEst=contadorA+contadorF;
		porcentajeFracasos=(contadorF*100)/totalEst;
		return porcentajeFracasos;
	}
}