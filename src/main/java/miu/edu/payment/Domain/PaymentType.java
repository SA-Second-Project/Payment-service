package miu.edu.payment.Domain;

public enum PaymentType {
    PAYPAL {
        public String toString() {
            return "PAYPAL";
        }
    },

    CC{
        public String toString () {
            return "CC";
        }

    },
    BC{
        public String toString () {
            return "BC";
        }

    }
    }   