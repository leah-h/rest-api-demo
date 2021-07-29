package io.lhdev.restdemo.controller;

import io.lhdev.restdemo.DAO.CouponRepository;
import io.lhdev.restdemo.model.Coupon;
import io.lhdev.restdemo.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @PostMapping(path="/coupons")
    public Coupon createCoupon(@RequestBody Coupon coupon) {
        return couponService.addCoupon(coupon);
    }

    @GetMapping(path="/coupons/{code}")
    public Coupon findByCode(@PathVariable("code") String code) {
        return couponService.findByCode(code);
    }

    @GetMapping(path="/coupons")
    public List<Coupon> getAllCoupons() {
        return couponService.getAllCoupons();
    }
}
