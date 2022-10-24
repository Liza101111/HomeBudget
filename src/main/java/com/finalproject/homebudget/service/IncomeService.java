package com.finalproject.homebudget.service;

import com.finalproject.homebudget.model.Income;
import com.finalproject.homebudget.repository.IncomeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class IncomeService {
    private final IncomeRepo incomeRepo;

    public IncomeService(IncomeRepo incomeRepo) {
        this.incomeRepo = incomeRepo;
    }

    public List<Income> listAllIncomes() {
        var incomesFromDb = incomeRepo.findAll();
        log.info("incomes from datasource: {}", incomesFromDb);
        return incomesFromDb;
    }
}
