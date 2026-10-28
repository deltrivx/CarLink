package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r0 f1437d = new r0(0, 0, null, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f1438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f1439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f1440c;

    public r0(long j5, long j10, f3.k kVar, long j11, int i7, long j12, int i10) {
        this(new h0((i10 & 1) != 0 ? y1.q.f14958m : j5, (i10 & 2) != 0 ? n3.q.f8754c : j10, (i10 & 4) != 0 ? null : kVar, (f3.i) null, (f3.j) null, (i10 & 32) != 0 ? null : f3.n.f5264b, (String) null, (i10 & 128) != 0 ? n3.q.f8754c : j11, (m3.a) null, (m3.p) null, (i3.b) null, y1.q.f14958m, (m3.l) null, (y1.k0) null, (y) null), new v((32768 & i10) != 0 ? Integer.MIN_VALUE : i7, Integer.MIN_VALUE, (i10 & 131072) != 0 ? n3.q.f8754c : j12, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r0(h0 h0Var, v vVar) {
        y yVar = h0Var.f1369o;
        x xVar = vVar.f1457e;
        this(h0Var, vVar, (yVar == null && xVar == null) ? null : new z(yVar, xVar));
    }

    public r0(h0 h0Var, v vVar, z zVar) {
        this.f1438a = h0Var;
        this.f1439b = vVar;
        this.f1440c = zVar;
    }

    public static r0 a(r0 r0Var, long j5, long j10, f3.k kVar, f3.n nVar, long j11, long j12, m3.i iVar, int i7) {
        m3.o cVar;
        long jB = (i7 & 1) != 0 ? r0Var.f1438a.f1356a.b() : j5;
        long j13 = (i7 & 2) != 0 ? r0Var.f1438a.f1357b : j10;
        f3.k kVar2 = (i7 & 4) != 0 ? r0Var.f1438a.f1358c : kVar;
        h0 h0Var = r0Var.f1438a;
        f3.i iVar2 = h0Var.f1359d;
        f3.j jVar = h0Var.f1360e;
        f3.n nVar2 = (i7 & 32) != 0 ? h0Var.f1361f : nVar;
        String str = h0Var.f1362g;
        long j14 = (i7 & 128) != 0 ? h0Var.f1363h : j11;
        m3.a aVar = h0Var.f1364i;
        m3.p pVar = h0Var.f1365j;
        i3.b bVar = h0Var.k;
        long j15 = h0Var.f1366l;
        m3.l lVar = h0Var.f1367m;
        y1.k0 k0Var = h0Var.f1368n;
        a2.h hVar = h0Var.f1370p;
        v vVar = r0Var.f1439b;
        int i10 = vVar.f1453a;
        int i11 = vVar.f1454b;
        long j16 = (i7 & 131072) != 0 ? vVar.f1455c : j12;
        m3.q qVar = vVar.f1456d;
        z zVar = (i7 & 524288) != 0 ? r0Var.f1440c : d1.e.f3688a;
        m3.i iVar3 = (i7 & 1048576) != 0 ? vVar.f1458f : iVar;
        int i12 = vVar.f1459g;
        int i13 = vVar.f1460h;
        m3.s sVar = vVar.f1461i;
        if (y1.q.c(jB, h0Var.f1356a.b())) {
            cVar = h0Var.f1356a;
        } else {
            cVar = jB != 16 ? new m3.c(jB) : m3.n.f8425a;
        }
        return new r0(new h0(cVar, j13, kVar2, iVar2, jVar, nVar2, str, j14, aVar, pVar, bVar, j15, lVar, k0Var, zVar != null ? zVar.f1467a : null, hVar), new v(i10, i11, j16, qVar, zVar != null ? zVar.f1468b : null, iVar3, i12, i13, sVar), zVar);
    }

    public static r0 e(r0 r0Var, long j5, long j10, f3.k kVar, long j11, int i7, long j12, int i10) {
        long j13 = (i10 & 2) != 0 ? n3.q.f8754c : j10;
        f3.k kVar2 = (i10 & 4) != 0 ? null : kVar;
        long j14 = (i10 & 128) != 0 ? n3.q.f8754c : j11;
        long j15 = y1.q.f14958m;
        int i11 = (32768 & i10) != 0 ? Integer.MIN_VALUE : i7;
        long j16 = (i10 & 131072) != 0 ? n3.q.f8754c : j12;
        h0 h0VarA = j0.a(r0Var.f1438a, j5, null, Float.NaN, j13, kVar2, null, null, null, null, j14, null, null, null, j15, null, null, null, null);
        v vVarA = w.a(r0Var.f1439b, i11, Integer.MIN_VALUE, j16, null, null, null, 0, Integer.MIN_VALUE, null);
        return (r0Var.f1438a == h0VarA && r0Var.f1439b == vVarA) ? r0Var : new r0(h0VarA, vVarA);
    }

    public final long b() {
        return this.f1438a.f1356a.b();
    }

    public final boolean c(r0 r0Var) {
        if (this != r0Var) {
            return i9.l.a(this.f1439b, r0Var.f1439b) && this.f1438a.a(r0Var.f1438a);
        }
        return true;
    }

    public final r0 d(r0 r0Var) {
        return (r0Var == null || r0Var.equals(f1437d)) ? this : new r0(this.f1438a.c(r0Var.f1438a), this.f1439b.a(r0Var.f1439b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return i9.l.a(this.f1438a, r0Var.f1438a) && i9.l.a(this.f1439b, r0Var.f1439b) && i9.l.a(this.f1440c, r0Var.f1440c);
    }

    public final int hashCode() {
        int iHashCode = (this.f1439b.hashCode() + (this.f1438a.hashCode() * 31)) * 31;
        z zVar = this.f1440c;
        return iHashCode + (zVar != null ? zVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) y1.q.i(b()));
        sb2.append(", brush=");
        h0 h0Var = this.f1438a;
        sb2.append(h0Var.f1356a.e());
        sb2.append(", alpha=");
        sb2.append(h0Var.f1356a.a());
        sb2.append(", fontSize=");
        sb2.append((Object) n3.q.e(h0Var.f1357b));
        sb2.append(", fontWeight=");
        sb2.append(h0Var.f1358c);
        sb2.append(", fontStyle=");
        sb2.append(h0Var.f1359d);
        sb2.append(", fontSynthesis=");
        sb2.append(h0Var.f1360e);
        sb2.append(", fontFamily=");
        sb2.append(h0Var.f1361f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(h0Var.f1362g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) n3.q.e(h0Var.f1363h));
        sb2.append(", baselineShift=");
        sb2.append(h0Var.f1364i);
        sb2.append(", textGeometricTransform=");
        sb2.append(h0Var.f1365j);
        sb2.append(", localeList=");
        sb2.append(h0Var.k);
        sb2.append(", background=");
        ob.a.x(h0Var.f1366l, sb2, ", textDecoration=");
        sb2.append(h0Var.f1367m);
        sb2.append(", shadow=");
        sb2.append(h0Var.f1368n);
        sb2.append(", drawStyle=");
        sb2.append(h0Var.f1370p);
        sb2.append(", textAlign=");
        v vVar = this.f1439b;
        sb2.append((Object) m3.k.a(vVar.f1453a));
        sb2.append(", textDirection=");
        sb2.append((Object) m3.m.a(vVar.f1454b));
        sb2.append(", lineHeight=");
        sb2.append((Object) n3.q.e(vVar.f1455c));
        sb2.append(", textIndent=");
        sb2.append(vVar.f1456d);
        sb2.append(", platformStyle=");
        sb2.append(this.f1440c);
        sb2.append(", lineHeightStyle=");
        sb2.append(vVar.f1458f);
        sb2.append(", lineBreak=");
        sb2.append((Object) m3.e.a(vVar.f1459g));
        sb2.append(", hyphens=");
        sb2.append((Object) m3.d.a(vVar.f1460h));
        sb2.append(", textMotion=");
        sb2.append(vVar.f1461i);
        sb2.append(')');
        return sb2.toString();
    }
}
