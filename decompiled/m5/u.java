package m5;

import a8.u0;
import i9.x;
import k2.z;
import w0.e1;
import x.n1;
import z.e2;
import z.v;
import z.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f8551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i9.j f8552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f8553f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(x xVar, h9.o oVar, l lVar, y8.c cVar, int i7) {
        super(2, cVar);
        this.f8548a = i7;
        switch (i7) {
            case 1:
                this.f8551d = xVar;
                this.f8552e = (i9.j) oVar;
                this.f8553f = lVar;
                super(2, cVar);
                break;
            default:
                this.f8551d = xVar;
                this.f8552e = (i9.j) oVar;
                this.f8553f = lVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [h9.o, i9.j] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h9.o, i9.j] */
    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f8548a) {
            case 0:
                u uVar = new u(this.f8551d, this.f8552e, this.f8553f, cVar, 0);
                uVar.f8550c = obj;
                return uVar;
            default:
                u uVar2 = new u(this.f8551d, this.f8552e, this.f8553f, cVar, 1);
                uVar2.f8550c = obj;
                return uVar2;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f8548a) {
            case 0:
                break;
        }
        return ((u) create(zVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [h9.o, i9.j] */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f8548a;
        t8.z zVar = t8.z.f12851a;
        l lVar = this.f8553f;
        ?? r8 = this.f8552e;
        x xVar = this.f8551d;
        z8.a aVar = z8.a.f15774a;
        switch (i7) {
            case 0:
                int i10 = this.f8549b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return zVar;
                }
                t8.a.e(obj);
                z zVar2 = (z) this.f8550c;
                a8.l lVar2 = new a8.l(xVar, (h9.o) r8, lVar);
                this.f8549b = 1;
                float f10 = y.f15597a;
                Object objL = n4.h.l(zVar2, new v(new n1(17), lVar2, new e1(11), new e1(11), (y8.c) null), this);
                if (objL != aVar) {
                    objL = zVar;
                }
                return objL == aVar ? aVar : zVar;
            default:
                int i11 = this.f8549b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return zVar;
                }
                t8.a.e(obj);
                z zVar3 = (z) this.f8550c;
                u0 u0Var = new u0(xVar, (h9.o) r8, lVar);
                this.f8549b = 1;
                return e2.e(zVar3, null, u0Var, this, 7) == aVar ? aVar : zVar;
        }
    }
}
