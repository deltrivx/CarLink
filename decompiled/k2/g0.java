package k2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements PointerInputEventHandler, i9.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h9.n f7213a;

    public g0(h9.n nVar) {
        this.f7213a = nVar;
    }

    @Override // i9.h
    public final t8.e b() {
        return this.f7213a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof i9.h)) {
            return false;
        }
        return i9.l.a(this.f7213a, ((i9.h) obj).b());
    }

    public final int hashCode() {
        return this.f7213a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(z zVar, y8.c cVar) {
        return this.f7213a.invoke(zVar, cVar);
    }
}
