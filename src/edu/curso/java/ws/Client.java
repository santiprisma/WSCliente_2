package edu.curso.java.ws;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

public class Client {
	public static void main(String[] args) {
		WSImplServiceLocator service = new WSImplServiceLocator();
		
		try {
			WSImpl ejemploWebService = service.getWSImpl();
			Persona p;
			try {
				p = ejemploWebService.recuperarPersonaPorId(1);
				System.out.println("Persona recupearada: " + p.getNombre() + " " + p.getApellido());
				
				Persona personas[] = ejemploWebService.recuperarPersonas();
				for (Persona persona: personas) {
					System.out.println("Persona recupearada: " + persona.getNombre() + " " + persona.getApellido());
				}
				
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
