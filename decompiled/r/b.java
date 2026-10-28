package r;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f11061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f11062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11063c;

    public b(c cVar, c cVar2, int i7) {
        this.f11063c = i7;
        this.f11061a = cVar2;
        this.f11062b = cVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f11061a == cVar && cVar == this.f11062b) {
            this.f11062b = null;
            this.f11061a = null;
        }
        c cVar3 = this.f11061a;
        if (cVar3 == cVar) {
            switch (this.f11063c) {
                case 0:
                    cVar2 = cVar3.f11067d;
                    break;
                default:
                    cVar2 = cVar3.f11066c;
                    break;
            }
            this.f11061a = cVar2;
        }
        c cVar4 = this.f11062b;
        if (cVar4 == cVar) {
            c cVar5 = this.f11061a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f11062b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f11063c) {
            case 0:
                return cVar.f11066c;
            default:
                return cVar.f11067d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11062b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f11062b;
        c cVar2 = this.f11061a;
        this.f11062b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
