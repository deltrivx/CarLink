package fc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import f1.k1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a9.i implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, y8.c cVar, int i7) {
        super(1, cVar);
        this.f5546a = i7;
        this.f5548c = obj;
        this.f5549d = obj2;
    }

    @Override // a9.a
    public final y8.c create(y8.c cVar) {
        switch (this.f5546a) {
            case 0:
                return new h((e) this.f5548c, (i9.x) this.f5549d, cVar, 0);
            case 1:
                return new h((q0.f) this.f5548c, (s0.e) this.f5549d, cVar, 1);
            default:
                return new h((s0.c) this.f5548c, (s0.b) this.f5549d, cVar, 2);
        }
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        y8.c cVar = (y8.c) obj;
        switch (this.f5546a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((h) create(cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        q0.d dVar;
        switch (this.f5546a) {
            case 0:
                i9.x xVar = (i9.x) this.f5549d;
                int i7 = this.f5547b;
                if (i7 == 0) {
                    t8.a.e(obj);
                    e eVar = (e) this.f5548c;
                    hc.s sVar = gc.c.f6217b;
                    Object obj2 = xVar.f6688a;
                    if (obj2 == sVar) {
                        obj2 = null;
                    }
                    this.f5547b = 1;
                    Object objH = eVar.h(obj2, this);
                    z8.a aVar = z8.a.f15774a;
                    if (objH == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                xVar.f6688a = null;
                return t8.z.f12851a;
            case 1:
                q0.f fVar = (q0.f) this.f5548c;
                p1.u uVar = fVar.f10546e;
                View view = fVar.f10542a;
                int i10 = this.f5547b;
                t8.z zVar = t8.z.f12851a;
                try {
                    if (i10 == 0) {
                        t8.a.e(obj);
                        q0.e eVar2 = new q0.e();
                        s0.e eVar3 = (s0.e) this.f5549d;
                        q0.d dVar2 = new q0.d(eVar2, new q0.b(fVar, eVar3, 0), new q0.b(fVar, eVar3, 1), view);
                        h9.k kVar = fVar.f10543b;
                        if (kVar != null && (dVar = (q0.d) kVar.invoke(dVar2)) != null) {
                            dVar2 = dVar;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                            l4.l lVar = fVar.f10550i;
                            if (lVar == null) {
                                lVar = new l4.l(fVar, dVar2, eVar2, 1);
                                fVar.f10550i = lVar;
                            }
                            view.post(lVar);
                        } else {
                            ActionMode actionModeStartActionMode = Build.VERSION.SDK_INT >= 23 ? view.startActionMode(new q0.l(dVar2), 1) : view.startActionMode(new q0.n(dVar2));
                            if (actionModeStartActionMode == null) {
                                return zVar;
                            }
                            fVar.f10549h = actionModeStartActionMode;
                        }
                        this.f5547b = 1;
                        Object objV = eVar2.f10541a.v(this);
                        z8.a aVar2 = z8.a.f15774a;
                        if (objV != aVar2) {
                            objV = zVar;
                        }
                        if (objV == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t8.a.e(obj);
                    }
                    uVar.a();
                    ActionMode actionMode = fVar.f10549h;
                    if (actionMode != null) {
                        actionMode.finish();
                    }
                    l4.l lVar2 = fVar.f10550i;
                    if (lVar2 != null) {
                        view.removeCallbacks(lVar2);
                    }
                    fVar.f10549h = null;
                    return zVar;
                } catch (Throwable th) {
                    uVar.a();
                    ActionMode actionMode2 = fVar.f10549h;
                    if (actionMode2 != null) {
                        actionMode2.finish();
                    }
                    l4.l lVar3 = fVar.f10550i;
                    if (lVar3 != null) {
                        view.removeCallbacks(lVar3);
                    }
                    fVar.f10549h = null;
                    throw th;
                }
            default:
                s0.b bVar = (s0.b) this.f5549d;
                k1 k1Var = ((s0.c) this.f5548c).f12531c;
                int i11 = this.f5547b;
                t8.z zVar2 = t8.z.f12851a;
                try {
                    if (i11 == 0) {
                        t8.a.e(obj);
                        k1Var.setValue(bVar);
                        this.f5547b = 1;
                        Object objV2 = bVar.f12528b.v(this);
                        z8.a aVar3 = z8.a.f15774a;
                        if (objV2 != aVar3) {
                            objV2 = zVar2;
                        }
                        if (objV2 == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t8.a.e(obj);
                    }
                    k1Var.setValue(null);
                    return zVar2;
                } catch (Throwable th2) {
                    k1Var.setValue(null);
                    throw th2;
                }
        }
    }
}
