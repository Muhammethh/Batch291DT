package d21oop;

public class Dog extends Mammal {

    public void bark (){

        System.out.println("Dogs bark...");
    }

    @Override //Anotation
    public void eat (){
        System.out.println("Dogs eat....");
    }

    @Override
    public Animal create() {
        return new Dog();  //Upcasting-java bu işlemi otomatik yapar

        //child parentının data typeini kullanabilir
    }

    @Override
    public int add(int a, int b) {
        //primiteiveler arasında parent child ilişkisi yoktur
        //Yani primitive'lerde return type degistirilemez
        return a+b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }

}

