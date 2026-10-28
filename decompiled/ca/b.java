package ca;

import i9.l;
import l0.o0;
import o9.e0;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f2575a;

    public /* synthetic */ b(ClassLoader classLoader) {
        this.f2575a = classLoader;
    }

    public o0 a(wa.b bVar, ta.e eVar) {
        c cVarW;
        l.e(bVar, "classId");
        l.e(eVar, "metadataVersion");
        String strM0 = q.m0(bVar.f14237b.f14240a.f14243a, '.', '$');
        wa.c cVar = bVar.f14236a;
        if (!cVar.f14240a.c()) {
            strM0 = cVar + '.' + strM0;
        }
        Class clsT = e0.T(this.f2575a, strM0);
        if (clsT == null || (cVarW = a.a.w(clsT)) == null) {
            return null;
        }
        return new o0(12, cVarW);
    }
}
