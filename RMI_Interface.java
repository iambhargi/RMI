/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author mca241
 */
public interface RMI_Interface extends Remote{
    //various method declartaion to call remotely.
    public float fahrenheit_to_celsius(float temp)throws RemoteException;
}
