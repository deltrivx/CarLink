package l0;

import android.app.Activity;
import android.os.Trace;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7759f;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f7754a = i7;
        this.f7755b = obj;
        this.f7756c = obj2;
        this.f7757d = obj3;
        this.f7758e = obj4;
        this.f7759f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p1.b bVarD;
        switch (this.f7754a) {
            case 0:
                b3.r0 r0Var = (b3.r0) this.f7755b;
                n3.o oVar = (n3.o) this.f7756c;
                String str = (String) this.f7757d;
                n3.c cVar = (n3.c) this.f7758e;
                f3.d dVar = (f3.d) this.f7759f;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    p1.f fVarK = p1.l.k();
                    p1.b bVar = fVarK instanceof p1.b ? (p1.b) fVarK : null;
                    if (bVar == null || (bVarD = bVar.D(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        p1.f fVarJ = bVarD.j();
                        try {
                            b3.r0 r0VarH = b3.g0.h(r0Var, oVar);
                            u8.w wVar = u8.w.f13122a;
                            new j3.d(str, r0VarH, wVar, wVar, dVar, cVar).d();
                            p1.f.q(fVarJ);
                            bVarD.w().d();
                            bVarD.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            p1.f.q(fVarJ);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            bVarD.c();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            default:
                p6.e eVar = (p6.e) this.f7755b;
                Activity activity = (Activity) this.f7756c;
                List list = (List) this.f7757d;
                e6.f fVar = (e6.f) this.f7758e;
                n4.e eVar2 = (n4.e) this.f7759f;
                eVar.getClass();
                b3.r.r(activity, list, fVar, eVar2, eVar);
                return;
        }
    }
}
