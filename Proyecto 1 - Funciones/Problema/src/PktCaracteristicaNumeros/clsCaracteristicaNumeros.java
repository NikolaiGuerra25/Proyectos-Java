package PktCaracteristicaNumeros;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class clsCaracteristicaNumeros 
{
	UIManager UI;
	//Area de metodos
	
	//Metodo de potencia
	public static int mtdEnteroPotencia(int base, int exponente) 
	{
		int potencia = 1;
		int i=0;
		int multi=1;
			for (i=1;i<=exponente;i++) 
			{
				potencia=potencia*base;
			}	
		return potencia;
	}
	
	//Metodo de primo
	public static char mtdCalc_Primo(int primo) 
	{
		int i=0,cont=0;
		for(i=1;i<=primo;i++)
		{
			if(primo%i==0){
				cont++;
			}
		}
		if (cont>2)
		{
		return 'N';	
		}
		else
		{
		return 'S'	;
		}		
	}
	
	//Metodo de perfecto
	public static char MtdCalc_Perfecto  (int perfecto) 
	{
		int div=0,i=0;
		for (i=1; i<perfecto;i++)
		{
			if(perfecto% i==0) div+=i;
		}
		if(perfecto==div){
			return 'S';
		}
		else{
			return'N';
		}
	}
	
	//Metodo de invertir
	public static int MtdCalc_Invertir   (int invertir) 
	{
			int x, i=0;
			while(invertir!=0) 
		    { 
		    	x=invertir%10; 
		    	invertir=invertir/10;
		    	i=i*10+x;
		    } 
		    return i;
	}
	
	//Metodo de cifras
	public static long MtdCalc_Cifras(long cifras) 
	{   
     
          int CanCifras=0;
          while(cifras !=0)
          {
        	  cifras = cifras/10;
            CanCifras++;
          }
		return CanCifras;
	}
	
	//Metodo de ulam
	public void MtdCalc_Ulam (int ulam) 
	{
		while (ulam!=1)
		{
			if(ulam%2!=0)
				ulam=3*ulam+1;
			else
			{
				ulam=ulam/2;
			}
			UI = null;
			UI.put("OptionPane.background", new Color(44, 164, 134));
			UI.put("Panel.background", new Color(105, 225, 131));
			JOptionPane.showMessageDialog(null, "La respuesta es:"+ulam);
		}
	}
	
	//Metodo abundante
	public static boolean MtdCalc_Abundante (int abundante) 
	{   
	     int suma=0;
		for (int i = 1; i < abundante; i++)
		{
            if ( abundante%i == 0)
            {
                suma=suma+i;
            }
        }
            if (suma > abundante) 
            {
            	 return true;
            }
            else 
            {
            	return false;	
            }   
	}
	
	//Metodo armstrong
	public static boolean MtdCalc_Armnstrong (int number) 
	{   
		int raised=0, powerNumber=0, remaining, numberCopy;
		
		numberCopy=number;
		
		while (numberCopy!=0)
		{
			numberCopy=numberCopy/10;
			powerNumber++;
		}
		
		numberCopy=number;
		
		while (number!=0)
		{
			remaining=number%10;
			raised+=Math.pow(remaining, powerNumber);
			number = number/10;
		}
		
		if (numberCopy==raised)
			return true;
		else 
			return false;
	}
	
	//Metodo impar
	public static char MtdCalc_Impar   (int impar) 
	{   
		if (impar%2!=0)
		    return 'S';
		  else
		    return 'N';
	}
	
	//Metodo factorial
	public static long MtdCalc_Factorial   (int factorial) 
	{   
		 int i;
	     long NFactorial=1;
	        for (i=1; i<=factorial; i++)
	        {
	        	NFactorial=NFactorial*i;
	        }
	        return NFactorial;
	}
	
	//Metodo amigos
	public static char MtdCalc_Amigos(int NAmigo1, int NAmigo2) 
	{   
		int div1=0,div2=0,i=0;
		for (i=1;i<=NAmigo1/2;i++)
		{
			if (NAmigo1%i==0)
			div1+=i;
		}
		for (i=1;i<=NAmigo2/2;i++)
		{
			if(NAmigo2%i==0)
			div2+=i;
		}
		if(NAmigo1==div2 &&NAmigo2==div1)
		{
			return 'S';
		}
		else
		{
			return 'N';
		}
	}
	
	//Metodo capicua
	public static char MtdCalc_Capicua  (int capicua) 
	{
	   int c, s, r=0;
       c=capicua;
       while (capicua!=0)
       {
           s=capicua%10;
           r=r*10+s;
           capicua=capicua/10;
       }
       if (c==r)
           return 'S';
       else
           return 'N';
	}
	
	public static int fnSumaDigito (int num)
    {
        int e, s=0;
        while (num!=0)
        {
            e=num%10;
            num/=10;
            s+=e;
        }
        return s;
    }
}
