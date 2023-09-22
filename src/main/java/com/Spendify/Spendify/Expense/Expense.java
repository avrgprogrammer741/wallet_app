package com.Spendify.Spendify.Expense;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "expenses")
public class Expense {
    @Id
    @SequenceGenerator(name = "expense_sequence",
            sequenceName = "expense_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "expense_sequence"
    )

    private Long id;
    @Column(name = "quantity",
            length = 50,
            nullable = false
    )
    private Double quantity;
    public Expense(Double quantity){
        this.quantity = quantity;
    }
//    @ManyToOne
//    @JoinColumn(name = "currency_id")
//    private Currency currency;
//
//    private Double quantity;
//
//    @ManyToOne
//    @JoinColumn(name = "debt_id")
//    private Debt debt;
//
//    @ManyToOne
//    @JoinColumn(name = "invoice_id")
//    private Invoice invoice;


}