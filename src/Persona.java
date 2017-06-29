
public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String pnombre,String papellido,int pedad) {
		nombre=pnombre;
		apellido=papellido;
		edad=pedad;
	}
	public String ToString() {
		String resul="Nombre: "+nombre+"\n";
		resul+="Apellido: "+apellido+"\n";
		resul+="Nombre: "+edad;
		return resul;
	}
}
