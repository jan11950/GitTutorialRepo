package sample;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface HomeInterface extends EJBHome {

	public SampleEJBean create() throws CreateException, RemoteException;
}
