package com.anzinuse.model;

import javax.persistence.*;

@Entity
public class AccountTransactions {

	@Id
	private Long accountNumber;

    private String accountName;

    private String accountValueDate;

    private String accountCurrency;

    private Float accountCreditAmt;

    private Float accountDebitAmt;

    private String accountDebitCredit;

    private String accountTransactionNarrative;
    
    public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountValueDate() {
		return accountValueDate;
	}

	public void setAccountValueDate(String accountValueDate) {
		this.accountValueDate = accountValueDate;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public Float getAccountCreditAmt() {
		return accountCreditAmt;
	}

	public void setAccountCreditAmt(Float accountCreditAmt) {
		this.accountCreditAmt = accountCreditAmt;
	}

	public Float getAccountDebitAmt() {
		return accountDebitAmt;
	}

	public void setAccountDebitAmt(Float accountDebitAmt) {
		this.accountDebitAmt = accountDebitAmt;
	}

	public String getAccountDebitCredit() {
		return accountDebitCredit;
	}

	public void setAccountDebitCredit(String accountDebitCredit) {
		this.accountDebitCredit = accountDebitCredit;
	}

	public String getAccountTransactionNarrative() {
		return accountTransactionNarrative;
	}

	public void setAccountTransactionNarrative(String accountTransactionNarrative) {
		this.accountTransactionNarrative = accountTransactionNarrative;
	}
	
	@Override
	public String toString() {
		return "AccountTransactions [accountNumber=" + accountNumber + ", accountName=" + accountName
				+ ", accountValueDate=" + accountValueDate + ", accountCurrency=" + accountCurrency
				+ ", accountCreditAmt=" + accountCreditAmt + ", accountDebitAmt=" + accountDebitAmt
				+ ", accountDebitCredit=" + accountDebitCredit + ", accountTransactionNarrative="
				+ accountTransactionNarrative + "]";
	}

}
