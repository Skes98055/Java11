interface Data{
    public void showData();
}
interface Test{
    public void showScore();
    public double calcu();
}
class Cstu implements Data,Test{
    protected String id;
    protected String name;
    protected int mid;
    protected int final1;
    protected int comm;
    public Cstu(String s1,String s2,int m,int f,int c){//建構元
        this.id=s1;
        this.name=s2;
        this.mid=m;
        this.final1=f;
        this.comm=c;
    }
    //showdata()
    public void showData(){
        System.out.println("學號"+id);
        System.out.println("姓名+"+name);
    }
    public void showScore(){
        System.out.println("期中"+mid);
        System.out.println("期末"+final1);
        System.out.println("平時"+comm);
    }
    public double calcu(){
        return(mid*.3+final1*.3+comm*.4);
    }
    public void show(){
        showData();
        showScore();
    }
}
public class Class11 {
    public static void main(String[] args) {
        Cstu stu=new  Cstu("94001","Fiona",90,82,85);
        stu.show();
    }
}
