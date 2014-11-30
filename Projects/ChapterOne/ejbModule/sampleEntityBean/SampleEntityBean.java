package sampleEntityBean;

import java.rmi.RemoteException;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJBException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.LocalBean;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
 * Session Bean implementation class SampleEntityBean
 */
@Stateless
@LocalBean
@DeclareRoles(value = { "admin", "guest" })
public class SampleEntityBean implements EntityBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "")
	@Column(name = "")
	Integer key;

	@RolesAllowed(value = { "admin", "guest" })
	public Integer getID() {
		return this.key;
	}

	/**
	 * Default constructor.
	 */
	public SampleEntityBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejbLoad() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejbRemove() throws RemoveException, EJBException,
			RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejbStore() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEntityContext(EntityContext arg0) throws EJBException,
			RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void unsetEntityContext() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

}
