package miu.edu.payment.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import miu.edu.payment.Domain.Payment;
import miu.edu.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
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

    public boolean checkBalance(Long userId,Double amount){
        return true;
    }
}
