import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class functional_interface_old {

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        for(int i = 0; i < 10; i++) {
          final int index = i;
          executorService.submit(new Runnable() {
            public void run() {
              System.out.println("Running task " + index);
            }
          });
        }
        
        System.out.println("Tasks started...");
    }
    
}
