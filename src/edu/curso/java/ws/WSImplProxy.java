package edu.curso.java.ws;

public class WSImplProxy implements edu.curso.java.ws.WSImpl {
  private String _endpoint = null;
  private edu.curso.java.ws.WSImpl wSImpl = null;
  
  public WSImplProxy() {
    _initWSImplProxy();
  }
  
  public WSImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSImplProxy();
  }
  
  private void _initWSImplProxy() {
    try {
      wSImpl = (new edu.curso.java.ws.WSImplServiceLocator()).getWSImpl();
      if (wSImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSImpl != null)
      ((javax.xml.rpc.Stub)wSImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.curso.java.ws.WSImpl getWSImpl() {
    if (wSImpl == null)
      _initWSImplProxy();
    return wSImpl;
  }
  
  public edu.curso.java.ws.Persona[] recuperarPersonas() throws java.rmi.RemoteException{
    if (wSImpl == null)
      _initWSImplProxy();
    return wSImpl.recuperarPersonas();
  }
  
  public edu.curso.java.ws.Persona recuperarPersonaPorId(int idPersona) throws java.rmi.RemoteException{
    if (wSImpl == null)
      _initWSImplProxy();
    return wSImpl.recuperarPersonaPorId(idPersona);
  }
  
  
}