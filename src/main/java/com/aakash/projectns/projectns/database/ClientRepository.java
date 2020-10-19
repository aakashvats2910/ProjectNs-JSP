package com.aakash.projectns.projectns.database;

import com.aakash.projectns.projectns.entity.ClientDatabaseEntity;
import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ClientRepository extends CrudRepository<ClientDatabaseEntity, Integer> {

}
