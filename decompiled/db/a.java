package db;

import aa.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import u8.q;
import u8.w;

/* JADX INFO: loaded from: classes.dex */
public final class a implements wb.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3892b = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3893a;

    public /* synthetic */ a(int i7) {
        this.f3893a = i7;
    }

    @Override // wb.a
    public final Iterable g(Object obj) {
        Collection collectionM;
        switch (this.f3893a) {
            case 0:
                int i7 = e.f3900a;
                Collection collectionM2 = ((y0) obj).m();
                ArrayList arrayList = new ArrayList(q.a0(collectionM2, 10));
                Iterator it = ((ArrayList) collectionM2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((y0) it.next()).a());
                }
                return arrayList;
            default:
                x9.c cVar = (x9.c) obj;
                return (cVar == null || (collectionM = cVar.m()) == null) ? w.f13122a : collectionM;
        }
    }
}
