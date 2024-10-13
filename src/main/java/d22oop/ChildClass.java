package d22oop;

public class ChildClass extends ParentClass {

    @Override
    public Integer multiply(Integer a, Integer b) {

        //Parent classın multiply methodunu çağırdık
        Integer sonuc = super.multiply(a, b);

        //Ek işlevsellik katalım
        return sonuc + 10;
        //parent method değişmez
    }
}
