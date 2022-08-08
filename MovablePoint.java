package Day1;

public class MovablePoint implements Movable {
     int x ;
     int y;
     int xSpeed;
     int ySpeed;

     public MovablePoint(int x , int y ,int xSpeed,int ySpeed){
         this.x=x;
         this.y=y;
         this.xSpeed=xSpeed;
         this.ySpeed=ySpeed;
     }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }


    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp(){
        System.out.println("moveUp = " + (getxSpeed()+getySpeed()));
     }

     @Override
    public void moveDown(){
         System.out.println("moveDown"+(getxSpeed()-getySpeed()));
    }

    @Override
    public void moveRight(){
        System.out.println("moveRight"+(getxSpeed()-getySpeed()));
    }

    @Override
    public void moveLift() {
        System.out.println("moveLift"+(getxSpeed()+getySpeed()));
    }
}
