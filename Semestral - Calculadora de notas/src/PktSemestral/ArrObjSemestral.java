package PktSemestral;

public class ArrObjSemestral extends ClsPersona
{
	private int notaParcial1;
	private int notaParcial2;
	private int notaParcial3;
	private int notaLaboratorio1;
	private int notaLaboratorio2;
	private int notaLaboratorio3;
	private int notaSemestral;
	
	public ArrObjSemestral(String tomo, int folio, int asiento, String primerApellido, String segundoApellido, String primerNombre, String segundoNombre)
	{
		super(tomo, folio ,asiento ,primerApellido, segundoApellido, primerNombre, segundoNombre);
		notaParcial1 = 0;
		notaParcial2 = 0;
		notaParcial3 = 0;
		notaLaboratorio1 = 0;
		notaLaboratorio2 = 0;
		notaLaboratorio3 = 0;
		notaSemestral = 0;
	}
	
	public ArrObjSemestral(String tomo, int folio, int asiento, String primerApellido, String segundoApellido, String primerNombre, String segundoNombre, int nPar1, int nPar2, int nPar3, int nLab1, int nLab2, int nLab3, int nSemes)
	{
		super(tomo, folio ,asiento ,primerApellido, segundoApellido, primerNombre, segundoNombre);
		notaParcial1 = nPar1;
		notaParcial2 = nPar2;
		notaParcial3 = nPar3;
		notaLaboratorio1 = nLab1;
		notaLaboratorio2 = nLab2;
		notaLaboratorio3 = nLab3;
		notaSemestral = nSemes;
	}

	public int getNotaParcial1() 
	{
		return notaParcial1;
	}

	public void setNotaParcial1(int notaParcial1) 
	{
		this.notaParcial1 = notaParcial1;
	}

	public int getNotaParcial2() 
	{
		return notaParcial2;
	}

	public void setNotaParcial2(int notaParcial2) 
	{
		this.notaParcial2 = notaParcial2;
	}

	public int getNotaParcial3() 
	{
		return notaParcial3;
	}

	public void setNotaParcial3(int notaParcial3) 
	{
		this.notaParcial3 = notaParcial3;
	}

	public int getNotaLaboratorio1() 
	{
		return notaLaboratorio1;
	}

	public void setNotaLaboratorio1(int notaLaboratorio1) 
	{
		this.notaLaboratorio1 = notaLaboratorio1;
	}

	public int getNotaLaboratorio2() 
	{
		return notaLaboratorio2;
	}

	public void setNotaLaboratorio2(int notaLaboratorio2) 
	{
		this.notaLaboratorio2 = notaLaboratorio2;
	}

	public int getNotaLaboratorio3() 
	{
		return notaLaboratorio3;
	}

	public void setNotaLaboratorio3(int notaLaboratorio3) 
	{
		this.notaLaboratorio3 = notaLaboratorio3;
	}

	public int getNotaSemestral() 
	{
		return notaSemestral;
	}

	public void setNotaSemestral(int notaSemestral) 
	{
		this.notaSemestral = notaSemestral;
	}
}
