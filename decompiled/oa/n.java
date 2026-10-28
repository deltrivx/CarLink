package oa;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f9608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f9611d;

    public n(t tVar, ArrayList arrayList, String str) {
        this.f9608a = tVar;
        this.f9609b = arrayList;
        this.f9610c = str;
        n nVar = null;
        if (str != null) {
            t tVarA = tVar != null ? tVar.a() : null;
            ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t tVar2 = (t) it.next();
                arrayList2.add(tVar2 != null ? tVar2.a() : null);
            }
            nVar = new n(tVarA, arrayList2, null);
        }
        this.f9611d = nVar;
    }
}
