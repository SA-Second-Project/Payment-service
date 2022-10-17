package miu.edu.payment.repository;

import miu.edu.payment.Domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

    public Payment findPaymentByPaymentId(Long paymentId);
}
