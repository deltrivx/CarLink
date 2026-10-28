package r9;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f11795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11796b;

    public y1(ClassLoader classLoader) {
        this.f11795a = new WeakReference(classLoader);
        this.f11796b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y1) && this.f11795a.get() == ((y1) obj).f11795a.get();
    }

    public final int hashCode() {
        return this.f11796b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f11795a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
