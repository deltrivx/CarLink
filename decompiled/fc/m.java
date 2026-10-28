package fc;

import f1.y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5574a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a9.i f5577d;

    public m(e eVar, y8.h hVar) {
        this.f5575b = hVar;
        this.f5576c = hc.a.k(hVar);
        this.f5577d = new b0.g(eVar, (y8.c) null, 7);
    }

    public m(i9.t tVar, e eVar, y1 y1Var) {
        this.f5575b = tVar;
        this.f5576c = eVar;
        this.f5577d = y1Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        l lVar;
        m mVar;
        switch (this.f5574a) {
            case 0:
                if (cVar instanceof l) {
                    lVar = (l) cVar;
                    int i7 = lVar.f5573e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        lVar.f5573e = i7 - Integer.MIN_VALUE;
                    } else {
                        lVar = new l(this, cVar);
                    }
                } else {
                    lVar = new l(this, cVar);
                }
                Object objInvoke = lVar.f5571c;
                int i10 = lVar.f5573e;
                t8.z zVar = t8.z.f12851a;
                z8.a aVar = z8.a.f15774a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            obj = lVar.f5570b;
                            mVar = lVar.f5569a;
                            t8.a.e(objInvoke);
                        } else if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    t8.a.e(objInvoke);
                    return zVar;
                }
                t8.a.e(objInvoke);
                if (((i9.t) this.f5575b).f6684a) {
                    e eVar = (e) this.f5576c;
                    lVar.f5573e = 1;
                    if (eVar.h(obj, lVar) != aVar) {
                        return zVar;
                    }
                } else {
                    y1 y1Var = (y1) this.f5577d;
                    lVar.f5569a = this;
                    lVar.f5570b = obj;
                    lVar.f5573e = 2;
                    objInvoke = y1Var.invoke(obj, lVar);
                    if (objInvoke != aVar) {
                        mVar = this;
                    }
                }
                return aVar;
                if (((Boolean) objInvoke).booleanValue()) {
                    return zVar;
                }
                ((i9.t) mVar.f5575b).f6684a = true;
                e eVar2 = (e) mVar.f5576c;
                lVar.f5569a = null;
                lVar.f5570b = null;
                lVar.f5573e = 3;
                if (eVar2.h(obj, lVar) != aVar) {
                    return zVar;
                }
                return aVar;
            default:
                Object objA = gc.c.a((y8.h) this.f5575b, obj, this.f5576c, (b0.g) this.f5577d, cVar);
                return objA == z8.a.f15774a ? objA : t8.z.f12851a;
        }
    }
}
