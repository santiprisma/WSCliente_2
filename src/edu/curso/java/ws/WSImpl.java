/**
 * WSImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.curso.java.ws;

public interface WSImpl extends java.rmi.Remote {
    public edu.curso.java.ws.Persona[] recuperarPersonas() throws java.rmi.RemoteException;
    public edu.curso.java.ws.Persona recuperarPersonaPorId(int idPersona) throws java.rmi.RemoteException;
}
