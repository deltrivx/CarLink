package k1;

import f1.r1;
import java.util.Arrays;
import n3.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f7172e = new m(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1.b f7175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f7176d;

    public m(int i7, int i10, Object[] objArr, m1.b bVar) {
        this.f7173a = i7;
        this.f7174b = i10;
        this.f7175c = bVar;
        this.f7176d = objArr;
    }

    public static m j(int i7, Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11, m1.b bVar) {
        if (i11 > 30) {
            return new m(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iJ = a.a.J(i7, i11);
        int iJ2 = a.a.J(i10, i11);
        if (iJ != iJ2) {
            return new m((1 << iJ) | (1 << iJ2), 0, iJ < iJ2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new m(0, 1 << iJ, new Object[]{j(i7, obj, obj2, i10, obj3, obj4, i11 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i7, int i10, int i11, Object obj, Object obj2, int i12, m1.b bVar) {
        Object obj3 = this.f7176d[i7];
        m mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i7), i11, obj, obj2, i12 + 5, bVar);
        int iT = t(i10);
        int i13 = iT + 1;
        Object[] objArr = this.f7176d;
        Object[] objArr2 = new Object[objArr.length - 1];
        u8.l.r0(objArr, objArr2, 0, i7, 6);
        u8.l.p0(objArr, objArr2, i7, i7 + 2, i13);
        objArr2[iT - 1] = mVarJ;
        u8.l.p0(objArr, objArr2, iT, i13, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f7174b == 0) {
            return this.f7176d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f7173a);
        int length = this.f7176d.length;
        for (int i7 = iBitCount * 2; i7 < length; i7++) {
            iBitCount += s(i7).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        n9.b bVarZ = r.Z(r.e0(0, this.f7176d.length));
        int i7 = bVarZ.f8965a;
        int i10 = bVarZ.f8966b;
        int i11 = bVarZ.f8967c;
        if ((i11 > 0 && i7 <= i10) || (i11 < 0 && i10 <= i7)) {
            while (!i9.l.a(obj, this.f7176d[i7])) {
                if (i7 != i10) {
                    i7 += i11;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i7, int i10, Object obj) {
        int iJ = 1 << a.a.J(i7, i10);
        if (h(iJ)) {
            return i9.l.a(obj, this.f7176d[f(iJ)]);
        }
        if (!i(iJ)) {
            return false;
        }
        m mVarS = s(t(iJ));
        return i10 == 30 ? mVarS.c(obj) : mVarS.d(i7, i10 + 5, obj);
    }

    public final boolean e(m mVar) {
        if (this == mVar) {
            return true;
        }
        if (this.f7174b == mVar.f7174b && this.f7173a == mVar.f7173a) {
            int length = this.f7176d.length;
            for (int i7 = 0; i7 < length; i7++) {
                if (this.f7176d[i7] == mVar.f7176d[i7]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i7) {
        return Integer.bitCount((i7 - 1) & this.f7173a) * 2;
    }

    public final Object g(int i7, int i10, Object obj) {
        int iJ = 1 << a.a.J(i7, i10);
        if (h(iJ)) {
            int iF = f(iJ);
            if (i9.l.a(obj, this.f7176d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iJ)) {
            return null;
        }
        m mVarS = s(t(iJ));
        if (i10 != 30) {
            return mVarS.g(i7, i10 + 5, obj);
        }
        n9.b bVarZ = r.Z(r.e0(0, mVarS.f7176d.length));
        int i11 = bVarZ.f8965a;
        int i12 = bVarZ.f8966b;
        int i13 = bVarZ.f8967c;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return null;
        }
        while (!i9.l.a(obj, mVarS.f7176d[i11])) {
            if (i11 == i12) {
                return null;
            }
            i11 += i13;
        }
        return mVarS.x(i11);
    }

    public final boolean h(int i7) {
        return (i7 & this.f7173a) != 0;
    }

    public final boolean i(int i7) {
        return (i7 & this.f7174b) != 0;
    }

    public final m k(int i7, e eVar) {
        eVar.b(eVar.f7160f - 1);
        eVar.f7158d = x(i7);
        Object[] objArr = this.f7176d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f7175c != eVar.f7156b) {
            return new m(0, 0, a.a.k(objArr, i7), eVar.f7156b);
        }
        this.f7176d = a.a.k(objArr, i7);
        return this;
    }

    public final m l(int i7, Object obj, Object obj2, int i10, e eVar) {
        e eVar2;
        m mVarL;
        int iJ = 1 << a.a.J(i7, i10);
        boolean zH = h(iJ);
        m1.b bVar = this.f7175c;
        if (zH) {
            int iF = f(iJ);
            if (!i9.l.a(obj, this.f7176d[iF])) {
                eVar.b(eVar.f7160f + 1);
                m1.b bVar2 = eVar.f7156b;
                if (bVar != bVar2) {
                    return new m(this.f7173a ^ iJ, this.f7174b | iJ, a(iF, iJ, i7, obj, obj2, i10, bVar2), bVar2);
                }
                this.f7176d = a(iF, iJ, i7, obj, obj2, i10, bVar2);
                this.f7173a ^= iJ;
                this.f7174b |= iJ;
                return this;
            }
            eVar.f7158d = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == eVar.f7156b) {
                this.f7176d[iF + 1] = obj2;
                return this;
            }
            eVar.f7159e++;
            Object[] objArr = this.f7176d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            i9.l.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new m(this.f7173a, this.f7174b, objArrCopyOf, eVar.f7156b);
        }
        if (!i(iJ)) {
            eVar.b(eVar.f7160f + 1);
            m1.b bVar3 = eVar.f7156b;
            int iF2 = f(iJ);
            if (bVar != bVar3) {
                return new m(this.f7173a | iJ, this.f7174b, a.a.j(this.f7176d, iF2, obj, obj2), bVar3);
            }
            this.f7176d = a.a.j(this.f7176d, iF2, obj, obj2);
            this.f7173a |= iJ;
            return this;
        }
        int iT = t(iJ);
        m mVarS = s(iT);
        if (i10 == 30) {
            n9.b bVarZ = r.Z(r.e0(0, mVarS.f7176d.length));
            int i11 = bVarZ.f8965a;
            int i12 = bVarZ.f8966b;
            int i13 = bVarZ.f8967c;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                while (true) {
                    if (!i9.l.a(obj, mVarS.f7176d[i11])) {
                        if (i11 == i12) {
                            eVar.b(eVar.f7160f + 1);
                            mVarL = new m(0, 0, a.a.j(mVarS.f7176d, 0, obj, obj2), eVar.f7156b);
                            break;
                        }
                        i11 += i13;
                    } else {
                        eVar.f7158d = mVarS.x(i11);
                        if (mVarS.f7175c != eVar.f7156b) {
                            eVar.f7159e++;
                            Object[] objArr2 = mVarS.f7176d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            i9.l.d(objArrCopyOf2, "copyOf(...)");
                            objArrCopyOf2[i11 + 1] = obj2;
                            mVarL = new m(0, 0, objArrCopyOf2, eVar.f7156b);
                            break;
                        }
                        mVarS.f7176d[i11 + 1] = obj2;
                        mVarL = mVarS;
                        break;
                    }
                }
            } else {
                eVar.b(eVar.f7160f + 1);
                mVarL = new m(0, 0, a.a.j(mVarS.f7176d, 0, obj, obj2), eVar.f7156b);
                break;
            }
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            mVarL = mVarS.l(i7, obj, obj2, i10 + 5, eVar2);
        }
        return mVarS == mVarL ? this : r(iT, mVarL, eVar2.f7156b);
    }

    public final m m(m mVar, int i7, m1.a aVar, e eVar) {
        m mVar2;
        Object[] objArr;
        m mVarJ;
        if (this == mVar) {
            aVar.f8398a += b();
            return this;
        }
        if (i7 > 30) {
            m1.b bVar = eVar.f7156b;
            int i10 = mVar.f7174b;
            Object[] objArr2 = this.f7176d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + mVar.f7176d.length);
            i9.l.d(objArrCopyOf, "copyOf(...)");
            int length = this.f7176d.length;
            n9.b bVarZ = r.Z(r.e0(0, mVar.f7176d.length));
            int i11 = bVarZ.f8965a;
            int i12 = bVarZ.f8966b;
            int i13 = bVarZ.f8967c;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                while (true) {
                    if (c(mVar.f7176d[i11])) {
                        aVar.f8398a++;
                    } else {
                        Object[] objArr3 = mVar.f7176d;
                        objArrCopyOf[length] = objArr3[i11];
                        objArrCopyOf[length + 1] = objArr3[i11 + 1];
                        length += 2;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11 += i13;
                }
            }
            if (length != this.f7176d.length) {
                if (length == mVar.f7176d.length) {
                    return mVar;
                }
                if (length == objArrCopyOf.length) {
                    return new m(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                i9.l.d(objArrCopyOf2, "copyOf(...)");
                return new m(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i14 = this.f7174b | mVar.f7174b;
            int i15 = this.f7173a;
            int i16 = mVar.f7173a;
            int i17 = (i15 ^ i16) & (~i14);
            int i18 = i15 & i16;
            int i19 = i17;
            while (i18 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i18);
                if (i9.l.a(this.f7176d[f(iLowestOneBit)], mVar.f7176d[mVar.f(iLowestOneBit)])) {
                    i19 |= iLowestOneBit;
                } else {
                    i14 |= iLowestOneBit;
                }
                i18 ^= iLowestOneBit;
            }
            if ((i14 & i19) != 0) {
                r1.b("Check failed.");
            }
            if (i9.l.a(this.f7175c, eVar.f7156b) && this.f7173a == i19 && this.f7174b == i14) {
                mVar2 = this;
            } else {
                mVar2 = new m(i19, i14, new Object[Integer.bitCount(i14) + (Integer.bitCount(i19) * 2)], null);
            }
            int i20 = i14;
            int i21 = 0;
            while (i20 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i20);
                Object[] objArr4 = mVar2.f7176d;
                int length2 = (objArr4.length - 1) - i21;
                if (i(iLowestOneBit2)) {
                    mVarJ = s(t(iLowestOneBit2));
                    if (mVar.i(iLowestOneBit2)) {
                        mVarJ = mVarJ.m(mVar.s(mVar.t(iLowestOneBit2)), i7 + 5, aVar, eVar);
                        objArr = objArr4;
                    } else if (mVar.h(iLowestOneBit2)) {
                        int iF = mVar.f(iLowestOneBit2);
                        Object obj = mVar.f7176d[iF];
                        Object objX = mVar.x(iF);
                        int i22 = eVar.f7160f;
                        objArr = objArr4;
                        mVarJ = mVarJ.l(obj != null ? obj.hashCode() : 0, obj, objX, i7 + 5, eVar);
                        if (eVar.f7160f == i22) {
                            aVar.f8398a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (mVar.i(iLowestOneBit2)) {
                        m mVarS = mVar.s(mVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f7176d[iF2];
                            int i23 = i7 + 5;
                            if (mVarS.d(obj2 != null ? obj2.hashCode() : 0, i23, obj2)) {
                                aVar.f8398a++;
                                mVarJ = mVarS;
                            } else {
                                mVarJ = mVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i23, eVar);
                            }
                        } else {
                            mVarJ = mVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f7176d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = mVar.f(iLowestOneBit2);
                        Object obj4 = mVar.f7176d[iF4];
                        mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, mVar.x(iF4), i7 + 5, eVar.f7156b);
                    }
                }
                objArr[length2] = mVarJ;
                i21++;
                i20 ^= iLowestOneBit2;
            }
            int i24 = 0;
            while (i19 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i19);
                int i25 = i24 * 2;
                if (mVar.h(iLowestOneBit3)) {
                    int iF5 = mVar.f(iLowestOneBit3);
                    Object[] objArr5 = mVar2.f7176d;
                    objArr5[i25] = mVar.f7176d[iF5];
                    objArr5[i25 + 1] = mVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f8398a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = mVar2.f7176d;
                    objArr6[i25] = this.f7176d[iF6];
                    objArr6[i25 + 1] = x(iF6);
                }
                i24++;
                i19 ^= iLowestOneBit3;
            }
            if (!e(mVar2)) {
                return mVar.e(mVar2) ? mVar : mVar2;
            }
        }
        return this;
    }

    public final m n(int i7, Object obj, int i10, e eVar) {
        m mVarN;
        int iJ = 1 << a.a.J(i7, i10);
        if (h(iJ)) {
            int iF = f(iJ);
            if (i9.l.a(obj, this.f7176d[iF])) {
                return p(iF, iJ, eVar);
            }
        } else if (i(iJ)) {
            int iT = t(iJ);
            m mVarS = s(iT);
            if (i10 == 30) {
                n9.b bVarZ = r.Z(r.e0(0, mVarS.f7176d.length));
                int i11 = bVarZ.f8965a;
                int i12 = bVarZ.f8966b;
                int i13 = bVarZ.f8967c;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (true) {
                        if (!i9.l.a(obj, mVarS.f7176d[i11])) {
                            if (i11 == i12) {
                                mVarN = mVarS;
                                break;
                            }
                            i11 += i13;
                        } else {
                            mVarN = mVarS.k(i11, eVar);
                            break;
                        }
                    }
                } else {
                    mVarN = mVarS;
                    break;
                }
            } else {
                mVarN = mVarS.n(i7, obj, i10 + 5, eVar);
            }
            return q(mVarS, mVarN, iT, iJ, eVar.f7156b);
        }
        return this;
    }

    public final m o(int i7, Object obj, Object obj2, int i10, e eVar) {
        m mVar;
        m mVarO;
        int iJ = 1 << a.a.J(i7, i10);
        if (h(iJ)) {
            int iF = f(iJ);
            if (i9.l.a(obj, this.f7176d[iF]) && i9.l.a(obj2, x(iF))) {
                return p(iF, iJ, eVar);
            }
        } else if (i(iJ)) {
            int iT = t(iJ);
            m mVarS = s(iT);
            if (i10 == 30) {
                n9.b bVarZ = r.Z(r.e0(0, mVarS.f7176d.length));
                int i11 = bVarZ.f8965a;
                int i12 = bVarZ.f8966b;
                int i13 = bVarZ.f8967c;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (true) {
                        if (!i9.l.a(obj, mVarS.f7176d[i11]) || !i9.l.a(obj2, mVarS.x(i11))) {
                            if (i11 == i12) {
                                mVarO = mVarS;
                                break;
                            }
                            i11 += i13;
                        } else {
                            mVarO = mVarS.k(i11, eVar);
                            break;
                        }
                    }
                } else {
                    mVarO = mVarS;
                    break;
                }
                mVar = mVarS;
            } else {
                mVar = mVarS;
                mVarO = mVar.o(i7, obj, obj2, i10 + 5, eVar);
            }
            return q(mVar, mVarO, iT, iJ, eVar.f7156b);
        }
        return this;
    }

    public final m p(int i7, int i10, e eVar) {
        eVar.b(eVar.f7160f - 1);
        eVar.f7158d = x(i7);
        Object[] objArr = this.f7176d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f7175c != eVar.f7156b) {
            return new m(i10 ^ this.f7173a, this.f7174b, a.a.k(objArr, i7), eVar.f7156b);
        }
        this.f7176d = a.a.k(objArr, i7);
        this.f7173a ^= i10;
        return this;
    }

    public final m q(m mVar, m mVar2, int i7, int i10, m1.b bVar) {
        m1.b bVar2 = this.f7175c;
        if (mVar2 != null) {
            return (bVar2 == bVar || mVar != mVar2) ? r(i7, mVar2, bVar) : this;
        }
        Object[] objArr = this.f7176d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new m(this.f7173a, i10 ^ this.f7174b, a.a.l(objArr, i7), bVar);
        }
        this.f7176d = a.a.l(objArr, i7);
        this.f7174b ^= i10;
        return this;
    }

    public final m r(int i7, m mVar, m1.b bVar) {
        Object[] objArr = this.f7176d;
        if (objArr.length == 1 && mVar.f7176d.length == 2 && mVar.f7174b == 0) {
            mVar.f7173a = this.f7174b;
            return mVar;
        }
        if (this.f7175c == bVar) {
            objArr[i7] = mVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        i9.l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i7] = mVar;
        return new m(this.f7173a, this.f7174b, objArrCopyOf, bVar);
    }

    public final m s(int i7) {
        Object obj = this.f7176d[i7];
        i9.l.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (m) obj;
    }

    public final int t(int i7) {
        return (this.f7176d.length - 1) - Integer.bitCount((i7 - 1) & this.f7174b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dd, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
    
        r14.f6795c = w(r12, r4, (k1.m) r14.f6795c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ea, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j.g u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.m.u(int, int, java.lang.Object, java.lang.Object):j.g");
    }

    public final m v(int i7, int i10, Object obj) {
        m mVarV;
        int iJ = 1 << a.a.J(i7, i10);
        if (h(iJ)) {
            int iF = f(iJ);
            if (i9.l.a(obj, this.f7176d[iF])) {
                Object[] objArr = this.f7176d;
                if (objArr.length != 2) {
                    return new m(this.f7173a ^ iJ, this.f7174b, a.a.k(objArr, iF), null);
                }
                return null;
            }
            return this;
        }
        if (i(iJ)) {
            int iT = t(iJ);
            m mVarS = s(iT);
            if (i10 == 30) {
                n9.b bVarZ = r.Z(r.e0(0, mVarS.f7176d.length));
                int i11 = bVarZ.f8965a;
                int i12 = bVarZ.f8966b;
                int i13 = bVarZ.f8967c;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (true) {
                        if (!i9.l.a(obj, mVarS.f7176d[i11])) {
                            if (i11 == i12) {
                                mVarV = mVarS;
                                break;
                            }
                            i11 += i13;
                        } else {
                            Object[] objArr2 = mVarS.f7176d;
                            if (objArr2.length != 2) {
                                mVarV = new m(0, 0, a.a.k(objArr2, i11), null);
                                break;
                            }
                            mVarV = null;
                            break;
                        }
                    }
                } else {
                    mVarV = mVarS;
                    break;
                }
            } else {
                mVarV = mVarS.v(i7, i10 + 5, obj);
            }
            if (mVarV == null) {
                Object[] objArr3 = this.f7176d;
                if (objArr3.length != 1) {
                    return new m(this.f7173a, iJ ^ this.f7174b, a.a.l(objArr3, iT), null);
                }
                return null;
            }
            if (mVarS != mVarV) {
                return w(iT, iJ, mVarV);
            }
        }
        return this;
    }

    public final m w(int i7, int i10, m mVar) {
        Object[] objArr = mVar.f7176d;
        if (objArr.length != 2 || mVar.f7174b != 0) {
            Object[] objArr2 = this.f7176d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            i9.l.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i7] = mVar;
            return new m(this.f7173a, this.f7174b, objArrCopyOf, null);
        }
        if (this.f7176d.length == 1) {
            mVar.f7173a = this.f7174b;
            return mVar;
        }
        int iF = f(i10);
        Object[] objArr3 = this.f7176d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        i9.l.d(objArrCopyOf2, "copyOf(...)");
        u8.l.p0(objArrCopyOf2, objArrCopyOf2, i7 + 2, i7 + 1, objArr3.length);
        u8.l.p0(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i7);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new m(this.f7173a ^ i10, i10 ^ this.f7174b, objArrCopyOf2, null);
    }

    public final Object x(int i7) {
        return this.f7176d[i7 + 1];
    }
}
