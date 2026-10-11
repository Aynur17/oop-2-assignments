package com.nhlstenden.vegetablegarden;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsparagusTest
{

    @Test
    void grow_withSunshineAndRain_returnsResult()
    {
        Asparagus asparagus = new Asparagus(10, 0.000027, 0.0049, 20, Color.BLUE, Status.GROWING);

        asparagus.grow(10000, 20, 1);

        double expectedGrowth = 10000 * 0.000027 + 20 * 0.0049;

        assertEquals(10 + expectedGrowth, asparagus.getSizeInCm(), 0.000001);
    }

    @Test
    void grow_asparagusReadyToHarvest_returnsStatus()
    {
        Asparagus asparagus = new Asparagus(19.9, 0.000027, 0.0049, 20, Color.BLUE, Status.GROWING);

        asparagus.grow(10000, 20, 1);

        assertEquals(Status.READY_TO_HARVEST, asparagus.getStatus());
    }

    @Test
    void grow_asparagusIsDestroyedAfterTenDaysWithoutTooLittleRain_returnsStatus()
    {
        Asparagus asparagus = new Asparagus(
                10, 0.000027, 0.0049,
                20, Color.BLUE, Status.GROWING
        );

        asparagus.grow(10000, 13, 10);

        assertEquals(Status.DESTROYED,
                asparagus.getStatus());
    }
}