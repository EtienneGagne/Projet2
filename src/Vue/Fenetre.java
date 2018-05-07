package Vue;

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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * Fenetre de jeu
 */
public class Fenetre extends JFrame {

    //Nombre de point initialement a 0
    private int nombrePoint = 0;
    //Démarrage du chrono a 0
    private long chrono = 0;
    //Le probleme sera affiché dans ce string
    private String probleme = "";

    private Background backgrounds[];
    //initialise le niveau à rien au début
    private int niveauActuel = -1;
    //création des panneaux
    private JPanel pnlPrincipal = new JPanel(new BorderLayout());
    private JPanel pnlCarre = new JPanel(new GridLayout(51, 1));
    private JPanel pnlJeu = new JPanel(new BorderLayout());
    private JPanel pnlNiveau = new JPanel(new BorderLayout());
    private JPanel pnlChronoPoint = new JPanel(new BorderLayout());
    //le problème est mis dans un JTextArea par soucis d'espace
    private JTextArea lblEnoncer = new JTextArea();
    //création des Label
    private JLabel lblNiveau = new JLabel("Niveau : " + "\n");
    private JLabel lblChrono = new JLabel("     00:00      ");
    private JLabel lblPoint = new JLabel(nombrePoint + " points     ", SwingConstants.CENTER);
    //création des menus
    private JMenuBar monMenu = new JMenuBar();
    private JMenu mnuFichier = new JMenu("Fichier");
    private JMenu mnuAide = new JMenu("?");
    private JMenuItem mnuAPropos = new JMenuItem("À propos");
    private JMenu mnuMode = new JMenu("Mode de Jeu");
    private JMenuItem mnuNouvellePartie = new JMenuItem("Nouvelle partie");
    private JMenuItem mnuQuitter = new JMenuItem("Quitter");
    private JMenuItem mnuFormules = new JMenuItem("Formules utiles");
    private JMenuItem mnuReponses = new JMenuItem("Réponses des niveaux");
    private JMenuItem mnuRegles = new JMenuItem("Comment jouer ?");
    private JMenuItem mnuApprentissage = new JMenuItem("Apprentissage");
    private JMenuItem mnuChrono = new JMenuItem("Chrono");
    //création d'un bouton pour vérifier la réponse
    private JButton btnVerifier = new JButton("Verifier");
    //création des composantes du circuit
    private JLabel composantes[] = {
        new JLabel(new Amperemetre("0.4")), new JLabel(new Amperemetre("3")),
        new JLabel(new Ampoule()),
        new JLabel(new Bobine()),
        new JLabel(new Condensateur("2")), new JLabel(new Condensateur("3")), new JLabel(new Condensateur("4")),
        new JLabel(new Condensateur("6")), new JLabel(new Condensateur("10")),
        new JLabel(new InterrupteurO()),
        new JLabel(new InterrupteurF()),
        new JLabel(new Pile("4")), new JLabel(new Pile("4.5")), new JLabel(new Pile("6")), new JLabel(new Pile("8")), new JLabel(new Pile("10")),
        new JLabel(new Pile("12")), new JLabel(new Pile("15")), new JLabel(new Pile("18")), new JLabel(new Pile("36")), new JLabel(new Pile("90")),
        new JLabel(new Pile("120")), new JLabel(new Pile("204")),
        new JLabel(new Voltmetre("1.5")), new JLabel(new Voltmetre("6")),
        new JLabel(new Resistance("1")), new JLabel(new Resistance("2")),
        new JLabel(new Resistance("3")), new JLabel(new Resistance("4")),
        new JLabel(new Resistance("5")), new JLabel(new Resistance("6")),
        new JLabel(new Resistance("7")), new JLabel(new Resistance("8")),
        new JLabel(new Resistance("10")), new JLabel(new Resistance("11")),
        new JLabel(new Resistance("2K")), new JLabel(new Resistance("3K")),
        new JLabel(new Resistance("4K")), new JLabel(new Resistance("7K")),
        new JLabel(new Resistance("10K")), new JLabel(new Resistance("50K")),
        new JLabel(new Resistance("100K")),
        new JLabel(new Resistance("10", true)), new JLabel(new Resistance("11", true)),
        new JLabel(new Resistance("2K", true)), new JLabel(new Resistance("3K", true)),
        new JLabel(new Resistance("4K", true)), new JLabel(new Resistance("7K", true)),
        new JLabel(new Resistance("10K", true)), new JLabel(new Resistance("50K", true)),
        new JLabel(new Resistance("100K", true))
    };

