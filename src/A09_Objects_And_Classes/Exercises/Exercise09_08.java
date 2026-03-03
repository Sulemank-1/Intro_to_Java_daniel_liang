package A09_Objects_And_Classes.Exercises;

public class Exercise09_08 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.print(fan1.toString());
        System.out.print(fan2.toString());

    }
}

class Fan{
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }


    public int getSpeed(){
        return speed;
    }

    public boolean isOn(){
        return on;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

   public void setSpeed(int newSpeed){
        speed = newSpeed;
   }

   public void setOn(boolean newOn){
        on = newOn;
   }

   public void setRadius(double newRadius){
        radius = newRadius;
   }

   public void setColor(String newColor){
        color = newColor;
   }

   public String toString(){
        if (on){
            String s = "";
            switch (speed) {
                case SLOW: s = "SLOW"; break;
                case MEDIUM: s = "MEDIUM"; break;
                case FAST: s = "FAST";
            }
            return "\nFan speed: " + s + ", color: " + color + ", radius: " + radius;
        }

        else
            return "\nFan color: " + color + ", radius: " + radius + "\nfan is off";
   }

}
