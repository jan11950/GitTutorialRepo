package sample;

import java.rmi.RemoteException;

import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.EJBException;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class SampleEJBean
 */
@Stateless
@LocalBean
@AccessTimeout(value = 100)
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
// Bean managed concurrency
public class SampleEJBean implements SessionBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public SampleEJBean() {
		// TODO Auto-generated constructor stub
	}

	@Lock(LockType.WRITE)
	public Integer addition(Integer a, Integer b) {
		return a + b;
	}

	public Double convertFtoC(Double f) {
		return (f - 32) / 1.8;
	}

	public Double convertCtoF(Double c) {
		return (c * 1.8) + 32.0;
	}

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSessionContext(SessionContext arg0) throws EJBException,
			RemoteException {
		// TODO Auto-generated method stub

	}

}
