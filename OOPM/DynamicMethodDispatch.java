class Super
{
    public void meth1()
    {
        System.out.println("Super Meth1");
    }
    
    public void meth2()
    {
        System.out.println("Super Meth2");
    }
}

class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.err.println("Sub Meth2");
    }
    
    public void meth3()
    {
        System.out.println("Sub Meth3");
    }
}

public class DynamicDispatch 
{
    public static void main(String[] args) 
    {
        Super sup=new Sub();
       
        sup.meth1();
        sup.meth2();

       //A super class reference can hold methods of subclass but it can call only those methods which are defined in superclass.
      //Superclass reference holding object of subclass,the method of object will be called. 
    }   
}
