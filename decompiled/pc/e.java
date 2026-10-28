package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f10438c = new e(f.f10442a);

    @Override // pc.a
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        i9.l.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // pc.n, pc.a
    public final void j(oc.a aVar, int i7, Object obj) {
        d dVar = (d) obj;
        i9.l.e(dVar, "builder");
        boolean zQ = aVar.q(this.f10498b, i7);
        dVar.b(dVar.d() + 1);
        boolean[] zArr = dVar.f10432a;
        int i10 = dVar.f10433b;
        dVar.f10433b = i10 + 1;
        zArr[i10] = zQ;
    }

    @Override // pc.a
    public final Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        i9.l.e(zArr, "<this>");
        d dVar = new d();
        dVar.f10432a = zArr;
        dVar.f10433b = zArr.length;
        dVar.b(10);
        return dVar;
    }

    @Override // pc.r0
    public final Object n() {
        return new boolean[0];
    }

    @Override // pc.r0
    public final void o(rc.s sVar, Object obj, int i7) {
        boolean[] zArr = (boolean[]) obj;
        i9.l.e(sVar, "encoder");
        i9.l.e(zArr, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            sVar.c(this.f10498b, i10, zArr[i10]);
        }
    }
}
