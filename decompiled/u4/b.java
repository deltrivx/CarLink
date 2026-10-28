package u4;

import i9.l;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13062a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.a(this.f13062a, ((b) obj).f13062a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13062a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f13062a + ')';
    }
}
