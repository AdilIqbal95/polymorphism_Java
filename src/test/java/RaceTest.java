import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RaceTest {

    Race race;

    @BeforeEach
    void setUp() {
        race = new Race();
    }

    @Test
    void canGiveRacerCount() {
        assertThat(race.racerCount()).isEqualTo(0);
    }

    @Test
    void canAddCar() {
        Car car = new Car("BMW",4,5,30000);
        race.addRacer(car);
        assertThat(race.racerCount()).isEqualTo(1);
    }

    @Test
    void canAddPlane() {
        Plane plane = new Plane("Boeing",6,450,8_500_000);
        race.addRacer(plane);
        assertThat(race.racerCount()).isEqualTo(1);
    }

}
