package script.compile;
import script.lex.Lexer;
import sun.font.Script;

import java.io.*;

public class CompilerManager {
   private String scriptFileName;

   public CompilerManager(String scriptFileName){
      this.scriptFileName=scriptFileName;
   }
   static void printStartingMessage(){
      System.out.println("usage: unless script-file");
   }
   public static void main(String[]args)throws Exception{
      if(args.length==0){
         printStartingMessage();
         return;
      }
      try{

      }
      catch (Exception ex){
         System.out.println("compileError:"+ex);
      }
   }
}
