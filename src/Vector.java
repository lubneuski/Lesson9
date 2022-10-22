public abstract class Vector {
    private int x;
    private int y;
    private int z;
    public Vector() {    }
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;    }
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z; }
    public int getX() {
        return x;    }
    public void setX(int x) {
        this.x = x;    }
    public int getY() {
        return y;    }
    public void setY(int y) {
        this.y = y;    }
    public int getZ() {
        return z;    }

    public abstract void length();
    public abstract void scalar(Vector a, Vector b);
    public abstract void plus(Vector i, Vector j);
    public abstract void minus(Vector i, Vector j);
    public abstract void getInfo();
}