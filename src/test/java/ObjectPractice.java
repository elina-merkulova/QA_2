import org.junit.jupiter.api.Test;

public class ObjectPractice {
    @Test
    public void workingWithOrders() {
        Order firstOrder = new Order();

        firstOrder.setTotalPrice(12.34);
        firstOrder.setAddress("Rigas str.22");
        firstOrder.setItemCount(9);
        firstOrder.setHeight(14.5);
        firstOrder.setDepth(55.65);
        firstOrder.setVolume(24.888);
        firstOrder.setDeliveryRequested(true);
        firstOrder.setWeight(55.9954);
        firstOrder.setWidth(88.4562);

        Order secondOrder = new Order();

        secondOrder.setWidth(5456.6);
        secondOrder.setWeight(45.5);
        secondOrder.setHeight(5.545);
        secondOrder.setVolume(45.555);
        secondOrder.setDepth(555.33);
        secondOrder.setDeliveryRequested(false);
        secondOrder.setItemCount(5);
        secondOrder.setAddress("Valdemara str 5-55");
        secondOrder.setTotalPrice(55.87);

        System.out.println("Hello World");
        System.out.println("1st order");
        System.out.println(firstOrder.getTotalPrice());
        System.out.println("2nd Order");
        System.out.println(secondOrder.getTotalPrice());
    }
}
