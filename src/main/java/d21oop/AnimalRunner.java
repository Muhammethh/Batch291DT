package d21oop;

public class AnimalRunner {

    public static void main(String[] args) {

        Dog objDog1 = new Dog();
        objDog1.bark();  //Dogs bark...
        objDog1.feedWithMilk(); //Mammals feed their babies with milk...
        objDog1.drink(); //Animals drink...


        objDog1.eat(); //dogs eat....   //Override


        Bird objBird = new Bird();
        objBird.tweet();
        objBird.eat();

        Cat Catobj = new Cat();
        Catobj.feedWithMilk(); //Cats feed their babies with milk...    //Override


    }
}
