/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import javax.swing.*;
import java.awt.*;

class DownloadManagementFrame extends JFrame {
    public DownloadManagementFrame() {
        setTitle("View Downloads");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new BorderLayout());
        JTextArea txtDownloads = new JTextArea("List of Downloads");
        txtDownloads.setEditable(false);
        panel.add(new JScrollPane(txtDownloads), BorderLayout.CENTER);
        
        add(panel);
        setVisible(true);
    }
}