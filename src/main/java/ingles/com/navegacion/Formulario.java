package ingles.com.navegacion;

import ingles.com.bean.Usuario;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.logging.Logger;

@RequestScoped
@Named
public class Formulario {

    private Logger logger = Logger.getLogger(getClass().getName());

    private Usuario usuario;

    @PostConstruct
    public void init() {
        usuario = new Usuario();
    }

    public String guardarNombre() {
        //guardamnos en BD
        logger.info(usuario.toString());
        return "confirmar";
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
