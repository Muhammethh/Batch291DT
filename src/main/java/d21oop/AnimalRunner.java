package d20staticblock_instanceblock_oop;

public class AnimalRunner {

    public static void main(String[] args) {

        Dog objDog1 = new Dog();
        objDog1.bark();  //Dogs bark...
        objDog1.feedWithMilk(); //Mammals feed their babies with milk...
        objDog1.drink(); //Animals drink...


        Bird objBird = new Bird();
        objBird.tweet();
        objBird.eat();


    }
}
