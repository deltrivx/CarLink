package nc;

import i9.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pc.m0;
import t8.o;
import u8.a0;
import u8.b0;
import u8.c0;
import u8.n;
import u8.p;
import u8.q;
import u8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e, pc.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n4.h f9078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f9081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f9082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e[] f9083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List[] f9084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f9085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f9086j;
    public final e[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f9087l;

    public f(String str, n4.h hVar, int i7, List list, a aVar) {
        l.e(str, "serialName");
        this.f9077a = str;
        this.f9078b = hVar;
        this.f9079c = i7;
        this.f9080d = aVar.f9062b;
        ArrayList arrayList = aVar.f9063c;
        l.e(arrayList, "<this>");
        HashSet hashSet = new HashSet(c0.S0(q.a0(arrayList, 12)));
        p.H0(arrayList, hashSet);
        this.f9081e = hashSet;
        int i10 = 0;
        this.f9082f = (String[]) arrayList.toArray(new String[0]);
        this.f9083g = m0.b(aVar.f9065e);
        this.f9084h = (List[]) aVar.f9066f.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f9067g;
        l.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        this.f9085i = zArr;
        String[] strArr = this.f9082f;
        l.e(strArr, "<this>");
        n nVar = new n(1, new a5.e(27, strArr));
        ArrayList arrayList3 = new ArrayList(q.a0(nVar, 10));
        Iterator it2 = nVar.iterator();
        while (true) {
            a0 a0Var = (a0) it2;
            if (!a0Var.f13099b.hasNext()) {
                this.f9086j = b0.Z0(arrayList3);
                this.k = m0.b(list);
                this.f9087l = t8.a.d(new a5.e(16, this));
                return;
            }
            z zVar = (z) a0Var.next();
            arrayList3.add(new t8.j(zVar.f13126b, Integer.valueOf(zVar.f13125a)));
        }
    }

    @Override // pc.j
    public final Set a() {
        return this.f9081e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (l.a(this.f9077a, eVar.h()) && Arrays.equals(this.k, ((f) obj).k)) {
                int iK = eVar.k();
                int i7 = this.f9079c;
                if (i7 == iK) {
                    for (int i10 = 0; i10 < i7; i10++) {
                        e[] eVarArr = this.f9083g;
                        if (l.a(eVarArr[i10].h(), eVar.n(i10).h()) && l.a(eVarArr[i10].f(), eVar.n(i10).f())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // nc.e
    public final n4.h f() {
        return this.f9078b;
    }

    @Override // nc.e
    public final boolean g() {
        return false;
    }

    @Override // nc.e
    public final List getAnnotations() {
        return this.f9080d;
    }

    @Override // nc.e
    public final String h() {
        return this.f9077a;
    }

    public final int hashCode() {
        return ((Number) this.f9087l.getValue()).intValue();
    }

    @Override // nc.e
    public final void i() {
    }

    @Override // nc.e
    public final int j(String str) {
        l.e(str, "name");
        Integer num = (Integer) this.f9086j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // nc.e
    public final int k() {
        return this.f9079c;
    }

    @Override // nc.e
    public final String l(int i7) {
        return this.f9082f[i7];
    }

    @Override // nc.e
    public final List m(int i7) {
        return this.f9084h[i7];
    }

    @Override // nc.e
    public final e n(int i7) {
        return this.f9083g[i7];
    }

    @Override // nc.e
    public final boolean o(int i7) {
        return this.f9085i[i7];
    }

    public final String toString() {
        return m0.g(this);
    }
}
