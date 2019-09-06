package OOP.moveablepoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    private float[]XY = new float[2];
    public Point() {
    }
    public Point(float x,float y) {
        this.x = x;
        this.y =y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        XY[0] = this.x;
        XY[1] = this.y;
        return XY;
    }
    public void setXY(float x ,float y) {
        XY[0] = x;
        XY[1] = y;
    }
    @Override
    public String toString() {
        return " The point have x = " + getX() + " and y = " + getY();
    }
}
