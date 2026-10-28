package r9;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f11751a = new ConcurrentHashMap();

    public static final ca.f a(Class cls) {
        z9.b bVarK;
        z9.d dVarK;
        jb.j jVar = jb.j.f7040f;
        i9.l.e(cls, "<this>");
        ClassLoader classLoaderD = da.d.d(cls);
        y1 y1Var = new y1(classLoaderD);
        ConcurrentHashMap concurrentHashMap = f11751a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(y1Var);
        if (weakReference != null) {
            ca.f fVar = (ca.f) weakReference.get();
            if (fVar != null) {
                return fVar;
            }
            concurrentHashMap.remove(y1Var, weakReference);
        }
        ca.b bVar = new ca.b(classLoaderD);
        ClassLoader classLoader = t8.z.class.getClassLoader();
        i9.l.d(classLoader, "getClassLoader(...)");
        ca.b bVar2 = new ca.b(classLoader);
        ca.b bVar3 = new ca.b(classLoaderD);
        String str = "runtime module for " + classLoaderD;
        ca.e eVar = ca.e.f2579b;
        ca.e eVar2 = ca.e.f2580c;
        i9.l.e(str, "moduleName");
        mb.k kVar = new mb.k("DeserializationComponentsForJava.ModuleData");
        w9.i iVar = new w9.i(kVar);
        aa.h0 h0Var = new aa.h0(wa.e.g("<" + str + '>'), kVar, iVar, 56);
        mb.m mVar = kVar.f8628a;
        mVar.lock();
        try {
            if (iVar.f13142a == null) {
                iVar.f13142a = h0Var;
                mVar.unlock();
                iVar.f14203f = new aa.g0(h0Var, 2);
                pa.e eVar3 = new pa.e();
                a2.d dVar = new a2.d(27, false);
                da.a aVar = new da.a(kVar, h0Var);
                pa.f fVar2 = pa.f.f10336c;
                ha.h hVar = ha.h.f6485c;
                ha.h hVar2 = ha.h.f6483a;
                kb.d dVar2 = new kb.d(kVar);
                x9.o0 o0Var = x9.o0.f14732c;
                u9.m mVar2 = new u9.m(h0Var, aVar);
                ga.u uVar = ga.u.f6116c;
                ga.b bVar4 = new ga.b(uVar);
                ja.b bVar5 = ja.b.f6987a;
                oa.d dVar3 = new oa.d();
                ob.l.f9655b.getClass();
                ob.m mVar3 = ob.k.f9654b;
                ja.d dVar4 = new ja.d(new ja.a(kVar, bVar3, bVar, eVar3, hVar, eVar, hVar2, dVar2, eVar2, dVar, fVar2, o0Var, fa.a.f5501a, h0Var, mVar2, bVar4, dVar3, ga.l.f6094a, bVar5, mVar3, uVar, new pa.f()));
                ta.e eVar4 = ta.e.f12885g;
                i9.l.e(eVar4, "metadataVersion");
                android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(21, bVar, eVar3);
                p.t tVar = new p.t(h0Var, aVar, kVar, bVar);
                tVar.f9920f = eVar4;
                List listI = n3.l.I(nb.k.f9014a);
                u9.i iVar2 = h0Var.f344d;
                w9.i iVar3 = iVar2 instanceof w9.i ? (w9.i) iVar2 : null;
                pa.f fVar3 = pa.f.f10335b;
                if (iVar3 == null || (bVarK = iVar3.K()) == null) {
                    bVarK = z9.a.f15784b;
                }
                if (iVar3 == null || (dVarK = iVar3.K()) == null) {
                    dVarK = z9.a.f15786d;
                }
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                y1 y1Var2 = y1Var;
                jb.i iVar4 = new jb.i(kVar, h0Var, rVar, tVar, dVar4, eVar, fVar3, u8.w.f13122a, aVar, bVarK, dVarK, va.g.f13718a, mVar3, new kb.d(kVar), listI, jVar);
                eVar3.f10334a = iVar4;
                dVar.f20b = new a2.d(9, dVar4);
                w9.l lVarK = iVar.K();
                w9.l lVarK2 = iVar.K();
                kb.d dVar5 = new kb.d(kVar);
                i9.l.e(lVarK, "additionalClassPartsProvider");
                i9.l.e(lVarK2, "platformDependentDeclarationFilter");
                w9.n nVar = new w9.n(kVar, bVar2, h0Var);
                a2.d dVar6 = new a2.d(28, nVar);
                kb.a aVar2 = kb.a.f7495m;
                nVar.f14225c = new jb.i(kVar, h0Var, dVar6, new android.support.v4.media.session.r(h0Var, aVar, aVar2), nVar, n3.l.J(new v9.a(kVar, h0Var), new w9.g(kVar, h0Var)), aVar, lVarK, lVarK2, aVar2.f6690a, mVar3, dVar5, 262144);
                h0Var.f347g = new aa.f0(u8.l.L0(new aa.h0[]{h0Var}));
                h0Var.f348h = new aa.p(n3.l.J(dVar4, nVar), "CompositeProvider@RuntimeModuleData for " + h0Var);
                ca.f fVar4 = new ca.f(iVar4, new a2.b(eVar3, bVar));
                while (true) {
                    y1 y1Var3 = y1Var2;
                    ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                    WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(y1Var3, new WeakReference(fVar4));
                    if (weakReference2 == null) {
                        return fVar4;
                    }
                    ca.f fVar5 = (ca.f) weakReference2.get();
                    if (fVar5 != null) {
                        return fVar5;
                    }
                    concurrentHashMap3.remove(y1Var3, weakReference2);
                    y1Var2 = y1Var3;
                    concurrentHashMap2 = concurrentHashMap3;
                }
            } else {
                try {
                    throw new AssertionError("Built-ins module is already set: " + iVar.f13142a + " (attempting to reset to " + h0Var + ")");
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            kVar.f8629b.getClass();
            throw th;
        } catch (Throwable th3) {
            mVar.unlock();
            throw th3;
        }
    }
}
