package k2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7182b;

    public a(int i7) {
        this.f7182b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i9.l.c(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f7182b == ((a) obj).f7182b;
    }

    public final int hashCode() {
        return this.f7182b;
    }

    public final String toString() {
        return a2.f.H(new StringBuilder("AndroidPointerIcon(type="), this.f7182b, ')');
    }
}