    /**
     * Chronometre mis en action
     */
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //augmente de 1 à chaque 1000 milisecondes
            chrono++;
            Date temps = new Date(chrono * 1000);
            SimpleDateFormat ft = new SimpleDateFormat("mm:ss");
            lblChrono.setText("     " + ft.format(temps) + "     ");
        }

    });

    /**
     * constructeur de la fenetre
     */
    public Fenetre() {
        //titre de la fenetre
        setTitle("circuitAEC");
        //fermer le programme en faisant X
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set la taille de la fenetre
        setSize(900, 850);
        //appeler la méthode pour setter la fenetre
        settingWindow();
        //appeler la méthode pour initialiser le menu
        initMenu();
        //empêcher l'utilisateur d'agrandir la fenetre
        setResizable(false);
        //mettre la fenetre visible
        this.setVisible(true);
        //appeler la méthode qui créer les niveaux
        creerNiveaux();
    }

    /**
     * Configuration de la fenêtre de jeu avec les Jcomposantes
     */
    public void settingWindow() {
        add(pnlPrincipal);
        //positionnement du pnl jeu à l'Est du pnl principal
        pnlPrincipal.add(pnlJeu, BorderLayout.EAST);
        //"                        "à l'Ouest"             "
        pnlPrincipal.add(pnlCarre, BorderLayout.WEST);

        pnlCarre.setBackground(Color.WHITE);

        pnlJeu.setPreferredSize(new Dimension(650, 900));
        //changement de couleur du background en blanc
        pnlJeu.setBackground(Color.WHITE);
        //positionnement du pnl niveau au Nord du pnlJeu
        pnlJeu.add(pnlNiveau, BorderLayout.NORTH);
        //positionnement du pnlChrono au Sud du pnlJeu
        pnlJeu.add(pnlChronoPoint, BorderLayout.SOUTH);

        pnlNiveau.add(lblNiveau, BorderLayout.NORTH);
        pnlNiveau.add(lblEnoncer, BorderLayout.SOUTH);
        //empêcher l'utilisateur d'écrire dans la zone d'énoncer
        lblEnoncer.setEditable(false);
        pnlNiveau.setBackground(Color.WHITE);
        //positionnement
        pnlChronoPoint.add(lblChrono, BorderLayout.WEST);
        //positionnement
        pnlChronoPoint.add(lblPoint, BorderLayout.CENTER);
        //positionnement
        pnlChronoPoint.add(btnVerifier, BorderLayout.EAST);
        //changement de couleur en blanc
        pnlChronoPoint.setBackground(Color.WHITE);
        //ajouter chaque composante avec un for each
        for (JLabel composante : composantes) {
            pnlCarre.add(composante);
        }
        //drag and drop
        MouseListener listener = new DragMouseAdapter();
        for (JLabel composante : composantes) {
            composante.addMouseListener(listener);
            composante.setTransferHandler(new TransferHandler("icon"));
            composante.setDropTarget(null);
        }
        //création d'un curseur
        JScrollPane scrollPane = new JScrollPane(pnlCarre);
        pnlPrincipal.add(scrollPane);
        //action du bouton de vérification
        btnVerifier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //vérification des élément 
                if (backgrounds[niveauActuel].verifier() == true) {
                    bonneReponse();
                } else {
                    mauvaiseReponse();
                }
            }
        });
    }

    /**
     * Message affiché lorsque la réponse est bonne
     */
    private void bonneReponse() {
        //afficher message
        JOptionPane.showMessageDialog(null, "Bravo!!!  Bonne reponse!");
        //réinitialise
        pnlJeu.remove(backgrounds[niveauActuel]);
        //changment vers niveau supérieur

        if (niveauActuel == 9) {
            timer.stop();
            int dialogBouton = JOptionPane.YES_NO_OPTION;
            int reponse = JOptionPane.showConfirmDialog(null, "Votre pointage est de "
                    + nombrePoint + "et votre temps est de " + chrono + ". Voulez vous quitter?", "Question", dialogBouton);
            if (reponse == JOptionPane.NO_OPTION) {

            } else if (reponse == JOptionPane.YES_OPTION) {
                //le programme se ferme
                System.exit(0);
            }

        } else {
            niveauActuel++;
        }
        nombrePoint += 10;
        lblPoint.setText(nombrePoint + " points     ");
        pnlChronoPoint.revalidate();
        pnlChronoPoint.repaint();
        changerDeNiveau();
    }

    /**
     * Message affiché lorsque la réponse est mauvaise
     */
    private void mauvaiseReponse() {
        JOptionPane.showMessageDialog(null, "Essaie encore!");
        nombrePoint -= 2;
        lblPoint.setText(nombrePoint + " points     ");
        pnlChronoPoint.revalidate();
        pnlChronoPoint.repaint();
    }

    /**
     * création des menus du jeu
     */
    private void initMenu() {

        monMenu.add(mnuFichier);
        monMenu.add(mnuAide);
        monMenu.add(mnuMode);

        mnuFichier.add(mnuNouvellePartie);
        //ajouter séparateur
        mnuFichier.addSeparator();
        mnuFichier.add(mnuAPropos);
        //ajouter séparateur
        mnuFichier.addSeparator();
        mnuFichier.add(mnuQuitter);

        mnuAide.add(mnuFormules);
        //ajouter séparateur
        mnuAide.addSeparator();
        mnuAide.add(mnuReponses);
        //ajouter séparateur
        mnuAide.addSeparator();
        mnuAide.add(mnuRegles);

        mnuMode.add(mnuApprentissage);
        //ajouter séparateur
        mnuMode.addSeparator();
        mnuMode.add(mnuChrono);
        //setter le menus avec les menus précédents
        setJMenuBar(monMenu);

        listenersMenus();
    }

    /**
     * Action créée en cliquant sur les éléments du menu
     */
    public void listenersMenus() {
        //faire une nouvelle partie
        mnuNouvellePartie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (niveauActuel != -1) {
                    pnlJeu.remove(backgrounds[niveauActuel]);
                    reset();
                }
                //création des niveaux
                creerNiveaux();

            }
        });
        //Afficher le nom des créateur et la date de finalisation
        mnuAPropos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Étienne Gagné,Audrey Lupien et Cloé Lachance, créé le 24 mai");
            }
        });
        //sert a quitter la partie
        mnuQuitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //demande de confirmer la volonté de quitter le jeu
                int dialogBouton = JOptionPane.YES_NO_OPTION;
                int reponse = JOptionPane.showConfirmDialog(null, "Voulez-vous "
                        + "vraiment quitter ce merveilleux jeux?", "Question", dialogBouton);
                if (reponse == JOptionPane.NO_OPTION) {

                } else if (reponse == JOptionPane.YES_OPTION) {
                    //le programme se ferme
                    System.exit(0);
                }
            }
        });
        //afficher une feuille de formule en pdf
        mnuFormules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Runtime runtime = Runtime.getRuntime();

                // Utilise le web browser par default pour ouvrir le pdf.
                if (Desktop.isDesktopSupported()) {
                    try {
                        //recherche de la feuille de formule
                        Desktop.getDesktop().browse(new URI("aide-memoire_final.pdf"));
                    } catch (URISyntaxException ex) {
                        Logger.getLogger(Fenetre.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Fenetre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        });
        //affiche la réponse de chaque niveau à l'utilisateur
        mnuReponses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //tableau contenant les niveaux
                Integer[] niveaux = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                //demande le niveau afin d'afficher la réponse
                int input = (int) JOptionPane.showInputDialog(null,
                        "De quel niveau voulez-vous voir la réponse ?", "Réponses",
                        JOptionPane.QUESTION_MESSAGE, null, niveaux, niveaux[0]);
                String rep = null;
                switch (input) {
                    case 1:
                        rep = "6µF";
                        break;
                    case 2:
                        rep = "A)3Ω  \n" + "B)8V";
                        break;
                    case 3:
                        rep = "A)R1=8Ω   R2=11Ω \n" + "B)14Ω";
                        break;
                    case 4:
                        rep = "A)ampèremètre du haut=0,4A \n" + "B)voltmètre du bas=1,5V";
                        break;
                    case 5:
                        rep = "A)11Ω \n" + "B)Haut=18V Bas=36V";
                        break;
                    case 6:
                        rep = "A)R du haut=50kΩ   R du bas=100kΩ \n" + "B)C=10µF";
                        break;
                    case 7:
                        rep = "A)R=2kΩ \n" + "B)ɛ=15V";
                        break;
                    case 8:
                        rep = "A)C=2µF \n" + "B)ɛ=120V \n" + "C)R=2kΩ";
                        break;
                    case 9:
                        rep = "A)7kΩ \n" + "B)3µF \n" + "C)ɛ=204V";
                        break;
                }
                JOptionPane.showMessageDialog(null, rep);

            }
        });
        //afficher les règle du jeu à l'utilisateur
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
        //demande le niveau voulu à l'utilisateur
        mnuApprentissage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //tableau contenant les niveaux
                Integer[] niveaux = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                //affiche le choix de niveaux
                int input = (int) JOptionPane.showInputDialog(null,
                        "Choisissez un niveau : ", "Niveaux",
                        JOptionPane.QUESTION_MESSAGE, null, niveaux, niveaux[0]);
                //regarde si l'utilisateur n'est pas déjà à ce niveau
                if (niveauActuel != -1) {
                    //enlever le backGround actuel 
                    pnlJeu.remove(backgrounds[niveauActuel]);
                }
                niveauActuel = input - 1;
                //change niveau
                changerDeNiveau();
            }
        });
        //Départ du chronomètre et les niveaux en ordre
        mnuChrono.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                timer.start();
                if (niveauActuel != -1) {
                    //enlever le backGround actuel 
                    pnlJeu.remove(backgrounds[niveauActuel]);
                }
                niveauActuel = 0;
                changerDeNiveau();
            }

        });

    }

    /**
     * Changement de niveau (background, énoncé, niveau)
     */
    private void changerDeNiveau() {
        if (niveauActuel <= 8) {
            //changment de background
            pnlJeu.add(backgrounds[niveauActuel], BorderLayout.CENTER);
            //énoncé du problème relié au background
            probleme = backgrounds[niveauActuel].toString();
            lblEnoncer.setText("Énoncé du problème : " + "\n" + probleme);
            //changement de ligne dans l'énoncé
            lblEnoncer.setLineWrap(true);
            //changment du niveau affiché
            lblNiveau.setText("Niveau : " + (niveauActuel + 1) + "\n");
            //réinitialiser le background
            pnlJeu.revalidate();
            pnlJeu.repaint();
        } else {
            int dialogBouton = JOptionPane.YES_NO_OPTION;
            int reponse = JOptionPane.showConfirmDialog(null, "Bravo! Vous avex fini le jeu! \n Votre pointage: "
                    + nombrePoint + " \n"
                    + " Votre temps: " + chrono + "\n Voulez vous quitter?", "Question", dialogBouton);
            if (reponse == JOptionPane.NO_OPTION) {
                //réinitialiser le tout
                reset();

            } else if (reponse == JOptionPane.YES_OPTION) {
                //le programme se ferme
                System.exit(0);
            }
        }
    }

    /**
     * création des backgrounds
     */
    private void creerNiveaux() {
        backgrounds = new Background[]{new BackGround419(), new BackGround619(),
            new BackGround621(), new BackGround625(),
            new BackGround632(), new BackGround639(),
            new BackGround651(), new BackGround661(),
            new BackGround667()};
    }

    /**
     *
     * @return niveau Actuel
     */
    public int getNombreNiveau() {
        return niveauActuel;
    }

    /**
     *
     * @return nombre de points
     */
    public int getNombrePoint() {
        return nombrePoint;
    }
/**
 * remet tout à 0 comme à l'ouverture du projet
 */
    public void reset() {
               
        timer.stop();

        nombrePoint = 0;
        chrono = 0;
        lblChrono.setText("     00:00      ");
        lblPoint.setText(nombrePoint + " points     ");
        pnlChronoPoint.revalidate();
        pnlChronoPoint.repaint();
        
        probleme = "";
        niveauActuel = -1;
        lblNiveau.setText("Niveau : " + "\n");
        lblEnoncer.setText("Énoncé du problème : " + "\n" + probleme);
        pnlNiveau.revalidate();
        pnlNiveau.repaint();
        
        pnlJeu.revalidate();
        pnlJeu.repaint();
 
    }
}
