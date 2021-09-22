package com.example.BillPayment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BillPayment.Model.AccountTransaction;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Long>{

}
