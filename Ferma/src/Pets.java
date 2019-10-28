public class Pets {

        int n = 10; //количество животных
        String name;
        int weigh;
        int speed;
        int health;
        int res; //количество ресурсов собираемых за раз с животного

    public Pets(int n, String name, int weigh, int speed, int health, int res) {
        this.n = n;
        this.name = name;
        this.weigh = weigh;
        this.speed = speed;
        this.health = health;
        this.res = res;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
}
