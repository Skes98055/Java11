interface  Math{
    public void show();
    public abstract void add(int a,int b);
    public abstract void sub(int a,int b);
    public abstract void mul(int a,int b);
    public abstract void div(int a,int b);
}
class Compute implements Math{
    public void add(int a,int b){ans=a+b;}
    public void sub(int a,int b){ans=a-b;}
    public void mul(int a,int b){ans=a*b;}
    public void div(int a,int b){ans=a/b;}
    public void show(){
        System.out.println("ans="+ans);
    }
}

}
public class Class05 {
    Compute cmp=new Compute();
    cmp.mul(3,5);
    cmp.show();
}