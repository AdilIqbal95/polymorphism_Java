import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("BMW",4,5,30000);
    }

    @Test
    void canAccelerate() {
        assertThat(car.accelerate()).isEqualTo("Vehicle is accelerating");
    }

    @Test
    void canReduceSpeed() {
        assertThat(car.reduceSpeed()).isEqualTo("This car is reducing it's speed");
    }

    @Test
    void canDrive() {
        assertThat(car.drive()).isEqualTo("This car is driven around town");
    }

    @Test
    void canGetMake() {
        assertThat(car.getMake()).isEqualTo("BMW");
    }

    @Test
    void canGetNoOfWheels() {
        assertThat(car.getNoOfWheels()).isEqualTo(4);
    }

    @Test
    void canGetMaxOccupancy() {
        assertThat(car.getMaxOccupancy()).isEqualTo(5);
    }

    @Test
    void canGetPrice() {
        assertThat(car.getPrice()).isEqualTo(30000);
    }

    @Test
    void canSetMake() {
        car.setMake("Kia");
        assertThat(car.getMake()).isEqualTo("Kia");
    }

    @Test
    void canSetNoOfWheels() {
        car.setNoOfWheels(8);
        assertThat(car.getNoOfWheels()).isEqualTo(8);
    }

    @Test
    void canSetMaxOccupancy() {
        car.setMaxOccupancy(12);
        assertThat(car.getMaxOccupancy()).isEqualTo(12);
    }

    @Test
    void canSetPrice() {
        car.setPrice(20000);
        assertThat(car.getPrice()).isEqualTo(20000);
    }




}
