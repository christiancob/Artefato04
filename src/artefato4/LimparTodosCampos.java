
package artefato4;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Aluno
 */
public class LimparTodosCampos {
    
    public void limpar(Container container){
        Component components[] = container.getComponents();
            for (Component component: components)
            {
                if(component instanceof JTextField){
                    JTextField field = (JTextField)component;
                    field.setText("");
                }
                else if(component instanceof  Container){
                    limpar((Container)component);
                }
        
            }
            
    
    }
    
}
