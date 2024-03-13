package com.example.javaconcurrency.domain.coupon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long stock;

    public Coupon(String name, Long stock) {
        this.name = name;
        this.stock = stock;
    }

    public void decrease() {
        validateStockCount();
        this.stock -= 1;
    }

    private void validateStockCount() {
        if (stock < 1) {
            throw new IllegalArgumentException();
        }
    }
}
