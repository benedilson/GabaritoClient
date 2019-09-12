package br.com.infosolo.client;

import java.rmi.RemoteException;

public class RemoteServiceImpl implements IRemoteService { 
    public RemoteServiceImpl(){ 
        super(); 
    } 
    public void startDoing() throws RemoteException { 
    	System.out.println("I'm starting");
    } 
    public void stopDoing() throws RemoteException { 
    	System.out.println("I'm stoping");
    }
}