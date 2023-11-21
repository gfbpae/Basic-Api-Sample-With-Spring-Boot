package gfbpae.BankWebSite.entities.concretes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Open 'Clients' table from database
@Table(name="Clients")
// Getter methods
@Getter
// Setter Methods
@Setter
// Create a constructor that get all parameters
@AllArgsConstructor
// Create a constructor without parameters
@NoArgsConstructor
@Entity
public class ClientsDB {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="password")
	private int password;
	
	@Column(name="name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name="nationalID")
	private String nationalID;
	
	@Column(name="entity")
	private int entity;
	
	@Override
	public String toString()
	{
		return "Client Name ->"+getName()+"| Surname ->"+getSurname()+"| ID Number ->"+getNationalID()+"| Money ->"+getEntity();
	}
}
