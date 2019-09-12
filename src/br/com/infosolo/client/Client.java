package br.com.infosolo.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Client {

	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry("//localhost/servico", 1010);
			IRemoteService serv = (IRemoteService) registry.lookup(IRemoteService.serviceName);
			// Registry registry = LocateRegistry.getRegistry("");
			//Gabarito stub = (Gabarito) Naming.lookup("//localhost/servico");
			serv.startDoing();
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}

}
