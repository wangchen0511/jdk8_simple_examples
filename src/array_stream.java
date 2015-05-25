import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import java.io.*;

public class array_stream {
    public static void main(String[] args) {
      File aDirectory = new File(".");
      
      System.out.println(
      Stream.of(aDirectory.listFiles())
              .map(File::getName)
              .collect(joining(", ")));
  }
}