import static org.junit.jupiter.api.Assertions.*;

class EquationsTest {
    @org.junit.jupiter.api.Test
    void testHypotenuseOfTriangleIsCorrect() {
        assertEquals(5.0, Equations.hypotenuseOfTriangle(3.0, 4.0));
    }

    @org.junit.jupiter.api.Test
    void testHypotenuseOfTriangleIsIncorrect() {
        assertNotEquals(3.3, Equations.hypotenuseOfTriangle(1.0, 1.0));
    }

    @org.junit.jupiter.api.Test
    void areaOfTriangleIsCorrect() {
        assertEquals(15.0, Equations.areaOfTriangle(5.0, 6.0));
    }
    @org.junit.jupiter.api.Test
    void areaOfTriangleIsIncorrect() {
        assertNotEquals(4.0, Equations.areaOfTriangle(6.0,1.0));
    }

    @org.junit.jupiter.api.Test
    void circumferenceOfCircleIsCorrect() {
        assertEquals(4.0, Equations.circumferenceOfCircle(16.0));
    }
    @org.junit.jupiter.api.Test
    void circumferenceOfCircleIsIncorrect() {
        assertNotEquals(4.0, Equations.circumferenceOfCircle(16.0));

    }

    @org.junit.jupiter.api.Test
    void areaOfCircleIsCorrect(){
        assertEquals(8.0,Equations.areaOfCircle(16.0));

    }

    @org.junit.jupiter.api.Test
    void areaOfCircleIsIncorrect() {
        assertNotEquals(8.0, Equations.areaOfCircle(16.0));
    }

    @org.junit.jupiter.api.Test
    void surfaceAreaOfSphereIsCorrect() {
        assertEquals(314.15926, Equations.surfaceAreaOfSphere(5));
    }
    @org.junit.jupiter.api.Test
    void surfaceAreaOfSphereIsIncorrect() {
        assertNotEquals(8.0, Equations.areaOfCircle(16.0));

    }

    @org.junit.jupiter.api.Test
    void volumeOfSphereIsCorrect() {
        assertEquals(84.82300164692441, Equations.volumeOfSphere(3.0));
    }
    @org.junit.jupiter.api.Test
    void volumeOfSphereIsIncorrect() {
        assertNotEquals(3.0, Equations.volumeOfSphere(1.0));
    }
}