package w9;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import n3.u;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f14178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wa.b f14181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wa.c f14182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wa.b f14183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f14184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f14185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap f14186j;
    public static final HashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f14187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f14188m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f14189n;

    static {
        StringBuilder sb2 = new StringBuilder();
        v9.g gVar = v9.g.f13697c;
        sb2.append(gVar.f13701a);
        sb2.append('.');
        sb2.append(gVar.f13702b);
        f14177a = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        v9.h hVar = v9.h.f13698c;
        sb3.append(hVar.f13701a);
        sb3.append('.');
        sb3.append(hVar.f13702b);
        f14178b = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        v9.j jVar = v9.j.f13700c;
        sb4.append(jVar.f13701a);
        sb4.append('.');
        sb4.append(jVar.f13702b);
        f14179c = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        v9.i iVar = v9.i.f13699c;
        sb5.append(iVar.f13701a);
        sb5.append('.');
        sb5.append(iVar.f13702b);
        f14180d = sb5.toString();
        wa.b bVarL = u.L(new wa.c("kotlin.jvm.functions.FunctionN"));
        f14181e = bVarL;
        f14182f = bVarL.a();
        f14183g = wa.h.f14273q;
        d(Class.class);
        f14184h = new HashMap();
        f14185i = new HashMap();
        f14186j = new HashMap();
        k = new HashMap();
        f14187l = new HashMap();
        f14188m = new HashMap();
        wa.b bVarL2 = u.L(u9.n.B);
        wa.c cVar = u9.n.J;
        wa.c cVar2 = bVarL2.f14236a;
        c cVar3 = new c(d(Iterable.class), bVarL2, new wa.b(cVar2, n3.l.X(cVar, cVar2), false));
        wa.b bVarL3 = u.L(u9.n.A);
        wa.c cVar4 = u9.n.I;
        wa.c cVar5 = bVarL3.f14236a;
        c cVar6 = new c(d(Iterator.class), bVarL3, new wa.b(cVar5, n3.l.X(cVar4, cVar5), false));
        wa.b bVarL4 = u.L(u9.n.C);
        wa.c cVar7 = u9.n.K;
        wa.c cVar8 = bVarL4.f14236a;
        c cVar9 = new c(d(Collection.class), bVarL4, new wa.b(cVar8, n3.l.X(cVar7, cVar8), false));
        wa.b bVarL5 = u.L(u9.n.D);
        wa.c cVar10 = u9.n.L;
        wa.c cVar11 = bVarL5.f14236a;
        c cVar12 = new c(d(List.class), bVarL5, new wa.b(cVar11, n3.l.X(cVar10, cVar11), false));
        wa.b bVarL6 = u.L(u9.n.F);
        wa.c cVar13 = u9.n.N;
        wa.c cVar14 = bVarL6.f14236a;
        c cVar15 = new c(d(Set.class), bVarL6, new wa.b(cVar14, n3.l.X(cVar13, cVar14), false));
        wa.b bVarL7 = u.L(u9.n.E);
        wa.c cVar16 = u9.n.M;
        wa.c cVar17 = bVarL7.f14236a;
        c cVar18 = new c(d(ListIterator.class), bVarL7, new wa.b(cVar17, n3.l.X(cVar16, cVar17), false));
        wa.c cVar19 = u9.n.G;
        wa.b bVarL8 = u.L(cVar19);
        wa.c cVar20 = u9.n.O;
        wa.c cVar21 = bVarL8.f14236a;
        c cVar22 = new c(d(Map.class), bVarL8, new wa.b(cVar21, n3.l.X(cVar20, cVar21), false));
        wa.b bVarD = u.L(cVar19).d(u9.n.H.f14240a.f());
        wa.c cVar23 = u9.n.P;
        wa.c cVar24 = bVarD.f14236a;
        List<c> listJ = n3.l.J(cVar3, cVar6, cVar9, cVar12, cVar15, cVar18, cVar22, new c(d(Map.Entry.class), bVarD, new wa.b(cVar24, n3.l.X(cVar23, cVar24), false)));
        f14189n = listJ;
        c(Object.class, u9.n.f13166a);
        c(String.class, u9.n.f13175f);
        c(CharSequence.class, u9.n.f13173e);
        b(Throwable.class, u9.n.k);
        c(Cloneable.class, u9.n.f13169c);
        c(Number.class, u9.n.f13180i);
        b(Comparable.class, u9.n.f13182l);
        c(Enum.class, u9.n.f13181j);
        b(Annotation.class, u9.n.f13189s);
        for (c cVar25 : listJ) {
            wa.b bVar = cVar25.f14174a;
            wa.b bVar2 = cVar25.f14175b;
            wa.b bVar3 = cVar25.f14176c;
            a(bVar, bVar2);
            f14185i.put(bVar3.a().f14240a, bVar);
            f14187l.put(bVar3, bVar2);
            f14188m.put(bVar2, bVar3);
            wa.c cVarA = bVar2.a();
            wa.c cVarA2 = bVar3.a();
            f14186j.put(bVar3.a().f14240a, cVarA);
            k.put(cVarA.f14240a, cVarA2);
        }
        for (eb.c cVar26 : eb.c.values()) {
            wa.c cVar27 = cVar26.f4681d;
            if (cVar27 == null) {
                eb.c.a(15);
                throw null;
            }
            wa.b bVar4 = new wa.b(cVar27.b(), cVar27.f14240a.f());
            u9.k kVarD = cVar26.d();
            i9.l.d(kVarD, "getPrimitiveType(...)");
            wa.c cVarA3 = u9.o.k.a(kVarD.f13157a);
            a(bVar4, new wa.b(cVarA3.b(), cVarA3.f14240a.f()));
        }
        for (wa.b bVar5 : u9.d.f13133a) {
            wa.c cVar28 = new wa.c("kotlin.jvm.internal." + bVar5.f().b() + "CompanionObject");
            a(new wa.b(cVar28.b(), cVar28.f14240a.f()), bVar5.d(wa.g.f14252b));
        }
        for (int i7 = 0; i7 < 23; i7++) {
            wa.c cVar29 = new wa.c(a2.f.E(i7, "kotlin.jvm.functions.Function"));
            a(new wa.b(cVar29.b(), cVar29.f14240a.f()), new wa.b(u9.o.k, wa.e.e("Function" + i7)));
            f14185i.put(new wa.c(f14178b + i7).f14240a, f14183g);
        }
        for (int i10 = 0; i10 < 22; i10++) {
            v9.i iVar2 = v9.i.f13699c;
            f14185i.put(new wa.c((iVar2.f13701a + '.' + iVar2.f13702b) + i10).f14240a, f14183g);
        }
        wa.c cVar30 = new wa.c("kotlin.concurrent.atomics.AtomicInt");
        wa.b bVarD2 = d(AtomicInteger.class);
        HashMap map = f14185i;
        map.put(cVar30.f14240a, bVarD2);
        map.put(new wa.c("kotlin.concurrent.atomics.AtomicLong").f14240a, d(AtomicLong.class));
        map.put(new wa.c("kotlin.concurrent.atomics.AtomicBoolean").f14240a, d(AtomicBoolean.class));
        map.put(new wa.c("kotlin.concurrent.atomics.AtomicReference").f14240a, d(AtomicReference.class));
        map.put(new wa.c("kotlin.concurrent.atomics.AtomicIntArray").f14240a, d(AtomicIntegerArray.class));
        map.put(new wa.c("kotlin.concurrent.atomics.AtomicLongArray").f14240a, d(AtomicLongArray.class));
        map.put(new wa.c("kotlin.concurrent.atomics.AtomicArray").f14240a, d(AtomicReferenceArray.class));
        map.put(u9.n.f13167b.g().f14240a, d(Void.class));
    }

    public static void a(wa.b bVar, wa.b bVar2) {
        f14184h.put(bVar.a().f14240a, bVar2);
        f14185i.put(bVar2.a().f14240a, bVar);
    }

    public static void b(Class cls, wa.c cVar) {
        wa.b bVarD = d(cls);
        i9.l.e(cVar, "topLevelFqName");
        a(bVarD, new wa.b(cVar.b(), cVar.f14240a.f()));
    }

    public static void c(Class cls, wa.d dVar) {
        b(cls, dVar.g());
    }

    public static wa.b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return d(declaringClass).d(wa.e.e(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        i9.l.d(canonicalName, "getCanonicalName(...)");
        wa.c cVar = new wa.c(canonicalName);
        return new wa.b(cVar.b(), cVar.f14240a.f());
    }

    public static boolean e(wa.d dVar, String str) {
        Integer numP0;
        String str2 = dVar.f14243a;
        if (!q.o0(str2, str)) {
            return false;
        }
        String strSubstring = str2.substring(str.length());
        i9.l.d(strSubstring, "substring(...)");
        return (zb.j.K0('0', strSubstring) || (numP0 = q.p0(strSubstring)) == null || numP0.intValue() < 23) ? false : true;
    }

    public static wa.b f(wa.d dVar) {
        i9.l.e(dVar, "kotlinFqName");
        if (e(dVar, f14177a) || e(dVar, f14179c)) {
            return f14181e;
        }
        return (e(dVar, f14178b) || e(dVar, f14180d)) ? f14183g : (wa.b) f14185i.get(dVar);
    }
}
