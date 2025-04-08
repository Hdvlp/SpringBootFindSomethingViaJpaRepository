package com.findsomething.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.findsomething.demo.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
    User findByUsername(String username); // builds
    User findByLastname(String lastname); // builds
    User findFirstOrderByUsername(String username); // builds
    User findFirstOrderByLastname(String username); // builds

    User findFirstByOrderByUsernameAsc(); // builds
    User findFirstByOrderByLastnameAsc(); // builds
    User findFirstByOrderByFirstnameAsc(); // builds

    User findFirstByLastnameOrderByUsernameAsc(String lastname); // builds
    User findFirstByLastnameOrderByLastnameAsc(String lastname); // builds
    User findFirstByLastnameOrderByFirstnameAsc(String lastname); // builds
    User findFirstByLastnameOrderByIdAsc(String lastname); // builds

    User findFirstByUsernameOrderByUsernameAsc(String username); // builds
    User findFirstByUsernameOrderByUsername(String username); // builds
    User findFirstByUsernameOrderByUsernameDesc(String username); // builds

    User findFirstByOrderByUsername(String username); // fails to build
        // Could not create query for public abstract com.findsomething.demo.model.User 
        // com.findsomething.demo.repo.UserRepo.findFirstByOrderByUsername(java.lang.String); 
        // Reason: Failed to create query for method public abstract com.findsomething.demo.model.User 
        // com.findsomething.demo.repo.UserRepo.findFirstByOrderByUsername(java.lang.String); 
        // At least 1 parameter(s) provided but only 0 parameter(s) present in query


    
    User findFirstByOrderByUsernameAsc(String username); // fails to build
        // Could not create query for public abstract com.findsomething.demo.model.User 
        // com.findsomething.demo.repo.UserRepo.findFirstByOrderByUsernameAsc(java.lang.String); 
        // Reason: Failed to create query for method public abstract com.findsomething.demo.model.User 
        // com.findsomething.demo.repo.UserRepo.findFirstByOrderByUsernameAsc(java.lang.String); 
        // At least 1 parameter(s) provided but only 0 parameter(s) present in query
    


}