import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShowroomTest {

    Showroom showroom;

    @BeforeEach
    void setUp() {
        showroom = new Showroom();

    }

    @Test
    void canGiveVehicleCount() {
        assertThat(showroom.vehicleCount()).isEqualTo(0);
    }

    @Test
    void canAddVehicle() {
        Car car = new Car("BMW",4,5,30000);
        showroom.addVehicle(car);
        assertThat(showroom.vehicleCount()).isEqualTo(1);
    }

    @Test
    void canGetTill() {
        assertThat(showroom.getTill()).isEqualTo(0);
    }

    @Test
    void canGetStock() {
        ArrayList<Vehicle> result = new ArrayList<>();
        assertThat(showroom.getStock()).isEqualTo(result);
    }

    @Test
    void canSetTill() {
        showroom.setTill(10000);
        assertThat(showroom.getTill()).isEqualTo(10000);
    }

}
