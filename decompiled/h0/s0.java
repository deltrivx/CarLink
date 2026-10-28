package h0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import o2.f1;
import o2.h1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2.b f6374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9.k f6375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n3.a f6376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f1 f6377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f6381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6382j;
    public r0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6385n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f6386o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f1.t0 f6387p;

    public s0(f1.t0 t0Var, int i7, a2.b bVar, h9.k kVar) {
        this.f6387p = t0Var;
        this.f6373a = i7;
        this.f6374b = bVar;
        this.f6375c = kVar;
        int i10 = ac.i.f530b;
        this.f6386o = System.nanoTime() - ac.i.f529a;
    }

    @Override // h0.h0
    public final void a() {
        this.f6383l = true;
    }

    public final void b() {
        f1 f1Var = this.f6377e;
        if (f1Var != null) {
            f1Var.a();
        }
        this.f6377e = null;
        this.k = null;
    }

    public final boolean c(a aVar) {
        boolean zD;
        if (!this.f6387p.f5148a) {
            return false;
        }
        if (this.f6383l) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(aVar);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zD = d(aVar);
        }
        n3.n.P0("compose:lazy:prefetch:execute:item", -1L);
        return zD;
    }

    @Override // h0.h0
    public final void cancel() {
        if (this.f6379g) {
            return;
        }
        this.f6379g = true;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0215 A[Catch: all -> 0x0204, TryCatch #2 {all -> 0x0204, blocks: (B:81:0x01c5, B:83:0x01cd, B:85:0x01d3, B:90:0x01df, B:92:0x01eb, B:94:0x0201, B:93:0x01ee, B:97:0x0206, B:98:0x020d, B:100:0x0215, B:109:0x022b, B:110:0x022d, B:114:0x023b, B:115:0x0241), top: B:173:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x021f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0221  */
    /* JADX WARN: Code duplicated, block: B:104:0x0223  */
    /* JADX WARN: Code duplicated, block: B:106:0x0226  */
    /* JADX WARN: Code duplicated, block: B:107:0x0228  */
    /* JADX WARN: Code duplicated, block: B:109:0x022b A[Catch: all -> 0x0204, TryCatch #2 {all -> 0x0204, blocks: (B:81:0x01c5, B:83:0x01cd, B:85:0x01d3, B:90:0x01df, B:92:0x01eb, B:94:0x0201, B:93:0x01ee, B:97:0x0206, B:98:0x020d, B:100:0x0215, B:109:0x022b, B:110:0x022d, B:114:0x023b, B:115:0x0241), top: B:173:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x023b A[Catch: all -> 0x0204, LOOP:2: B:98:0x020d->B:114:0x023b, LOOP_END, TRY_ENTER, TryCatch #2 {all -> 0x0204, blocks: (B:81:0x01c5, B:83:0x01cd, B:85:0x01d3, B:90:0x01df, B:92:0x01eb, B:94:0x0201, B:93:0x01ee, B:97:0x0206, B:98:0x020d, B:100:0x0215, B:109:0x022b, B:110:0x022d, B:114:0x023b, B:115:0x0241), top: B:173:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x025d  */
    /* JADX WARN: Code duplicated, block: B:128:0x026b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0274 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x0280  */
    /* JADX WARN: Code duplicated, block: B:138:0x029e  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:165:0x0306 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:181:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0160  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:59:0x016a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0180  */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    /* JADX WARN: Code duplicated, block: B:70:0x0196  */
    /* JADX WARN: Code duplicated, block: B:72:0x019c  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ad A[Catch: all -> 0x01ba, TRY_LEAVE, TryCatch #3 {all -> 0x01ba, blocks: (B:74:0x01a6, B:76:0x01ad), top: B:175:0x01a6 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01cd A[Catch: all -> 0x0204, TryCatch #2 {all -> 0x0204, blocks: (B:81:0x01c5, B:83:0x01cd, B:85:0x01d3, B:90:0x01df, B:92:0x01eb, B:94:0x0201, B:93:0x01ee, B:97:0x0206, B:98:0x020d, B:100:0x0215, B:109:0x022b, B:110:0x022d, B:114:0x023b, B:115:0x0241), top: B:173:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01d3 A[Catch: all -> 0x0204, TRY_LEAVE, TryCatch #2 {all -> 0x0204, blocks: (B:81:0x01c5, B:83:0x01cd, B:85:0x01d3, B:90:0x01df, B:92:0x01eb, B:94:0x0201, B:93:0x01ee, B:97:0x0206, B:98:0x020d, B:100:0x0215, B:109:0x022b, B:110:0x022d, B:114:0x023b, B:115:0x0241), top: B:173:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01df A[Catch: all -> 0x0204, TRY_ENTER, TryCatch #2 {all -> 0x0204, blocks: (B:81:0x01c5, B:83:0x01cd, B:85:0x01d3, B:90:0x01df, B:92:0x01eb, B:94:0x0201, B:93:0x01ee, B:97:0x0206, B:98:0x020d, B:100:0x0215, B:109:0x022b, B:110:0x022d, B:114:0x023b, B:115:0x0241), top: B:173:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01eb A[Catch: all -> 0x0204, TryCatch #2 {all -> 0x0204, blocks: (B:81:0x01c5, B:83:0x01cd, B:85:0x01d3, B:90:0x01df, B:92:0x01eb, B:94:0x0201, B:93:0x01ee, B:97:0x0206, B:98:0x020d, B:100:0x0215, B:109:0x022b, B:110:0x022d, B:114:0x023b, B:115:0x0241), top: B:173:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ee A[Catch: all -> 0x0204, TryCatch #2 {all -> 0x0204, blocks: (B:81:0x01c5, B:83:0x01cd, B:85:0x01d3, B:90:0x01df, B:92:0x01eb, B:94:0x0201, B:93:0x01ee, B:97:0x0206, B:98:0x020d, B:100:0x0215, B:109:0x022b, B:110:0x022d, B:114:0x023b, B:115:0x0241), top: B:173:0x01c5 }] */
    public final boolean d(a aVar) {
        r0 r0Var;
        r0 r0Var2;
        n3.a aVar2;
        h9.k kVar;
        r0 r0Var3;
        int i7;
        boolean z10;
        List[] listArr;
        int i10;
        List list;
        int size;
        int i11;
        List list2;
        s0 s0Var;
        boolean z11;
        s0 s0Var2;
        i0 i0Var;
        h9.k kVar2;
        List list3;
        int i12 = this.f6373a;
        long j5 = i12;
        n3.n.P0("compose:lazy:prefetch:execute:item", j5);
        f1.t0 t0Var = this.f6387p;
        v vVar = (v) ((t) t0Var.f5149b).f6389b.invoke();
        if (!this.f6379g) {
            int iA = vVar.a();
            if (i12 >= 0 && i12 < iA) {
                Object objB = vVar.b(i12);
                Object obj = this.f6381i;
                if (obj != null && !objB.equals(obj)) {
                    b();
                    return false;
                }
                Object objC = vVar.c(i12);
                a2.b bVar = this.f6374b;
                c cVar = (c) bVar.f14d;
                if (bVar.f13c != objC || cVar == null) {
                    s.h0 h0Var = (s.h0) bVar.f12b;
                    Object objG = h0Var.g(objC);
                    Object obj2 = objG;
                    if (objG == null) {
                        c cVar2 = new c();
                        cVar2.f6291d = -1;
                        h0Var.m(objC, cVar2);
                        obj2 = cVar2;
                    }
                    cVar = (c) obj2;
                    bVar.f13c = objC;
                    bVar.f14d = cVar;
                }
                e();
                long jA = aVar.a();
                this.f6384m = jA;
                int i13 = ac.i.f530b;
                this.f6386o = System.nanoTime() - ac.i.f529a;
                this.f6385n = 0L;
                n3.n.P0("compose:lazy:prefetch:available_time_nanos", jA);
                if (!e()) {
                    if (h(this.f6384m, cVar.f6288a)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            if (this.f6377e != null) {
                                c0.b.a("Request was already composed!");
                            }
                            h9.n nVarA = ((t) t0Var.f5149b).a(i12, objB, objC);
                            this.f6381i = objB;
                            o2.i0 i0VarA = ((h1) t0Var.f5150c).a();
                            q2.h0 h0Var2 = i0VarA.f9341a;
                            if (h0Var2.I()) {
                                i0VarA.e();
                                if (!i0VarA.f9347g.c(objB)) {
                                    i0VarA.f9351l.k(objB);
                                    s.h0 h0Var3 = i0VarA.f9350j;
                                    Object objG2 = h0Var3.g(objB);
                                    if (objG2 == null) {
                                        objG2 = i0VarA.i(objB);
                                        if (objG2 != null) {
                                            int iJ = ((h1.e) ((h1.b) h0Var2.o()).f6413b).j(objG2);
                                            int i14 = ((h1.e) ((h1.b) h0Var2.o()).f6413b).f6423c;
                                            h0Var2.f10681p = true;
                                            h0Var2.M(iJ, i14, 1);
                                            h0Var2.f10681p = false;
                                            i0VarA.f9354o++;
                                        } else {
                                            int i15 = ((h1.e) ((h1.b) h0Var2.o()).f6413b).f6423c;
                                            q2.h0 h0Var4 = new q2.h0(2);
                                            h0Var2.f10681p = true;
                                            h0Var2.B(i15, h0Var4);
                                            h0Var2.f10681p = false;
                                            i0VarA.f9354o++;
                                            objG2 = h0Var4;
                                        }
                                        h0Var3.m(objB, objG2);
                                    }
                                    i0VarA.h((q2.h0) objG2, objB, false, nVarA);
                                }
                            }
                            this.f6377e = !h0Var2.I() ? new o2.g0() : new o2.h0(i0VarA, objB);
                            this.f6380h = true;
                            Trace.endSection();
                            i();
                            cVar.f6288a = c.a(this.f6385n, cVar.f6288a);
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (e()) {
                        if (this.f6382j) {
                            r0Var = this.k;
                            if (r0Var != null) {
                                i7 = cVar.f6291d;
                                z10 = this.f6383l;
                                listArr = r0Var.f6363b;
                                i10 = r0Var.f6364c;
                                list = r0Var.f6362a;
                                if (i10 < list.size()) {
                                    if (r0Var.f6367f.f6379g) {
                                        c0.b.c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    for (i11 = 0; i11 < size; i11++) {
                                        ((i0) list.get(i11)).f6326d = i7;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (r0Var.f6364c < list.size()) {
                                        if (listArr[r0Var.f6364c] == null) {
                                            if (aVar.a() <= 0) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i16 = r0Var.f6364c;
                                            i0Var = (i0) list.get(i16);
                                            kVar2 = i0Var.f6323a;
                                            if (kVar2 == null) {
                                                list3 = u8.w.f13122a;
                                            } else {
                                                g0 g0Var = new g0(i0Var, i0Var.f6326d);
                                                kVar2.invoke(g0Var);
                                                ArrayList arrayList = g0Var.f6317b;
                                                i0Var.f6328f = arrayList.size();
                                                list3 = arrayList;
                                            }
                                            listArr[i16] = list3;
                                        }
                                        list2 = listArr[r0Var.f6364c];
                                        i9.l.b(list2);
                                        while (r0Var.f6365d < list2.size()) {
                                            s0Var = (s0) list2.get(r0Var.f6365d);
                                            if (z10) {
                                                if (s0Var != null) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    s0Var2 = s0Var;
                                                } else {
                                                    s0Var2 = null;
                                                }
                                                if (s0Var2 != null) {
                                                    s0Var2.f6383l = true;
                                                }
                                            }
                                            r0Var.f6366e = true;
                                            if (s0Var.c(aVar)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            r0Var.f6365d++;
                                        }
                                        r0Var.f6365d = 0;
                                        r0Var.f6364c++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            r0Var2 = this.k;
                            if (r0Var2 != null) {
                                i();
                                n3.n.P0("compose:lazy:prefetch:execute:item", j5);
                                r0Var3 = this.k;
                                if (r0Var3 != null) {
                                    r0Var3.f6366e = false;
                                }
                            }
                            aVar2 = this.f6376d;
                            if (!this.f6378f) {
                                if (h(this.f6384m, cVar.f6290c)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    f(aVar2.f8730a);
                                    Trace.endSection();
                                    i();
                                    cVar.f6290c = c.a(this.f6385n, cVar.f6290c);
                                    kVar = this.f6375c;
                                    if (kVar != null) {
                                        kVar.invoke(this);
                                    }
                                }
                            }
                            r0 r0Var4 = this.k;
                            if (this.f6378f) {
                                return false;
                            }
                            return false;
                        }
                        if (this.f6384m > 0) {
                            Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                            this.k = g();
                            this.f6382j = true;
                            Trace.endSection();
                            r0Var = this.k;
                            if (r0Var != null) {
                                i7 = cVar.f6291d;
                                z10 = this.f6383l;
                                listArr = r0Var.f6363b;
                                i10 = r0Var.f6364c;
                                list = r0Var.f6362a;
                                if (i10 < list.size()) {
                                    if (r0Var.f6367f.f6379g) {
                                        c0.b.c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    while (i11 < size) {
                                        ((i0) list.get(i11)).f6326d = i7;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (r0Var.f6364c < list.size()) {
                                        if (listArr[r0Var.f6364c] == null) {
                                            if (aVar.a() <= 0) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i17 = r0Var.f6364c;
                                            i0Var = (i0) list.get(i17);
                                            kVar2 = i0Var.f6323a;
                                            if (kVar2 == null) {
                                                list3 = u8.w.f13122a;
                                            } else {
                                                g0 g0Var2 = new g0(i0Var, i0Var.f6326d);
                                                kVar2.invoke(g0Var2);
                                                ArrayList arrayList2 = g0Var2.f6317b;
                                                i0Var.f6328f = arrayList2.size();
                                                list3 = arrayList2;
                                            }
                                            listArr[i17] = list3;
                                        }
                                        list2 = listArr[r0Var.f6364c];
                                        i9.l.b(list2);
                                        while (r0Var.f6365d < list2.size()) {
                                            s0Var = (s0) list2.get(r0Var.f6365d);
                                            if (z10) {
                                                if (s0Var != null) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    s0Var2 = s0Var;
                                                } else {
                                                    s0Var2 = null;
                                                }
                                                if (s0Var2 != null) {
                                                    s0Var2.f6383l = true;
                                                }
                                            }
                                            r0Var.f6366e = true;
                                            if (s0Var.c(aVar)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            r0Var.f6365d++;
                                        }
                                        r0Var.f6365d = 0;
                                        r0Var.f6364c++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            r0Var2 = this.k;
                            if (r0Var2 != null) {
                                i();
                                n3.n.P0("compose:lazy:prefetch:execute:item", j5);
                                r0Var3 = this.k;
                                if (r0Var3 != null) {
                                    r0Var3.f6366e = false;
                                }
                            }
                            aVar2 = this.f6376d;
                            if (!this.f6378f) {
                                if (h(this.f6384m, cVar.f6290c)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    f(aVar2.f8730a);
                                    Trace.endSection();
                                    i();
                                    cVar.f6290c = c.a(this.f6385n, cVar.f6290c);
                                    kVar = this.f6375c;
                                    if (kVar != null) {
                                        kVar.invoke(this);
                                    }
                                }
                            }
                            r0 r0Var5 = this.k;
                            if (this.f6378f) {
                                return false;
                            }
                            return false;
                        }
                    }
                } else {
                    if (this.f6382j) {
                        r0Var = this.k;
                        if (r0Var != null) {
                            i7 = cVar.f6291d;
                            z10 = this.f6383l;
                            listArr = r0Var.f6363b;
                            i10 = r0Var.f6364c;
                            list = r0Var.f6362a;
                            if (i10 < list.size()) {
                                if (r0Var.f6367f.f6379g) {
                                    c0.b.c("Should not execute nested prefetch on canceled request");
                                }
                                Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                try {
                                    size = list.size();
                                    while (i11 < size) {
                                        ((i0) list.get(i11)).f6326d = i7;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (r0Var.f6364c < list.size()) {
                                        try {
                                            if (listArr[r0Var.f6364c] == null) {
                                                if (aVar.a() <= 0) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                int i18 = r0Var.f6364c;
                                                i0Var = (i0) list.get(i18);
                                                kVar2 = i0Var.f6323a;
                                                if (kVar2 == null) {
                                                    list3 = u8.w.f13122a;
                                                } else {
                                                    g0 g0Var3 = new g0(i0Var, i0Var.f6326d);
                                                    kVar2.invoke(g0Var3);
                                                    ArrayList arrayList3 = g0Var3.f6317b;
                                                    i0Var.f6328f = arrayList3.size();
                                                    list3 = arrayList3;
                                                }
                                                listArr[i18] = list3;
                                            }
                                            list2 = listArr[r0Var.f6364c];
                                            i9.l.b(list2);
                                            while (r0Var.f6365d < list2.size()) {
                                                s0Var = (s0) list2.get(r0Var.f6365d);
                                                if (z10) {
                                                    if (s0Var != null) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        s0Var2 = s0Var;
                                                    } else {
                                                        s0Var2 = null;
                                                    }
                                                    if (s0Var2 != null) {
                                                        s0Var2.f6383l = true;
                                                    }
                                                }
                                                r0Var.f6366e = true;
                                                if (s0Var.c(aVar)) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                r0Var.f6365d++;
                                            }
                                            r0Var.f6365d = 0;
                                            r0Var.f6364c++;
                                        } catch (Throwable th2) {
                                            Trace.endSection();
                                            throw th2;
                                        }
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        r0Var2 = this.k;
                        if (r0Var2 != null && r0Var2.f6366e) {
                            i();
                            n3.n.P0("compose:lazy:prefetch:execute:item", j5);
                            r0Var3 = this.k;
                            if (r0Var3 != null) {
                                r0Var3.f6366e = false;
                            }
                        }
                        aVar2 = this.f6376d;
                        if (!this.f6378f && aVar2 != null) {
                            if (h(this.f6384m, cVar.f6290c)) {
                                Trace.beginSection("compose:lazy:prefetch:measure");
                                try {
                                    f(aVar2.f8730a);
                                    Trace.endSection();
                                    i();
                                    cVar.f6290c = c.a(this.f6385n, cVar.f6290c);
                                    kVar = this.f6375c;
                                    if (kVar != null) {
                                        kVar.invoke(this);
                                    }
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                        }
                        r0 r0Var6 = this.k;
                        if (this.f6378f || !this.f6382j || r0Var6 == null) {
                            return false;
                        }
                        List list4 = r0Var6.f6362a;
                        int size2 = list4.size();
                        int iMin = Integer.MAX_VALUE;
                        for (int i19 = 0; i19 < size2; i19++) {
                            iMin = Math.min(iMin, ((i0) list4.get(i19)).f6327e);
                        }
                        if (iMin == Integer.MAX_VALUE) {
                            iMin = 0;
                        }
                        int i20 = cVar.f6291d;
                        cVar.f6291d = i20 == -1 ? iMin : ((i20 * 3) + iMin) / 4;
                        int size3 = list4.size();
                        int iMin2 = Integer.MAX_VALUE;
                        for (int i21 = 0; i21 < size3; i21++) {
                            iMin2 = Math.min(iMin2, ((i0) list4.get(i21)).f6328f);
                        }
                        if (iMin2 == Integer.MAX_VALUE) {
                            iMin2 = 0;
                        }
                        if (iMin2 >= iMin) {
                            return false;
                        }
                        cVar.f6290c = 0L;
                        return false;
                    }
                    if (this.f6384m > 0) {
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.k = g();
                            this.f6382j = true;
                            Trace.endSection();
                            r0Var = this.k;
                            if (r0Var != null) {
                                i7 = cVar.f6291d;
                                z10 = this.f6383l;
                                listArr = r0Var.f6363b;
                                i10 = r0Var.f6364c;
                                list = r0Var.f6362a;
                                if (i10 < list.size()) {
                                    if (r0Var.f6367f.f6379g) {
                                        c0.b.c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    while (i11 < size) {
                                        ((i0) list.get(i11)).f6326d = i7;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (r0Var.f6364c < list.size()) {
                                        if (listArr[r0Var.f6364c] == null) {
                                            if (aVar.a() <= 0) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i110 = r0Var.f6364c;
                                            i0Var = (i0) list.get(i110);
                                            kVar2 = i0Var.f6323a;
                                            if (kVar2 == null) {
                                                list3 = u8.w.f13122a;
                                            } else {
                                                g0 g0Var4 = new g0(i0Var, i0Var.f6326d);
                                                kVar2.invoke(g0Var4);
                                                ArrayList arrayList4 = g0Var4.f6317b;
                                                i0Var.f6328f = arrayList4.size();
                                                list3 = arrayList4;
                                            }
                                            listArr[i110] = list3;
                                        }
                                        list2 = listArr[r0Var.f6364c];
                                        i9.l.b(list2);
                                        while (r0Var.f6365d < list2.size()) {
                                            s0Var = (s0) list2.get(r0Var.f6365d);
                                            if (z10) {
                                                if (s0Var != null) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    s0Var2 = s0Var;
                                                } else {
                                                    s0Var2 = null;
                                                }
                                                if (s0Var2 != null) {
                                                    s0Var2.f6383l = true;
                                                }
                                            }
                                            r0Var.f6366e = true;
                                            if (s0Var.c(aVar)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            r0Var.f6365d++;
                                        }
                                        r0Var.f6365d = 0;
                                        r0Var.f6364c++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            r0Var2 = this.k;
                            if (r0Var2 != null) {
                                i();
                                n3.n.P0("compose:lazy:prefetch:execute:item", j5);
                                r0Var3 = this.k;
                                if (r0Var3 != null) {
                                    r0Var3.f6366e = false;
                                }
                            }
                            aVar2 = this.f6376d;
                            if (!this.f6378f) {
                                if (h(this.f6384m, cVar.f6290c)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    f(aVar2.f8730a);
                                    Trace.endSection();
                                    i();
                                    cVar.f6290c = c.a(this.f6385n, cVar.f6290c);
                                    kVar = this.f6375c;
                                    if (kVar != null) {
                                        kVar.invoke(this);
                                    }
                                }
                            }
                            r0 r0Var7 = this.k;
                            if (this.f6378f) {
                                return false;
                            }
                            return false;
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                return true;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        return this.f6380h;
    }

    public final void f(long j5) {
        if (this.f6379g) {
            c0.b.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f6378f) {
            c0.b.a("Request was already measured!");
        }
        this.f6378f = true;
        f1 f1Var = this.f6377e;
        if (f1Var == null) {
            c0.b.b("performComposition() must be called before performMeasure()");
            throw new cc.s();
        }
        int iB = f1Var.b();
        for (int i7 = 0; i7 < iB; i7++) {
            f1Var.d(i7, j5);
        }
    }

    public final r0 g() {
        f1 f1Var = this.f6377e;
        if (f1Var == null) {
            c0.b.b("Should precompose before resolving nested prefetch states");
            throw new cc.s();
        }
        i9.x xVar = new i9.x();
        f1Var.e(new c8.k(16, xVar));
        List list = (List) xVar.f6688a;
        if (list != null) {
            return new r0(this, list);
        }
        return null;
    }

    public final boolean h(long j5, long j10) {
        if (this.f6383l) {
            j10 = 0;
        }
        return j5 > j10;
    }

    public final void i() {
        int i7 = ac.i.f530b;
        long jNanoTime = System.nanoTime() - ac.i.f529a;
        long j5 = this.f6386o;
        ac.c cVar = ac.c.NANOSECONDS;
        i9.l.e(cVar, "unit");
        long jK = 0;
        long j10 = Long.MAX_VALUE;
        if (((j5 - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j5) {
                int i10 = ac.a.f508d;
            } else {
                jK = ac.a.g(j5 < 0 ? ac.a.f507c : ac.a.f506b);
            }
        } else if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
            jK = jNanoTime < 0 ? ac.a.f507c : ac.a.f506b;
        } else {
            long j11 = jNanoTime - j5;
            if (((~(j11 ^ j5)) & (j11 ^ jNanoTime)) < 0) {
                ac.c cVar2 = ac.c.MILLISECONDS;
                if (cVar.compareTo(cVar2) < 0) {
                    long jC = ac.f.c(1L, cVar2, cVar);
                    long j12 = (jNanoTime / jC) - (j5 / jC);
                    long j13 = (jNanoTime % jC) - (j5 % jC);
                    int i11 = ac.a.f508d;
                    jK = ac.a.e(ac.f.k(j12, cVar2), ac.f.k(j13, cVar));
                } else {
                    jK = ac.a.g(j11 < 0 ? ac.a.f507c : ac.a.f506b);
                }
            } else {
                jK = ac.f.k(j11, cVar);
            }
        }
        long j14 = jK >> 1;
        int i12 = ac.a.f508d;
        if ((1 & ((int) jK)) == 0) {
            j10 = j14;
        } else if (j14 <= 9223372036854L) {
            j10 = j14 < -9223372036854L ? Long.MIN_VALUE : j14 * ((long) 1000000);
        }
        this.f6385n = j10;
        long j15 = this.f6384m - j10;
        this.f6384m = j15;
        this.f6386o = jNanoTime;
        n3.n.P0("compose:lazy:prefetch:available_time_nanos", j15);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f6373a + ", constraints = " + this.f6376d + ", isComposed = " + e() + ", isMeasured = " + this.f6378f + ", isCanceled = " + this.f6379g + " }";
    }
}
