package p3;

import a8.y0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static String a(List list, String str, y0 y0Var, int i7) {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i7 & 2) != 0 ? "" : "[\n\t";
        String str3 = (i7 & 4) == 0 ? "\n]" : "";
        if ((i7 & 32) != 0) {
            y0Var = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            if (y0Var != null) {
                sb2.append((CharSequence) y0Var.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static final void b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
