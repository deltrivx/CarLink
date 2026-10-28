package i2;

import android.view.KeyEvent;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyEvent f6600a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.a(this.f6600a, ((b) obj).f6600a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6600a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f6600a + ')';
    }
}
