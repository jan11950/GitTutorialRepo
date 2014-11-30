package sampleEntityBean;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.EJBException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.LocalBean;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class DataAccessorBean
 */
@Stateless
@LocalBean
public class DataAccessorBean implements EntityBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> dataStore;

	/**
	 * Default constructor.
	 */
	public DataAccessorBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejbLoad() throws EJBException, RemoteException {
		Path p = FileSystems.getDefault().getPath("DataSource.txt");
		Charset c = Charset.defaultCharset();
		try {
			this.dataStore = Files.readAllLines(p, c);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

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
		Path p = FileSystems.getDefault().getPath("DataSource.txt");
		Charset c = Charset.defaultCharset();
		try {
			Files.write(p, this.dataStore, c);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

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

	public void modifyData(Integer lineNum, String newData) {
		this.dataStore.set(lineNum, newData);
	}

}
