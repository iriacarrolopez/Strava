import java.sql.Date;

public class Usuario {
	
	private String nombre;
	private String correo;
	private Date fechaNac;
	private float peso;
	private int altura;
	private int frecCardMax;
	private int frecCardReposo;
	
	public Usuario(String correo, String nombre, Date fechaNac)
	{
		this.nombre = nombre;
		this.correo = correo;
		this.fechaNac = fechaNac;
	}
	
	public Usuario(String correo, String nombre, Date fechaNac, float peso, int altura, 
			int frecCardMax, int frecCardReposo)
	{
		this.nombre = nombre;
		this.correo = correo;
		this.fechaNac = fechaNac;
		this.peso = peso;
		this.altura = altura;
		this.frecCardMax = frecCardMax;
		this.frecCardReposo = frecCardReposo;
	}
	
	

}
