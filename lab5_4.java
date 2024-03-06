/**
 * Innerlab5_4
 */
 class Cat {
    String name;
    int age;
    static int CatCount;

Cat(){
    CatCount++;
}
}
public class lab5_4{
    public static void main(String[] args) {
        Cat c1=new Cat();
        System.out.println(Cat.CatCount);
        Cat c2=new Cat();
        System.out.println(Cat.CatCount);
        Cat c3=new Cat();
        System.out.println(Cat.CatCount);
    }
} 