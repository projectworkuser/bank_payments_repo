package com.example.paymentapp.controller;
import com.example.paymentapp.entity.Payment;
import com.example.paymentapp.repository.PaymentRepository;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;
import java.util.List;
import java.time.LocalDate;
@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    private final PaymentRepository repo;
    public PaymentController(PaymentRepository repo){this.repo=repo;}
    @PostMapping public Payment create(@RequestBody Payment p, Principal principal){ p.setOwner(principal.getName()); return repo.save(p); }
    @GetMapping public List<Payment> list(Principal principal){ return repo.findByOwner(principal.getName()); }
    @GetMapping("/due") public List<Payment> dueBefore(@RequestParam("date") LocalDate date){ return repo.findByDueDateBeforeAndPaidFalse(date); }
}
