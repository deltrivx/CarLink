package pc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class o0 implements nc.e, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f10483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10485d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f10486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List[] f10487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f10488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f10489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f10490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f10491j;
    public final Object k;

    public o0(String str, w wVar, int i7) {
        this.f10482a = str;
        this.f10483b = wVar;
        this.f10484c = i7;
        String[] strArr = new String[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f10486e = strArr;
        int i11 = this.f10484c;
        this.f10487f = new List[i11];
        this.f10488g = new boolean[i11];
        this.f10489h = u8.x.f13123a;
        final int i12 = 0;
        h9.a aVar = new h9.a(this) { // from class: pc.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f10479b;

            {
                this.f10479b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, t8.h] */
            @Override // h9.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return this.f10479b.f10483b.b();
                    default:
                        o0 o0Var = this.f10479b;
                        return Integer.valueOf(m0.c(o0Var, (nc.e[]) o0Var.f10491j.getValue()));
                }
            }
        };
        t8.i iVar = t8.i.f12827a;
        this.f10490i = t8.a.c(iVar, aVar);
        this.f10491j = t8.a.c(iVar, new n8.f(this));
        final int i13 = 1;
        this.k = t8.a.c(iVar, new h9.a(this) { // from class: pc.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f10479b;

            {
                this.f10479b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, t8.h] */
            @Override // h9.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return this.f10479b.f10483b.b();
                    default:
                        o0 o0Var = this.f10479b;
                        return Integer.valueOf(m0.c(o0Var, (nc.e[]) o0Var.f10491j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // pc.j
    public final Set a() {
        return this.f10489h.keySet();
    }

    public final void b(String str, boolean z10) {
        int i7 = this.f10485d + 1;
        this.f10485d = i7;
        String[] strArr = this.f10486e;
        strArr[i7] = str;
        this.f10488g[i7] = z10;
        this.f10487f[i7] = null;
        if (i7 == this.f10484c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                map.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f10489h = map;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, t8.h] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            nc.e eVar = (nc.e) obj;
            if (this.f10482a.equals(eVar.h()) && Arrays.equals((nc.e[]) this.f10491j.getValue(), (nc.e[]) ((o0) obj).f10491j.getValue())) {
                int iK = eVar.k();
                int i7 = this.f10484c;
                if (i7 == iK) {
                    for (int i10 = 0; i10 < i7; i10++) {
                        if (i9.l.a(n(i10).h(), eVar.n(i10).h()) && i9.l.a(n(i10).f(), eVar.n(i10).f())) {
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
        return nc.i.f9090c;
    }

    @Override // nc.e
    public boolean g() {
        return false;
    }

    @Override // nc.e
    public final List getAnnotations() {
        return u8.w.f13122a;
    }

    @Override // nc.e
    public final String h() {
        return this.f10482a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // nc.e
    public final void i() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // nc.e
    public final int j(String str) {
        i9.l.e(str, "name");
        Integer num = (Integer) this.f10489h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // nc.e
    public final int k() {
        return this.f10484c;
    }

    @Override // nc.e
    public final String l(int i7) {
        return this.f10486e[i7];
    }

    @Override // nc.e
    public final List m(int i7) {
        List list = this.f10487f[i7];
        return list == null ? u8.w.f13122a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // nc.e
    public final nc.e n(int i7) {
        return ((mc.a[]) this.f10490i.getValue())[i7].d();
    }

    @Override // nc.e
    public final boolean o(int i7) {
        return this.f10488g[i7];
    }

    public final String toString() {
        return m0.g(this);
    }
}
