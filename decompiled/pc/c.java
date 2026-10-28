package pc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f10428b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mc.a aVar) {
        super(aVar);
        i9.l.e(aVar, "element");
        nc.e eVarD = aVar.d();
        i9.l.e(eVarD, "elementDesc");
        this.f10428b = new b(eVarD);
    }

    @Override // mc.a
    public final nc.e d() {
        return this.f10428b;
    }

    @Override // pc.a
    public final Object e() {
        return new ArrayList();
    }

    @Override // pc.a
    public final int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        i9.l.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // pc.a
    public final Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        i9.l.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // pc.a
    public final int h(Object obj) {
        Collection collection = (Collection) obj;
        i9.l.e(collection, "<this>");
        return collection.size();
    }

    @Override // pc.a
    public final Object k(Object obj) {
        i9.l.e(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // pc.a
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        i9.l.e(arrayList, "<this>");
        return arrayList;
    }

    @Override // pc.n
    public final void m(int i7, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        i9.l.e(arrayList, "<this>");
        arrayList.add(i7, obj2);
    }
}
