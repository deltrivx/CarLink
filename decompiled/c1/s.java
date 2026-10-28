package c1;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.w2 f2126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.w2 f2127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.w2 f2128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.w2 f2129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.w2 f2130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f2131f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f1.w2 w2Var, f1.w2 w2Var2, f1.w2 w2Var3, v.p0 p0Var, v.p0 p0Var2, p pVar) {
        super(1);
        this.f2126a = w2Var;
        this.f2127b = w2Var2;
        this.f2128c = w2Var3;
        this.f2129d = p0Var;
        this.f2130e = p0Var2;
        this.f2131f = pVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        float f10;
        a2.g gVar = (a2.g) obj;
        float fFloor = (float) Math.floor(gVar.R(v.f2206c));
        long j5 = ((y1.q) this.f2126a.getValue()).f14960a;
        long j10 = ((y1.q) this.f2127b.getValue()).f14960a;
        float fR = gVar.R(v.f2207d);
        float f11 = fFloor / 2.0f;
        a2.k kVar = new a2.k(fFloor, 0.0f, 0, 0, 30);
        float fD = x1.e.d(gVar.g());
        boolean zC = y1.q.c(j5, j10);
        a2.j jVar = a2.j.f23a;
        if (zC) {
            gVar.i0(j5, (226 & 2) != 0 ? 0L : 0L, n3.l.h(fD, fD), n3.l.a(fR), jVar);
            f10 = fFloor;
        } else {
            float f12 = fD - (2 * fFloor);
            f10 = fFloor;
            gVar.i0(j5, (226 & 2) != 0 ? 0L : n3.r.a(fFloor, fFloor), n3.l.h(f12, f12), n3.l.a(Math.max(0.0f, fR - fFloor)), jVar);
            float f13 = fD - f10;
            gVar.i0(j10, (226 & 2) != 0 ? 0L : n3.r.a(f11, f11), n3.l.h(f13, f13), n3.l.a(fR - f11), kVar);
        }
        long j11 = ((y1.q) this.f2128c.getValue()).f14960a;
        float fFloatValue = ((Number) this.f2129d.getValue()).floatValue();
        float fFloatValue2 = ((Number) this.f2130e.getValue()).floatValue();
        a2.k kVar2 = new a2.k(f10, 0.0f, 2, 0, 26);
        float fD2 = x1.e.d(gVar.g());
        float fE = n3.r.E(0.4f, 0.5f, fFloatValue2);
        float fE2 = n3.r.E(0.7f, 0.5f, fFloatValue2);
        float fE3 = n3.r.E(0.5f, 0.5f, fFloatValue2);
        float fE4 = n3.r.E(0.3f, 0.5f, fFloatValue2);
        p pVar = this.f2131f;
        pVar.f2052a.c();
        y1.h hVar = pVar.f2052a;
        Path path = hVar.f14895a;
        Path path2 = hVar.f14895a;
        path.moveTo(0.2f * fD2, fE3 * fD2);
        path2.lineTo(fE * fD2, fE2 * fD2);
        path2.lineTo(0.8f * fD2, fD2 * fE4);
        y1.i iVar = pVar.f2053b;
        iVar.f14902a.setPath(hVar != null ? hVar.f14895a : null, false);
        y1.h hVar2 = pVar.f2054c;
        hVar2.c();
        iVar.a(0.0f, iVar.f14902a.getLength() * fFloatValue, hVar2);
        a2.f.u(gVar, pVar.f2054c, j11, kVar2, 52);
        return t8.z.f12851a;
    }
}
