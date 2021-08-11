package com.example.controller;

import com.example.domain.Account;
import com.example.repository.AccountRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/account")
public class AccountController {

    @Inject
    private AccountRepository accountRepository;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List listAll() {
        return accountRepository.listAll();
    }

    @GET
    @Path("/{id}")
    public Account get(@PathParam("id") Integer id) {
        return accountRepository.findByAccountId(id);
    }
}