package com.finalproject.homebudget.model;

import com.finalproject.homebudget.model.enumeration.IncomeCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Income {
    @Id
    Long id;
    IncomeCategory incomeCategory;
    String currency;
    BigDecimal amount;
    String person;
    ZonedDateTime timestamp;

}
