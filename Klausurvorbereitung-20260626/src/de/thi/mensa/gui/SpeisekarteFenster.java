package de.thi.mensa.gui;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import de.thi.mensa.modell.Gericht;

/**
 * Eine einfache Speisekarten-Anzeige.
 *
 * Thema: GUI-Programmierung mit Swing per KOMPOSITION (nicht Vererbung):
 * Diese Klasse erbt NICHT von JFrame, sondern hält ein JFrame als Feld.
 * (Kurskonvention, vgl. Widget-Hierarchie Vorlesung-20260602.)
 */
public class SpeisekarteFenster {

    private JFrame fenster;

    public SpeisekarteFenster(ArrayList<Gericht> speisekarte) {
        // Komposition: das Fenster ist ein Feld, keine Oberklasse.
        fenster = new JFrame("Mensa – Speisekarte");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 5, 5));

        for (Gericht g : speisekarte) {
            // TODO (Thema GUI): Erzeuge für jedes Gericht ein JLabel mit dem
            // Text aus g.toString() und füge es dem panel hinzu (panel.add(...)).

        }

        fenster.add(panel);
        fenster.setSize(400, 300);
    }

    public void anzeigen() {
        fenster.setVisible(true);
    }
}
