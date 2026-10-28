package androidx.compose.foundation.gestures;

import a9.c;
import b0.k;
import i9.u;
import l0.o1;
import r1.p;
import x.n1;
import x.v0;
import x1.b;
import z.f1;
import z.g1;
import z.h1;
import z.i1;
import z.t1;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f793a = new n1(19);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f794b = new g1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1 f795c = new f1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h1 f796d = new h1();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(t1 t1Var, long j5, c cVar) {
        i1 i1Var;
        u uVar;
        t1 t1Var2;
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i7 = i1Var.f15407d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                i1Var.f15407d = i7 - Integer.MIN_VALUE;
            } else {
                i1Var = new i1(cVar);
            }
        } else {
            i1Var = new i1(cVar);
        }
        Object obj = i1Var.f15406c;
        int i10 = i1Var.f15407d;
        if (i10 == 0) {
            t8.a.e(obj);
            uVar = new u();
            l0.i1 i1Var2 = new l0.i1(t1Var, j5, uVar, null, 4);
            i1Var.f15404a = t1Var;
            i1Var.f15405b = uVar;
            i1Var.f15407d = 1;
            Object objF = t1Var.f(v0.f14491a, i1Var2, i1Var);
            z8.a aVar = z8.a.f15774a;
            if (objF == aVar) {
                return aVar;
            }
            t1Var2 = t1Var;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u uVar2 = i1Var.f15405b;
            t1 t1Var3 = i1Var.f15404a;
            t8.a.e(obj);
            uVar = uVar2;
            t1Var2 = t1Var3;
        }
        return new b(t1Var2.h(uVar.f6685a));
    }

    public static p b(o1 o1Var, x0 x0Var, boolean z10, boolean z11, k kVar) {
        return new ScrollableElement(o1Var, x0Var, z10, z11, kVar);
    }
}
