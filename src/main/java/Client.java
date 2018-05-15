import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCompute;
import org.apache.ignite.Ignition;


public class Client {
    public static void main(String[] args) throws InterruptedException {
        Ignition.setClientMode(true);
        Ignite ignite = Ignition.start();

        IgniteCompute igniteCompute = ignite.compute();
        igniteCompute.broadcast(() -> System.out.println("ho-ho"));

        Thread.sleep(60000);
    }
}


