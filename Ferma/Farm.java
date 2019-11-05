public class Farm {
    private Animal[] animals = new Animal[4];
    private Predator[] predators = new Predator[3];
    private Fermer[] fermers = new Fermer[1];


    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i] == null) {
                this.animals[i] = animal;
                return true;
            }
        }
        return false;
    }
    public boolean addPredator(Predator predator) {
        for (int i = 0; i < this.predators.length; i++) {
            if (this.predators[i] == null) {
                this.predators[i] = predator;
                return true;
            }
        }
        return false;
    }
    public boolean addFermer(Fermer fermer) {
        for (int i = 0; i < this.fermers.length; i++) {
            if (this.fermers[i] == null) {
                this.fermers[i] = fermer;
                return true;
            }
        }
        return false;
    }


}
