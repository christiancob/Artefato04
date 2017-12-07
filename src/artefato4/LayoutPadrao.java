/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package artefato4;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

/**
 *
 * @author Aluno
 */
public class LayoutPadrao {

    public void ativarLayoutPadrao() {
       
        
        UIManager.put( "nimbusBase", new Color( 102, 204, 255 ) ); //combobox
        //UIManager.put("LineBorder", new Color (153,0,0));
        UIManager.put("nimbusBlueGrey", new Color(153, 153, 153)); //botoes
       UIManager.put("control", new Color(153, 204, 255)); //fundo
         //UIManager.put("control", new Color(60, 68, 83));
 //                  UIManager.put("info", new Color(153,0,0));
//                    UIManager.put("nimbusBase", new Color(1, 1, 1));
//                    UIManager.put("nimbusDisabledText", new Color(247, 247, 255));
                    UIManager.put("nimbusFocus", new Color(0, 102, 204));
 //                   UIManager.put("nimbusGreen", new Color(153,0,0));
//                    UIManager.put("nimbusInfoBlue", new Color(40, 78, 156));
                  //  UIManager.put("nimbusLightBackground", new Color(153,0,0));
//                    UIManager.put("nimbusOrange", new Color(230, 217, 204));
//                    UIManager.put("nimbusRed", new Color(153,0,0));
//                    UIManager.put("nimbusSelectedText", new Color(251, 244, 244));
          //          UIManager.put("nimbusSelectionBackground", new Color(57, 105, 138));
                   UIManager.put("text", new Color(0, 0, 0));

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException exc) {
            exc.printStackTrace();
        } catch (ClassNotFoundException exc) {
            exc.printStackTrace();
        } catch (InstantiationException exc) {
            exc.printStackTrace();
        } catch (IllegalAccessException exc) {
            exc.printStackTrace();
        }
    }
}
