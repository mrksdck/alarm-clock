import java.time.LocalTime

/*
This is a code example of an alarm clock
It sufficiently covers the requirement that it should ring at six o'clock
 */

class Alarm {

    fun ring(time: LocalTime) {
        if(time.equals(LocalTime.of(6,0))){
            printRing()
        }
    }

    fun printRing() {
        print("It is 6:00 o'clock")
    }
}