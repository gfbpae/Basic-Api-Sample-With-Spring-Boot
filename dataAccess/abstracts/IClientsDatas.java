package gfbpae.BankWebSite.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gfbpae.BankWebSite.entities.concretes.ClientsDB;

// To indicates that the class is a DAO(Data Access Object) object
@Repository

// JpaRepository provides functions that are used for database query
public interface IClientsDatas extends JpaRepository<ClientsDB,Integer> {

	List<ClientsDB> findAll();
	ClientsDB findByNationalID(String name);

}
