import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

interface Car {
    void startEngine();
    void drive();
    void park();
}


class HondaCar implements Car, Serializable {
    //implemtation

    public void startEngine() {
        //code for starting engine
    }

    public void drive() {

    }

    public void park() {

    }
}

class ToyotaCar implements Car {
    @Override
    public void startEngine() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void park() {

    }
}


public class Interfaces {

    public static void main(String[] args) {
      Car myCar = new ToyotaCar();
      myCar.drive();

      OnlineShop shop = new OnlineShop();
      shop.placeOrder();
      shop.makePayment();


      //create a list of names
        List<String> names = new LinkedList<String>();
        names.add("Amit");







    }
}

class BlueDart implements Shipping {
    public void sendPackageToCustomer() {

    }
}

class FedEx implements Shipping {

    @Override
    public void sendPackageToCustomer() {

    }
}

interface Shipping {
    void sendPackageToCustomer();
}


class OnlineShop {
    Shipping shipping = new FedEx();

    void placeOrder() {

    }

    void makePayment() {

        shipOrder();
    }

    void shipOrder() {
        shipping.sendPackageToCustomer();
    }

}

