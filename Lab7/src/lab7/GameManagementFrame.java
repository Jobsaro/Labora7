/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import javax.swing.*;
import java.awt.*;

class GameManagementFrame extends JFrame {
    public GameManagementFrame() {
        setTitle("Manage Games");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        JButton btnAdd = new JButton("Add Game");
        JButton btnEdit = new JButton("Edit Game");
        JButton btnDelete = new JButton("Delete Game");
        JButton btnList = new JButton("List Games");
        
        panel.add(btnAdd);
        panel.add(btnEdit);
        panel.add(btnDelete);
        panel.add(btnList);
        
        add(panel);
        setVisible(true);
    }
}