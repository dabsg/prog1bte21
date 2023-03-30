package rättning_bte20;



import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.*;

public class UppgiftInloggv2 extends JFrame {

    JLabel l1 = new JLabel("Användarnamn"); // Skapar ett objekt av klassen JLabel och lagrar i en instans och referensvariabel. 
    JLabel l2 = new JLabel("Lösenord"); // Skapar ett objekt av klassenJLabel och lagrar i en instans och referensvariabel.
    JLabel l3 = new JLabel("Ange Lösenord Igen"); // Skapar ett objekt av klassen JLabel och lagrar i en instans och referensvariabel. Alla dessa 3 skapas för att veta vad användaren ska mata in

    JLabel l4 = new JLabel("Ange intressen"); // Skapar ett objekt av klassen JLabel och lagrar i en instans och referensvariabel.

    JLabel l5 = new JLabel("Javascript");//Skapar ett objekt av klassen JLabel och lagrar i en instans och referensvariabel
    JLabel l6 = new JLabel("Java"); //Skapar ett objekt av klassen JLabel och lagrar i en instans och referensvariabel
    JLabel l7 = new JLabel("HTML och CSS"); //Skapar ett objekt av klassen JLabel och lagrar i en instans och referensvariabel
    JLabel l8 = new JLabel("Accepterar du villkoren"); //Skapar ett objekt av klassen JLabel och lagrar i en instans och referensvariabel
    JLabel l9 = new JLabel(""); //Skapar ett objekt av klassen JLabel och lagrar i en instans och referensvariabel

    JTextField user = new JTextField(10); // Skapar ett objekt av klassen JTextField och lagrar i en instans och referensvariabel
    JPasswordField pass=new JPasswordField("",10);// Skapar ett objekt av klassen JPasswordfield och lagrar i en instans och referensvariabel
    JPasswordField pass2=new JPasswordField("",10);  // Skapar ett objekt av klassen JPasswordfield och lagrar i en instans och referensvariabel

    JRadioButton r1 = new JRadioButton();  // Skapar ett objekt av klassen JRadioButton och lagrar i en instans och referensvariabel
    JRadioButton r2 = new JRadioButton(); //-||-
    JRadioButton r3 = new JRadioButton(); //-||-

    ButtonGroup g1 = new ButtonGroup(); // Skapar en knappgrupp och lagrar i en instans och referensvariabel. För att sedan kunna ha radioknapparna i detta för att de ska tillhöra samma grupp. SÅ alla inte kan vara itryckta samtidigt.

    JCheckBox c1 = new JCheckBox();  // Skapar ett objekt av klassen JCheckbox och lagrar i en instans och referensvariabel

    JButton b1 = new JButton("Skapa Konto");  // Skapar ett objekt av klassen JButton och lagrar i en instans och referensvariabel

    public UppgiftInloggv2() {

        setLayout(new FlowLayout()); //sätter en layout till JFramen, för att struktera och positionera objekten.
        setVisible(true);    //Gör JFramen synlig
        setSize(new Dimension(1200, 600)); // Sätter dimensioner för JFramen vid start

        g1.add(r1); // Lägger till radioknappen r1 i knappgruppen
        g1.add(r2);// Lägger till radioknappen r2 i knappgruppen
        g1.add(r3);// Lägger till radioknappen r3 i knappgruppen

        add(l1); // Lägger till alla olika objektan i JFramen.
        add(user);
        add(l2);
        add(pass);
        add(l3);
        add(pass2);

        add(l4);
        add(l5);
        add(r1);
        add(l6);
        add(r2);
        add(l7);
        add(r3);
        add(l8);

        add(c1);

        add(b1);

        add(l9);

        b1.addActionListener(e -> { //Lägger till en lyssnare till knappen b1, genom att använda lambda utryck.

            String s1 = pass.getText(); // hämtar och Lagrar lösenordet i en sträng variabel.
            String s2 = pass2.getText(); // hämtar och lagrar andra lösenordet i en sträng variabel.
            String p = "";    //skapar en variabel för att sedan lagra lösenordet i Asterisker.
            String Intresse = ""; //skapar en sträng variabel för att sedan lagra ditt intresse i.

            for (int i = 0; i < s1.length(); i++) { //Gör en for loop för att lagra lösenordet i asterisker form som jag lagrar i p variabel.

                p += "*";
            }

            if (!user.getText().equals("") && s1.equals(s2) && c1.isSelected() && (r1.isSelected() || r2.isSelected() || r3.isSelected())) { //Testtar ifall alla krav uppfylls.

                if (r1.isSelected()) {  // hämtar och lagrar ditt intresse i en sträng som heter "Intresse"
                    Intresse = "Javascript";
                } else if (r2.isSelected()) {
                    Intresse = "Java";
                } else if (r3.isSelected()) {
                    Intresse = "HTML och CSS";
                } 

                l9.setText("Ditt användarnamn är: " + user.getText() + " ditt lösenord är: " + p + " Ditt intresse är: "
                        + Intresse); // Sätter text i en label som sedan visas upp i JFramen. I detta fall uppnåddes alla kraven.

            } else if (user.getText().equals("")) { // Kollar ifall användaren har matat in ett användarnamn

                l9.setText("Du har inte valt något användarnamn"); // Sätter text i en label som sedan visas upp i JFramen. I detta fall berättar texten att användaren inte har valt ett användarnamn.

            } else if (!s1.equals(s2) && c1.isSelected() && (r1.isSelected() || r2.isSelected() || r3.isSelected())) { //KOllar ifall användaren har fyllt i samma lösenord i båda inmatningsfälten.

                l9.setText("Dina lösenord är inte samma"); //Sätter text i en label som sedan visas upp i JFramen. I detta fall berättar texten att användarens lösenord inte är samma i båda inmatningsfälten.

            } else if ((!r1.isSelected() || !r2.isSelected() || !r3.isSelected()) && c1.isSelected()) { //KOllar ifall användaren har valt ett intresse.

                l9.setText("Du har inte valt något intresse"); //Sätter text i en label som sedan visas upp i JFramen. I detta fall talar texten om för användaren att hen inte har valt något intresse.

            } else { // i detta fall är kraven för att skapa ett konto inte uppfyllda

            
                l9.setText("Du har inte accepterat kraven"); //Sätter text i en label som sedan visas upp i JFramen. I detta fall talar texten om för användaren att hen inte har accepterat kraven.

            }

        });

    }

    public static void main(String[] args) {

        new UppgiftInloggv2(); 

    }
}