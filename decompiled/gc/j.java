package gc;

import cc.a1;
import cc.b0;
import l0.q0;
import l0.u0;
import w0.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6242e;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f6238a = i7;
        this.f6239b = obj;
        this.f6240c = obj2;
        this.f6241d = obj3;
        this.f6242e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00d6  */
    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        i iVar;
        j jVar;
        switch (this.f6238a) {
            case 0:
                if (cVar instanceof i) {
                    iVar = (i) cVar;
                    int i7 = iVar.f6237e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        iVar.f6237e = i7 - Integer.MIN_VALUE;
                    } else {
                        iVar = new i(this, cVar);
                    }
                } else {
                    iVar = new i(this, cVar);
                }
                Object obj2 = iVar.f6235c;
                int i10 = iVar.f6237e;
                if (i10 == 0) {
                    t8.a.e(obj2);
                    a1 a1Var = (a1) ((i9.x) this.f6239b).f6688a;
                    if (a1Var != null) {
                        a1Var.a(new l("Child of the scoped flow was cancelled"));
                        iVar.f6233a = this;
                        iVar.f6234b = obj;
                        iVar.f6237e = 1;
                        Object objD = a1Var.d(iVar);
                        z8.a aVar = z8.a.f15774a;
                        if (objD == aVar) {
                            return aVar;
                        }
                    }
                    jVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = iVar.f6234b;
                    jVar = iVar.f6233a;
                    t8.a.e(obj2);
                }
                ((i9.x) jVar.f6239b).f6688a = b0.s((cc.y) jVar.f6240c, null, new h((k) jVar.f6241d, (fc.e) jVar.f6242e, obj, null), 1);
                return t8.z.f12851a;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                t1 t1Var = (t1) this.f6241d;
                u0 u0Var = (u0) this.f6239b;
                if (zBooleanValue && u0Var.b()) {
                    q0.w((g3.x) this.f6240c, u0Var, t1Var.m(), (g3.k) this.f6242e, t1Var.f13940b);
                } else {
                    q0.m(u0Var);
                }
                return t8.z.f12851a;
            default:
                b0.j jVar2 = (b0.j) obj;
                i9.v vVar = (i9.v) this.f6241d;
                i9.v vVar2 = (i9.v) this.f6240c;
                i9.v vVar3 = (i9.v) this.f6239b;
                boolean z10 = true;
                if (jVar2 instanceof b0.m) {
                    vVar3.f6686a++;
                } else if ((jVar2 instanceof b0.n) || (jVar2 instanceof b0.l)) {
                    vVar3.f6686a--;
                } else if (jVar2 instanceof b0.h) {
                    vVar2.f6686a++;
                } else if (jVar2 instanceof b0.i) {
                    vVar2.f6686a--;
                } else if (jVar2 instanceof b0.d) {
                    vVar.f6686a++;
                } else if (jVar2 instanceof b0.e) {
                    vVar.f6686a--;
                }
                int i11 = vVar3.f6686a;
                boolean z11 = false;
                boolean z12 = i11 > 0;
                boolean z13 = vVar2.f6686a > 0;
                boolean z14 = vVar.f6686a > 0;
                x.y yVar = (x.y) this.f6242e;
                if (yVar.f14501p != z12) {
                    yVar.f14501p = z12;
                    z11 = true;
                }
                if (yVar.f14502q != z13) {
                    yVar.f14502q = z13;
                    z11 = true;
                }
                if (yVar.f14503r != z14) {
                    yVar.f14503r = z14;
                } else {
                    z10 = z11;
                }
                if (z10) {
                    q2.f.l(yVar);
                }
                return t8.z.f12851a;
        }
    }
}
