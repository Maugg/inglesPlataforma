package ingles.com.flow;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.Flow;
import javax.faces.flow.FlowScoped;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.inject.Named;
import java.io.Serializable;


@FlowScoped("registroBean")
@Named
public class RegistroBean implements Serializable {

    private boolean licenciaAceptada;

    public String regresarInicio() {
        return "/index.xhtml";
    }

    public String aceptar() {
        if (licenciaAceptada) {
            return "registro3";
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "Aun no has leido y aceptado los terminos",
                            "Tienes que aceptar los terminos y condiciones"));
            return null;
        }
    }

    public boolean isLicenciaAceptada() {
        return licenciaAceptada;
    }

    public void setLicenciaAceptada(boolean licenciaAceptada) {
        this.licenciaAceptada = licenciaAceptada;
    }
}
