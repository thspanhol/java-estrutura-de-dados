package java8;

import java.time.*;
import java.util.TimeZone;

public class Datas {
    public static void main(String[] args) {

        // Data local
        System.out.println(LocalDate.now());
        // Hora local
        System.out.println(LocalTime.now());
        // Data e Hora local
        System.out.println("São Paulo - " + LocalDateTime.now());
        // Data e Hora GTM
        System.out.println("GTM - " + Instant.now());
        // Data, Hora e Zona local
        System.out.println(ZonedDateTime.now());

        // Cria um Date específico no mesmo formato
        System.out.println(LocalDate.of(1996, Month.OCTOBER, 23));

        // Seta novo padrão para toda JVM
        //TimeZone.setDefault(TimeZone.getTimeZone("Europe/Berlin"));
        //System.out.println(LocalTime.now());

        ZoneId zone = ZoneId.of("America/Panama");
        System.out.println("Panama - " + LocalDateTime.now(zone));

    }
}
