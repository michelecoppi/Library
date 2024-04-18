package model;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;

public class TextDisplay {
    private JFrame frame;
    

    public TextDisplay() {
        frame = new JFrame("Text Display");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        ((JComponent) frame.getContentPane()).setBorder(new EmptyBorder(10, 0, 0, 0)); 
        frame.setVisible(true);
    }

    public void addText(Text text) {
        JPanel textPanel = new JPanel(new GridBagLayout());
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS)); 
        textPanel.setBorder(BorderFactory.createLineBorder(text.getCoverColor(), 2));
    
        JLabel titleLabel = new JLabel("Title: " + text.getTitle());
        JLabel genreLabel = new JLabel("Genre: " + text.getGenre().name());
        JLabel pagesLabel = new JLabel("Pages: " + text.getNumPages());
      
    
        textPanel.add(titleLabel);
        textPanel.add(genreLabel);
        textPanel.add(pagesLabel);

    
        frame.add(textPanel);
        frame.add(Box.createVerticalStrut(20)); 
        frame.revalidate();
    }
}
