package gfbpae.BankWebSite.webApi.abstracs;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import gfbpae.BankWebSite.entities.concretes.ClientsDB;
import gfbpae.BankWebSite.webApi.concretes.registerInput;

public interface IClientsApi {
	ResponseEntity<String> login(Map<String, String> loginInput);
	public ResponseEntity<String> register(registerInput regInput);
	public List<ClientsDB> allClients();
}
