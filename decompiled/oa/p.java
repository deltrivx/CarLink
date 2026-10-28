package oa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import u8.a0;
import u8.c0;
import u8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9618b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t8.j f9619c = new t8.j("V", null);

    public p(android.support.v4.media.session.r rVar, String str, String str2) {
        this.f9617a = str2;
    }

    public final void a(String str, e... eVarArr) {
        t tVar;
        i9.l.e(str, "type");
        if (eVarArr.length == 0) {
            tVar = null;
        } else {
            u8.n nVar = new u8.n(1, new a5.e(27, eVarArr));
            int iS0 = c0.S0(u8.q.a0(nVar, 10));
            if (iS0 < 16) {
                iS0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS0);
            Iterator it = nVar.iterator();
            while (true) {
                a0 a0Var = (a0) it;
                if (!a0Var.f13099b.hasNext()) {
                    break;
                }
                z zVar = (z) a0Var.next();
                linkedHashMap.put(Integer.valueOf(zVar.f13125a), (e) zVar.f13126b);
            }
            tVar = new t(linkedHashMap);
        }
        this.f9618b.add(new t8.j(str, tVar));
    }

    public final void b(eb.c cVar) {
        i9.l.e(cVar, "type");
        String strC = cVar.c();
        i9.l.d(strC, "getDesc(...)");
        this.f9619c = new t8.j(strC, null);
    }

    public final void c(String str, e... eVarArr) {
        i9.l.e(str, "type");
        u8.n nVar = new u8.n(1, new a5.e(27, eVarArr));
        int iS0 = c0.S0(u8.q.a0(nVar, 10));
        if (iS0 < 16) {
            iS0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS0);
        Iterator it = nVar.iterator();
        while (true) {
            a0 a0Var = (a0) it;
            if (!a0Var.f13099b.hasNext()) {
                this.f9619c = new t8.j(str, new t(linkedHashMap));
                return;
            } else {
                z zVar = (z) a0Var.next();
                linkedHashMap.put(Integer.valueOf(zVar.f13125a), (e) zVar.f13126b);
            }
        }
    }
}
