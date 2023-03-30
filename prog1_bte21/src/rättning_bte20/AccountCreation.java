package rättning_bte20;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.*;

public class AccountCreation extends JFrame{
    
    JLabel l1 = new JLabel("Username");    // skapar ett objekt av klassen JLable och en referense till den denna, referensen är en instansvariabel
    JLabel l2 = new JLabel("Password");    // -||-
    JLabel l3 = new JLabel("Retype password"); // -||-
    JTextField user = new JTextField(30); // skapar ett objekt av klassen JTextField och en referense till den denna, referensen är en instansvariabel
    JPasswordField pas1 = new JPasswordField("",30); // skapar ett objekt av klassen JPasswordField och en referense till den denna, referensen är en instansvariabel
    JPasswordField pas2 = new JPasswordField("",30); // -||-
    
    ButtonGroup g1 = new ButtonGroup();    // skapar ett objekt av klassen ButtonGroup och en referense till den denna, referensen är en instansvariabel
    JLabel l4 = new JLabel("Choose interest"); // skapar ett objekt av klassen JLable och en referense till den denna, referensen är en instansvariabel
    JLabel l5 = new JLabel("Java"); // -||-
    JLabel l6 = new JLabel("Javascript"); // -||-
    JLabel l7 = new JLabel("HTML och CSS"); // -||-
    JRadioButton r1 = new JRadioButton(); // skapar ett objekt av klassen JRadioButton och en referense till den denna, referensen är en instansvariabel
    JRadioButton r2 = new JRadioButton(); // -||-
    JRadioButton r3 = new JRadioButton(); // -||-
    
    JLabel l8 = new JLabel("Have your read the terms of account creation?"); // skapar ett objekt av klassen JLable och en referense till den denna, referensen är en instansvariabel
    JCheckBox c1 = new JCheckBox(); // skapar ett objekt av klassen JCheckBox och en referense till den denna, referensen är en instansvariabel
    
    JButton b1 = new JButton("Confirm creation of account"); // skapar ett objekt av klassen JButton och en referense till den denna, referensen är en instansvariabel
    JLabel l9 = new JLabel(); // skapar ett objekt av klassen JLable och en referense till den denna, referensen är en instansvariabel
    JLabel l10 = new JLabel(); // -||-
    
