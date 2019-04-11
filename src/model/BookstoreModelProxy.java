package model;

public class BookstoreModelProxy implements model.BookstoreModel {
  private String _endpoint = null;
  private model.BookstoreModel bookstoreModel = null;
  
  public BookstoreModelProxy() {
    _initBookstoreModelProxy();
  }
  
  public BookstoreModelProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookstoreModelProxy();
  }
  
  private void _initBookstoreModelProxy() {
    try {
      bookstoreModel = (new model.BookstoreModelServiceLocator()).getbookstoreModel();
      if (bookstoreModel != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookstoreModel)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookstoreModel)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookstoreModel != null)
      ((javax.xml.rpc.Stub)bookstoreModel)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public model.BookstoreModel getBookstoreModel() {
    if (bookstoreModel == null)
      _initBookstoreModelProxy();
    return bookstoreModel;
  }
  
  public java.lang.String getBYBIDExternal(java.lang.String bid) throws java.rmi.RemoteException{
    if (bookstoreModel == null)
      _initBookstoreModelProxy();
    return bookstoreModel.getBYBIDExternal(bid);
  }
  
  
}