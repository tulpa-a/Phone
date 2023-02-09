public class Phone2 {
    public static void main(String[] args) {
        //№2
        Phone instance1 = new Phone();
        Phone instance2 = new Phone();
        Phone instance3 = new Phone();
        //№3
        instance1.number = "88468826401";
        instance1.model = "Apple";
        instance1.weight = "10";

        instance2.number = "88282649375";
        instance2.model = "Samsung";
        instance2.weight = "13";

        instance3.number = "86185246524";
        instance3.model = "Nokia";
        instance3.weight = "15";

        System.out.println(instance1.number);
        System.out.println(instance1.model);
        System.out.println(instance1.weight);

        System.out.println(instance2.number);
        System.out.println(instance2.model);
        System.out.println(instance2.weight);

        System.out.println(instance3.number);
        System.out.println(instance3.model);
        System.out.println(instance3.weight);
        //№4
        instance1.receiveCall ("Лиза");
        instance2.receiveCall ("Маша");
        instance3.receiveCall ("Даша");

        System.out.println(instance1.getNumber());
        System.out.println(instance2.getNumber());
        System.out.println(instance3.getNumber());
        //№9
        instance1.receiveCall ("Лера", "86836583475");
        instance1.receiveCall ("Полина", "82640375835");
        instance1.receiveCall ("Карина", "83649240374");
        //№10
        instance1.sendMessage("первое", "836294637501", "84538107564");
        instance2.sendMessage("второе", "83649275349");
        instance3.sendMessage("третье","873927453647");



    }
}
