package com.deaddictionsystem.deaddictionsystemapp.repository;

import com.deaddictionsystem.deaddictionsystemapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {


    @Query("from User u where u.email=?1")
     User    findUserByEmail(String email);

}
