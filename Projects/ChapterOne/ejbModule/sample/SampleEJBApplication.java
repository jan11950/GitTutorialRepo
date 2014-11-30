package sample;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJB;
import javax.naming.NamingException;

public class SampleEJBApplication {

	@EJB
	public static void main(String[] args) throws NamingException,
			RemoteException, CreateException {
		// Context initial = new InitialContext();
		// Context enviornment = (Context) initial.lookup("java:comp/env");
		// HomeInterface home = (HomeInterface) initial.lookup("SampleEJBean");
		//
		// SampleEJBean bean = home.create();

		SampleEJBean bean = new SampleEJBean();
		System.out.println(bean.convertCtoF(0.0));

	}

}
