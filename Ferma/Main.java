import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cow = new Animal("cow", 1000, 5, 100, 2);
        Animal chicken = new Animal("chicken", 5, 10, 50, 1);
        Animal rabbit = new Animal("rabbit", 7, 20, 10, 0);
        Animal cat = new Animal("cat", 3, 20, 7, 0);

        Predator wolf = new Predator("wolf", 100, 6, 15);
        Predator bear = new Predator("bear", 700, 15, 12);
        Predator fox = new Predator("fox", 50, 17, 1);

        Fermer fermer = new Fermer(10);

        Farm farm = new Farm();
        farm.addAnimal(cow);
        farm.addAnimal(chicken);
        farm.addAnimal(rabbit);
        farm.addAnimal(cat);

        farm.addPredator(wolf);
        farm.addPredator(bear);
        farm.addPredator(fox);

        farm.addFermer(fermer);

        int newres = fermer.getRes();
        while ( newres > 0) {
            newres += cow.getAnimalres() + chicken.getAnimalres();
            System.out.println("Новый день, количество ресурсов: " + newres);
            int cownewhealth = cow.getAnimalhealth() - cow.getAnimalres();
            int chickennewhealth = chicken.getAnimalhealth() - chicken.getAnimalres();

            cow.setAnimalhealth(cownewhealth);
            chicken.setAnimalhealth(chickennewhealth);
            System.out.println("Здоровье коровы после сбора ресурса " + cow.getAnimalhealth());
            System.out.println("Здоровье курицы после сбора ресурса " + chicken.getAnimalhealth());

            int fermerfury = (int)  (Math.random()*2);

            if (wolf.getPredatorspeed() > cow.getAnimalspeed()) {
                if (fermerfury < 1) {
                    cownewhealth = cow.getAnimalhealth() - wolf.getPredatorpower();
                    cow.setAnimalhealth(cownewhealth);
                    System.out.println("волк ранил корову");
                    System.out.println("Здоровье раненой коровы: " + cow.getAnimalhealth());
                }
                else {
                    System.out.println("Фермер прогнал волка");
                }
            }
             fermerfury = (int)  (Math.random()*2);
            if (bear.getPredatorspeed() > chicken.getAnimalspeed()) {
                if (fermerfury < 1) {
                    chickennewhealth = chicken.getAnimalhealth() - bear.getPredatorpower();
                    chicken.setAnimalhealth(chickennewhealth);
                    System.out.println("медведь ранил курицу");
                    System.out.println("Здоровье раненой курицы: " + chicken.getAnimalhealth());
                }
                else {
                    System.out.println("Фермер прогнал медведя");
                }
            }
            if (fox.getPredatorspeed() > rabbit.getAnimalspeed()) {
                System.out.println("Лиса съела кролика");
            } else {
                System.out.println("лиса не догнала кролика");
            }
            if (fox.getPredatorspeed() > cat.getAnimalspeed()) {
                System.out.println("Лиса съела кота");
            } else {
                System.out.println("лиса не догнала кота");
            }


            cownewhealth = cow.getAddhealth() * (int) (Math.random() * 3) + cow.getAnimalhealth();
            cow.setAnimalhealth(cownewhealth);
            System.out.println("Здоровье коровы после корма " + cow.getAnimalhealth());

            chickennewhealth = chicken.getAddhealth() * (int) (Math.random() * 3) + chicken.getAnimalhealth();
            chicken.setAnimalhealth(chickennewhealth);
            System.out.println("Здоровье курицы после корма " + chicken.getAnimalhealth());

            newres -= 5;
            System.out.println("Фермер потратил себе на еду и корм животным ресуры");
            System.out.println("Ресурсов осталось: " + newres);

        }
        System.out.println("Фермер умер от нехватки ресурсов");

    }


}
