package f1;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2 f4970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f4971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f4973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0 f4979j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4980l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4981m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4982n;

    public h2(i2 i2Var) {
        this.f4970a = i2Var;
        this.f4971b = i2Var.f4985a;
        int i7 = i2Var.f4986b;
        this.f4972c = i7;
        this.f4973d = i2Var.f4987c;
        this.f4974e = i2Var.f4988d;
        this.f4977h = i7;
        this.f4978i = -1;
        this.f4979j = new o0();
    }

    public final a a(int i7) {
        ArrayList arrayList = this.f4970a.f4993i;
        int iE = k2.e(arrayList, i7, this.f4972c);
        if (iE >= 0) {
            return (a) arrayList.get(iE);
        }
        a aVar = new a(i7);
        arrayList.add(-(iE + 1), aVar);
        return aVar;
    }

    public final Object b(int[] iArr, int i7) {
        int i10 = i7 * 5;
        int i11 = iArr[i10 + 1];
        if ((268435456 & i11) != 0) {
            return this.f4973d[i10 >= iArr.length ? iArr.length : iArr[i10 + 4] + Integer.bitCount(i11 >> 29)];
        }
        return n.f5051a;
    }

    public final void c() {
        this.f4975f = true;
        i2 i2Var = this.f4970a;
        i2Var.getClass();
        if (this.f4970a != i2Var || i2Var.f4989e <= 0) {
            t.c("Unexpected reader close()");
        }
        i2Var.f4989e--;
        this.f4973d = new Object[0];
    }

    public final boolean d(int i7) {
        return (this.f4971b[(i7 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.k == 0) {
            if (!(this.f4976g == this.f4977h)) {
                t.c("endGroup() not called at the end of a group");
            }
            int i7 = (this.f4978i * 5) + 2;
            int[] iArr = this.f4971b;
            int i10 = iArr[i7];
            this.f4978i = i10;
            int i11 = this.f4972c;
            this.f4977h = i10 < 0 ? i11 : k2.a(iArr, i10) + i10;
            int iB = this.f4979j.b();
            if (iB < 0) {
                this.f4980l = 0;
                this.f4981m = 0;
            } else {
                this.f4980l = iB;
                this.f4981m = i10 >= i11 - 1 ? this.f4974e : iArr[((i10 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i7 = this.f4976g;
        if (i7 < this.f4977h) {
            return b(this.f4971b, i7);
        }
        return 0;
    }

    public final int g() {
        int i7 = this.f4976g;
        if (i7 >= this.f4977h) {
            return 0;
        }
        return this.f4971b[i7 * 5];
    }

    public final Object h(int i7, int i10) {
        int[] iArr = this.f4971b;
        int iC = k2.c(iArr, i7);
        int i11 = i7 + 1;
        int i12 = iC + i10;
        return i12 < (i11 < this.f4972c ? iArr[(i11 * 5) + 4] : this.f4974e) ? this.f4973d[i12] : n.f5051a;
    }

    public final int i(int i7) {
        return this.f4971b[i7 * 5];
    }

    public final boolean j(int i7) {
        return (this.f4971b[(i7 * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i7) {
        return (this.f4971b[(i7 * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i7) {
        return (this.f4971b[(i7 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i7;
        if (this.k > 0 || (i7 = this.f4980l) >= this.f4981m) {
            this.f4982n = false;
            return n.f5051a;
        }
        this.f4982n = true;
        Object[] objArr = this.f4973d;
        this.f4980l = i7 + 1;
        return objArr[i7];
    }

    public final Object n(int i7) {
        int i10 = i7 * 5;
        int[] iArr = this.f4971b;
        int i11 = iArr[i10 + 1] & 1073741824;
        if (i11 != 0) {
            return i11 != 0 ? this.f4973d[iArr[i10 + 4]] : n.f5051a;
        }
        return null;
    }

    public final int o(int i7) {
        return this.f4971b[(i7 * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i7) {
        int i10 = i7 * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) == 0) {
            return null;
        }
        return this.f4973d[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
    }

    public final int q(int i7) {
        return this.f4971b[(i7 * 5) + 2];
    }

    public final void r(int i7) {
        if (!(this.k == 0)) {
            t.c("Cannot reposition while in an empty region");
        }
        this.f4976g = i7;
        int[] iArr = this.f4971b;
        int i10 = this.f4972c;
        int i11 = i7 < i10 ? iArr[(i7 * 5) + 2] : -1;
        if (i11 != this.f4978i) {
            this.f4978i = i11;
            if (i11 < 0) {
                this.f4977h = i10;
            } else {
                this.f4977h = k2.a(iArr, i11) + i11;
            }
            this.f4980l = 0;
            this.f4981m = 0;
        }
    }

    public final int s() {
        if (!(this.k == 0)) {
            t.c("Cannot skip while in an empty region");
        }
        int i7 = this.f4976g;
        int[] iArr = this.f4971b;
        int i10 = (iArr[(i7 * 5) + 1] & 1073741824) == 0 ? iArr[(i7 * 5) + 1] & 67108863 : 1;
        this.f4976g = k2.a(iArr, i7) + i7;
        return i10;
    }

    public final void t() {
        if (!(this.k == 0)) {
            t.c("Cannot skip the enclosing group while in an empty region");
        }
        this.f4976g = this.f4977h;
        this.f4980l = 0;
        this.f4981m = 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f4976g);
        sb2.append(", key=");
        sb2.append(g());
        sb2.append(", parent=");
        sb2.append(this.f4978i);
        sb2.append(", end=");
        return a2.f.H(sb2, this.f4977h, ')');
    }

    public final void u() {
        if (this.k <= 0) {
            int i7 = this.f4978i;
            int i10 = this.f4976g;
            int[] iArr = this.f4971b;
            if (!(iArr[(i10 * 5) + 2] == i7)) {
                r1.a("Invalid slot table detected");
            }
            int i11 = this.f4980l;
            int i12 = this.f4981m;
            o0 o0Var = this.f4979j;
            if (i11 == 0 && i12 == 0) {
                o0Var.c(-1);
            } else {
                o0Var.c(i11);
            }
            this.f4978i = i10;
            this.f4977h = k2.a(iArr, i10) + i10;
            int i13 = i10 + 1;
            this.f4976g = i13;
            this.f4980l = k2.c(iArr, i10);
            this.f4981m = i10 >= this.f4972c - 1 ? this.f4974e : iArr[(i13 * 5) + 4];
        }
    }
}
