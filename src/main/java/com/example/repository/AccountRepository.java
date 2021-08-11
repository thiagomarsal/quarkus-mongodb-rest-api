package com.example.repository;

import com.example.domain.Account;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AccountRepository implements PanacheMongoRepository<Account> {

    public Account findByAccountId(Integer accountId) {
        return find("account_id", accountId).firstResult();
    }
}
