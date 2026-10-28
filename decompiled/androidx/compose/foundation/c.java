package androidx.compose.foundation;

import b0.k;
import f1.c0;
import l0.m1;
import r1.p;
import w0.e1;
import x.n0;
import x.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f779a = new c0(new e1(7));

    public static final p a(p pVar, k kVar, n0 n0Var) {
        if (n0Var == null) {
            return pVar;
        }
        return n0Var instanceof r0 ? pVar.a(new IndicationModifierElement(kVar, (r0) n0Var)) : r1.a.a(pVar, new m1(3, n0Var, kVar));
    }
}
