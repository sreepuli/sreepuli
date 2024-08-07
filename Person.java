public class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String compareAges(Person P1){
        if(this.age>P1.age)
            return this.name +"is older than"+P1.name;
        else if(this.age<P1.age)
            return P1.name +"is older than"+this.name;
        else 
            return P1.name + "and"+this.name+"are of same age";
    }
}