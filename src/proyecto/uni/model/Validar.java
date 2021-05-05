

package proyecto.uni.model;

import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author Alcides Blandon
 */
public class Validar {

    public Validar() {
    }
  

    
    
   
    public void numberKeyTasa(KeyEvent evt, JFormattedTextField textField) {
        char car = evt.getKeyChar();
        
        if((car < '0' || car > '9') && textField.getText().contains(".")
                && textField.getText().contains("%") && (car != (char) KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }else if((car < '0' || car > '9') && (car != '.') && (car != '%')
                && (car != (char) KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }
    
    public void numberDecimalKeyPress(KeyEvent evt, JFormattedTextField textField){
        
        char car = evt.getKeyChar();
        
        if((car < '0' || car > '9') && textField.getText().contains(".")
                && (car != (char) KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }else if((car < '0' || car > '9') && (car != '.')
                && (car != (char) KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }
    
    
}
