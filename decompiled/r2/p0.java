package r2;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements cc.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f11359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3.x f11360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cc.y f11361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f11362d = new AtomicReference(null);

    public p0(View view, g3.x xVar, cc.y yVar) {
        this.f11359a = view;
        this.f11360b = xVar;
        this.f11361c = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(u0.p pVar, a9.c cVar) {
        o0 o0Var;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i7 = o0Var.f11355c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                o0Var.f11355c = i7 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        Object obj = o0Var.f11353a;
        int i10 = o0Var.f11355c;
        if (i10 == 0) {
            t8.a.e(obj);
            c1.a1 a1Var = new c1.a1(8, pVar, this);
            b0.g gVar = new b0.g(this, (y8.c) null, 12);
            o0Var.f11355c = 1;
            if (cc.b0.g(new fc.i(a1Var, this.f11362d, gVar, null), o0Var) == z8.a.f15774a) {
                return;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
        }
        throw new cc.s();
    }

    @Override // cc.y
    public final y8.h u() {
        return this.f11361c.u();
    }
}
