package gfbpae.BankWebSite.webApi.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gfbpae.BankWebSite.business.concretes.ClientManager;
import gfbpae.BankWebSite.entities.concretes.ClientsDB;
import gfbpae.BankWebSite.webApi.abstracs.IClientsApi;
import lombok.Getter;
import lombok.Setter;

// To indicates being controller of RESTful services for this class
@RestController

@Setter
@Getter

// It adds an endpoint to api path for specify access path
@RequestMapping("/bank")
public class ClientsApi implements IClientsApi {
	
	@Autowired
	ClientManager clientManager;
	
	
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> loginInput) {

    	if(getClientManager().checkLogin(loginInput.get("username"),Integer.parseInt(loginInput.get("password"))))
        return new ResponseEntity<>("{\"success\": true}", HttpStatus.OK);
    	else return new ResponseEntity<>("{\"wrong\": false}", HttpStatus.OK);
    }
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody registerInput regInput) 
	{
		ClientsDB user=new ClientsDB();
		user.setName(regInput.getName());
		user.setSurname(regInput.getSurname());
		user.setNationalID(regInput.getNationalId());
		user.setPassword(Integer.parseInt(regInput.getPassword()));
		getClientManager().saveUser(user);
		return new ResponseEntity<>("{\"success\": true}", HttpStatus.OK);
 	}
	@GetMapping("/all")
	public List<ClientsDB> allClients()
	{
		return clientManager.getAll();
	}
	

	
}
