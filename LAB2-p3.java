class Point
{
void show()
{
System.out.println("This is the Point Base class");
}
}
class Shape extends Point
{
void display()
{
System.out.println("Different shapes can be developed with different number of points");
}
}

class Rectangle extends Shape
{
int l,b;
void getdata1(int x,int y)
{
l=x;
b=y;
}
void area()
{
System.out.println("Length:"+l);
System.out.println("Breadth:"+b);
System.out.println("Area:"+(l*b));
}
void display()
{
System.out.println("Rectangle Class");
}
}

class Square extends Shape{
int a;
void getdata2(int x){
a=x;
}
void area(){
System.out.println("Side:"+a);
System.out.println("Area:"+(a*a));
}
void display(){
System.out.println("Square Class");
}

}
class Circle extends Shape{
int r;
void getdata3(int x){
r=x;
}
void area(){
System.out.println("Radius :"+r);
System.out.println("Area:"+(3.14*r*r));
}
void display(){
System.out.println("Circle Class");
}

}
class Triangle extends Shape{
int b,h;
void getdata4(int x,int y){
b=x;
h=y;
}
void area()
{
System.out.println("Base:"+b);
System.out.println("Height:"+h);
System.out.println("Area:"+(0.5*b*h));
}
void display(){
System.out.println("Triangle Class");
}
}

class Main
{
public static void main(String args[])
{
Rectangle r = new Rectangle();
Square s = new Square();
Circle c = new Circle();
Triangle t = new Triangle();
r.show();
s.display();

System.out.println("Rectangle:");
r.getdata1(12,6);
r.area();

System.out.println("Square:");
s.getdata2(7);
s.area();

System.out.println("Circle:");
c.getdata3(5);
c.area();

System.out.println("Triangle:");
t.getdata4(4,7);
t.area();

System.out.println("Dynamic Polymorphism");
Shape sh;
sh=new Rectangle();
sh.display();
sh=new Triangle();
sh.display();
}
}
