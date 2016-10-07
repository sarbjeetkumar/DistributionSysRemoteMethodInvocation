package ie.gmit.sw;

import java.rmi.Naming;

public class Client {
	
	public static void main(String[] args)  throws Throwable{
		/*
		 * Internet Protocal : Service end Endpoint
		 * 
		 * <protocol>://ip:port/path/to/resource
		 * 
		 * */
		
		//Get a handle on the remote object
		RemoteGreeting rg = (RemoteGreeting) Naming.lookup("rmi://127.0.0.1:1099/Howday");
		
		//make the remote invocation same as local invocation
		String greeting =  rg.getGreeting("Sarab", 27);//called local remote transparency
		System.out.println(greeting);
		
	}

}
