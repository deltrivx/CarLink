package m3;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f8420b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f8421c = new l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f8422d = new l(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8423a;

    public l(int i7) {
        this.f8423a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f8423a == ((l) obj).f8423a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8423a;
    }

    public final String toString() {
        int i7 = this.f8423a;
        if (i7 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i7 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i7 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return a2.f.I(new StringBuilder("TextDecoration["), p3.a.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
