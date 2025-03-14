/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import javax.swing.*;
import java.awt.*;

class ReportManagementFrame extends JFrame {
    public ReportManagementFrame() {
        setTitle("Generate Reports");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
        JButton btnGenerate = new JButton("Generate Report");
        JButton btnView = new JButton("View Report");
        
        panel.add(btnGenerate);
        panel.add(btnView);
        
        add(panel);
        setVisible(true);
    }
}