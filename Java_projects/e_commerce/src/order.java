// I created a order class for purchsing. This class like a bridge between user and product.
public class order {
    private user orderer;
    private product order;
    private creditCards cardForOrder;
     
    public order(user orderer, product order, creditCards cardForOrder) {
        this.orderer = orderer;
        this.order = order;
        this.cardForOrder = cardForOrder;
        purchsing();
    }

    public user getOrderer() {
        return orderer;
    }

    public void setOrderer(user orderer) {
        this.orderer = orderer;
    }

    public product getOrder() {
        return order;
    }

    public void setOrder(product order) {
        this.order = order;
    }

    public creditCards getCardForOrder() {
        return cardForOrder;
    }

    public void setCardForOrder(creditCards cardForOrder) {
        this.cardForOrder = cardForOrder;
    }
    // This method checks the stock and makes purchases.
    public void purchsing (){
        if(this.order.productControl()){
            this.orderer.addOrdered(this.order);
            System.out.println("Your order has been completed :)");
        }else{
            System.out.println("Your order could not be completed!!");
        }
    }
    
}
