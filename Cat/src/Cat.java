public class Cat {

        String name = "Мурка";
        double weight = 3.5;
        int age = 5;
        String colour = "Рыжая";
        String adress = "Невский пр., д.47";


    public Cat(String name) {
        this.name = name;
        Cat Cat1 = new Cat("Мурка");
    }
    public Cat(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        Cat Cat2 = new Cat("Мурка", 3.5, 5);
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        Cat Cat3 = new Cat("Мурка",  5);
    }
    public Cat(double weight,String colour) {
        this.weight = weight;
        this.colour = colour;
        Cat Cat4 = new Cat( 3.5, "Рыжая");
    }
    public Cat(double weight, String colour, String adress) {
        this.weight = weight;
        this.colour = colour;
        this.adress = adress;
        Cat Cat5 = new Cat( 3.5,"Рыжая","Невский пр., д.47");
    }
    public Cat(String name, double weight, int age, String colour, String adress) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.colour = colour;
        this.adress = adress;
        Cat Cat6 = new Cat("Мурка",3.5,5,"Рыжая","Невский пр., д.47");
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    public String getAdress() {
        return adress;
    }

    public static void main(String[] args) {
        System.out.println(); //не получается вывести информацию об объектах
    }
}











