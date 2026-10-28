package g6;

import n5.i;
import n5.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5.b f5936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f5937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f5938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f5939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f5940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5944i;

    public c(c cVar) {
        this.f5936a = cVar.f5936a;
        this.f5937b = cVar.f5937b;
        this.f5938c = cVar.f5938c;
        this.f5939d = cVar.f5939d;
        this.f5940e = cVar.f5940e;
        this.f5941f = cVar.f5941f;
        this.f5942g = cVar.f5942g;
        this.f5943h = cVar.f5943h;
        this.f5944i = cVar.f5944i;
    }

    public c(t5.b bVar, o oVar, o oVar2, o oVar3, o oVar4) throws i {
        boolean z10 = oVar == null || oVar2 == null;
        boolean z11 = oVar3 == null || oVar4 == null;
        if (z10 && z11) {
            throw i.f8833c;
        }
        if (z10) {
            oVar = new o(0.0f, oVar3.f8855b);
            oVar2 = new o(0.0f, oVar4.f8855b);
        } else if (z11) {
            int i7 = bVar.f12761a;
            oVar3 = new o(i7 - 1, oVar.f8855b);
            oVar4 = new o(i7 - 1, oVar2.f8855b);
        }
        this.f5936a = bVar;
        this.f5937b = oVar;
        this.f5938c = oVar2;
        this.f5939d = oVar3;
        this.f5940e = oVar4;
        this.f5941f = (int) Math.min(oVar.f8854a, oVar2.f8854a);
        this.f5942g = (int) Math.max(oVar3.f8854a, oVar4.f8854a);
        this.f5943h = (int) Math.min(oVar.f8855b, oVar3.f8855b);
        this.f5944i = (int) Math.max(oVar2.f8855b, oVar4.f8855b);
    }
}
