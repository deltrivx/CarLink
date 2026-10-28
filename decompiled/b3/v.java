package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.q f1456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f1457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3.i f1458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m3.s f1461i;

    public v(int i7, int i10, long j5, m3.q qVar, x xVar, m3.i iVar, int i11, int i12, m3.s sVar) {
        this.f1453a = i7;
        this.f1454b = i10;
        this.f1455c = j5;
        this.f1456d = qVar;
        this.f1457e = xVar;
        this.f1458f = iVar;
        this.f1459g = i11;
        this.f1460h = i12;
        this.f1461i = sVar;
        if (n3.q.a(j5, n3.q.f8754c) || n3.q.c(j5) >= 0.0f) {
            return;
        }
        h3.a.b("lineHeight can't be negative (" + n3.q.c(j5) + ')');
    }

    public final v a(v vVar) {
        return vVar == null ? this : w.a(this, vVar.f1453a, vVar.f1454b, vVar.f1455c, vVar.f1456d, vVar.f1457e, vVar.f1458f, vVar.f1459g, vVar.f1460h, vVar.f1461i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f1453a == vVar.f1453a && this.f1454b == vVar.f1454b && n3.q.a(this.f1455c, vVar.f1455c) && i9.l.a(this.f1456d, vVar.f1456d) && i9.l.a(this.f1457e, vVar.f1457e) && i9.l.a(this.f1458f, vVar.f1458f) && this.f1459g == vVar.f1459g && this.f1460h == vVar.f1460h && i9.l.a(this.f1461i, vVar.f1461i);
    }

    public final int hashCode() {
        int iD = (n3.q.d(this.f1455c) + (((this.f1453a * 31) + this.f1454b) * 31)) * 31;
        m3.q qVar = this.f1456d;
        int iHashCode = (iD + (qVar != null ? qVar.hashCode() : 0)) * 31;
        x xVar = this.f1457e;
        int iHashCode2 = (iHashCode + (xVar != null ? xVar.hashCode() : 0)) * 31;
        m3.i iVar = this.f1458f;
        int iHashCode3 = (((((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.f1459g) * 31) + this.f1460h) * 31;
        m3.s sVar = this.f1461i;
        return iHashCode3 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) m3.k.a(this.f1453a)) + ", textDirection=" + ((Object) m3.m.a(this.f1454b)) + ", lineHeight=" + ((Object) n3.q.e(this.f1455c)) + ", textIndent=" + this.f1456d + ", platformStyle=" + this.f1457e + ", lineHeightStyle=" + this.f1458f + ", lineBreak=" + ((Object) m3.e.a(this.f1459g)) + ", hyphens=" + ((Object) m3.d.a(this.f1460h)) + ", textMotion=" + this.f1461i + ')';
    }
}
