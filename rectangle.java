
public class rectangle {
    float length = 1.0f;
    float width = 1.0f;

    rectangle(float a, float b) {
        length = a;
        width = b;
    }

    float getLength() {
        return length;
    }

    void setLength(float length) {
        this.length = length;
    }

    float getWidth() {
        return width;
    }

    void setWidth(float width) {
        this.width = width;
    }

    double getArea() {
        return length * width;
    }

    public String toString() {
        return "rectangle[length="+length+",width="+width+"]";
    }
}



