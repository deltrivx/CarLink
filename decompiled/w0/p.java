package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0.g f13875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0.g f13876c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b3.o0 f13878e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f13877d = this;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13879f = -1;

    public p(long j5, v0.g gVar, v0.g gVar2) {
        this.f13874a = j5;
        this.f13875b = gVar;
        this.f13876c = gVar2;
    }

    public final long a(z zVar, boolean z10) {
        b3.o0 o0Var;
        y yVar = zVar.f14019b;
        y yVar2 = zVar.f14018a;
        long j5 = this.f13874a;
        if (z10 && yVar2.f14011c != j5) {
            return 9205357640488583168L;
        }
        if ((!z10 && yVar.f14011c != j5) || c() == null || (o0Var = (b3.o0) this.f13876c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return y0.t(o0Var, n3.r.m(z10 ? yVar2.f14010b : yVar.f14010b, 0, b(o0Var)), z10, zVar.f14020c);
    }

    public final int b(b3.o0 o0Var) {
        int i7;
        synchronized (this.f13877d) {
            try {
                if (this.f13878e != o0Var) {
                    b3.p pVar = o0Var.f1409b;
                    boolean z10 = pVar.f1416c;
                    int i10 = 0;
                    if (!(z10 || ((float) ((int) (o0Var.f1410c & 4294967295L))) < pVar.f1418e) || z10) {
                        i10 = pVar.f1419f - 1;
                    } else {
                        int iE = pVar.e((int) (o0Var.f1410c & 4294967295L));
                        int i11 = o0Var.f1409b.f1419f - 1;
                        if (iE > i11) {
                            iE = i11;
                        }
                        while (iE >= 0 && o0Var.f1409b.f(iE) >= ((int) (o0Var.f1410c & 4294967295L))) {
                            iE--;
                        }
                        if (iE >= 0) {
                            i10 = iE;
                        }
                    }
                    this.f13879f = o0Var.f1409b.c(i10, true);
                    this.f13878e = o0Var;
                }
                i7 = this.f13879f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i7;
    }

    public final o2.w c() {
        o2.w wVar = (o2.w) this.f13875b.invoke();
        if (wVar == null || !wVar.isAttached()) {
            return null;
        }
        return wVar;
    }

    public final b3.h d() {
        b3.o0 o0Var = (b3.o0) this.f13876c.invoke();
        return o0Var == null ? new b3.h("") : o0Var.f1408a.f1393a;
    }
}
