package test;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Date;
 
public class FieldTest {
 
    public static void main(String[] args) {
         
        Field[] fields = new Persion().getClass().getDeclaredFields();
        for(Field field : fields){
        }
 
    }
}
class Persion{
     
    String name = "";
     
    Date d =new Date();
    int age = 20;
     
    boolean isMarried = false;
     
}