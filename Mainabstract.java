abstract class Animals
{
 String color;
 String breed;
 String name;
 abstract void eat();
 void speak()
 {
 System.out.println("Animals");
 }
}
class Dog extends Animals
{
void eat()
{
System.out.println("Dog eats pedigree");
}
}
class Mainabstract
{
 public static void main(String[] args)
 {
 Dog obj=new Dog();
 obj.eat();
 obj.speak();
 }
}
