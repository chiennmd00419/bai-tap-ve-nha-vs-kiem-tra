/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author chien
 */
public class From extends JFrame {

    private JMenuBar JmbMenu;
    private JMenu jmStudentManager, jmClassRoom, jmAboutMe;
    private JMenuItem jmiAddStudent, jmiListStudent, jmiAddClass, jmiListClass;

    public From() {
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);

        this.JmbMenu = new JMenuBar();

        this.jmStudentManager = new JMenu("StudentManager");
        this.jmClassRoom = new JMenu("ClassRoom ");
        
        this.jmAboutMe = new JMenu("AboutMe");
        
        
        this.jmiAddStudent = new JMenuItem("AddStudent");
        jmiAddStudent.setActionCommand("add1");
        jmiAddStudent.addActionListener(new ac())
                ;
        this.jmiListStudent = new JMenuItem("ListStudent");
        jmiListStudent.setActionCommand("list1");
        jmiListStudent.addActionListener(new ac());
        
        this.jmiAddClass = new JMenuItem("AddClass");
        jmiAddClass.setActionCommand("add2");
        jmiAddClass.addActionListener(new ac());
        
        this.jmiListClass = new JMenuItem("ListClass");
        jmiListClass.setActionCommand("list2");
        jmiListClass.addActionListener(new ac());

        JmbMenu.add(jmStudentManager);
        JmbMenu.add(jmClassRoom);
        JmbMenu.add(jmAboutMe);

        jmStudentManager.add(jmiAddStudent);
        jmStudentManager.add(jmiListStudent);

        jmClassRoom.add(jmiAddClass);
        jmClassRoom.add(jmiListClass);

        setJMenuBar(JmbMenu);
        this.add(JmbMenu);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class ac implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if ("add1".equals(e.getActionCommand())) {
                JOptionPane.showMessageDialog(JmbMenu, "ok");
            }
            if ("add2".equals(e.getActionCommand())) {
                JOptionPane.showMessageDialog(JmbMenu, "ok");
            }
            if ("list1".equals(e.getActionCommand())) {
                JOptionPane.showMessageDialog(JmbMenu, "ok");
            }
            if ("list2".equals(e.getActionCommand())) {
                JOptionPane.showMessageDialog(JmbMenu, "ok");
            }
        

        }
    }
}
