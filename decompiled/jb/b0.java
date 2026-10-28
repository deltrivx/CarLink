package jb;

import ra.s0;
import x9.n0;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f7004b = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7005a = 0;

    public /* synthetic */ b0() {
    }

    public b0(kb.c cVar) {
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f7005a) {
            case 0:
                s0 s0Var = (s0) obj;
                i9.l.e(s0Var, "it");
                return Integer.valueOf(s0Var.f12170d.size());
            default:
                i9.l.e((wa.b) obj, "it");
                return n0.f14716e0;
        }
    }
}
