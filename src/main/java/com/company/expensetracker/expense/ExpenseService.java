package com.company.expensetracker.expense;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> expenseList() {
        return expenseRepository.findAll();
    }

    public void save(Expense expense) {
        expense.setCreatedAt(System.currentTimeMillis());
        expenseRepository.save(expense);
    }

    public Expense findById(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if (optionalExpense.isPresent()) {
            return expenseRepository.findById(id).get();
        }
        return null;
    }

}
