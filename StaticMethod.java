class Mobile {
  String brand;
  int price;
  static String name;

  public void show() {
    System.out.println(brand + " : " + price + " : " + name);
  }

  public static void show1(Mobile obj1) {
    System.out.println(obj1.brand + " : " + obj1.price + " : " + name);
  }
}

public class StaticMethod {
  public static void main(String[] args) {
    Mobile obj1 = new Mobile();
    obj1.brand = "Iphone";
    obj1.price = 1400;
    Mobile.name = "SmartPhone";

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 1350;
    Mobile.name = "SmartPhone";

    obj1.show();
    obj2.show();

    Mobile.show1(obj1);

  }
}
