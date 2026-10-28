package androidx.compose.ui.layout;

import o2.d1;
import o2.l1;
import o2.m1;
import o2.n1;
import o2.p;
import o2.q;
import q2.m0;
import s.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1[] f962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f963c;

    static {
        w wVar = new w(8);
        m1.f9381a.getClass();
        n1 n1Var = l1.f9376g;
        wVar.h(1, n1Var);
        n1 n1Var2 = l1.f9375f;
        wVar.h(2, n1Var2);
        n1 n1Var3 = l1.f9371b;
        wVar.h(4, n1Var3);
        n1 n1Var4 = l1.f9373d;
        wVar.h(8, n1Var4);
        n1 n1Var5 = l1.f9377h;
        wVar.h(16, n1Var5);
        n1 n1Var6 = l1.f9374e;
        wVar.h(32, n1Var6);
        n1 n1Var7 = l1.f9378i;
        wVar.h(64, n1Var7);
        f961a = wVar;
        f962b = new m1[]{n1Var, n1Var2, n1Var3, n1Var7, n1Var5, n1Var6, n1Var4, l1.f9379j, l1.f9372c};
        w wVar2 = new w(7);
        wVar2.h(1, n1Var);
        wVar2.h(2, n1Var2);
        wVar2.h(4, n1Var3);
        wVar2.h(16, n1Var5);
        wVar2.h(64, n1Var7);
        wVar2.h(32, n1Var6);
        wVar2.h(8, n1Var4);
        f963c = wVar2;
    }

    public static final void a(m0 m0Var, p pVar, long j5, int i7, int i10) {
        if (d1.f(j5, -1L)) {
            return;
        }
        m0Var.b(pVar.b(), (int) ((j5 >>> 48) & 65535));
        m0Var.b(pVar.d(), (int) ((j5 >>> 32) & 65535));
        m0Var.b(pVar.c(), i7 - ((int) ((j5 >>> 16) & 65535)));
        m0Var.b(pVar.a(), i10 - ((int) (j5 & 65535)));
    }

    public static final r1.p b(q qVar) {
        return new RulerProviderModifierElement(qVar);
    }
}
