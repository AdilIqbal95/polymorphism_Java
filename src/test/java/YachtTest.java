import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class YachtTest {

    Yacht yacht;

    @BeforeEach
    void setUp() {
        yacht = new Yacht("Prestige",0,20,1_500_000,2);
    }

    @Test
    void canDeployLifeBoat() {
        assertThat(yacht.deployLifeBoat()).isEqualTo("Life boat deployed");
    }


    @Test
    void canAccelerate() {
        assertThat(yacht.accelerate()).isEqualTo("Vehicle is accelerating");
    }

    @Test
    void canReduceSpeed() {
        assertThat(yacht.reduceSpeed()).isEqualTo("This yacht is reducing it's speed");
    }


    @Test
    void canGetNoOfRooms() {
        assertThat(yacht.getNoOfRooms()).isEqualTo(2);
    }

    @Test
    void canGetMake() {
        assertThat(yacht.getMake()).isEqualTo("Prestige");
    }

    @Test
    void canGetNoOfWheels() {
        assertThat(yacht.getNoOfWheels()).isEqualTo(0);
    }

    @Test
    void canGetMaxOccupancy() {
        assertThat(yacht.getMaxOccupancy()).isEqualTo(20);
    }

    @Test
    void canGetPrice() {
        assertThat(yacht.getPrice()).isEqualTo(1_500_000);
    }

    @Test
    void canSetNoOfRooms() {
        yacht.setNoOfRooms(3);
        assertThat(yacht.getNoOfRooms()).isEqualTo(3);
    }

    @Test
    void canSetMake() {
        yacht.setMake("Zeelander");
        assertThat(yacht.getMake()).isEqualTo("Zeelander");
    }

    @Test
    void canSetNoOfWheels() {
        yacht.setNoOfWheels(8);
        assertThat(yacht.getNoOfWheels()).isEqualTo(8);
    }

    @Test
    void canSetMaxOccupancy() {
        yacht.setMaxOccupancy(12);
        assertThat(yacht.getMaxOccupancy()).isEqualTo(12);
    }

    @Test
    void canSetPrice() {
        yacht.setPrice(2_000_000);
        assertThat(yacht.getPrice()).isEqualTo(2_000_000);
    }


}
