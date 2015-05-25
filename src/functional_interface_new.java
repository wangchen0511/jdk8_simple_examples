import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class functional_interface_new {

    /*
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        IntStream.range(0, 10)
                .forEach(index ->
                  executorService.submit(() -> System.out.println("Running task " + index)));
                
        System.out.println("Tasks started...");
        executorService.shutdown();
    }
    */
    
    public static void main(String[] args) throws Exception {
        
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        for(int i = 0; i < 10; i++) {
          final int index = i;
          executorService.submit(() -> System.out.println("Running task " + index));
        }
        
        System.out.println("Tasks started...");
    }
    
}
