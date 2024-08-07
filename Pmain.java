public class Pmain{
    public static void main(String[] args){
        Person P1 =new Person("sree",19);
        Person P2 = new Person("syamala",20);
        String result= P1.compareAges(P2);
        System.out.println(result);
    }
}