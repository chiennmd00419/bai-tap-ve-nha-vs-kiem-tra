/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jtable;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


 
/**
 *
 * @author TUNGDUONG
 */
public class jTtable extends JFrame{
 
    public jTtable() {
 
        String[] titles = new String[]{"id", "name", "classname", "old"};
 
        Object[][] objects = new Object[][]{
            {1, "A", " dvd", 22},
            {2, "B ", " dvdvd", 15},
            {3, "C ", " dvdv", 7}};
        
        JTable table = new JTable(objects, titles);
        
        this.add(new JScrollPane(table));
        this.setTitle("Kênh Lập Trình - Hướng dẫn lập trình Web");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new jTtable().setVisible(true);
    }
 
}

