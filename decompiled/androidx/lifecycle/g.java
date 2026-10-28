package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1030a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1032c;

    public g(android.support.v4.media.session.r rVar, v vVar) {
        this.f1031b = vVar;
        this.f1032c = rVar;
    }

    public g(e eVar, r rVar) {
        i9.l.e(eVar, "defaultLifecycleObserver");
        this.f1031b = eVar;
        this.f1032c = rVar;
    }

    public g(s sVar) {
        this.f1031b = sVar;
        d dVar = d.f1024c;
        Class<?> cls = sVar.getClass();
        b bVar = (b) dVar.f1025a.get(cls);
        this.f1032c = bVar == null ? dVar.a(cls, null) : bVar;
    }

    @Override // androidx.lifecycle.r
    public final void c(t tVar, n nVar) {
        switch (this.f1030a) {
            case 0:
                e eVar = (e) this.f1031b;
                switch (f.f1027a[nVar.ordinal()]) {
                    case 1:
                        eVar.b(tVar);
                        break;
                    case 2:
                        eVar.h(tVar);
                        break;
                    case 3:
                        eVar.a(tVar);
                        break;
                    case 4:
                        eVar.d(tVar);
                        break;
                    case 5:
                        eVar.e(tVar);
                        break;
                    case 6:
                        eVar.g(tVar);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new cc.s();
                }
                r rVar = (r) this.f1032c;
                if (rVar != null) {
                    rVar.c(tVar, nVar);
                    return;
                }
                return;
            case 1:
                if (nVar == n.ON_START) {
                    ((v) this.f1031b).f(this);
                    ((android.support.v4.media.session.r) this.f1032c).I();
                    return;
                }
                return;
            default:
                HashMap map = ((b) this.f1032c).f1011a;
                List list = (List) map.get(nVar);
                Object obj = this.f1031b;
                b.a(list, tVar, nVar, obj);
                b.a((List) map.get(n.ON_ANY), tVar, nVar, obj);
                return;
        }
    }
}
