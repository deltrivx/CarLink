package r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e6.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f11199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m3.j f11200f = m3.j.f8417b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m3.j f11201g = m3.j.f8416a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b3.o0 f11202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y2.m f11203d;

    @Override // e6.f
    public final int[] f(int i7) {
        int iE;
        if (k().length() <= 0 || i7 >= k().length()) {
            return null;
        }
        try {
            y2.m mVar = this.f11203d;
            if (mVar == null) {
                i9.l.j("node");
                throw null;
            }
            x1.c cVarG = mVar.g();
            int iRound = Math.round(cVarG.f14526d - cVarG.f14524b);
            if (i7 <= 0) {
                i7 = 0;
            }
            b3.o0 o0Var = this.f11202c;
            if (o0Var == null) {
                i9.l.j("layoutResult");
                throw null;
            }
            int iD = o0Var.f1409b.d(i7);
            b3.o0 o0Var2 = this.f11202c;
            if (o0Var2 == null) {
                i9.l.j("layoutResult");
                throw null;
            }
            float f10 = o0Var2.f1409b.f(iD) + iRound;
            b3.o0 o0Var3 = this.f11202c;
            if (o0Var3 == null) {
                i9.l.j("layoutResult");
                throw null;
            }
            if (o0Var3 == null) {
                i9.l.j("layoutResult");
                throw null;
            }
            b3.p pVar = o0Var3.f1409b;
            if (f10 < pVar.f(pVar.f1419f - 1)) {
                b3.o0 o0Var4 = this.f11202c;
                if (o0Var4 == null) {
                    i9.l.j("layoutResult");
                    throw null;
                }
                iE = o0Var4.f1409b.e(f10);
            } else {
                b3.o0 o0Var5 = this.f11202c;
                if (o0Var5 == null) {
                    i9.l.j("layoutResult");
                    throw null;
                }
                iE = o0Var5.f1409b.f1419f;
            }
            return j(i7, p(iE - 1, f11201g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // e6.f
    public final int[] n(int i7) {
        int iE;
        if (k().length() <= 0 || i7 <= 0) {
            return null;
        }
        try {
            y2.m mVar = this.f11203d;
            if (mVar == null) {
                i9.l.j("node");
                throw null;
            }
            x1.c cVarG = mVar.g();
            int iRound = Math.round(cVarG.f14526d - cVarG.f14524b);
            int length = k().length();
            if (length <= i7) {
                i7 = length;
            }
            b3.o0 o0Var = this.f11202c;
            if (o0Var == null) {
                i9.l.j("layoutResult");
                throw null;
            }
            int iD = o0Var.f1409b.d(i7);
            b3.o0 o0Var2 = this.f11202c;
            if (o0Var2 == null) {
                i9.l.j("layoutResult");
                throw null;
            }
            float f10 = o0Var2.f1409b.f(iD) - iRound;
            if (f10 > 0.0f) {
                b3.o0 o0Var3 = this.f11202c;
                if (o0Var3 == null) {
                    i9.l.j("layoutResult");
                    throw null;
                }
                iE = o0Var3.f1409b.e(f10);
            } else {
                iE = 0;
            }
            if (i7 == k().length() && iE < iD) {
                iE++;
            }
            return j(p(iE, f11200f), i7);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int p(int i7, m3.j jVar) {
        b3.o0 o0Var = this.f11202c;
        if (o0Var == null) {
            i9.l.j("layoutResult");
            throw null;
        }
        int iG = o0Var.g(i7);
        b3.o0 o0Var2 = this.f11202c;
        if (o0Var2 == null) {
            i9.l.j("layoutResult");
            throw null;
        }
        if (jVar != o0Var2.h(iG)) {
            b3.o0 o0Var3 = this.f11202c;
            if (o0Var3 != null) {
                return o0Var3.g(i7);
            }
            i9.l.j("layoutResult");
            throw null;
        }
        b3.o0 o0Var4 = this.f11202c;
        if (o0Var4 != null) {
            return o0Var4.f1409b.c(i7, false) - 1;
        }
        i9.l.j("layoutResult");
        throw null;
    }
}
