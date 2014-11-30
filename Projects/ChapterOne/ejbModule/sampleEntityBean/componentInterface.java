package sampleEntityBean;

import java.rmi.RemoteException;

import javax.ejb.EJBLocalObject;

public interface componentInterface extends EJBLocalObject {

	public Integer doCalculation(Integer inputs) throws RemoteException;

}
