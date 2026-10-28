package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f2891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b2 f2892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b2 f2893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b2 f2894d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f2891a = cls;
        f2892b = w(false);
        f2893c = w(true);
        f2894d = new b2();
    }

    public static void A(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                uVar.i0(i7, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = u.k;
            i11++;
        }
        uVar.u0(i11);
        while (i10 < list.size()) {
            uVar.h0(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void B(int i7, List list, f1 f1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f1Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((u) f1Var.f2744a).j0(i7, (l) list.get(i10));
        }
    }

    public static void C(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                double dDoubleValue = ((Double) list.get(i10)).doubleValue();
                uVar.getClass();
                uVar.m0(i7, Double.doubleToRawLongBits(dDoubleValue));
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = u.k;
            i11 += 8;
        }
        uVar.u0(i11);
        while (i10 < list.size()) {
            uVar.n0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void D(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                uVar.o0(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int iA0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iA0 += u.a0(((Integer) list.get(i11)).intValue());
        }
        uVar.u0(iA0);
        while (i10 < list.size()) {
            uVar.p0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void E(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                uVar.k0(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = u.k;
            i11 += 4;
        }
        uVar.u0(i11);
        while (i10 < list.size()) {
            uVar.l0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void F(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                uVar.m0(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = u.k;
            i11 += 8;
        }
        uVar.u0(i11);
        while (i10 < list.size()) {
            uVar.n0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void G(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                float fFloatValue = ((Float) list.get(i10)).floatValue();
                uVar.getClass();
                uVar.k0(i7, Float.floatToRawIntBits(fFloatValue));
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = u.k;
            i11 += 4;
        }
        uVar.u0(i11);
        while (i10 < list.size()) {
            uVar.l0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void H(int i7, List list, f1 f1Var, x1 x1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f1Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            f1Var.d(i7, list.get(i10), x1Var);
        }
    }

    public static void I(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                uVar.o0(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int iA0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iA0 += u.a0(((Integer) list.get(i11)).intValue());
        }
        uVar.u0(iA0);
        while (i10 < list.size()) {
            uVar.p0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void J(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                uVar.v0(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int iF0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iF0 += u.f0(((Long) list.get(i11)).longValue());
        }
        uVar.u0(iF0);
        while (i10 < list.size()) {
            uVar.w0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void K(int i7, List list, f1 f1Var, x1 x1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f1Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            f1Var.g(i7, list.get(i10), x1Var);
        }
    }

    public static void L(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                uVar.k0(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = u.k;
            i11 += 4;
        }
        uVar.u0(i11);
        while (i10 < list.size()) {
            uVar.l0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void M(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                uVar.m0(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = u.k;
            i11 += 8;
        }
        uVar.u0(i11);
        while (i10 < list.size()) {
            uVar.n0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void N(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                uVar.t0(i7, (iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int iE0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue2 = ((Integer) list.get(i11)).intValue();
            iE0 += u.e0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        uVar.u0(iE0);
        while (i10 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i10)).intValue();
            uVar.u0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i10++;
        }
    }

    public static void O(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                uVar.v0(i7, (jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int iF0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iF0 += u.f0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        uVar.u0(iF0);
        while (i10 < list.size()) {
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            uVar.w0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i10++;
        }
    }

    public static void P(int i7, List list, f1 f1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!(list instanceof z0)) {
            while (i10 < list.size()) {
                uVar.r0(i7, (String) list.get(i10));
                i10++;
            }
            return;
        }
        z0 z0Var = (z0) list;
        while (i10 < list.size()) {
            Object objJ = z0Var.j(i10);
            if (objJ instanceof String) {
                uVar.r0(i7, (String) objJ);
            } else {
                uVar.j0(i7, (l) objJ);
            }
            i10++;
        }
    }

    public static void Q(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                uVar.t0(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int iE0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iE0 += u.e0(((Integer) list.get(i11)).intValue());
        }
        uVar.u0(iE0);
        while (i10 < list.size()) {
            uVar.u0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void R(int i7, List list, f1 f1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u uVar = (u) f1Var.f2744a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                uVar.v0(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        uVar.s0(i7, 2);
        int iF0 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iF0 += u.f0(((Long) list.get(i11)).longValue());
        }
        uVar.u0(iF0);
        while (i10 < list.size()) {
            uVar.w0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC0 = u.c0(i7) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iC0 += u.W((l) list.get(i10));
        }
        return iC0;
    }

    public static int b(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u.c0(i7) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k0)) {
            int iA0 = 0;
            while (i7 < size) {
                iA0 += u.a0(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iA0;
        }
        k0 k0Var = (k0) list;
        int iA1 = 0;
        while (i7 < size) {
            iA1 += u.a0(k0Var.m(i7));
            i7++;
        }
        return iA1;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u.X(i7) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u.Y(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u.c0(i7) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k0)) {
            int iA0 = 0;
            while (i7 < size) {
                iA0 += u.a0(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iA0;
        }
        k0 k0Var = (k0) list;
        int iA1 = 0;
        while (i7 < size) {
            iA1 += u.a0(k0Var.m(i7));
            i7++;
        }
        return iA1;
    }

    public static int j(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (u.c0(i7) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof d1)) {
            int iF0 = 0;
            while (i7 < size) {
                iF0 += u.f0(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iF0;
        }
        d1 d1Var = (d1) list;
        int iF1 = 0;
        while (i7 < size) {
            iF1 += u.f0(d1Var.m(i7));
            i7++;
        }
        return iF1;
    }

    public static int l(int i7, List list, x1 x1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC0 = u.c0(i7) * size;
        for (int i10 = 0; i10 < size; i10++) {
            int serializedSize = ((c) ((l1) list.get(i10))).getSerializedSize(x1Var);
            iC0 += u.e0(serializedSize) + serializedSize;
        }
        return iC0;
    }

    public static int m(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u.c0(i7) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k0)) {
            int iE0 = 0;
            while (i7 < size) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                iE0 += u.e0((iIntValue >> 31) ^ (iIntValue << 1));
                i7++;
            }
            return iE0;
        }
        k0 k0Var = (k0) list;
        int iE1 = 0;
        while (i7 < size) {
            int iM = k0Var.m(i7);
            iE1 += u.e0((iM >> 31) ^ (iM << 1));
            i7++;
        }
        return iE1;
    }

    public static int o(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u.c0(i7) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof d1)) {
            int iF0 = 0;
            while (i7 < size) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                iF0 += u.f0((jLongValue >> 63) ^ (jLongValue << 1));
                i7++;
            }
            return iF0;
        }
        d1 d1Var = (d1) list;
        int iF1 = 0;
        while (i7 < size) {
            long jM = d1Var.m(i7);
            iF1 += u.f0((jM >> 63) ^ (jM << 1));
            i7++;
        }
        return iF1;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iC0 = u.c0(i7) * size;
        if (!(list instanceof z0)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof l) {
                    int size2 = ((l) obj).size();
                    iC0 = u.e0(size2) + size2 + iC0;
                } else {
                    iC0 = u.b0((String) obj) + iC0;
                }
                i10++;
            }
            return iC0;
        }
        z0 z0Var = (z0) list;
        while (i10 < size) {
            Object objJ = z0Var.j(i10);
            if (objJ instanceof l) {
                int size3 = ((l) objJ).size();
                iC0 = u.e0(size3) + size3 + iC0;
            } else {
                iC0 = u.b0((String) objJ) + iC0;
            }
            i10++;
        }
        return iC0;
    }

    public static int r(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u.c0(i7) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k0)) {
            int iE0 = 0;
            while (i7 < size) {
                iE0 += u.e0(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iE0;
        }
        k0 k0Var = (k0) list;
        int iE1 = 0;
        while (i7 < size) {
            iE1 += u.e0(k0Var.m(i7));
            i7++;
        }
        return iE1;
    }

    public static int t(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u.c0(i7) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof d1)) {
            int iF0 = 0;
            while (i7 < size) {
                iF0 += u.f0(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iF0;
        }
        d1 d1Var = (d1) list;
        int iF1 = 0;
        while (i7 < size) {
            iF1 += u.f0(d1Var.m(i7));
            i7++;
        }
        return iF1;
    }

    public static Object v(Object obj, int i7, List list, p0 p0Var, Object obj2, b2 b2Var) {
        if (p0Var == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!p0Var.isInRange(iIntValue)) {
                    obj2 = z(obj, i7, iIntValue, obj2, b2Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) list.get(i11);
            int iIntValue2 = num.intValue();
            if (p0Var.isInRange(iIntValue2)) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                obj2 = z(obj, i7, iIntValue2, obj2, b2Var);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return obj2;
    }

    public static b2 w(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (b2) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void x(b2 b2Var, Object obj, Object obj2) {
        b2Var.getClass();
        j0 j0Var = (j0) obj;
        a2 a2VarE = j0Var.unknownFields;
        a2 a2Var = ((j0) obj2).unknownFields;
        a2 a2Var2 = a2.f2712f;
        if (!a2Var2.equals(a2Var)) {
            if (a2Var2.equals(a2VarE)) {
                a2VarE = a2.e(a2VarE, a2Var);
            } else {
                a2VarE.getClass();
                if (!a2Var.equals(a2Var2)) {
                    a2VarE.a();
                    int i7 = a2VarE.f2713a + a2Var.f2713a;
                    a2VarE.b(i7);
                    System.arraycopy(a2Var.f2714b, 0, a2VarE.f2714b, a2VarE.f2713a, a2Var.f2713a);
                    System.arraycopy(a2Var.f2715c, 0, a2VarE.f2715c, a2VarE.f2713a, a2Var.f2713a);
                    a2VarE.f2713a = i7;
                }
            }
        }
        j0Var.unknownFields = a2VarE;
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object z(Object obj, int i7, int i10, Object obj2, b2 b2Var) {
        if (obj2 == null) {
            b2Var.getClass();
            obj2 = b2.a(obj);
        }
        b2Var.getClass();
        ((a2) obj2).f(i7 << 3, Long.valueOf(i10));
        return obj2;
    }
}
