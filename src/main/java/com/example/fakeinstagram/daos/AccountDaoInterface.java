package com.example.fakeinstagram.daos;

import com.example.fakeinstagram.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDaoInterface extends JpaRepository<Account, Long> {
}
