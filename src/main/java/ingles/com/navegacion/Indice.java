package ingles.com.navegacion;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;

@Model
public class Indice {

    private int valor;

    @PostConstruct
    public void initi() {
        valor = 2;
    }

    public String ejecucionPrueba() {
        //codigo java
        return "pruebas";
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
