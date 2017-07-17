package script.lex;
import com.sun.corba.se.impl.oa.toa.TOA;
import com.sun.org.apache.bcel.internal.generic.FLOAD;

import java.util.Map;
import java.util.TreeMap;

public final class Lexer {

    private Map<String,TokenType>lexToken(){
        Map<String,TokenType>KeyWords=new TreeMap<>();
        KeyWords.put("method",TokenType.MethodName);
        KeyWords.put("+",TokenType.Addkey);
        KeyWords.put("-",TokenType.SubtructKey);
        KeyWords.put("*",TokenType.MultiplyKey);
        KeyWords.put("/",TokenType.DivideKey);
        KeyWords.put("class",TokenType.className);
        KeyWords.put("end", TokenType.MethodEndName);
        KeyWords.put("puts",TokenType.PrintName);
        KeyWords.put("endC",TokenType.classEndName);
        return KeyWords;
    }
     Float Operator(TokenType key,float a,float b){
         switch (key){
             case Addkey:
                 return a+b;
             case SubtructKey:
                 return a-b;
             case MultiplyKey:
                 return a*b;
             case DivideKey:
                 return a/b;
        }
        throw new AssertionError();

    }
}
