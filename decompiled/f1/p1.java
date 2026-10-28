package f1;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s.w f5085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t8.o f5086f;

    public p1(int i7, ArrayList arrayList) {
        this.f5081a = arrayList;
        this.f5082b = i7;
        if (i7 < 0) {
            r1.a("Invalid start index");
        }
        this.f5084d = new ArrayList();
        s.w wVar = new s.w();
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            s0 s0Var = (s0) this.f5081a.get(i11);
            int i12 = s0Var.f5133c;
            int i13 = s0Var.f5134d;
            wVar.h(i12, new l0(i11, i10, i13));
            i10 += i13;
        }
        this.f5085e = wVar;
        this.f5086f = t8.a.d(new aa.e(7, this));
    }

    public final boolean a(int i7, int i10) {
        int i11;
        s.w wVar = this.f5085e;
        l0 l0Var = (l0) wVar.b(i7);
        if (l0Var == null) {
            return false;
        }
        int i12 = l0Var.f5012b;
        int i13 = i10 - l0Var.f5013c;
        l0Var.f5013c = i10;
        if (i13 == 0) {
            return true;
        }
        Object[] objArr = wVar.f12463c;
        long[] jArr = wVar.f12461a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i14 = 0;
        while (true) {
            long j5 = jArr[i14];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j5) < 128) {
                        l0 l0Var2 = (l0) objArr[(i14 << 3) + i16];
                        if (l0Var2.f5012b >= i12 && !l0Var2.equals(l0Var) && (i11 = l0Var2.f5012b + i13) >= 0) {
                            l0Var2.f5012b = i11;
                        }
                    }
                    j5 >>= 8;
                }
                if (i15 != 8) {
                    return true;
                }
            }
            if (i14 == length) {
                return true;
            }
            i14++;
        }
    }
}
