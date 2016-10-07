package ie.gmit.sw;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;

public class Servant {
	
	
	public static void main(String[] args) throws Throwable {
		
		//Start the registry on default port
		LocateRegistry.createRegistry(1099);//the first 1024 port require root access
		
		///intantitate the remote object
		RemoteGreeting greeting = new RemoteGreetingImpl();
		
		Naming.bind("HowDay", greeting);
		System.out.println("Server Ready......");
		
	}

}
