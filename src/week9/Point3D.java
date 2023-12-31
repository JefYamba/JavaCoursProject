package week9;

public class Point3D extends Point2D{
    private int z;

    public Point3D() {
        super();
        this.setZ(0);
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.setZ(z);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY()+ "," + getZ() + ")";
    }
}
