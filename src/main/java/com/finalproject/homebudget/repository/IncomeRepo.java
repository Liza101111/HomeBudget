package com.finalproject.homebudget.repository;

import com.finalproject.homebudget.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepo extends JpaRepository<Income, Long> {

}
