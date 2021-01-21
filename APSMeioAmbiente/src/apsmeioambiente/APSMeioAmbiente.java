package apsmeioambiente;

import Apresentacao.frmDOIS;
import Apresentacao.frmUM;
import java.awt.Component;
import javax.swing.JOptionPane;

public class APSMeioAmbiente 
{

    public static void main(String[] args) 
    {
        Component Regras = null;
        JOptionPane.showMessageDialog(Regras, "Ache os erros e clique neles \n         Você tem 3 vidas");
        
        frmUM frm = new frmUM(null, true);
        frm.setVisible(true);
    }
    
}
