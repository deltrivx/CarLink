package h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1.b f6388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.k f6389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s.h0 f6390c;

    public t(o1.b bVar, f0.k kVar) {
        this.f6388a = bVar;
        this.f6389b = kVar;
        long[] jArr = s.o0.f12476a;
        this.f6390c = new s.h0();
    }

    public final h9.n a(int i7, Object obj, Object obj2) {
        s.h0 h0Var = this.f6390c;
        s sVar = (s) h0Var.g(obj);
        if (sVar != null && sVar.f6370c == i7 && i9.l.a(sVar.f6369b, obj2)) {
            n1.c cVar = sVar.f6371d;
            if (cVar != null) {
                return cVar;
            }
            n1.c cVar2 = new n1.c(new a8.k0(13, sVar.f6372e, sVar), 818252804, true);
            sVar.f6371d = cVar2;
            return cVar2;
        }
        s sVar2 = new s(this, i7, obj, obj2);
        h0Var.m(obj, sVar2);
        n1.c cVar3 = sVar2.f6371d;
        if (cVar3 != null) {
            return cVar3;
        }
        n1.c cVar4 = new n1.c(new a8.k0(13, this, sVar2), 818252804, true);
        sVar2.f6371d = cVar4;
        return cVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        s sVar = (s) this.f6390c.g(obj);
        if (sVar != null) {
            return sVar.f6369b;
        }
        v vVar = (v) this.f6389b.invoke();
        int iD = vVar.d(obj);
        if (iD != -1) {
            return vVar.c(iD);
        }
        return null;
    }
}
