package facade;

public class Iphone implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println(" Iphone 13 proMax");
    }

    @Override
    public void price() {
        System.out.println(" Rs 65000.00");
    }
}
