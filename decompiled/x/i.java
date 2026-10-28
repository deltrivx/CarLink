package x;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3.c f14388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0.h0 f14390d;

    public i(Context context, n3.c cVar, long j5, d0.h0 h0Var) {
        this.f14387a = context;
        this.f14388b = cVar;
        this.f14389c = j5;
        this.f14390d = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i9.l.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        i iVar = (i) obj;
        return i9.l.a(this.f14387a, iVar.f14387a) && i9.l.a(this.f14388b, iVar.f14388b) && y1.q.c(this.f14389c, iVar.f14389c) && i9.l.a(this.f14390d, iVar.f14390d);
    }

    public final int hashCode() {
        int iHashCode = (this.f14388b.hashCode() + (this.f14387a.hashCode() * 31)) * 31;
        int i7 = y1.q.f14959n;
        return this.f14390d.hashCode() + ob.a.k(iHashCode, 31, this.f14389c);
    }
}
