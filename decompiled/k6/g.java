package k6;

import e4.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f7329e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g[] f7330f = a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f7332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.g[] f7333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7334d;

    public g(int i7, int[] iArr, j.g... gVarArr) {
        this.f7331a = i7;
        this.f7332b = iArr;
        this.f7333c = gVarArr;
        j.g gVar = gVarArr[0];
        int i10 = gVar.f6794b;
        int i11 = 0;
        for (n nVar : (n[]) gVar.f6795c) {
            i11 += (nVar.f4381c + i10) * nVar.f4380b;
        }
        this.f7334d = i11;
    }

    public static g[] a() {
        int i7 = 1;
        int i10 = 2;
        int i11 = 16;
        int i12 = 4;
        g gVar = new g(1, new int[0], new j.g(7, new n[]{new n(i7, 19, i10)}), new j.g(10, new n[]{new n(i7, i11, i10)}), new j.g(13, new n[]{new n(i7, 13, i10)}), new j.g(17, new n[]{new n(i7, 9, i10)}));
        g gVar2 = new g(2, new int[]{6, 18}, new j.g(10, new n[]{new n(i7, 34, i10)}), new j.g(16, new n[]{new n(i7, 28, i10)}), new j.g(22, new n[]{new n(i7, 22, i10)}), new j.g(28, new n[]{new n(i7, i11, i10)}));
        g gVar3 = new g(3, new int[]{6, 22}, new j.g(15, new n[]{new n(i7, 55, i10)}), new j.g(26, new n[]{new n(i7, 44, i10)}), new j.g(18, new n[]{new n(i10, 17, i10)}), new j.g(22, new n[]{new n(i10, 13, i10)}));
        g gVar4 = new g(4, new int[]{6, 26}, new j.g(20, new n[]{new n(i7, 80, i10)}), new j.g(18, new n[]{new n(i10, 32, i10)}), new j.g(26, new n[]{new n(i10, 24, i10)}), new j.g(16, new n[]{new n(i12, 9, i10)}));
        g gVar5 = new g(5, new int[]{6, 30}, new j.g(26, new n[]{new n(i7, 108, i10)}), new j.g(24, new n[]{new n(i10, 43, i10)}), new j.g(18, new n[]{new n(i10, 15, i10), new n(i10, 16, i10)}), new j.g(22, new n[]{new n(i10, 11, i10), new n(i10, 12, i10)}));
        g gVar6 = new g(6, new int[]{6, 34}, new j.g(18, new n[]{new n(i10, 68, i10)}), new j.g(16, new n[]{new n(i12, 27, i10)}), new j.g(24, new n[]{new n(i12, 19, i10)}), new j.g(28, new n[]{new n(i12, 15, i10)}));
        g gVar7 = new g(7, new int[]{6, 22, 38}, new j.g(20, new n[]{new n(i10, 78, i10)}), new j.g(18, new n[]{new n(i12, 31, i10)}), new j.g(18, new n[]{new n(i10, 14, i10), new n(i12, 15, i10)}), new j.g(26, new n[]{new n(i12, 13, i10), new n(1, 14, i10)}));
        g gVar8 = new g(8, new int[]{6, 24, 42}, new j.g(24, new n[]{new n(i10, 97, i10)}), new j.g(22, new n[]{new n(i10, 38, i10), new n(i10, 39, i10)}), new j.g(22, new n[]{new n(4, 18, i10), new n(i10, 19, i10)}), new j.g(26, new n[]{new n(4, 14, i10), new n(i10, 15, i10)}));
        int i13 = 4;
        g gVar9 = new g(9, new int[]{6, 26, 46}, new j.g(30, new n[]{new n(i10, 116, i10)}), new j.g(22, new n[]{new n(3, 36, i10), new n(i10, 37, i10)}), new j.g(20, new n[]{new n(i13, 16, i10), new n(i13, 17, i10)}), new j.g(24, new n[]{new n(i13, 12, i10), new n(i13, 13, i10)}));
        int i14 = 6;
        g gVar10 = new g(10, new int[]{6, 28, 50}, new j.g(18, new n[]{new n(i10, 68, i10), new n(i10, 69, i10)}), new j.g(26, new n[]{new n(4, 43, i10), new n(1, 44, i10)}), new j.g(24, new n[]{new n(i14, 19, i10), new n(i10, 20, i10)}), new j.g(28, new n[]{new n(i14, 15, i10), new n(i10, 16, i10)}));
        int i15 = 4;
        g gVar11 = new g(11, new int[]{6, 30, 54}, new j.g(20, new n[]{new n(i15, 81, i10)}), new j.g(30, new n[]{new n(1, 50, i10), new n(i15, 51, i10)}), new j.g(28, new n[]{new n(i15, 22, i10), new n(i15, 23, i10)}), new j.g(24, new n[]{new n(3, 12, i10), new n(8, 13, i10)}));
        g gVar12 = new g(12, new int[]{6, 32, 58}, new j.g(24, new n[]{new n(i10, 92, i10), new n(i10, 93, i10)}), new j.g(22, new n[]{new n(6, 36, i10), new n(i10, 37, i10)}), new j.g(26, new n[]{new n(4, 20, i10), new n(6, 21, i10)}), new j.g(28, new n[]{new n(7, 14, i10), new n(4, 15, i10)}));
        int i16 = 8;
        int i17 = 12;
        g gVar13 = new g(13, new int[]{6, 34, 62}, new j.g(26, new n[]{new n(4, 107, i10)}), new j.g(22, new n[]{new n(i16, 37, i10), new n(1, 38, i10)}), new j.g(24, new n[]{new n(i16, 20, i10), new n(4, 21, i10)}), new j.g(22, new n[]{new n(i17, 11, i10), new n(4, i17, i10)}));
        int i18 = 5;
        g gVar14 = new g(14, new int[]{6, 26, 46, 66}, new j.g(30, new n[]{new n(3, 115, i10), new n(1, 116, i10)}), new j.g(24, new n[]{new n(4, 40, i10), new n(i18, 41, i10)}), new j.g(20, new n[]{new n(11, 16, i10), new n(i18, 17, i10)}), new j.g(24, new n[]{new n(11, 12, i10), new n(5, 13, i10)}));
        int i19 = 5;
        g gVar15 = new g(15, new int[]{6, 26, 48, 70}, new j.g(22, new n[]{new n(i19, 87, i10), new n(1, 88, i10)}), new j.g(24, new n[]{new n(i19, 41, i10), new n(i19, 42, i10)}), new j.g(30, new n[]{new n(i19, 24, i10), new n(7, 25, i10)}), new j.g(24, new n[]{new n(11, 12, i10), new n(7, 13, i10)}));
        int i20 = 15;
        g gVar16 = new g(16, new int[]{6, 26, 50, 74}, new j.g(24, new n[]{new n(5, 98, i10), new n(1, 99, i10)}), new j.g(28, new n[]{new n(7, 45, i10), new n(3, 46, i10)}), new j.g(24, new n[]{new n(i20, 19, i10), new n(i10, 20, i10)}), new j.g(30, new n[]{new n(3, i20, i10), new n(13, 16, i10)}));
        int i21 = 1;
        j.g gVar17 = new j.g(28, new n[]{new n(i21, 107, i10), new n(5, 108, i10)});
        j.g gVar18 = new j.g(28, new n[]{new n(10, 46, i10), new n(i21, 47, i10)});
        n nVar = new n(i21, 22, i10);
        int i22 = 15;
        g gVar19 = new g(17, new int[]{6, 30, 54, 78}, gVar17, gVar18, new j.g(28, new n[]{nVar, new n(i22, 23, i10)}), new j.g(28, new n[]{new n(i10, 14, i10), new n(17, i22, i10)}));
        int i23 = 3;
        g gVar20 = new g(18, new int[]{6, 30, 56, 82}, new j.g(30, new n[]{new n(5, 120, i10), new n(1, 121, i10)}), new j.g(26, new n[]{new n(9, 43, i10), new n(4, 44, i10)}), new j.g(28, new n[]{new n(17, 22, i10), new n(1, 23, i10)}), new j.g(28, new n[]{new n(i10, 14, i10), new n(19, 15, i10)}));
        int i24 = 3;
        g gVar21 = new g(19, new int[]{6, 30, 58, 86}, new j.g(28, new n[]{new n(i23, 113, i10), new n(4, 114, i10)}), new j.g(26, new n[]{new n(i23, 44, i10), new n(11, 45, i10)}), new j.g(26, new n[]{new n(17, 21, i10), new n(4, 22, i10)}), new j.g(26, new n[]{new n(9, 13, i10), new n(16, 14, i10)}));
        int i25 = 15;
        g gVar22 = new g(20, new int[]{6, 34, 62, 90}, new j.g(28, new n[]{new n(i24, 107, i10), new n(5, 108, i10)}), new j.g(26, new n[]{new n(i24, 41, i10), new n(13, 42, i10)}), new j.g(30, new n[]{new n(15, 24, i10), new n(5, 25, i10)}), new j.g(28, new n[]{new n(i25, i25, i10), new n(10, 16, i10)}));
        int i26 = 4;
        int i27 = 17;
        g gVar23 = new g(21, new int[]{6, 28, 50, 72, 94}, new j.g(28, new n[]{new n(i26, 116, i10), new n(i26, 117, i10)}), new j.g(26, new n[]{new n(i27, 42, i10)}), new j.g(28, new n[]{new n(i27, 22, i10), new n(6, 23, i10)}), new j.g(30, new n[]{new n(19, 16, i10), new n(6, 17, i10)}));
        g gVar24 = new g(22, new int[]{6, 26, 50, 74, 98}, new j.g(28, new n[]{new n(i10, 111, i10), new n(7, 112, i10)}), new j.g(28, new n[]{new n(17, 46, i10)}), new j.g(30, new n[]{new n(7, 24, i10), new n(16, 25, i10)}), new j.g(24, new n[]{new n(34, 13, i10)}));
        int i28 = 16;
        g gVar25 = new g(23, new int[]{6, 30, 54, 78, 102}, new j.g(30, new n[]{new n(4, 121, i10), new n(5, 122, i10)}), new j.g(28, new n[]{new n(4, 47, i10), new n(14, 48, i10)}), new j.g(30, new n[]{new n(11, 24, i10), new n(14, 25, i10)}), new j.g(30, new n[]{new n(i28, 15, i10), new n(14, i28, i10)}));
        int i29 = 6;
        int i30 = 16;
        g gVar26 = new g(24, new int[]{6, 28, 54, 80, 106}, new j.g(30, new n[]{new n(i29, 117, i10), new n(4, 118, i10)}), new j.g(28, new n[]{new n(i29, 45, i10), new n(14, 46, i10)}), new j.g(30, new n[]{new n(11, 24, i10), new n(i30, 25, i10)}), new j.g(30, new n[]{new n(30, i30, i10), new n(i10, 17, i10)}));
        int i31 = 8;
        int i32 = 22;
        g gVar27 = new g(25, new int[]{6, 32, 58, 84, 110}, new j.g(26, new n[]{new n(i31, 106, i10), new n(4, 107, i10)}), new j.g(28, new n[]{new n(i31, 47, i10), new n(13, 48, i10)}), new j.g(30, new n[]{new n(7, 24, i10), new n(i32, 25, i10)}), new j.g(30, new n[]{new n(i32, 15, i10), new n(13, 16, i10)}));
        g gVar28 = new g(26, new int[]{6, 30, 58, 86, 114}, new j.g(28, new n[]{new n(10, 114, i10), new n(i10, 115, i10)}), new j.g(28, new n[]{new n(19, 46, i10), new n(4, 47, i10)}), new j.g(28, new n[]{new n(28, 22, i10), new n(6, 23, i10)}), new j.g(30, new n[]{new n(33, 16, i10), new n(4, 17, i10)}));
        int i33 = 3;
        g gVar29 = new g(27, new int[]{6, 34, 62, 90, 118}, new j.g(30, new n[]{new n(8, 122, i10), new n(4, 123, i10)}), new j.g(28, new n[]{new n(22, 45, i10), new n(3, 46, i10)}), new j.g(30, new n[]{new n(8, 23, i10), new n(26, 24, i10)}), new j.g(30, new n[]{new n(12, 15, i10), new n(28, 16, i10)}));
        g gVar30 = new g(28, new int[]{6, 26, 50, 74, 98, 122}, new j.g(30, new n[]{new n(i33, 117, i10), new n(10, 118, i10)}), new j.g(28, new n[]{new n(i33, 45, i10), new n(23, 46, i10)}), new j.g(30, new n[]{new n(4, 24, i10), new n(31, 25, i10)}), new j.g(30, new n[]{new n(11, 15, i10), new n(31, 16, i10)}));
        int i34 = 7;
        g gVar31 = new g(29, new int[]{6, 30, 54, 78, 102, 126}, new j.g(30, new n[]{new n(i34, 116, i10), new n(i34, 117, i10)}), new j.g(28, new n[]{new n(21, 45, i10), new n(i34, 46, i10)}), new j.g(30, new n[]{new n(1, 23, i10), new n(37, 24, i10)}), new j.g(30, new n[]{new n(19, 15, i10), new n(26, 16, i10)}));
        int i35 = 10;
        int i36 = 15;
        int i37 = 25;
        int i38 = 10;
        int i39 = 12;
        int i40 = 6;
        int i41 = 34;
        return new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13, gVar14, gVar15, gVar16, gVar19, gVar20, gVar21, gVar22, gVar23, gVar24, gVar25, gVar26, gVar27, gVar28, gVar29, gVar30, gVar31, new g(30, new int[]{6, 26, 52, 78, 104, 130}, new j.g(30, new n[]{new n(5, 115, i10), new n(i35, 116, i10)}), new j.g(28, new n[]{new n(19, 47, i10), new n(i35, 48, i10)}), new j.g(30, new n[]{new n(i36, 24, i10), new n(i37, i37, i10)}), new j.g(30, new n[]{new n(23, i36, i10), new n(25, 16, i10)})), new g(31, new int[]{6, 30, 56, 82, 108, 134}, new j.g(30, new n[]{new n(13, 115, i10), new n(3, 116, i10)}), new j.g(28, new n[]{new n(i10, 46, i10), new n(29, 47, i10)}), new j.g(30, new n[]{new n(42, 24, i10), new n(1, 25, i10)}), new j.g(30, new n[]{new n(23, 15, i10), new n(28, 16, i10)})), new g(32, new int[]{6, 34, 60, 86, 112, 138}, new j.g(30, new n[]{new n(17, 115, i10)}), new j.g(28, new n[]{new n(i38, 46, i10), new n(23, 47, i10)}), new j.g(30, new n[]{new n(i38, 24, i10), new n(35, 25, i10)}), new j.g(30, new n[]{new n(19, 15, i10), new n(35, 16, i10)})), new g(33, new int[]{6, 30, 58, 86, 114, 142}, new j.g(30, new n[]{new n(17, 115, i10), new n(1, 116, i10)}), new j.g(28, new n[]{new n(14, 46, i10), new n(21, 47, i10)}), new j.g(30, new n[]{new n(29, 24, i10), new n(19, 25, i10)}), new j.g(30, new n[]{new n(11, 15, i10), new n(46, 16, i10)})), new g(34, new int[]{6, 34, 62, 90, 118, 146}, new j.g(30, new n[]{new n(13, 115, i10), new n(6, 116, i10)}), new j.g(28, new n[]{new n(14, 46, i10), new n(23, 47, i10)}), new j.g(30, new n[]{new n(44, 24, i10), new n(7, 25, i10)}), new j.g(30, new n[]{new n(59, 16, i10), new n(1, 17, i10)})), new g(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new j.g(30, new n[]{new n(i39, 121, i10), new n(7, 122, i10)}), new j.g(28, new n[]{new n(i39, 47, i10), new n(26, 48, i10)}), new j.g(30, new n[]{new n(39, 24, i10), new n(14, 25, i10)}), new j.g(30, new n[]{new n(22, 15, i10), new n(41, 16, i10)})), new g(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new j.g(30, new n[]{new n(i40, 121, i10), new n(14, 122, i10)}), new j.g(28, new n[]{new n(i40, 47, i10), new n(34, 48, i10)}), new j.g(30, new n[]{new n(46, 24, i10), new n(10, 25, i10)}), new j.g(30, new n[]{new n(i10, 15, i10), new n(64, 16, i10)})), new g(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new j.g(30, new n[]{new n(17, 122, i10), new n(4, 123, i10)}), new j.g(28, new n[]{new n(29, 46, i10), new n(14, 47, i10)}), new j.g(30, new n[]{new n(49, 24, i10), new n(10, 25, i10)}), new j.g(30, new n[]{new n(24, 15, i10), new n(46, 16, i10)})), new g(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new j.g(30, new n[]{new n(4, 122, i10), new n(18, 123, i10)}), new j.g(28, new n[]{new n(13, 46, i10), new n(32, 47, i10)}), new j.g(30, new n[]{new n(48, 24, i10), new n(14, 25, i10)}), new j.g(30, new n[]{new n(42, 15, i10), new n(32, 16, i10)})), new g(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new j.g(30, new n[]{new n(20, 117, i10), new n(4, 118, i10)}), new j.g(28, new n[]{new n(40, 47, i10), new n(7, 48, i10)}), new j.g(30, new n[]{new n(43, 24, i10), new n(22, 25, i10)}), new j.g(30, new n[]{new n(10, 15, i10), new n(67, 16, i10)})), new g(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new j.g(30, new n[]{new n(19, 118, i10), new n(6, 119, i10)}), new j.g(28, new n[]{new n(18, 47, i10), new n(31, 48, i10)}), new j.g(30, new n[]{new n(i41, 24, i10), new n(i41, 25, i10)}), new j.g(30, new n[]{new n(20, 15, i10), new n(61, 16, i10)}))};
    }

    public static g b(int i7) {
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        for (int i12 = 0; i12 < 34; i12++) {
            int i13 = f7329e[i12];
            if (i13 == i7) {
                return c(i12 + 7);
            }
            int iBitCount = Integer.bitCount(i13 ^ i7);
            if (iBitCount < i10) {
                i11 = i12 + 7;
                i10 = iBitCount;
            }
        }
        if (i10 <= 3) {
            return c(i11);
        }
        return null;
    }

    public static g c(int i7) {
        if (i7 <= 0 || i7 > 40) {
            throw new IllegalArgumentException();
        }
        return f7330f[i7 - 1];
    }

    public final String toString() {
        return String.valueOf(this.f7331a);
    }
}
