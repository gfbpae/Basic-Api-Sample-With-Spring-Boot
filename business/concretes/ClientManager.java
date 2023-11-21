package gfbpae.BankWebSite.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gfbpae.BankWebSite.business.abstracts.IClientManager;
import gfbpae.BankWebSite.dataAccess.abstracts.IClientsDatas;
import gfbpae.BankWebSite.entities.concretes.ClientsDB;
import lombok.Getter;
import lombok.Setter;

// Indicate the business layer
@Service

@Setter
@Getter
public class ClientManager implements IClientManager {
	 
	private IClientsDatas clientsDatas;
	
	@Autowired
	public ClientManager(IClientsDatas clientsDatas) 
	{
		this.clientsDatas = clientsDatas;
	}
	// It returns all data that found in database
	public List<ClientsDB> getAll()
	{
		return getClientsDatas().findAll();
	}
	// To check input data that are coming from login operation with function that is provided by JPA	
	public boolean checkLogin(String nID,int psw)
	{
		if(getClientsDatas().findByNationalID(nID).getPassword() == psw) return true;
		else return false;
	}
	// To save data that is coming from registration operation with function that is provided by JPA
	public void saveUser(ClientsDB user) {
		getClientsDatas().save(user);
	}
	
}
