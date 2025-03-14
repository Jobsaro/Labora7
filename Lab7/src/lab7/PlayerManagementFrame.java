/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import javax.swing.*;
import java.awt.*;

class PlayerManagementFrame extends JFrame {
    public PlayerManagementFrame() {
        setTitle("Manage Players");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        JButton btnAdd = new JButton("Add Player");
        JButton btnEdit = new JButton("Edit Player");
        JButton btnDelete = new JButton("Delete Player");
        JButton btnList = new JButton("List Players");
        
        panel.add(btnAdd);
        panel.add(btnEdit);
        panel.add(btnDelete);
        panel.add(btnList);
        
        add(panel);
        setVisible(true);
    }
}