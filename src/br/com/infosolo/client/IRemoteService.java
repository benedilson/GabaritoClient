package br.com.infosolo.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteService extends Remote { 

    public final String serviceName = "MyRemoteService"; 
    public abstract void startDoing() throws RemoteException; 

    public abstract void stopDoing() throws RemoteException; 
}