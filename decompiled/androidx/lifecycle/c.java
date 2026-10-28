package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f1014b;

    public c(int i7, Method method) {
        this.f1013a = i7;
        this.f1014b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1013a == cVar.f1013a && this.f1014b.getName().equals(cVar.f1014b.getName());
    }

    public final int hashCode() {
        return this.f1014b.getName().hashCode() + (this.f1013a * 31);
    }
}
