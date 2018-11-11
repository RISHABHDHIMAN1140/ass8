interface Animals
{
 void speak();
 void eat();
}
class Dog implements Animals
{
 public void speak()
 {
  System.out.println("Barks");
 }
 public void eat()
 {
  System.out.println("Dog eats pedigree");
 }
}
class Cat implements Animals
{
 public void speak()
 {
 System.out.println("Meow");
 }
 public void eat()
 {
 System.out.println("Cat drinks milk");
 }
}
class MainAnimal
{
public static void main(String[] args)
{
Dog ob=new Dog();
ob.speak();
ob.eat();
Cat obj=new Cat();
obj.speak();
obj.eat();
}
}