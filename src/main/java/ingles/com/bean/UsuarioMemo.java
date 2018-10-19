package ingles.com.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UsuarioMemo {
	@NotNull(message = "El nombre no puede ser vacio")
	@Size(min = 3, max = 100, message = "El nombre debe ser entre 3 y 100")
	private String nombre;
	@NotNull(message = "El Apellido no puede ser vacio")
	@Size(min = 3, max = 100, message = "El nombre debe ser entre 3 y 100")
	private String apellidos;
	@NotNull(message = "El Contraseña no puede ser vacio")
	@Size(min = 3, max = 100, message = "El nombre debe ser entre 3 y 100")
	private String contraseña;
    @Min(5)
    @Max(12)
	private Integer edad;
	
	public UsuarioMemo() {
		
	}
    public UsuarioMemo( String nombre, String apellidos,String contraseña, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.edad = edad;
        
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((contraseña == null) ? 0 : contraseña.hashCode());
		result = prime * result + ((edad == null) ? 0 : edad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioMemo other = (UsuarioMemo) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (contraseña == null) {
			if (other.contraseña != null)
				return false;
		} else if (!contraseña.equals(other.contraseña))
			return false;
		if (edad == null) {
			if (other.edad != null)
				return false;
		} else if (!edad.equals(other.edad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UsuarioMemo [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", contraseña=");
		builder.append(contraseña);
		builder.append(", edad=");
		builder.append(edad);
		builder.append("]");
		return builder.toString();
	}
	
}
