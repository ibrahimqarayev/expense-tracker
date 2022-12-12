package com.company.expensetracker.expense;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tbl_expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String expenseName;

    private BigDecimal amount;

    private String note;

    @Column(name = "created_at")
    private Long createdAt;

    public Expense() {
    }

    public Expense(Long id, String expenseName, BigDecimal amount, String note, Long createdAt) {
        this.id = id;
        this.expenseName = expenseName;
        this.amount = amount;
        this.note = note;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", expenseName='" + expenseName + '\'' +
                ", amount=" + amount +
                ", note='" + note + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
