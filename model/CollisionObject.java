package com.javarush.task.task34.task3410.model;

public abstract class CollisionObject extends GameObject {


    public CollisionObject(int x, int y) {
        super(x, y);
    }

    public boolean isCollision(GameObject gameObject, Direction direction){
        if (gameObject == null || direction == null) return false;
        int x = this.getX();
        int y = this.getY();


        if (direction == Direction.DOWN ) {
            y +=Model.FIELD_CELL_SIZE;
        }
        if (direction == Direction.UP) {
            y-=Model.FIELD_CELL_SIZE;
        }
        if (direction == Direction.RIGHT) {
            x+=Model.FIELD_CELL_SIZE;
        }
        if (direction == Direction.LEFT) {
            x-=Model.FIELD_CELL_SIZE;
        }

        return x == gameObject.getX() & y == gameObject.getY();
    }
}
