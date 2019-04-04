/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author mca241
 */
class Hello extends UnicastRemoteObject implements RMI_Interface{
    //its better to throw remote exception while obj is being created
    Hello()throws RemoteException{
    }

    @Override
    public float fahrenheit_to_celsius(float temp) {
        return (((temp-32)*5)/9);
    }
    
}

public class RMI_Server {
    public static void main(String[] args) throws RemoteException {
        Registry registery = LocateRegistry.createRegistry(1099);
        registery.rebind("MyServer", new Hello());
        System.out.println("Successfully Connected");
    }
}
