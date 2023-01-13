package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class StreamParaleloTest {
    public static void main(String[] args) {
        int max = 1_000_000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        //Stream secuencial
        long t0 = System.nanoTime();

        long count = values.stream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("el ordenamiento secuencial toma: %d ms", millis));

        //Stream paralelo
        long t0p = System.nanoTime();

        long countp = values.parallelStream().sorted().count();
        System.out.println(countp);

        long t1p = System.nanoTime();

        long millisp = TimeUnit.NANOSECONDS.toMillis(t1p - t0p);
        System.out.println(String.format("el ordenamiento paralelo toma: %d ms", millisp));
    }
}
