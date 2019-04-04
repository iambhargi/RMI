/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 *
 * @author mca241
 */
public class RMI_Client {
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        RMI_Interface r = (RMI_Interface)Naming.lookup("//localhost/MyServer");
        //System.out.println(r.hello("Bhargav Patel"));
        
        String no=JOptionPane.showInputDialog("Enter Tempreture In Fahrenheit");
        float response=r.fahrenheit_to_celsius(Float.parseFloat(no));
        JOptionPane.showMessageDialog(null, response+" Celsius");
        
    }
}
