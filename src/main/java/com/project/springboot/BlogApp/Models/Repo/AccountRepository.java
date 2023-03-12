package com.project.springboot.BlogApp.Models.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springboot.BlogApp.Models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
		
	 Optional<Account> findOneByEmailIgnoreCase(String email);
}
