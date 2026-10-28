package t8;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h9.a f12815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12816b;

    @Override // t8.h
    public final Object getValue() {
        if (this.f12816b == w.f12848a) {
            h9.a aVar = this.f12815a;
            i9.l.b(aVar);
            this.f12816b = aVar.invoke();
            this.f12815a = null;
        }
        return this.f12816b;
    }

    public final String toString() {
        return this.f12816b != w.f12848a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
