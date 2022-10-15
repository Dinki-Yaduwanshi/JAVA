class Rectangle
{
    int length;
    int breadth;
    
    Rectangle()
    {
        length=breadth=1;
    }
    Rectangle(int l,int b)
    {
    	System.out.println("Constructor-1");
        length=l;
        breadth=b;
    }
   
}

class Cuboid extends Rectangle
{
    int height;
    
    Cuboid()
    {
        height=1;
    }
    
    Cuboid(int h)
    {
        height=h;
    }
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
        System.out.println("Constructor-2");
    }
    
    int volume()
    {
        return length*breadth*height;
    }
}


public class SuperConst 
{
    public static void main(String[] args) 
    {

        Cuboid c=new Cuboid(5,3,10);
        System.out.println(c.volume());
    }    
}

