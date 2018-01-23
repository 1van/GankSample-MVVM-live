package ivan.gank.utils;

import android.os.Build;
import android.util.Log;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayLinkedHashMap<K, V> extends LinkedHashMap<K, V> {

    private static final String TAG = "ArrayLinkedHashMap";

    private int index = -1;

    @Override
    public V put(K key, V value) {
        index++;
        return super.put(key, value);
    }

    public Map.Entry<K, V> get(int index) {
        if (Build.VERSION.SDK_INT < 26) {
            index++;
        }
        Object after = getHead(this);
        for (int i = 0; i < index; i++) {
            after = getAfter(after);
        }
        return (Map.Entry<K, V>) after;
    }

    public int indexOf(Map.Entry<K, V> entry) {
        if (entry == null) {
            for (int i = 0; i < index; i++)
                if (get(i) == null)
                    return i;
        } else {
            for (int i = 0; i < index; i++)
                if (entry.equals(get(i)))
                    return i;
        }
        return -1;
    }

    private Object getHead(Object obj) {
        Class<? extends ArrayLinkedHashMap> clazz = this.getClass();
        Class<?> classLinkedHashMap = clazz.getSuperclass();
        Field headField = null;
        try {
            if (Build.VERSION.SDK_INT > 25) {
                // API 26
                headField = classLinkedHashMap.getDeclaredField("head");
            } else {
                // API 16-25
                headField = classLinkedHashMap.getDeclaredField("header");
            }
            if (headField != null) {
                headField.setAccessible(true);
                return headField.get(obj);
            } else {
                Log.e(TAG, "head is null");
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Object getAfter(Object obj) {
        Field afterField = null;
        try {
            if (Build.VERSION.SDK_INT > 23) {
                // API 24-26
                Class clazzLinkedHashMapEntry = Class.forName("java.util.LinkedHashMap$LinkedHashMapEntry");
                afterField = clazzLinkedHashMapEntry.getDeclaredField("after");
            } else {
                // API 16-23
                Class clazzLinkedHashMapEntry = Class.forName("java.util.LinkedHashMap$LinkedEntry");
                afterField = clazzLinkedHashMapEntry.getDeclaredField("nxt");
            }
            if (afterField != null) {
                afterField.setAccessible(true);
                return afterField.get(obj);
            } else {
                Log.e(TAG, "not found \"after\"");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

}
