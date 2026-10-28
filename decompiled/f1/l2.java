package f1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2 f5018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f5019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f5020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f5021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f5022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s.w f5023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5027j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f5032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f5033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0 f5034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s.w f5035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5036t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5037u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5038v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public s.v f5040x;

    public l2(i2 i2Var) {
        this.f5018a = i2Var;
        int[] iArr = i2Var.f4985a;
        this.f5019b = iArr;
        Object[] objArr = i2Var.f4987c;
        this.f5020c = objArr;
        this.f5021d = i2Var.f4993i;
        this.f5022e = i2Var.f4994j;
        this.f5023f = i2Var.k;
        int i7 = i2Var.f4986b;
        this.f5024g = i7;
        this.f5025h = (iArr.length / 5) - i7;
        int i10 = i2Var.f4988d;
        this.k = i10;
        this.f5028l = objArr.length - i10;
        this.f5029m = i7;
        this.f5032p = new o0();
        this.f5033q = new o0();
        this.f5034r = new o0();
        this.f5037u = i7;
        this.f5038v = -1;
    }

    public static int i(int i7, int i10, int i11, int i12) {
        return i7 > i10 ? -(((i12 - i11) - i7) + 1) : i7;
    }

    public static void y(l2 l2Var) {
        int i7 = l2Var.f5038v;
        int iR = l2Var.r(i7);
        int[] iArr = l2Var.f5019b;
        int i10 = (iR * 5) + 1;
        int i11 = iArr[i10];
        if ((i11 & 134217728) != 0) {
            return;
        }
        int i12 = (i11 & (-134217729)) | 134217728;
        iArr[i10] = i12;
        if ((67108864 & i12) != 0) {
            return;
        }
        l2Var.S(l2Var.D(iArr, i7));
    }

    public final void A(int i7) {
        a aVar;
        int i10;
        a aVar2;
        int i11;
        int i12;
        int i13 = this.f5025h;
        int i14 = this.f5024g;
        if (i14 != i7) {
            if (!this.f5021d.isEmpty()) {
                int iO = o() - this.f5025h;
                if (i14 < i7) {
                    for (int iB = k2.b(this.f5021d, i14, iO); iB < this.f5021d.size() && (i11 = (aVar2 = (a) this.f5021d.get(iB)).f4875a) < 0 && (i12 = i11 + iO) < i7; iB++) {
                        aVar2.f4875a = i12;
                    }
                } else {
                    for (int iB2 = k2.b(this.f5021d, i7, iO); iB2 < this.f5021d.size() && (i10 = (aVar = (a) this.f5021d.get(iB2)).f4875a) >= 0; iB2++) {
                        aVar.f4875a = -(iO - i10);
                    }
                }
            }
            if (i13 > 0) {
                int[] iArr = this.f5019b;
                int i15 = i7 * 5;
                int i16 = i13 * 5;
                int i17 = i14 * 5;
                if (i7 < i14) {
                    u8.l.m0(i16 + i15, i15, i17, iArr, iArr);
                } else {
                    u8.l.m0(i17, i17 + i16, i15 + i16, iArr, iArr);
                }
            }
            if (i7 < i14) {
                i14 = i7 + i13;
            }
            int iO2 = o();
            if (i14 >= iO2) {
                t.c("Check failed");
            }
            while (i14 < iO2) {
                int i18 = (i14 * 5) + 2;
                int i19 = this.f5019b[i18];
                int iP = i19 > -2 ? i19 : (p() + i19) - (-2);
                if (iP >= i7) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i19) {
                    this.f5019b[i18] = iP;
                }
                i14++;
                if (i14 == i7) {
                    i14 += i13;
                }
            }
        }
        this.f5024g = i7;
    }

    public final void B(int i7, int i10) {
        int i11 = this.f5028l;
        int i12 = this.k;
        int i13 = this.f5029m;
        if (i12 != i7) {
            Object[] objArr = this.f5020c;
            if (i7 < i12) {
                System.arraycopy(objArr, i7, objArr, i7 + i11, i12 - i7);
            } else {
                int i14 = i12 + i11;
                System.arraycopy(objArr, i14, objArr, i12, (i7 + i11) - i14);
            }
        }
        int iMin = Math.min(i10 + 1, p());
        if (i13 != iMin) {
            int length = this.f5020c.length - i11;
            if (iMin < i13) {
                int iR = r(iMin);
                int iR2 = r(i13);
                int i15 = this.f5024g;
                while (iR < iR2) {
                    int i16 = (iR * 5) + 4;
                    int i17 = this.f5019b[i16];
                    if (!(i17 >= 0)) {
                        t.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f5019b[i16] = -((length - i17) + 1);
                    iR++;
                    if (iR == i15) {
                        iR += this.f5025h;
                    }
                }
            } else {
                int iR3 = r(i13);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i18 = (iR3 * 5) + 4;
                    int i19 = this.f5019b[i18];
                    if (!(i19 < 0)) {
                        t.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f5019b[i18] = i19 + length + 1;
                    iR3++;
                    if (iR3 == this.f5024g) {
                        iR3 += this.f5025h;
                    }
                }
            }
            this.f5029m = iMin;
        }
        this.k = i7;
    }

    public final Object C(int i7) {
        int iR = r(i7);
        int[] iArr = this.f5019b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.f5020c[h(g(iArr, iR))];
        }
        return null;
    }

    public final int D(int[] iArr, int i7) {
        int i10 = iArr[(r(i7) * 5) + 2];
        return i10 > -2 ? i10 : (p() + i10) - (-2);
    }

    public final Object E(Object obj) {
        if (this.f5030n > 0) {
            w(1, this.f5038v);
        }
        Object[] objArr = this.f5020c;
        int i7 = this.f5026i;
        this.f5026i = i7 + 1;
        Object obj2 = objArr[h(i7)];
        if (this.f5026i > this.f5027j) {
            t.c("Writing to an invalid slot");
        }
        this.f5020c[h(this.f5026i - 1)] = obj;
        return obj2;
    }

    public final void F() {
        int i7;
        s.v vVar = this.f5040x;
        if (vVar != null) {
            while (vVar.f12509b != 0) {
                int iX = b.x(vVar);
                int iR = r(iX);
                int iT = iX + 1;
                int iT2 = t(iX) + iX;
                while (true) {
                    if (iT >= iT2) {
                        i7 = 0;
                        break;
                    } else {
                        if ((this.f5019b[(r(iT) * 5) + 1] & 201326592) != 0) {
                            i7 = 1;
                            break;
                        }
                        iT += t(iT);
                    }
                }
                int[] iArr = this.f5019b;
                int i10 = (iR * 5) + 1;
                int i11 = iArr[i10];
                if (((67108864 & i11) != 0 ? 1 : 0) != i7) {
                    iArr[i10] = (i7 << 26) | ((-67108865) & i11);
                    int iD = D(iArr, iX);
                    if (iD >= 0) {
                        b.i(vVar, iD);
                    }
                }
            }
        }
    }

    public final boolean G() {
        if (!(this.f5030n == 0)) {
            t.c("Cannot remove group while inserting");
        }
        int i7 = this.f5036t;
        int i10 = this.f5026i;
        int iG = g(this.f5019b, r(i7));
        int iK = K();
        N(this.f5038v);
        s.v vVar = this.f5040x;
        if (vVar != null) {
            while (true) {
                int i11 = vVar.f12509b;
                if (i11 == 0) {
                    break;
                }
                if (i11 == 0) {
                    t.a.e("IntList is empty.");
                    throw null;
                }
                if (vVar.f12508a[0] < i7) {
                    break;
                }
                b.x(vVar);
            }
        }
        boolean zH = H(i7, this.f5036t - i7);
        I(iG, this.f5026i - iG, i7 - 1);
        this.f5036t = i7;
        this.f5026i = i10;
        this.f5031o -= iK;
        return zH;
    }

    public final boolean H(int i7, int i10) {
        boolean z10 = false;
        if (i10 > 0) {
            ArrayList arrayList = this.f5021d;
            A(i7);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f5022e;
                int i11 = i7 + i10;
                int iB = k2.b(this.f5021d, i11, o() - this.f5025h);
                if (iB >= this.f5021d.size()) {
                    iB--;
                }
                int i12 = iB + 1;
                int i13 = 0;
                while (iB >= 0) {
                    a aVar = (a) this.f5021d.get(iB);
                    int iC = c(aVar);
                    if (iC < i7) {
                        break;
                    }
                    if (iC < i11) {
                        aVar.f4875a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i13 == 0) {
                            i13 = iB + 1;
                        }
                        i12 = iB;
                    }
                    iB--;
                }
                z10 = i12 < i13;
                if (z10) {
                    this.f5021d.subList(i12, i13).clear();
                }
            }
            this.f5024g = i7;
            this.f5025h += i10;
            int i14 = this.f5029m;
            if (i14 > i7) {
                this.f5029m = Math.max(i7, i14 - i10);
            }
            int i15 = this.f5037u;
            if (i15 >= this.f5024g) {
                this.f5037u = i15 - i10;
            }
            int i16 = this.f5038v;
            if (i16 >= 0 && (this.f5019b[(r(i16) * 5) + 1] & 67108864) != 0) {
                S(i16);
            }
        }
        return z10;
    }

    public final void I(int i7, int i10, int i11) {
        if (i10 > 0) {
            int i12 = this.f5028l;
            int i13 = i7 + i10;
            B(i13, i11);
            this.k = i7;
            this.f5028l = i12 + i10;
            u8.l.t0(i7, i13, null, this.f5020c);
            int i14 = this.f5027j;
            if (i14 >= i7) {
                this.f5027j = i14 - i10;
            }
        }
    }

    public final Object J(int i7, int i10, Object obj) {
        int iM = M(this.f5019b, r(i7));
        int iG = g(this.f5019b, r(i7 + 1));
        int i11 = iM + i10;
        if (i11 < iM || i11 >= iG) {
            t.c("Write to an invalid slot index " + i10 + " for group " + i7);
        }
        int iH = h(i11);
        Object[] objArr = this.f5020c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int K() {
        int iR = r(this.f5036t);
        int iA = k2.a(this.f5019b, iR) + this.f5036t;
        this.f5036t = iA;
        this.f5026i = g(this.f5019b, r(iA));
        int i7 = this.f5019b[(iR * 5) + 1];
        if ((1073741824 & i7) != 0) {
            return 1;
        }
        return i7 & 67108863;
    }

    public final void L() {
        int i7 = this.f5037u;
        this.f5036t = i7;
        this.f5026i = g(this.f5019b, r(i7));
    }

    public final int M(int[] iArr, int i7) {
        if (i7 >= o()) {
            return this.f5020c.length - this.f5028l;
        }
        int iC = k2.c(iArr, i7);
        return iC < 0 ? (this.f5020c.length - this.f5028l) + iC + 1 : iC;
    }

    public final n0 N(int i7) {
        a aVarQ;
        HashMap map = this.f5022e;
        if (map == null || (aVarQ = Q(i7)) == null) {
            return null;
        }
        return (n0) map.get(aVarQ);
    }

    public final void O() {
        if (this.f5030n != 0) {
            t.c("Key must be supplied when inserting");
        }
        w0 w0Var = n.f5051a;
        P(0, w0Var, w0Var, false);
    }

    public final void P(int i7, Object obj, Object obj2, boolean z10) {
        int i10;
        int i11 = this.f5038v;
        boolean z11 = this.f5030n > 0;
        this.f5034r.c(this.f5031o);
        w0 w0Var = n.f5051a;
        if (z11) {
            int i12 = this.f5036t;
            int iG = g(this.f5019b, r(i12));
            v(1);
            this.f5026i = iG;
            this.f5027j = iG;
            int iR = r(i12);
            int i13 = obj != w0Var ? 1 : 0;
            int i14 = (z10 || obj2 == w0Var) ? 0 : 1;
            int i15 = i(iG, this.k, this.f5028l, this.f5020c.length);
            if (i15 >= 0 && this.f5029m < i12) {
                i15 = -(((this.f5020c.length - this.f5028l) - i15) + 1);
            }
            int[] iArr = this.f5019b;
            int i16 = this.f5038v;
            int i17 = iR * 5;
            iArr[i17] = i7;
            iArr[i17 + 1] = ((z10 ? 1 : 0) << 30) | (i13 << 29) | (i14 << 28);
            iArr[i17 + 2] = i16;
            iArr[i17 + 3] = 0;
            iArr[i17 + 4] = i15;
            int i18 = (z10 ? 1 : 0) + i13 + i14;
            if (i18 > 0) {
                w(i18, i12);
                Object[] objArr = this.f5020c;
                int i19 = this.f5026i;
                if (z10) {
                    objArr[i19] = obj2;
                    i19++;
                }
                if (i13 != 0) {
                    objArr[i19] = obj;
                    i19++;
                }
                if (i14 != 0) {
                    objArr[i19] = obj2;
                    i19++;
                }
                this.f5026i = i19;
            }
            this.f5031o = 0;
            i10 = i12 + 1;
            this.f5038v = i12;
            this.f5036t = i10;
            if (i11 >= 0) {
                N(i11);
            }
        } else {
            this.f5032p.c(i11);
            this.f5033q.c((o() - this.f5025h) - this.f5037u);
            int i20 = this.f5036t;
            int iR2 = r(i20);
            if (!i9.l.a(obj2, w0Var)) {
                if (z10) {
                    T(this.f5036t, obj2);
                } else {
                    R(obj2);
                }
            }
            this.f5026i = M(this.f5019b, iR2);
            this.f5027j = g(this.f5019b, r(this.f5036t + 1));
            int[] iArr2 = this.f5019b;
            int i21 = iR2 * 5;
            this.f5031o = iArr2[i21 + 1] & 67108863;
            this.f5038v = i20;
            this.f5036t = i20 + 1;
            i10 = i20 + iArr2[i21 + 3];
        }
        this.f5037u = i10;
    }

    public final a Q(int i7) {
        ArrayList arrayList;
        int iE;
        if (i7 < 0 || i7 >= p() || (iE = k2.e((arrayList = this.f5021d), i7, p())) < 0) {
            return null;
        }
        return (a) arrayList.get(iE);
    }

    public final void R(Object obj) {
        int iR = r(this.f5036t);
        int i7 = (iR * 5) + 1;
        if ((this.f5019b[i7] & 268435456) == 0) {
            t.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f5020c;
        int[] iArr = this.f5019b;
        objArr[h(Integer.bitCount(iArr[i7] >> 29) + g(iArr, iR))] = obj;
    }

    public final void S(int i7) {
        if (i7 >= 0) {
            s.v vVar = this.f5040x;
            if (vVar == null) {
                vVar = new s.v();
                this.f5040x = vVar;
            }
            b.i(vVar, i7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final void T(int i7, Object obj) {
        boolean z10;
        int iR = r(i7);
        int[] iArr = this.f5019b;
        if (iR < iArr.length) {
            z10 = (iArr[(iR * 5) + 1] & 1073741824) != 0;
        }
        if (!z10) {
            t.c("Updating the node of a group at " + i7 + " that was not created with as a node group");
        }
        this.f5020c[h(g(this.f5019b, iR))] = obj;
    }

    public final void a(int i7) {
        boolean z10 = false;
        if (!(i7 >= 0)) {
            t.c("Cannot seek backwards");
        }
        if (!(this.f5030n <= 0)) {
            r1.b("Cannot call seek() while inserting");
        }
        if (i7 == 0) {
            return;
        }
        int i10 = this.f5036t + i7;
        if (i10 >= this.f5038v && i10 <= this.f5037u) {
            z10 = true;
        }
        if (!z10) {
            t.c("Cannot seek outside the current group (" + this.f5038v + '-' + this.f5037u + ')');
        }
        this.f5036t = i10;
        int iG = g(this.f5019b, r(i10));
        this.f5026i = iG;
        this.f5027j = iG;
    }

    public final a b(int i7) {
        ArrayList arrayList = this.f5021d;
        int iE = k2.e(arrayList, i7, p());
        if (iE >= 0) {
            return (a) arrayList.get(iE);
        }
        if (i7 > this.f5024g) {
            i7 = -(p() - i7);
        }
        a aVar = new a(i7);
        arrayList.add(-(iE + 1), aVar);
        return aVar;
    }

    public final int c(a aVar) {
        int i7 = aVar.f4875a;
        return i7 < 0 ? p() + i7 : i7;
    }

    public final void d() {
        int i7 = this.f5030n;
        this.f5030n = i7 + 1;
        if (i7 == 0) {
            this.f5033q.c((o() - this.f5025h) - this.f5037u);
        }
    }

    public final void e(boolean z10) {
        this.f5039w = true;
        if (z10 && this.f5032p.f5067b == 0) {
            A(p());
            B(this.f5020c.length - this.f5028l, this.f5024g);
            int i7 = this.k;
            Arrays.fill(this.f5020c, i7, this.f5028l + i7, (Object) null);
            F();
        }
        int[] iArr = this.f5019b;
        int i10 = this.f5024g;
        Object[] objArr = this.f5020c;
        int i11 = this.k;
        ArrayList arrayList = this.f5021d;
        HashMap map = this.f5022e;
        s.w wVar = this.f5023f;
        i2 i2Var = this.f5018a;
        if (!i2Var.f4991g) {
            r1.a("Unexpected writer close()");
        }
        i2Var.f4991g = false;
        i2Var.f4985a = iArr;
        i2Var.f4986b = i10;
        i2Var.f4987c = objArr;
        i2Var.f4988d = i11;
        i2Var.f4993i = arrayList;
        i2Var.f4994j = map;
        i2Var.k = wVar;
    }

    public final int f(int i7) {
        return g(this.f5019b, r(i7));
    }

    public final int g(int[] iArr, int i7) {
        if (i7 >= o()) {
            return this.f5020c.length - this.f5028l;
        }
        int i10 = iArr[(i7 * 5) + 4];
        return i10 < 0 ? (this.f5020c.length - this.f5028l) + i10 + 1 : i10;
    }

    public final int h(int i7) {
        return (this.f5028l * (i7 < this.k ? 0 : 1)) + i7;
    }

    public final void j() {
        s.d0 d0Var;
        boolean z10 = this.f5030n > 0;
        int i7 = this.f5036t;
        int i10 = this.f5037u;
        int i11 = this.f5038v;
        int iR = r(i11);
        int i12 = this.f5031o;
        int i13 = i7 - i11;
        int i14 = iR * 5;
        int i15 = i14 + 1;
        boolean z11 = (this.f5019b[i15] & 1073741824) != 0;
        o0 o0Var = this.f5034r;
        if (z10) {
            s.w wVar = this.f5035s;
            if (wVar != null && (d0Var = (s.d0) wVar.b(i11)) != null) {
                Object[] objArr = d0Var.f12407a;
                int i16 = d0Var.f12408b;
                for (int i17 = 0; i17 < i16; i17++) {
                    E(objArr[i17]);
                }
            }
            int[] iArr = this.f5019b;
            iArr[i14 + 3] = i13;
            k2.d(iR, i12, iArr);
            int iB = o0Var.b();
            if (z11) {
                i12 = 1;
            }
            this.f5031o = iB + i12;
            int iD = D(this.f5019b, i11);
            this.f5038v = iD;
            int iP = iD < 0 ? p() : r(iD + 1);
            int iG = iP >= 0 ? g(this.f5019b, iP) : 0;
            this.f5026i = iG;
            this.f5027j = iG;
            return;
        }
        if (i7 != i10) {
            t.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f5019b;
        int i18 = i14 + 3;
        int i19 = iArr2[i18];
        int i20 = iArr2[i15] & 67108863;
        iArr2[i18] = i13;
        k2.d(iR, i12, iArr2);
        int iB2 = this.f5032p.b();
        this.f5037u = (o() - this.f5025h) - this.f5033q.b();
        this.f5038v = iB2;
        int iD2 = D(this.f5019b, i11);
        int iB3 = o0Var.b();
        this.f5031o = iB3;
        if (iD2 == iB2) {
            this.f5031o = iB3 + (z11 ? 0 : i12 - i20);
            return;
        }
        int i21 = i13 - i19;
        int i22 = z11 ? 0 : i12 - i20;
        if (i21 != 0 || i22 != 0) {
            while (iD2 != 0 && iD2 != iB2 && (i22 != 0 || i21 != 0)) {
                int iR2 = r(iD2);
                if (i21 != 0) {
                    int[] iArr3 = this.f5019b;
                    int i23 = (iR2 * 5) + 3;
                    iArr3[i23] = iArr3[i23] + i21;
                }
                if (i22 != 0) {
                    int[] iArr4 = this.f5019b;
                    k2.d(iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i22, iArr4);
                }
                int[] iArr5 = this.f5019b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i22 = 0;
                }
                iD2 = D(iArr5, iD2);
            }
        }
        this.f5031o += i22;
    }

    public final void k() {
        if (this.f5030n <= 0) {
            r1.b("Unbalanced begin/end insert");
        }
        int i7 = this.f5030n - 1;
        this.f5030n = i7;
        if (i7 == 0) {
            if (this.f5034r.f5067b != this.f5032p.f5067b) {
                t.c("startGroup/endGroup mismatch while inserting");
            }
            this.f5037u = (o() - this.f5025h) - this.f5033q.b();
        }
    }

    public final void l(int i7) {
        boolean z10 = false;
        if (!(this.f5030n <= 0)) {
            t.c("Cannot call ensureStarted() while inserting");
        }
        int i10 = this.f5038v;
        if (i10 != i7) {
            if (i7 >= i10 && i7 < this.f5037u) {
                z10 = true;
            }
            if (!z10) {
                t.c("Started group at " + i7 + " must be a subgroup of the group at " + i10);
            }
            int i11 = this.f5036t;
            int i12 = this.f5026i;
            int i13 = this.f5027j;
            this.f5036t = i7;
            O();
            this.f5036t = i11;
            this.f5026i = i12;
            this.f5027j = i13;
        }
    }

    public final void m(int i7, int i10, int i11) {
        if (i7 >= this.f5024g) {
            i7 = -((p() - i7) + 2);
        }
        while (i11 < i10) {
            this.f5019b[(r(i11) * 5) + 2] = i7;
            int i12 = this.f5019b[(r(i11) * 5) + 3] + i11;
            m(i11, i12, i11 + 1);
            i11 = i12;
        }
    }

    public final void n(int i7, h9.n nVar) {
        int i10;
        int i11;
        a aVar;
        int iD = D(this.f5019b, i7);
        int iP = p();
        int iT = t(i7) + i7;
        int i12 = i7;
        s.x xVar = null;
        s.v vVar = null;
        while (i12 < iT) {
            int i13 = i12 + 1;
            int iF = f(i13);
            for (int iF2 = f(i12); iF2 < iF; iF2++) {
                Object obj = this.f5020c[h(iF2)];
                if ((obj instanceof e2) && (aVar = ((e2) obj).f4945b) != null && aVar.a()) {
                    int iC = c(aVar);
                    if (xVar == null) {
                        int[] iArr = s.m.f12470a;
                        xVar = new s.x();
                    }
                    if (vVar == null) {
                        vVar = new s.v();
                    }
                    xVar.a(iC);
                    vVar.a(iC);
                    vVar.a(iF2);
                } else {
                    nVar.invoke(Integer.valueOf(iF2), obj);
                }
            }
            int iD2 = i13 < iP ? D(this.f5019b, i13) : -1;
            if (iD2 != i12) {
                while (true) {
                    if (vVar == null || xVar == null || !xVar.e(i12)) {
                        i10 = iP;
                    } else {
                        int i14 = vVar.f12509b;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = iP;
                            int iB = vVar.b(i18);
                            if (iB == i12) {
                                int iB2 = vVar.b(i18 + 1);
                                nVar.invoke(Integer.valueOf(iB2), this.f5020c[h(iB2)]);
                            } else if (i18 != i17) {
                                int i20 = i17 + 1;
                                vVar.d(i17, iB);
                                i17 += 2;
                                vVar.d(i20, vVar.b(i18 + 1));
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            nVar = nVar;
                            iP = i19;
                        }
                        i10 = iP;
                        if (i17 != i14) {
                            if (i17 < 0 || i17 > (i11 = vVar.f12509b) || i14 < 0 || i14 > i11) {
                                t.a.d("Index must be between 0 and size");
                                throw null;
                            }
                            if (i14 < i17) {
                                t.a.c("The end index must be < start index");
                                throw null;
                            }
                            if (i14 != i17) {
                                if (i14 < i11) {
                                    int[] iArr2 = vVar.f12508a;
                                    u8.l.m0(i17, i14, i11, iArr2, iArr2);
                                }
                                vVar.f12509b -= i14 - i17;
                            }
                        }
                    }
                    if (i12 == i7 || iD == iD2) {
                        break;
                    }
                    i12 = iD;
                    iP = i10;
                    iD = D(this.f5019b, iD);
                    nVar = nVar;
                }
            } else {
                i10 = iP;
            }
            iD = iD2;
            i12 = i13;
            iP = i10;
        }
    }

    public final int o() {
        return this.f5019b.length / 5;
    }

    public final int p() {
        return o() - this.f5025h;
    }

    public final Object q(int i7) {
        int iR = r(i7);
        int[] iArr = this.f5019b;
        int i10 = (iR * 5) + 1;
        if ((iArr[i10] & 268435456) == 0) {
            return n.f5051a;
        }
        return this.f5020c[Integer.bitCount(iArr[i10] >> 29) + g(iArr, iR)];
    }

    public final int r(int i7) {
        return (this.f5025h * (i7 < this.f5024g ? 0 : 1)) + i7;
    }

    public final Object s(int i7) {
        int iR = r(i7);
        int[] iArr = this.f5019b;
        int i10 = iR * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) == 0) {
            return null;
        }
        return this.f5020c[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
    }

    public final int t(int i7) {
        return k2.a(this.f5019b, r(i7));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f5036t + " end=" + this.f5037u + " size = " + p() + " gap=" + this.f5024g + '-' + (this.f5024g + this.f5025h) + ')';
    }

    public final boolean u(int i7, int i10) {
        int iO;
        int iT;
        if (i10 == this.f5038v) {
            iO = this.f5037u;
        } else {
            o0 o0Var = this.f5032p;
            if (i10 > o0Var.a(0)) {
                iT = t(i10);
            } else {
                int[] iArr = o0Var.f5066a;
                int iMin = Math.min(iArr.length, o0Var.f5067b);
                int i11 = 0;
                while (true) {
                    if (i11 >= iMin) {
                        i11 = -1;
                        break;
                    }
                    if (iArr[i11] == i10) {
                        break;
                    }
                    i11++;
                }
                if (i11 < 0) {
                    iT = t(i10);
                } else {
                    iO = (o() - this.f5025h) - this.f5033q.f5066a[i11];
                }
            }
            iO = iT + i10;
        }
        return i7 > i10 && i7 < iO;
    }

    public final void v(int i7) {
        if (i7 > 0) {
            int i10 = this.f5036t;
            A(i10);
            int i11 = this.f5024g;
            int i12 = this.f5025h;
            int[] iArr = this.f5019b;
            int length = iArr.length / 5;
            int i13 = length - i12;
            if (i12 < i7) {
                int iMax = Math.max(Math.max(length * 2, i13 + i7), 32);
                int[] iArr2 = new int[iMax * 5];
                int i14 = iMax - i13;
                u8.l.m0(0, 0, i11 * 5, iArr, iArr2);
                u8.l.m0((i11 + i14) * 5, (i12 + i11) * 5, length * 5, iArr, iArr2);
                this.f5019b = iArr2;
                i12 = i14;
            }
            int i15 = this.f5037u;
            if (i15 >= i11) {
                this.f5037u = i15 + i7;
            }
            int i16 = i11 + i7;
            this.f5024g = i16;
            this.f5025h = i12 - i7;
            int i17 = i(i13 > 0 ? f(i10 + i7) : 0, this.f5029m >= i11 ? this.k : 0, this.f5028l, this.f5020c.length);
            for (int i18 = i11; i18 < i16; i18++) {
                this.f5019b[(i18 * 5) + 4] = i17;
            }
            int i19 = this.f5029m;
            if (i19 >= i11) {
                this.f5029m = i19 + i7;
            }
        }
    }

    public final void w(int i7, int i10) {
        if (i7 > 0) {
            B(this.f5026i, i10);
            int i11 = this.k;
            int i12 = this.f5028l;
            if (i12 < i7) {
                Object[] objArr = this.f5020c;
                int length = objArr.length;
                int i13 = length - i12;
                int iMax = Math.max(Math.max(length * 2, i13 + i7), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i14 = 0; i14 < iMax; i14++) {
                    objArr2[i14] = null;
                }
                int i15 = iMax - i13;
                int i16 = i12 + i11;
                System.arraycopy(objArr, 0, objArr2, 0, i11);
                System.arraycopy(objArr, i16, objArr2, i11 + i15, length - i16);
                this.f5020c = objArr2;
                i12 = i15;
            }
            int i17 = this.f5027j;
            if (i17 >= i11) {
                this.f5027j = i17 + i7;
            }
            this.k = i11 + i7;
            this.f5028l = i12 - i7;
        }
    }

    public final boolean x(int i7) {
        return (this.f5019b[(r(i7) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(i2 i2Var, int i7) {
        if (this.f5030n <= 0) {
            t.c("Check failed");
        }
        boolean z10 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i7 == 0 && this.f5036t == 0 && this.f5018a.f4986b == 0) {
            int[] iArr = i2Var.f4985a;
            int i10 = iArr[(i7 * 5) + 3];
            int i11 = i2Var.f4986b;
            if (i10 == i11) {
                int[] iArr2 = this.f5019b;
                Object[] objArr3 = this.f5020c;
                ArrayList arrayList = this.f5021d;
                HashMap map = this.f5022e;
                s.w wVar = this.f5023f;
                Object[] objArr4 = i2Var.f4987c;
                int i12 = i2Var.f4988d;
                HashMap map2 = i2Var.f4994j;
                s.w wVar2 = i2Var.k;
                this.f5019b = iArr;
                this.f5020c = objArr4;
                this.f5021d = i2Var.f4993i;
                this.f5024g = i11;
                this.f5025h = (iArr.length / 5) - i11;
                this.k = i12;
                this.f5028l = objArr4.length - i12;
                this.f5029m = i11;
                this.f5022e = map2;
                this.f5023f = wVar2;
                i2Var.f4985a = iArr2;
                i2Var.f4986b = objArr2 == true ? 1 : 0;
                i2Var.f4987c = objArr3;
                i2Var.f4988d = objArr == true ? 1 : 0;
                i2Var.f4993i = arrayList;
                i2Var.f4994j = map;
                i2Var.k = wVar;
                return;
            }
        }
        l2 l2VarM = i2Var.m();
        try {
            b.r(l2VarM, i7, this, true, true, false);
            boolean z11 = true;
        } finally {
            l2VarM.e(z10);
        }
    }
}
