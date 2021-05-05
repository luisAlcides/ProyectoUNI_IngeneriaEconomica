

package proyecto.uni.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author Alcides Blandon
 */
public class Interes {
    
    private double monto;
    private double capital;
    private double tasa;
    private double perido;
    
    private List<String> tiempoDeTaza = new ArrayList<>();

    public Interes() {
    }

    public Interes(double monto, double capital, double tasa, double perido, List<String> tiempoDeTaza) {
        this.monto = monto;
        this.capital = capital;
        this.tasa = tasa;
        this.perido = perido;
        this.tiempoDeTaza = tiempoDeTaza;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public double getPerido() {
        return perido;
    }

    public void setPerido(double perido) {
        this.perido = perido;
    }
    
     public void limpiar(List<JFormattedTextField> textField) {
        System.out.println("Entro");
        for (int i = 0; i < textField.size(); i++) {
            textField.get(i).setText("");
        }
        setCapital(0);
        setMonto(0);
        setPerido(0);
        setTasa(0);

    }

}
