package Percept.Sound;

import Geometry.Direction;

/**
 * Represents perception by hearing.
 */
public class SoundPercept {

    private SoundPerceptType type;
    private Direction direction;

    public SoundPercept(SoundPerceptType type, Direction direction) {
        this.type = type;
        this.direction = direction;
    }

    public SoundPerceptType getType() {
        return type;
    }

    /**
     * @return The direction from where the sounds comes from relative to the direction agent is facing.
     *         The direction grows clockwise.
     */
    public Direction getDirection() {
        return direction;
    }

}