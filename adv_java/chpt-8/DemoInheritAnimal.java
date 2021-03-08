public class DemoInheritAnimal
{
public static void main(String[] args)
{
Animal a1 = new Animal();
Animal a2 = new Animal("Buddy");
System.out.println(a1.name);
a1.sayName();

System.out.println(a2.name);
a2.sayName();
System.out.println();


Cat c1 = new Cat();
System.out.println(c1.status);
c1.meow();
System.out.println(c1.name);
c1.sayName();
System.out.println();

Cat c2 = new Cat("Fluffy", "domestic");
System.out.println(c2.name);
c2.sayName();
c2.meow();
System.out.println();

Dog d1 = new Dog();
System.out.println(d1.color);
d1.bark();
System.out.println(d1.name);
d1.sayName();
System.out.println();

Dog d2 = new Dog("Rex", "Black");
System.out.println(d2.color);
d2.bark();
System.out.println(d2.name);
d2.sayName();
System.out.println();

Retriever r1 = new Retriever();
System.out.println(r1.name);
System.out.println(r1.color);
System.out.println(r1.coat);
r1.sayName();
r1.bark();
r1.jump();
System.out.println();



Retriever r2 = new Retriever("Bob", "Red", "smooth");
System.out.println(r2.name);
System.out.println(r2.color);
System.out.println(r2.coat);
r2.sayName();
r2.bark();
r2.jump();
System.out.println();


Golden g1 = new Golden("Newman", "Orange", "smooth", "easy going");
System.out.println(g1.name);
System.out.println(g1.color);
System.out.println(g1.coat);
System.out.println(g1.attitude);
g1.sayName();
g1.bark();
g1.jump();
g1.sleep();
System.out.println();

Lab l1 = new Lab("Nicky", "Black", "short", "smart");
System.out.println(l1.name);
System.out.println(l1.color);
System.out.println(l1.coat);
System.out.println(l1.intelligence);
l1.sayName();
l1.bark();
l1.jump();
l1.drool();

}//end main
}//end class