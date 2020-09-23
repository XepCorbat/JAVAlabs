package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

    class laba4 extends JFrame {
        JLabel resultLabel = new JLabel(" Result: 0 x 0 ");
        JLabel lastScoredLabel = new JLabel(" Last Scored: N/A ");
        JLabel winnerLabel = new JLabel(" Winner: DRAW ");
        JLabel empty = new JLabel("");

        String MadridS = "Real Madrid ";
        String MilanS = "AC Milan ";

        JButton madridButton = new JButton(MadridS);
        JButton milanButton = new JButton(MilanS);

        String lastScored;
        int milanScore;
        int madridScore;

        laba4() {
            super("Real Madrid vs AC Milan");
            setLayout(new GridLayout(3,3));
            add(resultLabel);
            add(empty);
            add(lastScoredLabel);
            add(winnerLabel);

            add(madridButton);
            add(milanButton);
            setSize(350,200);

            setVisible(true);
            milanButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    lastScored = MilanS;
                    milanScore++;
                    UpdateText();
                }
            });
            madridButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    lastScored = MadridS;
                    madridScore++;
                    UpdateText();
                }
            });

        }
        public void UpdateText(){
            if (madridScore > milanScore) winnerLabel.setText(" Winner: " + MadridS); else winnerLabel.setText(" Winner: " + MilanS);
            if (madridScore == milanScore) winnerLabel.setText(" Winner: DRAW" );
            resultLabel.setText(" Result: " + madridScore + " x " + milanScore);
            lastScoredLabel.setText(" Last Scored: " + lastScored);
        }
    }

