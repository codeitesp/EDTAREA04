package Entornos4;
public class Main { 
    public static void main(String[] args) {
        eCesta cesta = NuevoMetodo();
        double bonoactual = cesta.bonificacion();
        System.out.println("Su bono actual es  "+ bonoactual );
    }

	/**
	 * @return
	 */
	public static eCesta NuevoMetodo() {
		eCesta cesta;
        cesta = new eCesta("Apellidos del alumno",100, "dni del alumno");
        try 
        {
            cesta.comprar(50);
        } catch (Exception e)
        {
            System.out.println("No se puede pagar  ");
        }
        try
        {
            System.out.println(" Modificación 1");
            cesta.ActualizarBono(-50);
        } catch (Exception e)
        {
            System.out.println("Fallo…….");
        }
		return cesta;
	}
}
