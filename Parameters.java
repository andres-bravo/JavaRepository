import java.util.*;

public class Parameters{
    public static void main(String[] args){
        int i = 0;
        while (i < args.length) {
            System.out.println("Argumentos " + i + " : " + args[i]);
            i++;
        }
    }
}