package com.example.paymentapp.repository;
import com.example.paymentapp.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;
public interface PaymentRepository extends JpaRepository<Payment,Long> {
  List<Payment> findByOwner(String owner);
  List<Payment> findByDueDateBeforeAndPaidFalse(LocalDate date);
}
