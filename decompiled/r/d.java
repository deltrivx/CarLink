package r;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f11068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11069b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f11070c;

    public d(f fVar) {
        this.f11070c = fVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        c cVar2 = this.f11068a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f11067d;
            this.f11068a = cVar3;
            this.f11069b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11069b) {
            return this.f11070c.f11071a != null;
        }
        c cVar = this.f11068a;
        return (cVar == null || cVar.f11066c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f11069b) {
            this.f11069b = false;
            this.f11068a = this.f11070c.f11071a;
        } else {
            c cVar = this.f11068a;
            this.f11068a = cVar != null ? cVar.f11066c : null;
        }
        return this.f11068a;
    }
}
