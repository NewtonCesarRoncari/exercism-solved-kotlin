import java.time.DayOfWeek
import java.time.LocalDate

class Meetup(private val month: Int, private val year: Int) {

    fun day(dayOfWeek: DayOfWeek, schedule: MeetupSchedule): LocalDate {
        return daysInMonth(dayOfWeek).run {

            when (schedule) {
                MeetupSchedule.FIRST -> first()
                MeetupSchedule.LAST -> last()
                MeetupSchedule.SECOND -> drop(1).first()
                MeetupSchedule.THIRD -> drop(2).first()
                MeetupSchedule.FOURTH -> drop(3).first()
                MeetupSchedule.TEENTH -> find { it.dayOfMonth > 12 }!!
            }
        }
    }

    private fun daysInMonth(dayOfWeek: DayOfWeek) =
        1.rangeTo(LocalDate.of(year, month, 1).lengthOfMonth())
            .map { LocalDate.of(year, month, it) }.filter { it.dayOfWeek == dayOfWeek }
}
