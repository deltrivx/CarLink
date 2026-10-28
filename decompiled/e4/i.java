package e4;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f4353a;

    public i(DisplayCutout displayCutout) {
        this.f4353a = displayCutout;
    }

    public final x3.b a() {
        return Build.VERSION.SDK_INT >= 30 ? x3.b.c(h.b(this.f4353a)) : x3.b.f14562e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f4353a, ((i) obj).f4353a);
    }

    public final int hashCode() {
        return this.f4353a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f4353a + "}";
    }
}
