package com.project.springboot.BlogApp.Models.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springboot.BlogApp.Models.Account;
import com.project.springboot.BlogApp.Models.Repo.AccountRepository;

@Service
public class AccountService {

	 @Autowired
	private AccountRepository accountRepository;
	 
	 public Optional<Account> findOneByEmail(String email) {
        return accountRepository.findOneByEmailIgnoreCase(email);
}
}
