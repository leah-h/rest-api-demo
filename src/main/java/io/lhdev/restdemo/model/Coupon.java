package io.lhdev.restdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coupons")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    @Id
    private String code;

    private String name;
    private int amount;
}
