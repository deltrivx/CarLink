package w2;

import a2.f;
import android.content.res.Resources;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f14087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14088b;

    public b(Resources.Theme theme, int i7) {
        this.f14087a = theme;
        this.f14088b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f14087a, bVar.f14087a) && this.f14088b == bVar.f14088b;
    }

    public final int hashCode() {
        return (this.f14087a.hashCode() * 31) + this.f14088b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f14087a);
        sb2.append(", id=");
        return f.H(sb2, this.f14088b, ')');
    }
}
