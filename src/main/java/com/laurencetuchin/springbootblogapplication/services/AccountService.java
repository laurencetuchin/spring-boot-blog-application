package com.laurencetuchin.springbootblogapplication.services;

import com.laurencetuchin.springbootblogapplication.models.Account;
import com.laurencetuchin.springbootblogapplication.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account save(Account account) {
        return accountRepository.save(account);
    }
}


