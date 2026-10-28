package s9;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f12677a = new e();

    @Override // h9.k
    public final Object invoke(Object obj) {
        String string;
        Map.Entry entry = (Map.Entry) obj;
        i9.l.e(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            i9.l.d(string, "toString(...)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            i9.l.d(string, "toString(...)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            i9.l.d(string, "toString(...)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            i9.l.d(string, "toString(...)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            i9.l.d(string, "toString(...)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            i9.l.d(string, "toString(...)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            i9.l.d(string, "toString(...)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            i9.l.d(string, "toString(...)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            i9.l.d(string, "toString(...)");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }
}
