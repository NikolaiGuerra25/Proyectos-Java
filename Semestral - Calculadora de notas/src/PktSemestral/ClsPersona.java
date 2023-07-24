package PktSemestral;

public class ClsPersona 
{
	private String tomo;
	private int folio;
	private int asiento;
	private String primerApellido;
	private String segundoApellido;
	private String primerNombre;
	private String segundoNombre;
	
	public ClsPersona(String t, int f, int a, String priApe, String segApe, String priNom, String segNom)
	{
		this.tomo = t;
		this.folio = f;
		this.asiento = a;
		this.primerApellido = priApe;
		this.segundoApellido = segApe;
		this.primerNombre = priNom;
		this.segundoNombre = segNom;
	}

	public String getTomo()
{
		return tomo;
	}

	public void setTomo(String tomo) 
	{
		this.tomo = tomo;
	}

	public int getFolio() 
	{
		return folio;
	}

	public void setFolio(int folio) 
	{
		this.folio = folio;
	}

	public int getAsiento() 
	{
		return asiento;
	}

	public void setAsiento(int asiento) 
	{
		this.asiento = asiento;
	}

	public String getPrimerApellido() 
	{
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) 
	{
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() 
	{
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) 
	{
		this.segundoApellido = segundoApellido;
	}

	public String getPrimerNombre() 
	{
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre)
	{
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() 
	{
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) 
	{
		this.segundoNombre = segundoNombre;
	}
}
