import java.util.Arrays;
import java.util.List;
import java.util.Random;

class TimeSlot {
  static Random random = new Random();
  
  public void schedule() {
    //...
  }
  
  public boolean isAvailable() {
    //...
    return random.nextBoolean();
  }
  
  public boolean scheduleIfAvailable() {
    boolean open = isAvailable();
    if(open) schedule();
    return open;
  }
}

public class collection_stream {
    public static void main(String[] args) {
      List<TimeSlot> timeSlots = Arrays.asList(
        new TimeSlot(), new TimeSlot(), new TimeSlot(), new TimeSlot(), new TimeSlot(), new TimeSlot());
        
      //...

      System.out.println("TimeSlot is " +
        timeSlots.stream()
                 .filter(TimeSlot::scheduleIfAvailable)
                 .findFirst());
      
  }
}