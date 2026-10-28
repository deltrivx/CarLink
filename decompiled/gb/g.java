package gb;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends za.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f6183d;

    public g(ArrayList arrayList, h hVar) {
        this.f6182c = arrayList;
        this.f6183d = hVar;
    }

    @Override // za.k
    public final void b(x9.c cVar) {
        i9.l.e(cVar, "fakeOverride");
        za.j.r(cVar, null);
        this.f6182c.add(cVar);
    }

    @Override // za.k
    public final void d(x9.c cVar, x9.c cVar2) {
        i9.l.e(cVar2, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f6183d.f6185b + ": " + cVar + " vs " + cVar2).toString());
    }
}
