import io.kotest.core.spec.style.FunSpec
import io.mockk.confirmVerified
import io.mockk.spyk
import io.mockk.verify
import java.time.LocalTime

class AlarmTest : FunSpec(){
    init {
        test("alarm clock rings") {
            val alarm = spyk(Alarm())
            alarm.ring(LocalTime.of(6,0))

            verify { alarm.ring(LocalTime.of(6,0)) }
            verify { alarm.printRing("It is 6:00 o'clock") }

            confirmVerified(alarm.printRing("It is 6:00 o'clock"))
        }
    }
}