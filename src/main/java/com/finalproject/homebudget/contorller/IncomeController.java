package com.finalproject.homebudget.contorller;

import com.finalproject.homebudget.model.Income;
import com.finalproject.homebudget.service.IncomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class IncomeController {
    private final IncomeService incomeService;

    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @GetMapping("/incomes")
    public ResponseEntity<List<Income>> getAllIncomes() {
        List<Income> incomes = incomeService.listAllIncomes();
        log.info("Getting all incomes");
        return new ResponseEntity<>(incomes, HttpStatus.OK);
    }


}
