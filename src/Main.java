public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Uchar");
        dog1.setWeight(55);
        dog1.setColor("Black");
        System.out.println("Name: "+dog1.getName());
        System.out.println("Weight: "+dog1.getWeight());
        System.out.println("Color: "+dog1.getColor());
        dog1.dogGuarding();
        System.out.println();

        Cat cat1 = new Cat();
        cat1.setName("Murka");
        cat1.setAge(3);
        cat1.setSex("female");
        System.out.println("Name: "+cat1.getName());
        System.out.println("Age: "+cat1.getAge());
        System.out.println("Sex: "+cat1.getSex());
        cat1.catSay();
        System.out.println();

        Popugai popugai1 = new Popugai();
        popugai1.setName("Corella");
        popugai1.setLength(18-17);
        popugai1.setCountry("Australia");
        System.out.println("Name: "+popugai1.getName());
        System.out.println("Length: "+popugai1.getLength());
        System.out.println("Country: "+popugai1.getCountry());
         popugai1.popugaiRep();
        System.out.println();

        Fish fish1 = new Fish();
        fish1.setType("Sazan");
        fish1.setLifeExpectancy(20);
        fish1.setColor("Brown");
        System.out.println("Type: "+fish1.getType());
        System.out.println("Life expectancy: "+fish1.getLifeExpectancy());
        System.out.println("Color: "+fish1.getColor());
        fish1.fishSwimming();

    }
}