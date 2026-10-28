package g0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o[] f5711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.support.v4.media.session.r f5712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f5713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5716g;

    public p(int i7, o[] oVarArr, android.support.v4.media.session.r rVar, List list, int i10) {
        this.f5710a = i7;
        this.f5711b = oVarArr;
        this.f5712c = rVar;
        this.f5713d = list;
        this.f5714e = i10;
        int iMax = 0;
        for (o oVar : oVarArr) {
            iMax = Math.max(iMax, oVar.k);
        }
        this.f5715f = iMax;
        int i11 = iMax + this.f5714e;
        this.f5716g = i11 >= 0 ? i11 : 0;
    }

    public final o[] a(int i7, int i10, int i11) {
        o[] oVarArr = this.f5711b;
        int length = oVarArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            o oVar = oVarArr[i12];
            int i15 = i13 + 1;
            int i16 = (int) ((b) this.f5713d.get(i13)).f5623a;
            oVar.k(i7, ((int[]) this.f5712c.f605c)[i14], i10, i11, this.f5710a, i14);
            i14 += i16;
            i12++;
            i13 = i15;
        }
        return oVarArr;
    }
}
