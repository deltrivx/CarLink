package o5;

import java.util.List;
import java.util.Map;
import n5.f;
import n5.i;
import n5.k;
import n5.m;
import n5.n;
import n5.o;
import n5.p;
import t5.d;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {
    @Override // n5.k
    public final m a(n5.b bVar, Map map) throws i, f {
        o[] oVarArr;
        i iVar;
        o[] oVarArr2;
        f fVar;
        o[] oVarArr3;
        p pVar;
        q5.a aVar = new q5.a(bVar.a());
        d dVarA = null;
        try {
            a aVarA = aVar.a(false);
            oVarArr = aVarA.f9459b;
            try {
                fVar = null;
                dVarA = new p5.a().a(aVarA);
                oVarArr2 = oVarArr;
                iVar = null;
            } catch (f e7) {
                e = e7;
                fVar = e;
                oVarArr2 = oVarArr;
                iVar = null;
            } catch (i e10) {
                e = e10;
                o[] oVarArr4 = oVarArr;
                iVar = e;
                oVarArr2 = oVarArr4;
                fVar = null;
            }
        } catch (f e11) {
            e = e11;
            oVarArr = null;
        } catch (i e12) {
            e = e12;
            oVarArr = null;
        }
        if (dVarA == null) {
            try {
                a aVarA2 = aVar.a(true);
                o[] oVarArr5 = aVarA2.f9459b;
                dVarA = new p5.a().a(aVarA2);
                oVarArr3 = oVarArr5;
            } catch (f | i e13) {
                if (iVar != null) {
                    throw iVar;
                }
                if (fVar != null) {
                    throw fVar;
                }
                throw e13;
            }
        } else {
            oVarArr3 = oVarArr2;
        }
        if (map != null && (pVar = (p) map.get(n5.d.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (o oVar : oVarArr3) {
                pVar.a(oVar);
            }
        }
        String str = dVarA.f12771b;
        byte[] bArr = dVarA.f12770a;
        System.currentTimeMillis();
        m mVar = new m(str, bArr, oVarArr3, n5.a.f8790a, 0);
        List list = dVarA.f12772c;
        if (list != null) {
            mVar.b(n.f8845b, list);
        }
        String str2 = dVarA.f12773d;
        if (str2 != null) {
            mVar.b(n.f8846c, str2);
        }
        return mVar;
    }

    @Override // n5.k
    public final void reset() {
    }
}
