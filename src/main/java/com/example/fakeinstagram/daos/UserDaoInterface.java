package com.example.fakeinstagram.daos;

import com.example.fakeinstagram.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDaoInterface extends JpaRepository<User, Long> {
}
