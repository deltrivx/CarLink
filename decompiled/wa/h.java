package wa;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import n3.n;
import u8.c0;
import u8.f0;
import u8.l;
import u8.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f14258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f14259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f14260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f14261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f14262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f14263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f14264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f14265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f14266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f14267j;
    public static final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f14268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f14269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f14270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f14271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f14272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f14273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Set f14274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Set f14275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f14276t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f14277u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f14278v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f14279w;

    static {
        c cVar = new c("kotlin");
        f14258a = cVar;
        c cVarA = cVar.a(e.e("reflect"));
        f14259b = cVarA;
        c cVarA2 = cVar.a(e.e("collections"));
        f14260c = cVarA2;
        cVar.a(e.e("sequences"));
        c cVarA3 = cVar.a(e.e("ranges"));
        f14261d = cVarA3;
        c cVarA4 = cVar.a(e.e("jvm"));
        cVar.a(e.e("annotations")).a(e.e("jvm"));
        cVarA4.a(e.e("internal"));
        cVarA4.a(e.e("functions"));
        c cVarA5 = cVar.a(e.e("annotation"));
        f14262e = cVarA5;
        c cVarA6 = cVar.a(e.e("internal"));
        cVarA6.a(e.e("ir"));
        c cVarA7 = cVar.a(e.e("coroutines"));
        f14263f = cVarA7;
        cVarA7.a(e.e("intrinsics"));
        f14264g = cVar.a(e.e("enums"));
        cVar.a(e.e("contracts"));
        c cVarA8 = cVar.a(e.e("concurrent")).a(e.e("atomics"));
        cVar.a(e.e("test"));
        cVar.a(e.e("text"));
        l.M0(new c[]{cVar, cVarA2, cVarA3, cVarA5});
        l.M0(new c[]{cVar, cVarA2, cVarA3, cVarA5, cVarA, cVarA6, cVarA7, cVarA8});
        n.D("Nothing");
        f14265h = n.D("Unit");
        f14266i = n.D("Any");
        f14267j = n.D("Enum");
        n.D("Annotation");
        k = n.D("Array");
        b bVarD = n.D("Boolean");
        b bVarD2 = n.D("Char");
        b bVarD3 = n.D("Byte");
        b bVarD4 = n.D("Short");
        b bVarD5 = n.D("Int");
        b bVarD6 = n.D("Long");
        b bVarD7 = n.D("Float");
        b bVarD8 = n.D("Double");
        f14268l = n.O(bVarD3);
        f14269m = n.O(bVarD4);
        f14270n = n.O(bVarD5);
        f14271o = n.O(bVarD6);
        n.D("CharSequence");
        f14272p = n.D("String");
        n.D("Throwable");
        n.D("Cloneable");
        n.L("KProperty");
        n.L("KMutableProperty");
        n.L("KProperty0");
        n.L("KMutableProperty0");
        n.L("KProperty1");
        n.L("KMutableProperty1");
        n.L("KProperty2");
        n.L("KMutableProperty2");
        f14273q = n.L("KFunction");
        n.L("KClass");
        n.L("KCallable");
        n.L("KType");
        n.D("Comparable");
        n.D("Number");
        n.D("Function");
        Set setM0 = l.M0(new b[]{bVarD, bVarD2, bVarD3, bVarD4, bVarD5, bVarD6, bVarD7, bVarD8});
        f14274r = setM0;
        l.M0(new b[]{bVarD3, bVarD4, bVarD5, bVarD6});
        Set set = setM0;
        int iS0 = c0.S0(q.a0(set, 10));
        if (iS0 < 16) {
            iS0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS0);
        for (Object obj : set) {
            linkedHashMap.put(obj, n.K(((b) obj).f()));
        }
        n.H(linkedHashMap);
        Set setM1 = l.M0(new b[]{f14268l, f14269m, f14270n, f14271o});
        f14275s = setM1;
        Set set2 = setM1;
        int iS1 = c0.S0(q.a0(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS1 >= 16 ? iS1 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, n.K(((b) obj2).f()));
        }
        n.H(linkedHashMap2);
        Set set3 = f14274r;
        Set set4 = f14275s;
        LinkedHashSet linkedHashSetG0 = f0.g0(set3, set4);
        b bVar = f14272p;
        f0.h0(linkedHashSetG0, bVar);
        c cVar2 = f14263f;
        e eVarE = e.e("Continuation");
        i9.l.e(cVar2, "packageFqName");
        c cVar3 = c.f14239c;
        n4.h.h0(eVarE).f14240a.c();
        n.E("Iterator");
        n.E("Iterable");
        n.E("Collection");
        n.E("List");
        n.E("ListIterator");
        n.E("Set");
        b bVarE = n.E("Map");
        n.E("AbstractMap");
        n.E("MutableIterator");
        n.E("CharIterator");
        n.E("MutableIterable");
        n.E("MutableCollection");
        f14276t = n.E("MutableList");
        n.E("MutableListIterator");
        f14277u = n.E("MutableSet");
        b bVarE2 = n.E("MutableMap");
        f14278v = bVarE2;
        bVarE.d(e.e("Entry"));
        bVarE2.d(e.e("MutableEntry"));
        n.D("Result");
        c cVar4 = f14261d;
        e eVarE2 = e.e("IntRange");
        i9.l.e(cVar4, "packageFqName");
        n4.h.h0(eVarE2).f14240a.c();
        e eVarE3 = e.e("LongRange");
        i9.l.e(cVar4, "packageFqName");
        n4.h.h0(eVarE3).f14240a.c();
        e eVarE4 = e.e("CharRange");
        i9.l.e(cVar4, "packageFqName");
        n4.h.h0(eVarE4).f14240a.c();
        c cVar5 = f14262e;
        e eVarE5 = e.e("AnnotationRetention");
        i9.l.e(cVar5, "packageFqName");
        n4.h.h0(eVarE5).f14240a.c();
        e eVarE6 = e.e("AnnotationTarget");
        i9.l.e(cVar5, "packageFqName");
        n4.h.h0(eVarE6).f14240a.c();
        n.D("DeprecationLevel");
        f14279w = new b(f14264g, e.e("EnumEntries"));
        f0.h0(f0.h0(f0.h0(f0.h0(f0.g0(set3, set4), bVar), f14265h), f14266i), f14267j);
    }
}
