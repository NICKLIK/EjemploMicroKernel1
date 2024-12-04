
import java.util.HashMap;
import java.util.Map;



interface Plugin {
    String execute(String input);
}

public class Main {
    public static void main(String[] args) {
        Microkernel kernel = new Microkernel();


        kernel.registerPlugin("hello", new HelloWorldPlugin());
        kernel.registerPlugin("reverse", new ReverseStringPlugin());


        System.out.println(kernel.executePlugin("hello", "World"));
        System.out.println(kernel.executePlugin("reverse", "Microkernel"));
    }
}
