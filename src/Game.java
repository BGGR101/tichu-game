import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class Game {
    private JFrame window;
    private String name;
    private JPanel cardPanel;
    private JPanel northPlayerPanel;
    private JPanel southPlayerPanel;
    private JPanel eastPlayerPanel;
    private JPanel westPlayerPanel;


    public Game(JFrame window, String name) {
        this.window = window;
        this.name = name;
        setupGameUI();
    }

    private void setupGameUI() {
        // Clear current content and set layout to BorderLayout
        window.getContentPane().removeAll();
        window.setLayout(new BorderLayout());

        //Player panels initialization (Positions are from the host's perspective, default Host : South)
        JPanel northPlayerPanel = createPlayerPanel("");
        JPanel southPlayerPanel = createPlayerPanel(name);
        JPanel eastPlayerPanel = createPlayerPanel("");
        JPanel westPlayerPanel = createPlayerPanel("");

        cardPanel = new JPanel();
        cardPanel.setBackground(new Color(80, 80, 80));

        //Set panel sizes
        northPlayerPanel.setPreferredSize(new Dimension(200, 400));
        southPlayerPanel.setPreferredSize(new Dimension(window.getWidth(), 450));
        eastPlayerPanel.setPreferredSize(new Dimension(200, 400));
        westPlayerPanel.setPreferredSize(new Dimension(200, 400));

        // Add panels to window
        window.add(northPlayerPanel, BorderLayout.NORTH);
        window.add(southPlayerPanel, BorderLayout.SOUTH);
        window.add(eastPlayerPanel, BorderLayout.EAST);
        window.add(westPlayerPanel, BorderLayout.WEST);
        window.add(cardPanel, BorderLayout.CENTER);

        window.revalidate();
        window.repaint();
    }

    private JPanel createPlayerPanel(String playerLabel) {
        JPanel playerPanel = new JPanel();
        playerPanel.setBackground(new Color(60, 63, 65));
        playerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        return playerPanel;
    }
}
