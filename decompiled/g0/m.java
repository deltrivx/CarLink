package g0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.r f5669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f5672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f5673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.r f5674f;

    public m(android.support.v4.media.session.r rVar, int i7, int i10, l lVar, s sVar) {
        this.f5674f = rVar;
        this.f5669a = rVar;
        this.f5670b = i7;
        this.f5671c = i10;
        this.f5672d = lVar;
        this.f5673e = sVar;
    }

    public final long a(int i7, int i10) {
        int i11;
        android.support.v4.media.session.r rVar = this.f5669a;
        int[] iArr = (int[]) rVar.f604b;
        if (i10 == 1) {
            i11 = iArr[i7];
        } else {
            int i12 = (i10 + i7) - 1;
            int[] iArr2 = (int[]) rVar.f605c;
            i11 = (iArr2[i12] + iArr[i12]) - iArr2[i7];
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 < 0) {
            n3.i.a("width must be >= 0");
        }
        return n3.b.h(i11, i11, 0, Integer.MAX_VALUE);
    }

    public final p b(int i7) {
        b4.l lVarB = this.f5673e.b(i7);
        int i10 = lVarB.f1501a;
        List list = lVarB.f1502b;
        int size = list.size();
        int i11 = 0;
        int i12 = (size == 0 || i10 + size == this.f5670b) ? 0 : this.f5671c;
        o[] oVarArr = new o[size];
        int i13 = 0;
        while (i11 < size) {
            int i14 = (int) ((b) list.get(i11)).f5623a;
            int i15 = i12;
            o oVarW0 = this.f5672d.w0(i10 + i11, a(i13, i14), i13, i14, i15);
            i13 += i14;
            oVarArr[i11] = oVarW0;
            i11++;
            i12 = i15;
        }
        return new p(i7, oVarArr, this.f5674f, lVarB.f1502b, i12);
    }
}
