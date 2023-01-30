package ua.ithillel.animals;

public class Cat extends Animal{
    private String name;
    public int maxRunDist = 200;
    public static int cat_count;

    public Cat(String name_value){
        this.name = name_value;
        animal_count++;
        cat_count++;
    }

    public void catCount() {
        System.out.println("Создано "+cat_count+" животных");
    }

    @Override
    public void run(int obs){
        if (obs < this.maxRunDist) {
            System.out.println(this.name+" пробежал "+obs+"м.");
        }
        else{
            System.out.println(this.name+" пробежал "+this.maxRunDist+"м. и выдохся");
        }
    }

    @Override
    public void swim(int obs){
            System.out.println(this.name+" не умеет плавать !");
    }
}
