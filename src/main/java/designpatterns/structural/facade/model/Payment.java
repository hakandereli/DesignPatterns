package designpatterns.structural.facade.model;

public class Payment {

    private String paymetMethod;
    private Double amount;

    public Payment(String paymetMethod, Double amount) {
        this.paymetMethod = paymetMethod;
        this.amount = amount;
    }

    public String getPaymetMethod() {
        return paymetMethod;
    }

    public void setPaymetMethod(String paymetMethod) {
        this.paymetMethod = paymetMethod;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymetMethod='" + paymetMethod + '\'' +
                ", amount=" + amount +
                '}';
    }
}
