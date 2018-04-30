package Vue;

import Modele.Modele;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Fenetre extends JFrame {

    private int nombrePoint = 0;
    private int nombreNiveau = 0;
    private long chrono = 0;
    private String probleme = "";

    private Background backgrounds[];

    private Background backgroundActuel;

    private JPanel pnlPrincipal = new JPanel(new BorderLayout());
    private JPanel pnlCarre = new JPanel(new GridLayout(49, 1));
    private JPanel pnlJeu = new JPanel(new BorderLayout());

    private JPanel pnlNiveau = new JPanel(new BorderLayout());
    private JPanel pnlChronoPoint = new JPanel(new BorderLayout());

    private JLabel lblNiveau = new JLabel("Niveau : " + nombreNiveau + "\n");
    private JTextArea lblEnoncer = new JTextArea();

    private JLabel lblChrono = new JLabel("     00:00      ");
    private JLabel lblPoint = new JLabel(nombrePoint + " points     ");

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

    private Amperemetre amperemetre04 = new Amperemetre();
    private Amperemetre amperemetre3m = new Amperemetre(1);
    private Ampoule ampoule = new Ampoule();
    private Bobine bobine = new Bobine();
    private Condensateur condensateur2 = new Condensateur();
    private Condensateur condensateur3 = new Condensateur(1);
    private Condensateur condensateur4 = new Condensateur(1, 1);
    private Condensateur condensateur6 = new Condensateur(1, 1, 1);
    private Condensateur condensateur10 = new Condensateur(1, 1, 1, 1);
    private InterrupteurO interrupteurO = new InterrupteurO();
    private InterrupteurF interrupteurF = new InterrupteurF();
    private Pile pile45 = new Pile();
    private Pile pile4 = new Pile (1);
    private Pile pile6 = new Pile (1, 1);
    private Pile pile8 = new Pile (1, 1, 1);
    private Pile pile10 = new Pile(1, 1, 1, 1);
    private Pile pile12 = new Pile(1, 1, 1, 1, 1);
    private Pile pile18 = new Pile(1, 1, 1, 1, 1, 1);
    private Pile pile36 = new Pile(1, 1, 1, 1, 1, 1, 1);
    private Pile pile90 = new Pile(1, 1, 1, 1, 1, 1, 1, 1);
    private Pile pile120 =new Pile(1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Pile pile204 =new Pile(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance resistance1 = new Resistance();
    private Resistance resistance2 = new Resistance(1);
    private Resistance resistance2k = new Resistance(1, 1);
    private Resistance resistance3 = new Resistance(1, 1, 1);
    private Resistance resistance3k = new Resistance(1, 1, 1, 1);
    private Resistance resistance4 = new Resistance(1, 1, 1, 1, 1);
    private Resistance resistance4k = new Resistance(1, 1, 1, 1, 1, 1);
    private Resistance resistance5 = new Resistance(1, 1, 1, 1, 1, 1, 1);
    private Resistance resistance6 = new Resistance(1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance resistance7 = new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance resistance7k = new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance resistance8 = new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance resistance10 = new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance resistance10k = new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance resistance11 = new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance resistance50k =        new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance ResistanceCouleur2k =  new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance ResistanceCouleur3k =  new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance ResistanceCouleur4k =  new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance ResistanceCouleur7k =  new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance ResistanceCouleur10k = new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance ResistanceCouleur10 =  new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance ResistanceCouleur11 =  new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance ResistanceCouleur50K = new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance ResistanceCouleur100K =new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

    private Voltmetre voltmetre15 = new Voltmetre();
    private Voltmetre voltmetre6 = new Voltmetre(1);

    private JLabel composantes[] = {
        new JLabel(amperemetre04), new JLabel(amperemetre3m),
        new JLabel(ampoule),
        new JLabel(bobine),
        new JLabel(condensateur2), new JLabel(condensateur3), new JLabel(condensateur4),
        new JLabel(condensateur6), new JLabel(condensateur10),
        new JLabel(interrupteurO),
        new JLabel(interrupteurF),
        new JLabel(pile45), new JLabel(pile4), new JLabel(pile6), new JLabel(pile8),new JLabel(pile10),
        new JLabel(pile12), new JLabel(pile18), new JLabel(pile36), new JLabel(pile90),
        new JLabel(pile120),new JLabel(pile204),
        new JLabel(resistance1), new JLabel(resistance2),
        new JLabel(resistance2k), new JLabel(resistance3), new JLabel(resistance3k),
        new JLabel(resistance4), new JLabel(resistance4k), new JLabel(resistance5),
        new JLabel(resistance6), new JLabel(resistance7), new JLabel(resistance7k),
        new JLabel(resistance8), new JLabel(resistance10), new JLabel(resistance10k),
        new JLabel(resistance11), new JLabel(resistance50k),
        new JLabel(voltmetre15), new JLabel(voltmetre6), new JLabel(ResistanceCouleur2k), 
        new JLabel(ResistanceCouleur3k), new JLabel(ResistanceCouleur4k), new JLabel(ResistanceCouleur7k),
        new JLabel(ResistanceCouleur10k), new JLabel(ResistanceCouleur10), new JLabel(ResistanceCouleur11),
         new JLabel(ResistanceCouleur50K), new JLabel(ResistanceCouleur100K)
    };

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            chrono++;
            Date temps = new Date(chrono * 1000);
            SimpleDateFormat ft = new SimpleDateFormat("mm:ss");
            lblChrono.setText("     " + ft.format(temps) + "     ");
        }

    });

    public Fenetre(Modele modele) {

        setTitle("circuitAEC");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 850);

        settingWindow();

        initMenu();

        setResizable(false);

        this.setVisible(true);

        creerNiveaux();
    }

    public void settingWindow() {
        add(pnlPrincipal);
        pnlPrincipal.add(pnlJeu, BorderLayout.EAST);
        pnlPrincipal.add(pnlCarre, BorderLayout.WEST);

        pnlCarre.setBackground(Color.WHITE);

        pnlJeu.setPreferredSize(new Dimension(700, 900));
        pnlJeu.setBackground(Color.WHITE);
        pnlJeu.add(pnlNiveau, BorderLayout.NORTH);
        pnlJeu.add(pnlChronoPoint, BorderLayout.SOUTH);

        pnlNiveau.add(lblNiveau, BorderLayout.NORTH);
        pnlNiveau.add(lblEnoncer, BorderLayout.SOUTH);
        lblEnoncer.setEditable(false);
        pnlNiveau.setBackground(Color.WHITE);

        pnlChronoPoint.add(lblChrono, BorderLayout.WEST);
        pnlChronoPoint.add(lblPoint, BorderLayout.EAST);
        pnlChronoPoint.setBackground(Color.WHITE);

        for (JLabel composante : composantes) {
            pnlCarre.add(composante);
        }

        MouseListener listener = new DragMouseAdapter();
        for (JLabel composante : composantes) {
            composante.addMouseListener(listener);
            composante.setTransferHandler(new TransferHandler("icon"));
        }

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
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (backgroundActuel != null) {
                    pnlJeu.remove(backgroundActuel);
                    pnlJeu.revalidate();
                    pnlJeu.repaint();
                }
                creerNiveaux();
                timer.stop();
                chrono = 0;
            }
        });

        mnuAPropos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Étienne Gagné,Audrey Lupien et Cloé Lachance, créé le 54 fevars");
            }
        });

        mnuQuitter.addActionListener(new ActionListener() {
            @Override
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
            @Override
            public void actionPerformed(ActionEvent ae) {

                Runtime runtime = Runtime.getRuntime();

                // Utilise le web browser par default pour ouvrir le pdf.
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("aide-memoire_final.pdf"));
                    } catch (URISyntaxException ex) {
                        Logger.getLogger(Fenetre.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Fenetre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        });

        mnuReponses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Object reponse = JOptionPane.showInputDialog(null,
                        "De quel niveau voulez-vous voir la réponse ?", "Réponses",
                        JOptionPane.QUESTION_MESSAGE, null, new String[]{"1", "2", "3", "4", "5", "..."}, null);

            }
        });
        mnuRegles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Règles et commandes du jeu : \n"
                        + "_________________________\n"
                        + "Premièrement, choisissez votre mode de jeu\n"
                        + "     -Apprentissage (mode avec pointage)\n"
                        + "     -Chrono (mode avec pointage et chronomètre)\n"
                        + "     -Libre (mode sans pointage ni chrono pour visualiser nos exercices)\n"
                        + "Dans les 2 premiers modes, vous devez compléter les niveaux pour accumuler des points. \n"
                        + "Les niveaux consistent à compléter des circuits où il manque des éléments \n"
                        + "Commandes du jeu : \n"
                        + "_________________\n"
                        + "Avec la souris cliquez et maintenez l'élément, puis glissez-le et lâchez l'élément à l'entroit désiré\n");
            }
        });

        mnuApprentissage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Integer[] niveaux = {1, 2, 3, 4, 5, 6, 7, 8, 9};

                int input = (int) JOptionPane.showInputDialog(null,
                        "Choisissez un niveau : ", "Niveaux",
                        JOptionPane.QUESTION_MESSAGE, null, niveaux, niveaux[0]);
                
                nombreNiveau = input;
                lblNiveau.setText("Niveau : " + nombreNiveau + "\n");

                if (backgroundActuel != null) {
                    pnlJeu.remove(backgroundActuel);
                }
                backgroundActuel = backgrounds[input - 1];
                pnlJeu.add(backgroundActuel, BorderLayout.CENTER);
                probleme = backgroundActuel.toString();
                lblEnoncer.setText("Énoncé du problème : " + "\n" + probleme);
                lblEnoncer.setLineWrap(true);

                pnlJeu.revalidate();
                pnlJeu.repaint();

            }
        });

        mnuChrono.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                timer.start();
            }

        });

        mnuLibre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
//            	
            }
        });

    }

    private void creerNiveaux() {
        backgrounds = new Background[]{new BackGround419(), new BackGround619(),
            new BackGround621(), new BackGround625(),
            new BackGround632(), new BackGround639(),
            new BackGround651(), new BackGround661(),
            new BackGround667()};
    }

    public int getNombreNiveau() {
        return nombreNiveau;
    }

    public int getNombrePoint() {
        return nombrePoint;
    }

}
