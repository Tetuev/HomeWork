import java.lang.reflect.Array;
        import java.util.Arrays;

public class Animal {
    private String animalname;
    private int animalweight;
    private int animalspeed;
    private int animalhealth;
    private int animalres;
    private int addhealth = 1;



    public Animal(String animalname, int animalweight, int animalspeed, int animalhealth, int animalres) {
        this.animalname = animalname;
        this.animalweight = animalweight;
        this.animalspeed = animalspeed;
        this.animalhealth = animalhealth;
        this.animalres = animalres;

    }

    public String getAnimalname() {
        return animalname;
    }

    public void setAnimalname(String animalname) {
        this.animalname = animalname;
    }

    public int getAnimalweight() {
        return animalweight;
    }

    public void setAnimalweight(int animalweight) {
        this.animalweight = animalweight;
    }

    public int getAnimalspeed() {
        return animalspeed;
    }

    public void setAnimalspeed(int animalspeed) {
        this.animalspeed = animalspeed;
    }

    public int getAnimalhealth() { return animalhealth; }

    public void setAnimalhealth(int animalhealth) {
        this.animalhealth = animalhealth;
    }

    public int getAnimalres() {
        return animalres;
    }

    public void setAnimalres(int animalres) {
        this.animalres = animalres;
    }

    public int getAddhealth() { return addhealth; }

    public void setAddhealth(int addhealth) { this.addhealth = addhealth; }


}




