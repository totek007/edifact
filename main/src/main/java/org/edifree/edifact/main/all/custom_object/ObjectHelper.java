package org.edifree.edifact.main.all.custom_object;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

public class ObjectHelper {

    public static boolean objectIsEmpty(Object e) throws IllegalArgumentException, IllegalAccessException {
        for (Field field : e.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (Collection.class.isAssignableFrom(field.getType())) {
                List get = (List) field.get(e);
                if (get != null) {
                    for (Object o : get) {
                        if (!objectIsEmpty(o)) {
                            return false;
                        }
                    }
                }
            } else {
                Object value = field.get(e);
                if (value != null) {
                    if (value instanceof Decimal) {
                        return false;
                    }
                    if (value instanceof String) {
                        return false;
                    }
                    if (!objectIsEmpty(value)) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    public static boolean objectIsSimpleType(Field field) {
        return field.getType().isAssignableFrom(String.class) || field.getType().isAssignableFrom(Decimal.class);
    }

}
