public class VectorXY extends Vector{
    private static final String DESCRIPTION = "для двумерной системы координат";
    public VectorXY() {
        super();
    }
    public VectorXY(int x, int y) {
        super(x, y);
    }
    @Override
    public int getX() {
        return super.getX();
    }
    @Override
    public int getY() {
        return super.getY();
    }
    @Override
    public int getZ() {
        return super.getZ();
    }
    @Override
    public void length() {                            //длина вектора a={ax;ay}
        double l= Math.sqrt(getX()*getX()+getY()*getY());
        System.out.println("Длинна вектора "+DESCRIPTION+" = "+l);
    }
    @Override
    public void scalar(Vector a, Vector b) {          // скалярное произведение векторов a={ax;ay} и b={bx;by}
        double sc=a.getX()*b.getX()+a.getY()*b.getY();
        System.out.println("Скалярное произведение векторов "+DESCRIPTION+" = "+sc);
    }
    @Override
    public void plus(Vector i, Vector j){             // сумма векторов c=a+b={ax+bx};{ay+by}
        Vector plus = new VectorXY(i.getX() + j.getX(), i.getY() + j.getY());
        System.out.println("Сумма векторов "+DESCRIPTION+" = {"+plus.getX()+";"+plus.getY()+"}");
    }
     public void minus(Vector i, Vector j){           // разность векторов c=a-b={ax-bx};{ay-by}
        Vector minus = new VectorXY(i.getX() - j.getX(), i.getY() - j.getY());
        System.out.println("Разность векторов "+DESCRIPTION+" = {"+minus.getX()+";"+minus.getY()+"}");
    }
    public static void massivXY(int n) {              // массив векторов N
        System.out.println("Массив векторов "+DESCRIPTION+":");
        VectorXY[] vMas = new VectorXY[n];
        for (int i = 0; i < vMas.length; i++) {
            vMas[i] = new VectorXY((int) (Math.random() * 100),
                                   (int) (Math.random() * 100));
            VectorXY vector = vMas[i];
        System.out.println("Произвольный вектор {"+vector.getX() + ";" + vector.getY()+"}");
        }
    }
    @Override
    public void getInfo() {
        System.out.println("Этот вектор "+DESCRIPTION);
    }
}