package x4;

import android.os.Build;
import android.text.TextUtils;
import n8.e;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f14587a;

    public a(String str, int i7, int i10) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.f14587a = new c(str, i7, i10);
            return;
        }
        b bVar = new b(str, i7, i10);
        e.s(str, i7, i10);
        this.f14587a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f14587a.equals(((a) obj).f14587a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14587a.hashCode();
    }
}
