import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlaneTest {

    Plane plane;

    @BeforeEach
    void setUp() {
        plane = new Plane("Boeing",6,450,8_500_000);
    }

    @Test
    void canTakeoff() {
        plane.takeoff(10000);
        assertThat(plane.getFlightHeight()).isEqualTo(10000);
    }

    @Test
    void canLand() {
        assertThat(plane.getFlightHeight()).isEqualTo(0);
    }

    @Test
    void canAccelerate() {
        assertThat(plane.accelerate()).isEqualTo("Vehicle is accelerating");
    }

    @Test
    void canGetFlightHeight() {
        assertThat(plane.getFlightHeight()).isEqualTo(0);
    }

    @Test
    void canGetMake() {
        assertThat(plane.getMake()).isEqualTo("Boeing");
    }

    @Test
    void canGetNoOfWheels() {
        assertThat(plane.getNoOfWheels()).isEqualTo(6);
    }

    @Test
    void canGetMaxOccupancy() {
        assertThat(plane.getMaxOccupancy()).isEqualTo(450);
    }

    @Test
    void canGetPrice() {
        assertThat(plane.getPrice()).isEqualTo(8_500_000);
    }

    @Test
    void canSetFlightHeight() {
        plane.setFlightHeight(6000);
        assertThat(plane.getFlightHeight()).isEqualTo(6000);
    }

    @Test
    void canSetMake() {
        plane.setMake("Airbus");
        assertThat(plane.getMake()).isEqualTo("Airbus");
    }

    @Test
    void canSetNoOfWheels() {
        plane.setNoOfWheels(22);
        assertThat(plane.getNoOfWheels()).isEqualTo(22);
    }

    @Test
    void canSetMaxOccupancy() {
        plane.setMaxOccupancy(800);
        assertThat(plane.getMaxOccupancy()).isEqualTo(800);
    }

    @Test
    void canSetPrice() {
        plane.setPrice(12_000_000);
        assertThat(plane.getPrice()).isEqualTo(12_000_000);
    }

}
