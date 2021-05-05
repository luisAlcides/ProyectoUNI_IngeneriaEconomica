package proyecto.uni.model;

import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import proyecto.uni.controller.DatosGenerales;
import proyecto.uni.view.IntSimple;

/**
 *
 * @author Alcides Blandon
 */
public class InteresSimple extends Interes {

    List<JRadioButton> radioButtons;
    List<String> tiempoTaza;
    DatosGenerales datos;

    public InteresSimple() {
    }

    public InteresSimple(double monto, double capital, double tasa, double perido, List<JRadioButton> radioButtons, List<String> tiempoDeTaza) {
        super(monto, capital, tasa, perido, tiempoDeTaza);
        this.radioButtons = radioButtons;
        this.tiempoTaza = tiempoDeTaza;
        datos = new DatosGenerales();
        IntSimple intSimple = new IntSimple();

    }

    //cIS -> calcular interes simple
    public void cISMonto(double capital, double tasa, double periodo) {
        double resultado = 0;
        tasa = tasa / 100;
        resultado = capital * (1 + (tasa * periodo));
        setMonto(resultado);

    }

    public void cISCapital(double monto, double tasa, double periodo) {
        double resultado = 0;
        tasa = tasa / 100;
        resultado = monto / (1 + (tasa * periodo));
        setMonto(resultado);

    }

    public void cISTasa(double monto, double capital, double periodo) {
        double resultado = 0;
        resultado = ((monto / capital) - 1) / periodo;
        setTasa(resultado * 100);

    }

    public void cISPeriodo(double monto, double capital, double tasa) {
        double resultado = 0;
        tasa = tasa / 100;
        resultado = ((monto / capital) - 1) / tasa;
        setPerido(resultado);

    }

   

}
