package ua.goit.gojavaonline.student.igorstolyarov.module03.flowers;

import java.lang.reflect.Type;

public class Aster extends Flowers {
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    Type type;

}
