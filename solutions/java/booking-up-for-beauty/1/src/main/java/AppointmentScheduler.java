import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {

    public LocalDateTime schedule(final String appointmentDateDescription) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy H:mm:ss", Locale.US);
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(final LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(final LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(final LocalDateTime appointmentDate) {
        return "You have an appointment on " +
                appointmentDate.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.", Locale.US));
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
