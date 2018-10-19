package ingles.com.navegacion;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.logging.Logger;

@RequestScoped
@Named
public class Formulario {

    private Logger logger = Logger.getLogger(getClass().getName());

    private String nombre;

    public String guardarNombre() {
        //guardamnos en BD
        logger.info(nombre);
        return "confirmar";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
