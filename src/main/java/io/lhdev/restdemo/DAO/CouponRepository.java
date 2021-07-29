package io.lhdev.restdemo.DAO;

import io.lhdev.restdemo.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface CouponRepository extends JpaRepository<Coupon, String> {

    List<Coupon> findAll();

    Coupon findByCode(String code);


}
