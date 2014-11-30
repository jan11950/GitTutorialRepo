package sample;

import java.rmi.RemoteException;

import javax.ejb.EJBLocalObject;

public interface componentInterface extends EJBLocalObject {

	public Integer addition(Integer a, Integer b) throws RemoteException;

	public Double convertFtoC(Double f) throws RemoteException;

	public Double convertCtoF(Double c) throws RemoteException;

}
