package ru.itmo.task3;

import ru.itmo.task3.creatures.Creature;
import ru.itmo.task3.creatures.NotWhale;
import ru.itmo.task3.creatures.Whale;
import ru.itmo.task3.position.NaturalPosition;
import ru.itmo.task3.position.Position;
import ru.itmo.task3.position.UnnaturalPosition;

public class PoorCreature {
    private Creature current_creature;
    private Position current_position;
    private boolean is_understand;

    public PoorCreature()
    {
        current_creature = new Whale();
        current_position = new NaturalPosition();
        is_understand = true;
    }

    public boolean ChangePosition()
    {
        if (!is_understand)
            return false;
        current_position = new UnnaturalPosition();
        is_understand = false;
        return true;
    }

    public boolean Understand()
    {
        if (is_understand)
            return false;
        current_creature = new NotWhale();
        is_understand = true;
        return true;
    }

    @Override
    public String toString() {
        return current_creature.getName() + " в положении " + current_position.getName() + (is_understand ? " осознал свое положение" : " не осознал свое положение");
    }
}
