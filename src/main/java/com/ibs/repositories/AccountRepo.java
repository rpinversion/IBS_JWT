package com.ibs.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibs.entities.Account;


public interface AccountRepo extends JpaRepository<Account, String>{
public Optional<Account> findById(String user);
}
