package ua.ithillel.animals;

public class Dog extends Animal{
    private String name;

    public int maxRunDist = 500;
    public int maxSwmDist = 10;
    public static int dog_count;

    public Dog(String name_value){
        this.name = name_value;
        animal_count++;
        dog_count++;
    }

    public void dogCount() {
        System.out.println("Создано "+dog_count+" животных");
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
        if (obs < this.maxSwmDist) {
            System.out.println(this.name+" проплыл "+obs+"м.");
        }
        else{
            System.out.println(this.name+" проплыл "+this.maxSwmDist+"м. и выдохся");
        }
    }
}
