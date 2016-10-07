package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class RemoteGreetingImpl extends UnicastRemoteObject implements RemoteGreeting {

	public RemoteGreetingImpl() throws RemoteException {
		super();
		
	}

	public RemoteGreetingImpl(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
		super(port, csf, ssf);
	}

	public RemoteGreetingImpl(int port) throws RemoteException {
		super(port);
	}
	
	public void foo (String s){	
		System.out.println(">>>>> " + s);
		
	}
	
	public String fee(String s) throws RemoteException{
		return "Fee---- "+s;
	}

	
	//pass the copy value or copy of object id
	public String getGreeting(String name, int age) throws RemoteException {
		
		return "Hello "+ name + " Your Age  is " + age;
	}
	
	
}
