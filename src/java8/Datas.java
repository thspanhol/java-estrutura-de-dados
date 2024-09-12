package java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.TimeZone;

public class Datas {
    public static void main(String[] args) {

        // Constructors privados
        // Acessa os dados atuais pelo now
        // Acessa dados específicos pelo of
        // Enum de meses
        // Manipula aumento e diminuição do tempo pelos plus e minus
        // Os dados são imutaveis
        // Valores de data errados quebram o código (ex: mês 13)

        // LocalDate - Representa uma data
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        LocalDate hojeOf = LocalDate.of(1996, Month.OCTOBER, 23);
        System.out.println(hojeOf);
        System.out.println(hoje.plusWeeks(2));
        System.out.println(hoje.minusYears(2));


        // LocalTime - Representa uma hora
        LocalTime agora = LocalTime.now();
        System.out.println(agora);
        LocalTime agoraOf = LocalTime.of(11,10,11,500);
        System.out.println(agoraOf);

        // LocalDateTime - Representa uma data e hora
        LocalDateTime dataEhora = LocalDateTime.now();
        System.out.println(dataEhora);
        LocalDateTime dataEhoraOf = LocalDateTime.of(hojeOf, agoraOf);
        System.out.println(dataEhoraOf);

        // Intant - Milissegundos desde 01/01/1970 00:00:00 (não pega local)
        Instant instante = Instant.now();
        System.out.println(instante);
        Instant instanteOf = Instant.ofEpochMilli(5000000000000l);
        System.out.println(instanteOf);

        // ZonedDateTime - Representa uma data e hora da zona informada
        ZonedDateTime dataEhoraZona = ZonedDateTime.now();
        System.out.println(dataEhoraZona);
        ZonedDateTime dataEhoraZonaOf = ZonedDateTime.of(dataEhoraOf, ZoneId.of("Europe/Berlin"));
        System.out.println(dataEhoraZonaOf);

        // Period e Duration armazenam um espaço de tempo
        // Period em data (dia, semana ...)
        // Duration em tempo (... minutos, horas)

        Period periodo = Period.of(1,2,3);
        System.out.println(periodo);
        Period periodoOfDays = Period.ofDays(2);
        System.out.println(periodoOfDays);
        Period periodoOfWeeks = Period.ofWeeks(4);
        System.out.println(periodoOfWeeks);

        // Between e Util calculam periodos entre datas
        // Plus e Minus aumentam ou diminuem o período
        // A classe Period não interage com marcação de tempo (... minutos, horas)
        // A classe Duration não interage com marcação de data (dias, semanas ...)


        Period entrePeriodos = Period.between(hoje.plusYears(6), hojeOf.minusMonths(14));
        System.out.println(entrePeriodos);
        Period entrePeriodos2 = hoje.until(hojeOf);
        System.out.println(entrePeriodos2);

        //

        Duration duracao = Duration.ofHours(500);
        System.out.println(duracao);
        Duration duracaoOfDays = Duration.ofDays(2);
        System.out.println(duracaoOfDays);
        Duration entreDuracoes = Duration.between(agora.plusHours(6), agoraOf.minusHours(1));
        System.out.println(entreDuracoes);
        //long entreDuracoes2 = agora.until(agoraOf, ChronoUnit.SECONDS);
        //System.out.println(entreDuracoes2);

        // DateTimeFormater
        // Também quebra se a formatação pedida não tem acesso a todos os dados
        // Ex: FormatStyle.FULL sem informar a zona local

        // Formata pelo ISO
        DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter isoDate = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter isoTime = DateTimeFormatter.ISO_TIME;
        // Formata com estilo, pelo local
        //Locale.setDefault(Locale.US);
        DateTimeFormatter styleShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter styleMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter styleLong = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter styleFull = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        // Formata como foi orientado
        DateTimeFormatter proprio = DateTimeFormatter.ofPattern("dd*MM*yyyy HH*mm*ss");
        String formatado = proprio.format(ZonedDateTime.now());
        String formatadoInvertido = ZonedDateTime.now().format(proprio);

        // Parse converte de String para data/tempo
        System.out.println(formatado);
        System.out.println(formatadoInvertido);
        System.out.println(proprio.parse("08*11*2034 12*07*41"));
        System.out.println(LocalDateTime.from(proprio.parse("08*11*2034 12*07*41")));

    }
}
