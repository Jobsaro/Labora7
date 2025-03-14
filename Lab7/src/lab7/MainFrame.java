/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import javax.swing.*;
import java.awt.*;

class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Steam Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        JButton btnGames = new JButton("Manage Games");
        JButton btnPlayers = new JButton("Manage Players");
        JButton btnDownloads = new JButton("View Downloads");
        JButton btnReports = new JButton("Generate Reports");

        panel.add(btnGames);
        panel.add(btnPlayers);
        panel.add(btnDownloads);
        panel.add(btnReports);
        
        add(panel);
        setVisible(true);
    }
}
