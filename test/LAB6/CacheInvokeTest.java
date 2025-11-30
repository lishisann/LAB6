package LAB6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheInvokeTest {

    @Test
    public void testCacheAndInvoke() throws Exception {
        Class<?> cls = CacheInvokeExample.class;
        Cache cache = cls.getAnnotation(Cache.class);
        assertArrayEquals(new String[]{"users", "orders"}, cache.value());

        Object obj = cls.getDeclaredConstructor().newInstance();
        Method[] methods = cls.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(Invoke.class)) {
                m.invoke(obj);
            }
        }

        CacheInvokeExample instance = (CacheInvokeExample) obj;
        assertTrue(instance.invoked);
    }

    @Test
    public void testEmptyCache() {
        @Cache({})
        class Temp {}

        Cache cache = Temp.class.getAnnotation(Cache.class);

        assertEquals(0, cache.value().length);

        Map<String, Object> fakeCache = new HashMap<>();

        if (cache.value().length == 0) {
            assertTrue(fakeCache.isEmpty());
        }
    }
}
