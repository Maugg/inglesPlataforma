package ingles.com.navegacion;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.logging.Logger;

@RequestScoped
@Named
public class FormularioMemo {

    private Logger logger = Logger.getLogger(getClass().getName());

    private String nombre;
    private String apellido;
    private String edad;

    public String guardarDatos() {
        //guardamnos en BD
        logger.info(nombre);
        logger.info(apellido);
        logger.info(edad);
        return "confirmarmemo";
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

    
}
