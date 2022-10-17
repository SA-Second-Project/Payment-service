package miu.edu.payment.Controller;
import miu.edu.payment.Domain.Payment;
import miu.edu.payment.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/payments")
public class paymentController{

    @Autowired
    PaymentService paymentService;

    @GetMapping()
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayment();
    }

    @PostMapping("/add")
    public void savePayment(@RequestBody Payment payment){
        paymentService.addPayment(payment);
    }

    @GetMapping(value = "/{paymentId}")
    public Payment getPaymentById(@PathVariable("paymentId") Long paymentId){
        return paymentService.getPaymentByPaymentId(paymentId);
    }

}
