package Vue;

import java.awt.BorderLayout;
import java.awt.Button;
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
 *
 *
 */
public class Fenetre extends JFrame {

    private int nombrePoint = 0;
    private long chrono = 0;
    private String probleme = "";

    private Background backgrounds[];
    private int niveauActuel = -1;

    private JPanel pnlPrincipal = new JPanel(new BorderLayout());
    private JPanel pnlCarre = new JPanel(new GridLayout(50, 1));
    private JPanel pnlJeu = new JPanel(new BorderLayout());

    private JPanel pnlNiveau = new JPanel(new BorderLayout());
    private JPanel pnlChronoPoint = new JPanel(new BorderLayout());

    private JLabel lblNiveau = new JLabel("Niveau : " + "\n");
    private JTextArea lblEnoncer = new JTextArea();

    private JLabel lblChrono = new JLabel("     00:00      ");
    private JLabel lblPoint = new JLabel(nombrePoint + " points     ", SwingConstants.CENTER);

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
    
    private JButton btnVerifier = new JButton("V�rifier");

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
    private Pile pile4 = new Pile(1);
    private Pile pile6 = new Pile(1, 1);
    private Pile pile8 = new Pile(1, 1, 1);
    private Pile pile10 = new Pile(1, 1, 1, 1);
    private Pile pile12 = new Pile(1, 1, 1, 1, 1);
    private Pile pile18 = new Pile(1, 1, 1, 1, 1, 1);
    private Pile pile36 = new Pile(1, 1, 1, 1, 1, 1, 1);
    private Pile pile90 = new Pile(1, 1, 1, 1, 1, 1, 1, 1);
    private Pile pile120 = new Pile(1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Pile pile204 = new Pile(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

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
        new JLabel(pile45), new JLabel(pile4), new JLabel(pile6), new JLabel(pile8), new JLabel(pile10),
        new JLabel(pile12), new JLabel(pile18), new JLabel(pile36), new JLabel(pile90),
        new JLabel(pile120), new JLabel(pile204),
        new JLabel(voltmetre15), new JLabel(voltmetre6),
        new JLabel(new Resistance("1")), new JLabel(new Resistance("2")),
        new JLabel(new Resistance("2K")), new JLabel(new Resistance("3")), new JLabel(new Resistance("3K")),
        new JLabel(new Resistance("4")), new JLabel(new Resistance("4K")), new JLabel(new Resistance("5")),
        new JLabel(new Resistance("6")), new JLabel(new Resistance("7")), new JLabel(new Resistance("7K")),
        new JLabel(new Resistance("8")), new JLabel(new Resistance("10")), new JLabel(new Resistance("10K")),
        new JLabel(new Resistance("100K")),
        new JLabel(new Resistance("11")), new JLabel(new Resistance("50K")),
        new JLabel(new Resistance("2K", true)),new JLabel(new Resistance("3K", true)),
        new JLabel(new Resistance("4K", true)), new JLabel(new Resistance("7K", true)),
        new JLabel(new Resistance("10K", true)), new JLabel(new Resistance("10", true)),
        new JLabel(new Resistance("11", true)),new JLabel(new Resistance("50K", true)), 
        new JLabel(new Resistance("100K", true))
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

    public Fenetre() {

        setTitle("circuitAEC");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 850);

        settingWindow();

        initMenu();

        setResizable(false);

        this.setVisible(true);

        creerNiveaux();
    }

    /**
     *
     */
    public void settingWindow() {
        add(pnlPrincipal);
        pnlPrincipal.add(pnlJeu, BorderLayout.EAST);
        pnlPrincipal.add(pnlCarre, BorderLayout.WEST);

        pnlCarre.setBackground(Color.WHITE);

        pnlJeu.setPreferredSize(new Dimension(650, 900));
        pnlJeu.setBackground(Color.WHITE);
        pnlJeu.add(pnlNiveau, BorderLayout.NORTH);
        pnlJeu.add(pnlChronoPoint, BorderLayout.SOUTH);

        pnlNiveau.add(lblNiveau, BorderLayout.NORTH);
        pnlNiveau.add(lblEnoncer, BorderLayout.SOUTH);
        lblEnoncer.setEditable(false);
        pnlNiveau.setBackground(Color.WHITE);

        pnlChronoPoint.add(lblChrono, BorderLayout.WEST);
        pnlChronoPoint.add(lblPoint, BorderLayout.CENTER);
        pnlChronoPoint.add(btnVerifier, BorderLayout.EAST);
        pnlChronoPoint.setBackground(Color.WHITE);

        for (JLabel composante : composantes) {
            pnlCarre.add(composante);
        }

        MouseListener listener = new DragMouseAdapter();
        for (JLabel composante : composantes) {
            composante.addMouseListener(listener);
            composante.setTransferHandler(new TransferHandler("icon"));
            composante.setDropTarget(null);
        }

        JScrollPane scrollPane = new JScrollPane(pnlCarre);
        pnlPrincipal.add(scrollPane);
        
        btnVerifier.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (backgrounds[niveauActuel].verifier() == true) {
					bonneReponse();
				} else {
					mauvaiseReponse();
				}
			}
		});
    }
    
    private void bonneReponse() {
    	JOptionPane.showMessageDialog(null, "Bravo!!!  Bonne reponse!");
    	pnlJeu.remove(backgrounds[niveauActuel]);
    	niveauActuel++;
    	changerDeNiveau();
    }
    
    private void mauvaiseReponse() {
    	JOptionPane.showMessageDialog(null, "Essaie encore!");
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

        setJMenuBar(monMenu);

        listenersMenus();
    }

    /**
     *
     */
    public void listenersMenus() {
        mnuNouvellePartie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (niveauActuel != -1) {
                    pnlJeu.remove(backgrounds[niveauActuel]);
                    pnlJeu.revalidate();
                    pnlJeu.repaint();
                    niveauActuel = -1;
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
                Integer[] niveaux = {1, 2, 3, 4, 5, 6, 7, 8, 9};
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

                if (niveauActuel != -1) {
                    pnlJeu.remove(backgrounds[niveauActuel]);
                }
                niveauActuel = input - 1;
                changerDeNiveau();
            }
        });

        mnuChrono.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                timer.start();
            }

        });

    }
    
    private void changerDeNiveau() {
        pnlJeu.add(backgrounds[niveauActuel], BorderLayout.CENTER);
        probleme = backgrounds[niveauActuel].toString();
        lblEnoncer.setText("Énoncé du problème : " + "\n" + probleme);
        lblEnoncer.setLineWrap(true);
        lblNiveau.setText("Niveau : " + (niveauActuel + 1) + "\n");

        pnlJeu.revalidate();
        pnlJeu.repaint();	
    }

    private void creerNiveaux() {
        backgrounds = new Background[]{new BackGround419(), new BackGround619(),
            new BackGround621(), new BackGround625(),
            new BackGround632(), new BackGround639(),
            new BackGround651(), new BackGround661(),
            new BackGround667()};
    }

    /**
     *
     * @return
     */
    public int getNombreNiveau() {
        return niveauActuel;
    }

    /**
     *
     * @return
     */
    public int getNombrePoint() {
        return nombrePoint;
    }

}
