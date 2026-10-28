package a4;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f32b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f33a;

    public e(g gVar) {
        this.f33a = gVar;
    }

    public static e a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new e(new i(d.a(localeArr))) : new e(new f(localeArr));
    }

    public static e b(String str) {
        if (str == null || str.isEmpty()) {
            return f32b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str2 = strArrSplit[i7];
            int i10 = c.f31a;
            localeArr[i7] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f33a.equals(((e) obj).f33a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33a.hashCode();
    }

    public final String toString() {
        return this.f33a.toString();
    }
}