    public AccountCreation() { // konstruktor
        
        this.setLayout(new FlowLayout()); // sätter flowlayout
        this.setVisible(true); // Gör boxen synlig
        this.setSize(new Dimension(400, 400)); // ger boxen en storlek
        add(l1); // Lägger till objektet som skapats som en instans variabler till konstruktorn 
        add(user); // -||-
        add(l2); // -||-
        add(pas1); // -||-
        add(l3); // -||-
        add(pas2); // -||-
        
        g1.add(r1); // Lägger till radiobuttonen i buttongroup 1 
        g1.add(r2); // -||-
        g1.add(r3); // -||-
        
        add(l4); // Lägger till objektet som skapats som en instans variabler till konstruktorn
        add(l5); // -||-
        add(r1); // -||-
        add(l6); // -||-
        add(r2); // -||-
        add(l7); // -||-
        add(r3); // -||-
        
        add(l8); // -||-
        add(c1); // -||-
        
        add(b1); // -||-
        add(l9); // -||-
        add(l10); // -||-
        
        b1.addActionListener(e->{ // lägger till en lysnare till b1 av formen lambda
            
            String username = user.getText(); // lagrar användarnamnet i en variabel
            String password = pas1.getText(); // lagrar lösenordet från första rutan i en variabel
            String passwordMatch = pas2.getText(); // lagrar lösenordet från andra rutan i en variabel
            String passCon = ""; // gör en tom string variabel
            for (int i = 0; i < password.length(); i++) { // kör for lopen lika många gånger som lösenordet är tecken
                
                passCon +="*"; // lägger till en * i passCon för varje gång lopen kör ett varv
                
            }    

            if (password.equals(passwordMatch) && c1.isSelected() && (r1.isSelected()||r2.isSelected()||r2.isSelected()) && !user.getText().equals("")) { // kollar så alla krav uppfylls, lösen matchar, har användarnamn, fyllt i intresse och klickat i boxen 
                
                String interest = "";
                l9.setText("Account has been created"); // sätter en text i JLable9 
                if (r1.isSelected()) { // kollar om radio1 är iklickad
                    interest = "Java"; // sätter intresse som java 
                }if (r2.isSelected()) { // kollar om radio2 är iklickad
                    interest = "JavaScript"; // sätter intresse till javascript
                }if (r3.isSelected()) { // kollar om radio 3 är iklickad
                    interest = "HTML och CSS"; // sätter intresse till html och css
                }
                l10.setText("Username: "+username+" Password: "+passCon+" Intresse: " + interest); // sätter texten i JLabel10 till informationen om kontot
                
            }else if(password.equals(passwordMatch) && !c1.isSelected() && (r1.isSelected()||r2.isSelected()||r2.isSelected()) && !user.getText().equals("")){ // lösenorden matchar, intresse ifyllt, användarnamn ifyllt, boxen inte iklickad
                l9.setText("You need to check the box"); // ger l9 en text där det står vad som saknas
            }else if(password.equals(passwordMatch) && !c1.isSelected() && (r1.isSelected()||r2.isSelected()||r2.isSelected()) && user.getText().equals("")){ // boxen inte iklickad och användarnamn saknas
                l9.setText("You need to check the box and add a username");    // ger l9 en text där det står vad som saknas
            }else if(!password.equals(passwordMatch) && c1.isSelected() && (r1.isSelected()||r2.isSelected()||r2.isSelected()) && !user.getText().equals("")){ // lösenorden matchar inte
                l9.setText("Your passwords do not match"); // ger l9 en text där det står vad som saknas
            }else if(!password.equals(passwordMatch) && c1.isSelected() && (r1.isSelected()||r2.isSelected()||r2.isSelected()) && user.getText().equals("")){ // lösenorden matchar inte och användarnamn saknas
                l9.setText("Your passwords do not match and you lack a username"); // ger l9 en text där det står vad som saknas
            }else if(password.equals(passwordMatch) && c1.isSelected() && !(r1.isSelected()||r2.isSelected()||r2.isSelected()) && !user.getText().equals("")){ // ingen radiobutton iklickad
                l9.setText("You lack interests"); // ger l9 en text där det står vad som saknas
            }else if(password.equals(passwordMatch) && c1.isSelected() && !(r1.isSelected()||r2.isSelected()||r2.isSelected()) && user.getText().equals("")){ // ingen radiobutton iklickad och användarnamn saknas
                l9.setText("You lack interests and a username"); // ger l9 en text där det står vad som saknas
            }else if(password.equals(passwordMatch) && !c1.isSelected() && !(r1.isSelected()||r2.isSelected()||r2.isSelected()) && !user.getText().equals("")){ // ingen radiobutton är iklickad och checkboxen är inte checkad
                l9.setText("You need to choose a interest and check the box"); // ger l9 en text där det står vad som saknas
            }else if(password.equals(passwordMatch) && !c1.isSelected() && !(r1.isSelected()||r2.isSelected()||r2.isSelected()) && user.getText().equals("")){ // ingen radiobutton är iklickad, användarnamn saknas och checkboxen är inte checkad
                l9.setText("You need to choose a interest, check the box and add a username"); // ger l9 en text där det står vad som saknas
            }else if(!password.equals(passwordMatch) && c1.isSelected() && !(r1.isSelected()||r2.isSelected()||r2.isSelected()) && !user.getText().equals("")){ // lösenorden matchar inte och ingen radiobutton är iklickad
                l9.setText("Your passwords do not match and you haven't choosen an interest"); // ger l9 en text där det står vad som saknas
            }else if(!password.equals(passwordMatch) && c1.isSelected() && !(r1.isSelected()||r2.isSelected()||r2.isSelected()) && user.getText().equals("")){ // lösenorden matchar inte, ingen radiobutton är iklickad och användarnamn saknas
                l9.setText("Your passwords do not match, you haven't choosen an interest and you lack a username");
            }else if(!password.equals(passwordMatch) && !c1.isSelected() && (r1.isSelected()||r2.isSelected()||r2.isSelected()) && user.getText().equals("")){ // lösenorden matchar inte, boxen är inte iklickad och användarnamn saknas
                l9.setText("Your passwords do not match, you haven't checked the box and you lack a username");
            }else if(!password.equals(passwordMatch) && !c1.isSelected() && (r1.isSelected()||r2.isSelected()||r2.isSelected()) && !user.getText().equals("")){ // lösenorden matchar inte och boxen är inte iklickad
                l9.setText("Your passwords do not match and you haven't checked the box"); // ger l9 en text där det står vad som saknas
            }else if(!password.equals(passwordMatch) && !c1.isSelected() && !(r1.isSelected()||r2.isSelected()||r2.isSelected()) && !user.getText().equals("")){ // lösenorden matchar inte, boxen är inte iklickad och ingen radiobutton är iklickad 
                l9.setText("Your passwords do not match, you haven't checked the box and you haven't choosen an interest"); // ger l9 en text där det står vad som saknas
            }else if(password.equals(passwordMatch) && c1.isSelected() && (r1.isSelected()||r2.isSelected()||r2.isSelected()) && user.getText().equals("")){ // användarnamn saknas
                l9.setText("You lack a username"); // ger l9 en text där det står vad som saknas
            }else { // allt saknas
                l9.setText("Your passwords do not match, you havent choosen an interest, you havent checked the box and you lack a username"); // ger l9 en text där det står vad som saknas
            }
            
        });
        
    }
    public static void main(String[] args) { // main
        new AccountCreation(); // gör ett objekt av kontruktorn när programmet körs
    }
    
}
 