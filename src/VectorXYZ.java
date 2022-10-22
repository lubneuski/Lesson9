public class VectorXYZ extends Vector{
    private static final String DESCRIPTION = "для трехмерной системы координат";
    public VectorXYZ() {
        super();
    }
    public VectorXYZ(int x, int y, int z) {
        super(x, y, z);
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
    public void length(){
        double l= Math.sqrt(getX()*getX()+getY()*getY()+getZ()*getZ());
        System.out.println("Длинна вектора "+DESCRIPTION+" = "+l);
    }
    @Override
    public void scalar(Vector a, Vector b) {       // скалярное произведение векторов c=a*b=ax*bx+ay*by+az*bz
        double sc=a.getX()*b.getX()+a.getY()*b.getY()+a.getZ()*b.getZ();
        System.out.println("Скалярное произведение векторов "+DESCRIPTION+" = "+sc);
    }
    @Override
    public void plus(Vector i, Vector j){          // сумма векторов c=a+b={ax+bx;ay+by;az+bz}
        Vector plus = new VectorXYZ(i.getX() + j.getX(), i.getY() + j.getY(),i.getZ()+ j.getZ());
        System.out.println("Сумма векторов "+DESCRIPTION+" = {"+plus.getX()+";"+plus.getY()+";"+plus.getZ()+"}");
    }
    public void minus(Vector i, Vector j){         // разность векторов c=a-b={ax-bx;ay-by;az-bz}
        Vector plus = new VectorXYZ(i.getX() - j.getX(), i.getY() - j.getY(),i.getZ() - j.getZ());
        System.out.println("Сумма векторов "+DESCRIPTION+" = {"+plus.getX()+";"+plus.getY()+";"+plus.getZ()+"}");
    }
    public static void massivXYZ(int n) {          // массив векторов N
        System.out.println("Массив векторов "+DESCRIPTION+":");
        VectorXYZ[] vMas = new VectorXYZ[n];
        for (int i = 0; i < vMas.length; i++) {
            vMas[i] = new VectorXYZ((int) (Math.random() * 100),
                    (int) (Math.random() * 100),
                    (int) (Math.random() * 100));
            VectorXYZ vector = vMas[i];
            System.out.println("Произвольный вектор {"+vector.getX() + ";" + vector.getY()+ ";" + vector.getZ()+"}");
        }
    }
    @Override
    public void getInfo() {
        System.out.println("Этот вектор "+DESCRIPTION);
    }
}