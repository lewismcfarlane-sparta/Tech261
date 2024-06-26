package com.sparta.lm;

public class ObjectRectangle {
    private Object width;
    private Object height;

    public ObjectRectangle(Object height, Object width) {
        this.height = height;
        this.width = width;
    }

    public Object getWidth() {
        return width;
    }

    public void setWidth(Object width) {
        this.width = width;
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Object height) {
        this.height = height;
    }
}
