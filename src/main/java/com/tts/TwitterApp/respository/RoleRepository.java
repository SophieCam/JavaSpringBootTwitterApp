package com.tts.TwitterApp.respository;


import com.tts.TwitterApp.model.Role;
import org.hibernate.validator.constraints.Currency;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}
