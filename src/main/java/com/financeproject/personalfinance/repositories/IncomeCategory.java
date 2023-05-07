package com.financeproject.personalfinance.repositories;

import com.financeproject.personalfinance.entities.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeCategory extends JpaRepository<Income, Long> {
}
