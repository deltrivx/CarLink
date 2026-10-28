package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b3.o0 f13978f;

    public w(long j5, int i7, int i10, int i11, int i12, b3.o0 o0Var) {
        this.f13973a = j5;
        this.f13974b = i7;
        this.f13975c = i10;
        this.f13976d = i11;
        this.f13977e = i12;
        this.f13978f = o0Var;
    }

    public final y a(int i7) {
        return new y(y0.u(this.f13978f, i7), i7, this.f13973a);
    }

    public final k b() {
        int i7 = this.f13975c;
        int i10 = this.f13976d;
        if (i7 < i10) {
            return k.f13825b;
        }
        return i7 > i10 ? k.f13824a : k.f13826c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionInfo(id=");
        sb2.append(this.f13973a);
        sb2.append(", range=(");
        int i7 = this.f13975c;
        sb2.append(i7);
        sb2.append('-');
        b3.o0 o0Var = this.f13978f;
        sb2.append(y0.u(o0Var, i7));
        sb2.append(',');
        int i10 = this.f13976d;
        sb2.append(i10);
        sb2.append('-');
        sb2.append(y0.u(o0Var, i10));
        sb2.append("), prevOffset=");
        return a2.f.H(sb2, this.f13977e, ')');
    }
}
