public class PaymentCard {
    private double balance = 0;

    public PaymentCard(double balance){
        this.balance = balance;
    }

    public void eatAffordably(){
        if (this.balance - 2.6 >= 0){
            this.balance -= 2.60;
        }
       
    }

    public void eatHeartily(){
        if (this.balance - 4.6 >= 0){
            this.balance -= 4.60;
        }
    }

    public void addMoney(double deposit){
        if (deposit > 0){
            if (this.balance + deposit > 150){
                this.balance = 150;
            } else {
                this.balance += deposit;
            }
        }
    }

    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
}
