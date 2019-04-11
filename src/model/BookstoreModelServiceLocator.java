/**
 * BookstoreModelServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package model;

public class BookstoreModelServiceLocator extends org.apache.axis.client.Service implements model.BookstoreModelService {

    public BookstoreModelServiceLocator() {
    }


    public BookstoreModelServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BookstoreModelServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for bookstoreModel
    private java.lang.String bookstoreModel_address = "http://localhost:8080/%28Project-Bookstore%29/services/bookstoreModel";

    public java.lang.String getbookstoreModelAddress() {
        return bookstoreModel_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String bookstoreModelWSDDServiceName = "bookstoreModel";

    public java.lang.String getbookstoreModelWSDDServiceName() {
        return bookstoreModelWSDDServiceName;
    }

    public void setbookstoreModelWSDDServiceName(java.lang.String name) {
        bookstoreModelWSDDServiceName = name;
    }

    public model.BookstoreModel getbookstoreModel() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(bookstoreModel_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getbookstoreModel(endpoint);
    }

    public model.BookstoreModel getbookstoreModel(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            model.BookstoreModelSoapBindingStub _stub = new model.BookstoreModelSoapBindingStub(portAddress, this);
            _stub.setPortName(getbookstoreModelWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setbookstoreModelEndpointAddress(java.lang.String address) {
        bookstoreModel_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (model.BookstoreModel.class.isAssignableFrom(serviceEndpointInterface)) {
                model.BookstoreModelSoapBindingStub _stub = new model.BookstoreModelSoapBindingStub(new java.net.URL(bookstoreModel_address), this);
                _stub.setPortName(getbookstoreModelWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("bookstoreModel".equals(inputPortName)) {
            return getbookstoreModel();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://model", "bookstoreModelService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://model", "bookstoreModel"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("bookstoreModel".equals(portName)) {
            setbookstoreModelEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
