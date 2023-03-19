package ru.itmo.task3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class domainModelTest {
    @Test
    void normalSituationTest()
    {
        PoorCreature creature = new PoorCreature();

        assertEquals(creature.toString(), "кит в положении Естественная позиция осознал свое положение");
        assertTrue(creature.ChangePosition());
        assertEquals(creature.toString(), "кит в положении неестественная позиция не осознал свое положение");
        assertTrue(creature.Understand());
        assertEquals(creature.toString(), "не кит в положении неестественная позиция осознал свое положение");
    }

    @Test
    void unnormalSituationTest()
    {
        PoorCreature creature = new PoorCreature();

        assertEquals(creature.toString(), "кит в положении Естественная позиция осознал свое положение");
        assertFalse(creature.Understand());
        assertEquals(creature.toString(), "кит в положении Естественная позиция осознал свое положение");
        assertTrue(creature.ChangePosition());
        assertFalse(creature.ChangePosition());
        assertEquals(creature.toString(), "кит в положении неестественная позиция не осознал свое положение");
    }
}
