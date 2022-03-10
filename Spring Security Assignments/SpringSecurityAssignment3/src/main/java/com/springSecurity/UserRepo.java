package com.springSecurity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<user, String>{

}
