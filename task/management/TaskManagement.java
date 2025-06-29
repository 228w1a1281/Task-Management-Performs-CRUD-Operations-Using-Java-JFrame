/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.management;

/**
 *
 * @author HP
 */
public class TaskManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new LoginForm().setVisible(true);
        }
    });
}
    
}
