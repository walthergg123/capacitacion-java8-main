package apiTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class TimeTest {
    public static void main(String[] args) {
        LocalDate ahora = LocalDate.now();
        LocalDate fecha =LocalDate.of(2021, 8, 20);
        LocalDate fechaText = LocalDate.parse("2022-08-08");

        //System.out.println(ahora);//2022-08-08

        LocalDate mañana = LocalDate.now().plusDays(10);
        //System.out.println(fecha);

        Period periodo = Period.between(fecha,ahora);
        //System.out.println(periodo.getDays());




        //localTime
        LocalTime now = LocalTime.now();

        LocalTime doce30 = LocalTime.of(12, 30);
        LocalTime doce30Text = LocalTime.parse("12:30");
        //System.out.println(now);
        //System.out.println(doce30Text);


        //LocalDateTime

        LocalDateTime tiempoyfecha = LocalDateTime.now();

        LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        LocalDateTime.parse("2015-02-20T06:30:00");

        //System.out.println(tiempoyfecha);



        //duration

        LocalTime initialTime = LocalTime.of(6, 30, 0);

        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));

        long duracion = Duration.between(initialTime, finalTime).getSeconds();



        LocalDateTime localDateTime = LocalDateTime.now();

        //Zonas horarias
        ZoneId zoneId = ZoneId.of("Europe/Madrid"); //String contenido en : getAvailableZoneIds
        Set<String> zonas = ZoneId.getAvailableZoneIds();

        //zonas.forEach(System.out::println);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);

        //System.out.println(zonedDateTime);



        //formateando localDateTime
        String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);

        String localDateStringPers = localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        System.out.println(localDateStringPers);

    }
}
