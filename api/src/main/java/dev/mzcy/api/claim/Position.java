package dev.mzcy.api.claim;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a position in a specific world with x, y, and z coordinates.
 *
 * @param world the name of the world where the position is located.
 * @param x the x-coordinate of the position.
 * @param y the y-coordinate of the position.
 * @param z the z-coordinate of the position.
 */
public record Position(String world, int x, int y, int z) {

    /**
     * Checks if this position is within a cuboid defined by two other positions.
     *
     * @param pos1 one corner of the cuboid.
     * @param pos2 the opposite corner of the cuboid.
     * @return true if this position is within the cuboid, false otherwise.
     */
    public boolean isInCuboid(Position pos1, Position pos2) {
        int minX = Math.min(pos1.x, pos2.x);
        int maxX = Math.max(pos1.x, pos2.x);
        int minY = Math.min(pos1.y, pos2.y);
        int maxY = Math.max(pos1.y, pos2.y);
        int minZ = Math.min(pos1.z, pos2.z);
        int maxZ = Math.max(pos1.z, pos2.z);

        return x >= minX && x <= maxX &&
                y >= minY && y <= maxY &&
                z >= minZ && z <= maxZ &&
                world.equals(pos1.world);
    }
}
