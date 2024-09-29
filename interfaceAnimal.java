 interface Animal{
    void makeSound();
    void eat();
}
class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("dog is barking");
}
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
}
class Cat implements Animal{
    @Override
    public void makeSound(){
    System.out.println("cat is Sounding");
    }
    @Override
public void eat(){
    System.out.println("Cat is eating");
}
}
public class interfaceAnimal{
    public static void main(String[] args){
        Animal dog=new Dog();
        Animal cat=new Cat();
        System.out.println("Dog");
        dog.makeSound();
        dog.eat();
        System.out.println("\nCat");
        cat.makeSound();
        cat.eat();
    }
}