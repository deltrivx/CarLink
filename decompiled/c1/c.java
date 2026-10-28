package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.p f1824b;

    public /* synthetic */ c(p1.p pVar, int i7) {
        this.f1823a = i7;
        this.f1824b = pVar;
    }

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        switch (this.f1823a) {
            case 0:
                b0.j jVar = (b0.j) obj;
                boolean z10 = jVar instanceof b0.h;
                p1.p pVar = this.f1824b;
                if (z10) {
                    pVar.add(jVar);
                } else if (jVar instanceof b0.i) {
                    pVar.remove(((b0.i) jVar).f1114a);
                } else if (jVar instanceof b0.d) {
                    pVar.add(jVar);
                } else if (jVar instanceof b0.e) {
                    pVar.remove(((b0.e) jVar).f1106a);
                } else if (jVar instanceof b0.m) {
                    pVar.add(jVar);
                } else if (jVar instanceof b0.n) {
                    pVar.remove(((b0.n) jVar).f1118a);
                } else if (jVar instanceof b0.l) {
                    pVar.remove(((b0.l) jVar).f1116a);
                }
                break;
            default:
                b0.j jVar2 = (b0.j) obj;
                boolean z11 = jVar2 instanceof b0.m;
                p1.p pVar2 = this.f1824b;
                if (z11) {
                    pVar2.add(jVar2);
                } else if (jVar2 instanceof b0.n) {
                    pVar2.remove(((b0.n) jVar2).f1118a);
                } else if (jVar2 instanceof b0.l) {
                    pVar2.remove(((b0.l) jVar2).f1116a);
                } else if (jVar2 instanceof b0.b) {
                    pVar2.add(jVar2);
                } else if (jVar2 instanceof b0.c) {
                    pVar2.remove(((b0.c) jVar2).f1105a);
                } else if (jVar2 instanceof b0.a) {
                    pVar2.remove(((b0.a) jVar2).f1104a);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
