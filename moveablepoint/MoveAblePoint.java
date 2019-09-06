package OOP.moveablepoint;

public class MoveAblePoint extends Point {
    private float speedX = 0.0f;
    private float speedY = 0.0f;
    private float[]speed = new float[2];
    private float[]newPoint = new float[2];
    public MoveAblePoint() {
    }
    public MoveAblePoint(float speedX,float speedY) {
        this.speedX = speedX;
        this.speedY = speedY;
    }
    public MoveAblePoint(float x,float y,float speedX ,float speedY) {
            super.setX(x);
            super.setY(y);
            this.speedX = speedX;
            this.speedY = speedY;
    }

    public float getSpeedX() {
        return speedX;
    }

    public void setSpeedX(float speedX) {
        this.speedX = speedX;
    }

    public float getSpeedY() {
        return speedY;
    }

    public void setSpeedY(float speedY) {
        this.speedY = speedY;
    }
    public float[] getSpeed() {
        speed[0] = getSpeedX();
        speed[1] = getSpeedY();
        return speed;
    }
    public void setSpeed(float speedX,float speedY) {
        speed[0] = speedX;
        speed[1] = speedY;
    }
    @Override
    public String toString () {
        return super.toString() + " and speed x = " + getSpeed()[0] + " and speed y = " + getSpeed()[1] ;
    }
    public float[] getNewPoint () {
        newPoint[0] = super.getX() + getSpeedX();
        newPoint[1] = super.getY() + getSpeedY();
        return newPoint;
    }
    public String getnowPoint ()
        {
            return " new point have x = "+ getNewPoint()[0] + "and y = " + getNewPoint()[1];
        }

    public static void main(String[] args) {
        MoveAblePoint moveAblePoint = new MoveAblePoint(2.5f,3.5f);
        moveAblePoint.setX(5);
        moveAblePoint.setY(5);
        System.out.println(moveAblePoint);
        System.out.println(moveAblePoint.getnowPoint());
    }


}
