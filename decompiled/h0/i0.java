package h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.k f6323a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f1.t0 f6325c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6328f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2.b f6324b = new a2.b(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6326d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6327e = -1;

    public i0(h9.k kVar) {
        this.f6323a = kVar;
    }

    public final h0 a(int i7, long j5, boolean z10, h9.k kVar) {
        f1.t0 t0Var = this.f6325c;
        if (t0Var == null) {
            return h.f6319a;
        }
        t0 t0Var2 = (t0) t0Var.f5151d;
        boolean z11 = t0Var2 instanceof b;
        s0 s0Var = new s0(t0Var, i7, this.f6324b, kVar);
        s0Var.f6376d = new n3.a(j5);
        if (!z11) {
            t0Var2.a(s0Var);
        } else if (z10) {
            b bVar = (b) t0Var2;
            bVar.f6282b.add(new w0(1, s0Var));
            if (!bVar.f6283c) {
                bVar.f6283c = true;
                bVar.f6281a.post(bVar);
            }
        } else {
            b bVar2 = (b) t0Var2;
            bVar2.f6282b.add(new w0(0, s0Var));
            if (!bVar2.f6283c) {
                bVar2.f6283c = true;
                bVar2.f6281a.post(bVar2);
            }
        }
        n3.n.P0("compose:lazy:schedule_prefetch:index", i7);
        return s0Var;
    }
}
