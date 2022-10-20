
import java.io.*;
import java_cup.runtime.*;
   

public class MainClass {
  static public void main(String argv[]) {    
    /* Start the parser */
    try {
      parser p = new parser(new Lexer(new FileReader("C:/Users/unknown/eclipse-workspace/J1/src/test.txt")));
      Object result = p.parse().value;      
      System.out.println("Parser finished successfully."); 
    } catch (Exception e) {
      /* do cleanup here -- possibly rethrow e */
      e.printStackTrace();
    }
  }
}