package xa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f14795a;

    public k() {
        this.f14795a = new h();
    }

    public k(j jVar) {
        jVar.f14793b.f();
        jVar.f14794c = false;
        this.f14795a = jVar.f14793b;
    }

    public final boolean g() {
        z zVar = this.f14795a.f14789a;
        for (int i7 = 0; i7 < zVar.f14842b.size(); i7++) {
            if (!h.e((Map.Entry) zVar.f14842b.get(i7))) {
                return false;
            }
        }
        Iterator it = zVar.c().iterator();
        while (it.hasNext()) {
            if (!h.e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int h() {
        z zVar = this.f14795a.f14789a;
        int iD = 0;
        for (int i7 = 0; i7 < zVar.f14842b.size(); i7++) {
            Map.Entry entry = (Map.Entry) zVar.f14842b.get(i7);
            iD += h.d((l) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : zVar.c()) {
            iD += h.d((l) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object i(m mVar) {
        m(mVar);
        l lVar = mVar.f14802d;
        Object obj = this.f14795a.f14789a.get(lVar);
        if (obj == null) {
            return mVar.f14800b;
        }
        if (!lVar.f14798c) {
            return mVar.a(obj);
        }
        if (lVar.f14797b.f14810a != n0.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(mVar.a(it.next()));
        }
        return arrayList;
    }

    public final boolean j(m mVar) {
        m(mVar);
        l lVar = mVar.f14802d;
        h hVar = this.f14795a;
        hVar.getClass();
        if (lVar.f14798c) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return hVar.f14789a.get(lVar) != null;
    }

    public final void k() {
        this.f14795a.f();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    public final boolean l(e eVar, d3.e eVar2, g gVar, int i7) throws q {
        boolean z10;
        boolean z11;
        Object objA;
        a aVar;
        int i10 = i7 & 7;
        m mVar = (m) gVar.f14786a.get(new f(i7 >>> 3, getDefaultInstanceForType()));
        if (mVar == null) {
            z10 = true;
            z11 = false;
        } else {
            l lVar = mVar.f14802d;
            m0 m0Var = lVar.f14797b;
            h hVar = h.f14788c;
            if (i10 == m0Var.f14811b) {
                z10 = false;
                z11 = false;
            } else if (lVar.f14798c && m0Var.a() && i10 == 2) {
                z10 = false;
                z11 = true;
            } else {
                z10 = true;
                z11 = false;
            }
        }
        if (z10) {
            return eVar.q(i7, eVar2);
        }
        i iVarB = null;
        h hVar2 = this.f14795a;
        if (z11) {
            int iD = eVar.d(eVar.k());
            l lVar2 = mVar.f14802d;
            if (lVar2.f14797b != m0.f14808g) {
                while (eVar.b() > 0) {
                    hVar2.a(lVar2, h.h(eVar, lVar2.f14797b));
                }
            } else if (eVar.b() > 0) {
                eVar.k();
                throw null;
            }
            eVar.c(iD);
            return true;
        }
        l lVar3 = mVar.f14802d;
        m0 m0Var2 = lVar3.f14797b;
        boolean z12 = lVar3.f14798c;
        int iOrdinal = m0Var2.f14810a.ordinal();
        if (iOrdinal == 7) {
            eVar.k();
            throw null;
        }
        if (iOrdinal != 8) {
            objA = h.h(eVar, m0Var2);
        } else {
            if (!z12 && (aVar = (a) hVar2.f14789a.get(lVar3)) != null) {
                iVarB = aVar.c();
            }
            if (iVarB == null) {
                iVarB = mVar.f14801c.b();
            }
            if (m0Var2 == m0.f14806e) {
                int i11 = lVar3.f14796a;
                int i12 = eVar.f14777i;
                if (i12 >= 64) {
                    throw new q("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                eVar.f14777i = i12 + 1;
                iVarB.b(eVar, gVar);
                eVar.a((i11 << 3) | 4);
                eVar.f14777i--;
            } else {
                int iK = eVar.k();
                if (eVar.f14777i >= 64) {
                    throw new q("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                int iD2 = eVar.d(iK);
                eVar.f14777i++;
                iVarB.b(eVar, gVar);
                eVar.a(0);
                eVar.f14777i--;
                eVar.c(iD2);
            }
            objA = iVarB.a();
        }
        if (z12) {
            hVar2.a(lVar3, mVar.b(objA));
            return true;
        }
        hVar2.i(lVar3, mVar.b(objA));
        return true;
    }

    public final void m(m mVar) {
        if (mVar.f14799a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
