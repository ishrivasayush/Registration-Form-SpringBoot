package com.Narainox.Registration.Form.Repository;

import com.Narainox.Registration.Form.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {

}
