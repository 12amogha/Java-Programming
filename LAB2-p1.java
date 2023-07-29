class Shape 
{
	 final double PI=3.14;
	 int length,breadth;
	 double base,height,radius;
	 Shape()
	 {
		 length=1;
		 breadth=1;
		 base=1.0;
		 height=1.0;
		 radius=1.0;
	 }
	 Shape(double r)
	 {
		 radius=r;
	 }
	 Shape(int m, int n)
	 {
		 length=m;
		 breadth=n;
	 }
	 Shape(double m, double n)
	 {
		 base=m;
		 height=n;
	 }
	 int print_area(int m,int n)
	 {
		 length=m;
		 breadth=n;
		 return length*breadth;
	 }
    double print_area(double m,double n)
    {
   	 base=m;
   	 height=n;
   	 return base*height/2;
    }
    double print_area(double r)
    {
   	 radius=r;
   	 return PI*radius*radius;
    }
}

class Main
{
	 public static void main(String[] args)
	 {
		 Shape circle=new Shape(5);
		 Shape rect=new Shape(4,5);
		 Shape triangle=new Shape(8.0,7.0);
		 System.out.println("Area of the circle is : "+circle.print_area(circle.radius));
		 System.out.println("Area of the Rectangle is : "+rect.print_area(rect.length,rect.breadth));
		 System.out.println("Area of the Triangle is : "+triangle.print_area(triangle.base,triangle.height));
	 }
}
