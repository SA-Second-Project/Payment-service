package miu.edu.payment.Service;

import miu.edu.payment.Domain.Payment;
import miu.edu.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public Payment getPaymentByPaymentId(Long paymentId){
        return paymentRepository.findPaymentByPaymentId(paymentId);
    }

    public void addPayment(Payment payment){
        paymentRepository.save(payment);
    }

    public List<Payment> getAllPayment(){
       return paymentRepository.findAll();
    }

}
