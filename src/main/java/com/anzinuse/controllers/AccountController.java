package com.anzinuse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anzinuse.data.AccountTransactionsRepository;
import com.anzinuse.data.AccountRepository;
import com.anzinuse.model.Account;
import com.anzinuse.model.AccountTransactions;

@Controller
public class AccountController {
	
	@Autowired
	AccountRepository accountData;
	
	@Autowired
	AccountTransactionsRepository accountTransactionsData;
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public ModelAndView accounts() {
		List<Account> allAccounts = accountData.findAll();
		return new ModelAndView("allAccounts", "accounts", allAccounts);

	}
	
	@RequestMapping(value = "/listTransactions/{id}", method = RequestMethod.GET)
	public ModelAndView listTransactions(@PathVariable(value = "id") Long id) {
		List<AccountTransactions> acctTransactions = accountTransactionsData.findByAccountNumber(id);
		return new ModelAndView("acctTransactions", "acctTransactions", acctTransactions);

	}
}

