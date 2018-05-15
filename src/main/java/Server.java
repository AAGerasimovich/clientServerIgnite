import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCompute;
import org.apache.ignite.Ignition;


public class Server {
    public static void main(String[] args) throws InterruptedException {

        Ignite ignite = Ignition.start();
        IgniteCompute igniteCompute = ignite.compute();
        Thread.sleep(60000);
    }
}







