package ingles.com.navegacion;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import ingles.com.bean.Usuario;
import ingles.com.bean.UsuarioMemo;

import java.util.logging.Logger;
import javax.annotation.PostConstruct;

@RequestScoped
@Named
public class FormularioMemo {

    private Logger logger = Logger.getLogger(getClass().getName());

    private UsuarioMemo usuarioMemo;
    
    @PostConstruct
    public void init() {
        usuarioMemo = new UsuarioMemo();
    }

	public UsuarioMemo getUsuarioMemo() {
		return usuarioMemo;
	}

	public void setUsuarioMemo(UsuarioMemo usuarioMemo) {
		this.usuarioMemo = usuarioMemo;
	}
    
    
}
