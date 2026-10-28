package d6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3776b;

    public b(int i7, ArrayList arrayList) {
        this.f3775a = new ArrayList(arrayList);
        this.f3776b = i7;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && this.f3775a.equals(((b) obj).f3775a);
    }

    public final int hashCode() {
        return this.f3775a.hashCode() ^ Boolean.FALSE.hashCode();
    }

    public final String toString() {
        return "{ " + this.f3775a + " }";
    }
}
