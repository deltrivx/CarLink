package b3;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3.o f1356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f3.k f1358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f3.i f1359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f3.j f1360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f3.n f1361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m3.a f1364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m3.p f1365j;
    public final i3.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f1366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m3.l f1367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y1.k0 f1368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y f1369o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2.h f1370p;

    public h0(long j5, long j10, f3.k kVar, f3.i iVar, f3.j jVar, f3.n nVar, String str, long j11, m3.a aVar, m3.p pVar, i3.b bVar, long j12, m3.l lVar, y1.k0 k0Var, int i7) {
        this((i7 & 1) != 0 ? y1.q.f14958m : j5, (i7 & 2) != 0 ? n3.q.f8754c : j10, (i7 & 4) != 0 ? null : kVar, (i7 & 8) != 0 ? null : iVar, (i7 & 16) != 0 ? null : jVar, (i7 & 32) != 0 ? null : nVar, (i7 & 64) != 0 ? null : str, (i7 & 128) != 0 ? n3.q.f8754c : j11, (i7 & 256) != 0 ? null : aVar, (i7 & 512) != 0 ? null : pVar, (i7 & 1024) != 0 ? null : bVar, (i7 & 2048) != 0 ? y1.q.f14958m : j12, (i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0 ? null : lVar, (i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0 ? null : k0Var, (y) null);
    }

    public h0(long j5, long j10, f3.k kVar, f3.i iVar, f3.j jVar, f3.n nVar, String str, long j11, m3.a aVar, m3.p pVar, i3.b bVar, long j12, m3.l lVar, y1.k0 k0Var, y yVar) {
        this(j5 != 16 ? new m3.c(j5) : m3.n.f8425a, j10, kVar, iVar, jVar, nVar, str, j11, aVar, pVar, bVar, j12, lVar, k0Var, yVar, null);
    }

    public h0(m3.o oVar, long j5, f3.k kVar, f3.i iVar, f3.j jVar, f3.n nVar, String str, long j10, m3.a aVar, m3.p pVar, i3.b bVar, long j11, m3.l lVar, y1.k0 k0Var, y yVar, a2.h hVar) {
        this.f1356a = oVar;
        this.f1357b = j5;
        this.f1358c = kVar;
        this.f1359d = iVar;
        this.f1360e = jVar;
        this.f1361f = nVar;
        this.f1362g = str;
        this.f1363h = j10;
        this.f1364i = aVar;
        this.f1365j = pVar;
        this.k = bVar;
        this.f1366l = j11;
        this.f1367m = lVar;
        this.f1368n = k0Var;
        this.f1369o = yVar;
        this.f1370p = hVar;
    }

    public final boolean a(h0 h0Var) {
        if (this == h0Var) {
            return true;
        }
        return n3.q.a(this.f1357b, h0Var.f1357b) && i9.l.a(this.f1358c, h0Var.f1358c) && i9.l.a(this.f1359d, h0Var.f1359d) && i9.l.a(this.f1360e, h0Var.f1360e) && i9.l.a(this.f1361f, h0Var.f1361f) && i9.l.a(this.f1362g, h0Var.f1362g) && n3.q.a(this.f1363h, h0Var.f1363h) && i9.l.a(this.f1364i, h0Var.f1364i) && i9.l.a(this.f1365j, h0Var.f1365j) && i9.l.a(this.k, h0Var.k) && y1.q.c(this.f1366l, h0Var.f1366l) && i9.l.a(this.f1369o, h0Var.f1369o);
    }

    public final boolean b(h0 h0Var) {
        return i9.l.a(this.f1356a, h0Var.f1356a) && i9.l.a(this.f1367m, h0Var.f1367m) && i9.l.a(this.f1368n, h0Var.f1368n) && i9.l.a(this.f1370p, h0Var.f1370p);
    }

    public final h0 c(h0 h0Var) {
        if (h0Var == null) {
            return this;
        }
        m3.o oVar = h0Var.f1356a;
        return j0.a(this, oVar.b(), oVar.e(), oVar.a(), h0Var.f1357b, h0Var.f1358c, h0Var.f1359d, h0Var.f1360e, h0Var.f1361f, h0Var.f1362g, h0Var.f1363h, h0Var.f1364i, h0Var.f1365j, h0Var.k, h0Var.f1366l, h0Var.f1367m, h0Var.f1368n, h0Var.f1369o, h0Var.f1370p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return a(h0Var) && b(h0Var);
    }

    public final int hashCode() {
        m3.o oVar = this.f1356a;
        long jB = oVar.b();
        int i7 = y1.q.f14959n;
        int iA = t8.u.a(jB) * 31;
        y1.m mVarE = oVar.e();
        int iD = (n3.q.d(this.f1357b) + ((Float.floatToIntBits(oVar.a()) + ((iA + (mVarE != null ? mVarE.hashCode() : 0)) * 31)) * 31)) * 31;
        f3.k kVar = this.f1358c;
        int i10 = (iD + (kVar != null ? kVar.f5261a : 0)) * 31;
        f3.i iVar = this.f1359d;
        int i11 = (i10 + (iVar != null ? iVar.f5255a : 0)) * 31;
        f3.j jVar = this.f1360e;
        int i12 = (i11 + (jVar != null ? jVar.f5256a : 0)) * 31;
        f3.n nVar = this.f1361f;
        int iHashCode = (i12 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        String str = this.f1362g;
        int iD2 = (n3.q.d(this.f1363h) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        m3.a aVar = this.f1364i;
        int iFloatToIntBits = (iD2 + (aVar != null ? Float.floatToIntBits(aVar.f8401a) : 0)) * 31;
        m3.p pVar = this.f1365j;
        int iHashCode2 = (iFloatToIntBits + (pVar != null ? pVar.hashCode() : 0)) * 31;
        i3.b bVar = this.k;
        int iK = ob.a.k((iHashCode2 + (bVar != null ? bVar.f6614a.hashCode() : 0)) * 31, 31, this.f1366l);
        m3.l lVar = this.f1367m;
        int i13 = (iK + (lVar != null ? lVar.f8423a : 0)) * 31;
        y1.k0 k0Var = this.f1368n;
        int iHashCode3 = (i13 + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
        y yVar = this.f1369o;
        int iHashCode4 = (iHashCode3 + (yVar != null ? yVar.hashCode() : 0)) * 31;
        a2.h hVar = this.f1370p;
        return iHashCode4 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        m3.o oVar = this.f1356a;
        sb2.append((Object) y1.q.i(oVar.b()));
        sb2.append(", brush=");
        sb2.append(oVar.e());
        sb2.append(", alpha=");
        sb2.append(oVar.a());
        sb2.append(", fontSize=");
        sb2.append((Object) n3.q.e(this.f1357b));
        sb2.append(", fontWeight=");
        sb2.append(this.f1358c);
        sb2.append(", fontStyle=");
        sb2.append(this.f1359d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f1360e);
        sb2.append(", fontFamily=");
        sb2.append(this.f1361f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f1362g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) n3.q.e(this.f1363h));
        sb2.append(", baselineShift=");
        sb2.append(this.f1364i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.f1365j);
        sb2.append(", localeList=");
        sb2.append(this.k);
        sb2.append(", background=");
        ob.a.x(this.f1366l, sb2, ", textDecoration=");
        sb2.append(this.f1367m);
        sb2.append(", shadow=");
        sb2.append(this.f1368n);
        sb2.append(", platformStyle=");
        sb2.append(this.f1369o);
        sb2.append(", drawStyle=");
        sb2.append(this.f1370p);
        sb2.append(')');
        return sb2.toString();
    }
}
