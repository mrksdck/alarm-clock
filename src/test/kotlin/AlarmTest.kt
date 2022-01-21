import io.kotest.core.spec.style.FunSpec
import java.time.LocalTime

class AlarmTest : FunSpec(){
    init {
        test("alarm clock rings") {
            val alarm = Alarm()
            alarm.ring(LocalTime.of(6,0))
        }
    }
}