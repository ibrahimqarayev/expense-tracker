package com.company.expensetracker.expense;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MasterController {

    private ExpenseService expenseService;

    public MasterController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView mov = new ModelAndView("home");
        List<Expense> expenses = expenseService.expenseList();
        mov.addObject("expenses", expenses);
        System.out.println(expenses);
        return mov;
    }

    @RequestMapping("/expense")
    public ModelAndView addExpense() {
        ModelAndView mov = new ModelAndView("expense");
        mov.addObject("expense", new Expense());
        return mov;
    }

    @RequestMapping(value = "/expense", method = RequestMethod.POST)
    public String save(@ModelAttribute("expense") Expense expense) {
        expenseService.save(expense);
        return "redirect:/";
    }

    @RequestMapping(value = "/expense/{id}",method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("id") Long id) {
        ModelAndView mov = new ModelAndView("expense");
        Expense expense = expenseService.findById(id);
        mov.addObject("expense", expense);
        return mov;
    }

    @RequestMapping(value = "/expense/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        return "";
    }


}
