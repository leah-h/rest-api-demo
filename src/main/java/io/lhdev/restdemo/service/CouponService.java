package io.lhdev.restdemo.service;

import io.lhdev.restdemo.DAO.CouponRepository;
import io.lhdev.restdemo.model.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CouponService {

    @Autowired
    private CouponRepository couponRepository;

    @Transactional
    public List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }

    @Transactional
    public Coupon addCoupon(Coupon inputCoupon) {
        Coupon coupon = null;
        coupon = new Coupon(inputCoupon.getCode(), inputCoupon.getName(), inputCoupon.getAmount());
        coupon = couponRepository.save(inputCoupon);
        return coupon;
    }

    @Transactional
    public Coupon findByCode(String code) {
        return couponRepository.findByCode(code);
    }

}
