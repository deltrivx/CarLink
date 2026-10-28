package ha;

import da.t;
import i9.l;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import u8.b0;
import u8.q;
import u8.u;
import u8.y;
import y9.m;
import y9.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6478a = b0.W0(new t8.j("PACKAGE", EnumSet.noneOf(n.class)), new t8.j("TYPE", EnumSet.of(n.CLASS, n.FILE)), new t8.j("ANNOTATION_TYPE", EnumSet.of(n.ANNOTATION_CLASS)), new t8.j("TYPE_PARAMETER", EnumSet.of(n.TYPE_PARAMETER)), new t8.j("FIELD", EnumSet.of(n.FIELD)), new t8.j("LOCAL_VARIABLE", EnumSet.of(n.LOCAL_VARIABLE)), new t8.j("PARAMETER", EnumSet.of(n.VALUE_PARAMETER)), new t8.j("CONSTRUCTOR", EnumSet.of(n.CONSTRUCTOR)), new t8.j("METHOD", EnumSet.of(n.FUNCTION, n.PROPERTY_GETTER, n.PROPERTY_SETTER)), new t8.j("TYPE_USE", EnumSet.of(n.TYPE)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f6479b = b0.W0(new t8.j("RUNTIME", m.f15139a), new t8.j("CLASS", m.f15140b), new t8.j("SOURCE", m.f15141c));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static bb.b a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof t) {
                arrayList.add(obj);
            }
        }
        ArrayList<n> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f6478a.get(wa.e.e(((t) it.next()).f3886b.name()).b());
            if (iterable == null) {
                iterable = y.f13124a;
            }
            u.c0(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(q.a0(arrayList2, 10));
        for (n nVar : arrayList2) {
            wa.c cVar = u9.n.f13191u;
            l.e(cVar, "topLevelFqName");
            arrayList3.add(new bb.i(new wa.b(cVar.b(), cVar.f14240a.f()), wa.e.e(nVar.name())));
        }
        return new bb.b(arrayList3, d.f6477a);
    }
}
