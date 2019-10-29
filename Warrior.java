public class Warrior {
    String name ;
    int age ;
    int health ;
    int strike ;

    public Warrior(String name, int age, int health, int strike) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.strike = strike;
    }

    public static void main(String[] args) {
        // не получилось сделать через метод void fight(Warrior anotherWarrior)
        Warrior warrior = new Warrior("John",20,50,10);
        Warrior anotherwarrior = new Warrior("Max",30,70,8);

        while (warrior.health>0) {
            warrior.health = warrior.health - anotherwarrior.strike;
            System.out.println("Здоровье воина " + warrior.health);
        }
        System.out.println("Воин погиб в бою");



    }
}




