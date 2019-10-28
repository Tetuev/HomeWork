public class Main {
    private int health = 100; //Здоровье фермера
    int res; //количество ресурса с животного за раз
    int n = 10;//количество животных

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

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Main(int health, int res, int n) {
        this.health = health;
        this.res = res;
        this.n = n;

    }
    while (health > 0 || health < 100){
 for (int i = 1; i < n; i++);{
   health = health + res;

    }
    }
}








