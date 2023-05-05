package rättning_bte20;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Upp {

    JFrame f = new JFrame(); 
    
    JLabel javascipt = new JLabel("Javascript"); 
    JLabel html = new JLabel("html");
    JLabel java = new JLabel("java");
    JLabel name = new JLabel("Username");
    JLabel lösenord = new JLabel("Password");
    JLabel bekräfta = new JLabel("Confirm Password");
    JLabel ToS = new JLabel("Har du läst Polski service policy?");
    
    JLabel response = new JLabel(); 
    JRadioButton b1 = new JRadioButton();
    JRadioButton b2 = new JRadioButton();
    JRadioButton b3 = new JRadioButton();
    JCheckBox tos = new JCheckBox();
    
    JTextField user = new JTextField(15); 
    JTextField pas = new JTextField(15);
    JTextField con = new JTextField(15);
    
    JButton skapaKonto = new JButton("Create Acount");
    
    ButtonGroup group = new ButtonGroup();
    
    public Upp() {
    
        group.add(b1);
        group.add(b2);
        group.add(b3);
        
        f.setVisible(true); 
        f.setSize(700,400); 
        f.setLayout(new FlowLayout());
        f.add(name); 
        f.add(user);
        f.add(lösenord);
        f.add(pas);
        f.add(bekräfta);
        f.add(con);
        f.add(javascipt);
        f.add(b1);
        f.add(html);
        f.add(b2);
        f.add(java);
        f.add(b3);
        f.add(skapaKonto);
        f.add(response);
        f.add(ToS);
        f.add(tos);
        
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        
        skapaKonto.addActionListener(e->{
            
            if (b1.isSelected()) {
                response.setText("Du valde Javascript");
            }else if (b2.isSelected()) {
                response.setText("Du valde Html");
            }else if (b3.isSelected()) {
                response.setText("Du valde Java");
            }
            System.out.println("Konto skapat");
            
            
        });
        
        
        
    }
    
    public static void main(String[] args) {
        new Upp(); 
    }
}