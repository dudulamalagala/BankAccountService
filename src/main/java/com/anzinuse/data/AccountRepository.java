package com.anzinuse.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anzinuse.model.Account;

public interface AccountRepository extends JpaRepository<Account
			, Long> {

}