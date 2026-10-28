package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0.t1 f7878b;

    public /* synthetic */ v(w0.t1 t1Var, int i7) {
        this.f7877a = i7;
        this.f7878b = t1Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x011f  */
    @Override // h9.k
    public final Object invoke(Object obj) {
        x1.c cVar;
        char c10;
        float fIntBitsToFloat;
        o2.w wVarC;
        o2.w wVarC2;
        o2.w wVarC3;
        o2.w wVarC4;
        int i7 = this.f7877a;
        w0.t1 t1Var = this.f7878b;
        switch (i7) {
            case 0:
                return new e8.p(5, t1Var);
            case 1:
                t1Var.q();
                return t8.z.f12851a;
            default:
                o2.w wVar = (o2.w) obj;
                u0 u0Var = t1Var.f13942d;
                if (u0Var == null) {
                    cVar = x1.c.f14522e;
                } else {
                    if (u0Var.f7862p) {
                        u0Var = null;
                    }
                    if (u0Var != null) {
                        g3.q qVar = t1Var.f13940b;
                        long j5 = t1Var.m().f5890b;
                        int i10 = b3.q0.f1429c;
                        int iB = qVar.b((int) (j5 >> 32));
                        int iB2 = t1Var.f13940b.b((int) (t1Var.m().f5890b & 4294967295L));
                        u0 u0Var2 = t1Var.f13942d;
                        long jE = 0;
                        long jE2 = (u0Var2 == null || (wVarC4 = u0Var2.c()) == null) ? 0L : wVarC4.E(t1Var.k(true));
                        u0 u0Var3 = t1Var.f13942d;
                        if (u0Var3 != null && (wVarC3 = u0Var3.c()) != null) {
                            jE = wVarC3.E(t1Var.k(false));
                        }
                        u0 u0Var4 = t1Var.f13942d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (u0Var4 == null || (wVarC2 = u0Var4.c()) == null) {
                            c10 = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            s1 s1VarD = u0Var.d();
                            c10 = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (wVarC2.E((((long) Float.floatToRawIntBits(s1VarD != null ? s1VarD.f7828a.c(iB).f14524b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        u0 u0Var5 = t1Var.f13942d;
                        if (u0Var5 != null && (wVarC = u0Var5.c()) != null) {
                            s1 s1VarD2 = u0Var.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (wVarC.E((((long) Float.floatToRawIntBits(0.0f)) << c10) | (((long) Float.floatToRawIntBits(s1VarD2 != null ? s1VarD2.f7828a.c(iB2).f14524b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i11 = (int) (jE2 >> c10);
                        int i12 = (int) (jE >> c10);
                        cVar = new x1.c(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), (u0Var.f7848a.f7597g.a() * 25) + Math.max(Float.intBitsToFloat((int) (jE2 & 4294967295L)), Float.intBitsToFloat((int) (jE & 4294967295L))));
                    } else {
                        cVar = x1.c.f14522e;
                    }
                }
                u0 u0Var6 = t1Var.f13942d;
                o2.w wVarC5 = u0Var6 != null ? u0Var6.c() : null;
                if (wVarC5 != null) {
                    return androidx.compose.foundation.text.contextmenu.modifier.a.d(cVar, wVarC5, wVar);
                }
                c0.b.d("Required value was null.");
                throw new cc.s();
        }
    }
}
