package homework_19;
//Task 3
public class ImmutablePoint {
    private final int x;
    private final int y;

   public ImmutablePoint (int x, int y){
       this.x = x;
       this.y=y; // generate не дает сеттеры

   }

//   public void setX(int x){
//       this.x=x; // Final не дает поменять
//
//
//   }
//   public void setY(int y){
//       this.y=y;// Final не дает поменять
//   }
      // Task 4
    public void printMessage(final String message){
        System.out.println("Пришедьшее значение: " + message);
       // message = "hh"; //Final не дает поменять
    }

}
