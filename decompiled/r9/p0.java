package r9;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11741a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f11742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f11743c;

    public p0(q0 q0Var, s0 s0Var) {
        this.f11743c = q0Var;
        this.f11742b = s0Var;
    }

    public p0(s0 s0Var, q0 q0Var) {
        this.f11742b = s0Var;
        this.f11743c = q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    @Override // h9.a
    public final Object invoke() {
        String str;
        switch (this.f11741a) {
            case 0:
                r1 r1Var = this.f11743c.f11747c;
                o9.u uVar = q0.f11746g[0];
                ca.c cVar = (ca.c) r1Var.invoke();
                if (cVar != null) {
                    qa.b bVar = cVar.f2577b;
                    str = bVar.f11004f;
                    if (bVar.f10999a != qa.a.MULTIFILE_CLASS_PART) {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return this.f11742b.f11760b.getClassLoader().loadClass(zb.q.m0(str, '/', '.'));
            default:
                r1 r1Var2 = this.f11743c.f11748d;
                o9.u uVar2 = q0.f11746g[1];
                Object objInvoke = r1Var2.invoke();
                i9.l.d(objInvoke, "getValue(...)");
                return this.f11742b.h((gb.o) objInvoke, c0.f11666a);
        }
    }
}
