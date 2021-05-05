

package proyecto.uni.model;

import java.util.List;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import proyecto.uni.controller.DatosGenerales;

/**
 *
 * @author Alcides Blandon
 */
public class InteresCompuesto extends Interes{

    private List<JRadioButton> radioButtons;
    private List<String> tiempoTaza;
    private DatosGenerales datos;
    
    public InteresCompuesto() {
    }

    public InteresCompuesto(double monto, double capital, double tasa, double perido,
            List<JRadioButton> radioButtons,List<String> tiempoDeTaza) {
        super(monto, capital, tasa, perido, tiempoDeTaza);
        this.radioButtons = radioButtons;
        this.tiempoTaza = tiempoDeTaza;
        datos = new DatosGenerales();
    }

    //cIC -> calcular interes Compuesto
    public void cICMonto(double capital, double tasa, double periodo) {
        double resultado = 0;
        tasa = tasa / 100;
        resultado = capital*(Math.pow(1+tasa, periodo));
        setMonto(resultado);

    }

    public void cICCapital(double monto, double tasa, double periodo) {
        double resultado = 0;
        tasa = tasa / 100;
        resultado = monto /Math.pow(1+tasa, periodo);
        setCapital(resultado);

    }

    public void cICTasa(double monto, double capital, double periodo) {
        double resultado = 0;
        resultado = Math.pow((monto/capital), (1/periodo)) - 1;
        setTasa(resultado * 100);

    }

    public void cICPeriodo(double monto, double capital, double tasa) {
        double resultado = 0;
        tasa = tasa / 100;
        resultado = (Math.log(monto/tasa)/Math.log(1+tasa));
        setPerido(resultado);

    }

   

    
    
}
