public class Main {
    public static void main(String[] args) {
    Vector a=new VectorXY(2,4);
    Vector b=new VectorXY(6,8);
        a.getInfo();
        a.length();
        b.length();
    Vector c=new VectorXY();
        c.scalar(a,b);
    Vector d=new VectorXY();
        d.plus(a,b);
        d.minus(a,b);
    VectorXY.massivXY(3);
System.out.println();
    Vector e=new VectorXYZ(2,4,6);
    Vector f=new VectorXYZ(9,3,7);
        e.getInfo();
        e.length();
        f.length();
    Vector g=new VectorXYZ();
        g.scalar(e,f);
        g.plus(e,f);
        g.minus(e,f);
    VectorXYZ.massivXYZ(2);
    }
}