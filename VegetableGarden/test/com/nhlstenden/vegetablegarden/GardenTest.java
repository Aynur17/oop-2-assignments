package com.nhlstenden.vegetablegarden;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GardenTest
{
    @Test
    void plantVegetable_27Vegetables_doesNotThrowException()
    {
        // Arrange
        Garden garden = new Garden();

        for (int i = 0; i < 26; i++)
        {
            garden.plantVegetable(new Asparagus(
                    5.0, 0.000027, 0.0049, 20, Color.BLUE, Status.GROWING
            ));
        }

        // Act
        garden.plantVegetable(new Asparagus(
                5.0, 0.000027, 0.0049, 20, Color.BLUE, Status.GROWING
        ));

        // Assert
        assertEquals(27, garden.getVegetables().size());
    }

    @Test
    void plantVegetable_28Vegetables_throwsException()
    {
        // Arrange
        Garden garden = new Garden();

        for (int i = 0; i < 27; i++)
        {
            garden.plantVegetable(new Asparagus
                    (5, 0.000027, 0.0049, 20, Color.BLUE, Status.GROWING));
        }

        // Act + Assert
        assertThrows(
                TooManyVegetablesException.class,
                () -> garden.plantVegetable(new Asparagus(5, 0.000027, 0.0049, 20, Color.BLUE, Status.GROWING))
        );
    }
}