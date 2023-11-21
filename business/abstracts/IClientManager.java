package gfbpae.BankWebSite.business.abstracts;

import java.util.List;

import gfbpae.BankWebSite.entities.concretes.ClientsDB;


// Client Manager interface
public interface IClientManager {
	List<ClientsDB> getAll();
	boolean checkLogin(String uName, int psw);
	void saveUser(ClientsDB user);
}
