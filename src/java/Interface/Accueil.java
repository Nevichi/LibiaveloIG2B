package Interface;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author quentin
 */
public class Accueil extends JPanel {
    private JButton suppression = new JButton("Suppression");
    private JButton ajout = new JButton("Ajout");
    private JButton listing = new JButton("Listing");
    private JButton modification = new JButton("Modification");
    private JButton statistique = new JButton("Statistiques");
    private JButton recherche = new JButton("Recherche");
    private JLabel message = new JLabel("Bienvenue dans le software de libiavélo.");
    
    
    public Accueil()
    {
    this.setBounds(100, 100, 500, 500);
    this.setBorder(BorderFactory.createLineBorder(Color.CYAN));
    
    this.setLayout(null);
    this.add(message);
    this.add(ajout);
    this.add(suppression);
    this.add(listing);
    this.add(modification);
    this.add(statistique);
    this.add(recherche);
    
    message.setBounds(100, 10, 500, 14);
    
    ajout.setBounds(150, 100, 140, 50);
    ajout.setBounds(23, 99, 140, 23);
    suppression.setBounds(150, 100, 140, 23);
    listing.setBounds(297, 99, 140, 23);
    modification.setBounds(10, 189, 140, 23);
    statistique.setBounds(144, 189, 140, 23);
    recherche.setBounds(287, 189, 140, 23);
    
    }
    
}
