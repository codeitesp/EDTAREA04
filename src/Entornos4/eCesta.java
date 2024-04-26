package Entornos4;

public class eCesta {

    /*Propiedades de la Clase eCesta*/

    private String comercio;

    private double bono;

    private String usuario;

    private double extra;

    /* Constructor sin argumentos */

    public eCesta ()

    {

    }

    /*Constructor con par�metros*/

    public eCesta (String c, double b, String u,double paramExtra)

    {

        comercio=c;

        bono=b+10;

        usuario=u;
        
        extra = paramExtra;

    }
    

    // Constructor sin par�metro extra (utiliza valor por defecto)
    public eCesta(String c, double b, String u) {
        this(c, b, u, 10.0); 
    }

   /*M�todo para fijar el comercio*/

    public void AsignarComercio(String nombre)

    {

        comercio=nombre;

    }

    /* M�todo que indica el usuario de la cesta electr�nica */

    public String Titular()

    {

        return usuario;

    }

 

    /*M�todo de consulta de bonificaci�n*/

     public double bonificacion ()

    {

        return bono;

    }

 

    /* M�todo para actualizar el bono */

    public void ActualizarBono (double n) throws Exception

    {

        if (n<0)

            throw new Exception("No es posible actualizar bono");

        bono= bono+ n;

    }

 

    /* M�todo para comprar */

    public void comprar (double total) throws Exception

    {

        if (total<= 0)

            throw new Exception ("Imposible la compra");

        if (bonificacion()< total)

            throw new Exception ("Su bono es insuficiente para la compra");

        bono = bono-total;

    }

 

    /*M�todo que me devuelve el usuario de la cesta*/

    public String identificacionUsuario ()

    {

        return usuario;

    }

    /*Metodos encapsulamiento*/
	public String getComercio() {
		return comercio;
	}

	public void setComercio(String comercio) {
		this.comercio = comercio;
	}

	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getExtra() {
		return extra;
	}

	public void setExtra(double extra) {
		this.extra = extra;
	}


    
    
    
    
}