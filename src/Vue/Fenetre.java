package Vue;

import Modele.Modele;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Fenetre extends JFrame implements Observer {
    
    

    private int nombrePoint=0;
    private int nombreNiveau=0;
    private JPanel pnlPrincipal = new JPanel(new BorderLayout());
    private JPanel pnlCarre = new JPanel(new GridLayout(10, 2));
    private JPanel pnlJeu = new JPanel(new BorderLayout());
    private JPanel pnlNiveau = new JPanel(new BorderLayout());
    private JPanel pnlChronoPoint = new JPanel(new BorderLayout());
    private JPanel pnlGrille = new JPanel(new GridLayout(6, 6));
    private JLabel lblNiveau = new JLabel("Niveau:"+nombreNiveau );
    private JLabel lblEnoncer = new JLabel("Énoncé du problème:");
    private JLabel lblChrono = new JLabel("00:00 min");
    private JLabel lblPoint = new JLabel(nombrePoint +" points");
    private JLabel lblEspace = new JLabel("          ");
    
    

    private JMenuBar monMenu = new JMenuBar();
    private final JMenu mnuFichier = new JMenu("Fichier");
    private final JMenu mnuAide = new JMenu("?");
    private final JMenuItem mnuAPropos = new JMenuItem("À propos");
    private final JMenu mnuMode = new JMenu("Mode de Jeu");
    private final JMenuItem mnuNouvellePartie = new JMenuItem("Nouvelle partie");
    private final JMenuItem mnuQuitter = new JMenuItem("Quitter");
    private final JMenuItem mnuFormules = new JMenuItem("Formules utiles");
    private final JMenuItem mnuReponses = new JMenuItem("Réponses des niveaux");
    private final JMenuItem mnuRegles = new JMenuItem("Comment jouer ?");
    private final JMenuItem mnuApprentissage = new JMenuItem("Apprentissage");
    private final JMenuItem mnuChrono = new JMenuItem("Chrono");
    private final JMenuItem mnuLibre = new JMenuItem("Libre");
//    private final JMenuItem mnusousÀPropos = new JMenu("Étienne Gagné,Audrey Lupien et Cloé Lachance");

    public Fenetre(Modele modele) {
        setTitle("circuitAEC");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 850);
//900,850
        add(pnlPrincipal);

        settingWindow();
        initMenu();

        setResizable(false);
//        pack();

        this.setVisible(true);
    }

    public void settingWindow() {

        pnlPrincipal.add(pnlJeu, BorderLayout.EAST);
        pnlPrincipal.add(pnlCarre, BorderLayout.WEST);
        pnlJeu.setPreferredSize(new Dimension(700, 900));
        pnlCarre.setPreferredSize(new Dimension(100, 900));
        pnlJeu.add(pnlNiveau, BorderLayout.NORTH);
        pnlJeu.add(pnlChronoPoint, BorderLayout.SOUTH);
        pnlJeu.add(pnlGrille, BorderLayout.CENTER);
        pnlJeu.add(lblEspace,BorderLayout.WEST);
        pnlNiveau.add(lblNiveau, BorderLayout.NORTH);
        pnlNiveau.add(lblEnoncer, BorderLayout.SOUTH);
        pnlChronoPoint.add(lblChrono, BorderLayout.WEST);
        pnlChronoPoint.add(lblPoint, BorderLayout.EAST);

        for (int i = 0; i < 20; i++) {
            JButton carre = new JButton("" + i);
            carre.setPreferredSize(new Dimension(50, 50));

            pnlCarre.add(carre);
            

        }JLabel tab[][]=new JLabel[6][6];
        for (int i = 0; i < 6; i++) {
          
            for(int j=0;j<6;j++){
          
          JLabel cercle=new JLabel("o");
          tab[i][j]=cercle;
            
            pnlGrille.add(cercle);}
        }

        pnlPrincipal.setPreferredSize(new Dimension(500, 500));
        JScrollPane scrollPane = new JScrollPane(pnlCarre);
        pnlPrincipal.add(scrollPane);

    }

    private void initMenu() {

        monMenu.add(mnuFichier);
        monMenu.add(mnuAide);
        monMenu.add(mnuMode);

        mnuFichier.add(mnuNouvellePartie);
        mnuFichier.addSeparator();
        mnuFichier.add(mnuAPropos);
        mnuFichier.addSeparator();
        mnuFichier.add(mnuQuitter);

        mnuAide.add(mnuFormules);
        mnuAide.addSeparator();
        mnuAide.add(mnuReponses);
        mnuAide.addSeparator();
        mnuAide.add(mnuRegles);

        mnuMode.add(mnuApprentissage);
        mnuMode.addSeparator();
        mnuMode.add(mnuChrono);
        mnuMode.addSeparator();
        mnuMode.add(mnuLibre);

        setJMenuBar(monMenu);

        listenersMenus();
    }

    public void listenersMenus() {
        mnuNouvellePartie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
//            	finDePartie();
//            	modele.reset();
            }
        });

        mnuAPropos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Étienne Gagné,Audrey Lupien et Cloé Lachance, créé le 54 fevars");
            }
        });

        mnuQuitter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                int dialogBouton = JOptionPane.YES_NO_OPTION;
                int reponse = JOptionPane.showConfirmDialog(null, "Voulez-vous "
                        + "vraiment quitter ce merveilleux jeux?", "Question", dialogBouton);
                if (reponse == JOptionPane.NO_OPTION) {

                } else if (reponse == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        mnuFormules.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Ajouter Formules ici!!!");
            }
        });

        mnuReponses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Object reponse = JOptionPane.showInputDialog(null,
                        "De quel niveau voulez-vous voir la réponse ?", "Réponses",
                        JOptionPane.QUESTION_MESSAGE, null, new String[]{"1", "2", "3", "4", "5", "..."}, null);

            }
        });
        mnuRegles.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Écrire les règles du jeu ici!!!");
            }
        });

        mnuApprentissage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
//            	
            }
        });

        mnuChrono.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
//            	
            }
        });

        mnuLibre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
//            	
            }
        });

    }
     public int getNombreNiveau() {
        return nombreNiveau;
    }

    public int getNombrePoint() {
        return nombrePoint;
    }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
