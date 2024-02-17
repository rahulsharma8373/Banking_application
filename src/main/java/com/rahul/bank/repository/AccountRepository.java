package com.rahul.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.bank.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
