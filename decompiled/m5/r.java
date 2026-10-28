package m5;

import android.graphics.Paint;
import java.util.ArrayList;
import y1.f0;
import y1.h0;
import y1.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f7.q f8519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f7.q f8520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f8521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f8522d;

    static {
        f7.q qVarH = h0.h();
        ((Paint) qVarH.f5447c).setAntiAlias(true);
        f8519a = qVarH;
        f7.q qVarH2 = h0.h();
        ((Paint) qVarH2.f5447c).setAntiAlias(true);
        f8520b = qVarH2;
        Float fValueOf = Float.valueOf(0.0f);
        long j5 = y1.q.f14952f;
        t8.j[] jVarArr = {new t8.j(fValueOf, new y1.q(j5)), new t8.j(Float.valueOf(0.166f), new y1.q(y1.q.k)), new t8.j(Float.valueOf(0.333f), new y1.q(y1.q.f14954h)), new t8.j(Float.valueOf(0.499f), new y1.q(y1.q.f14956j)), new t8.j(Float.valueOf(0.666f), new y1.q(y1.q.f14953g)), new t8.j(Float.valueOf(0.833f), new y1.q(y1.q.f14955i)), new t8.j(Float.valueOf(0.999f), new y1.q(j5))};
        ArrayList arrayList = new ArrayList(7);
        for (int i7 = 0; i7 < 7; i7++) {
            arrayList.add(new y1.q(((y1.q) jVarArr[i7].f12831b).f14960a));
        }
        ArrayList arrayList2 = new ArrayList(7);
        for (int i10 = 0; i10 < 7; i10++) {
            arrayList2.add(Float.valueOf(((Number) jVarArr[i10].f12830a).floatValue()));
        }
        f8521c = new o0(arrayList, arrayList2);
        t8.j[] jVarArr2 = {new t8.j(fValueOf, new y1.q(h0.d(4294967295L))), new t8.j(Float.valueOf(1.0f), new y1.q(h0.c(16777215)))};
        ArrayList arrayList3 = new ArrayList(2);
        for (int i11 = 0; i11 < 2; i11++) {
            arrayList3.add(new y1.q(((y1.q) jVarArr2[i11].f12831b).f14960a));
        }
        ArrayList arrayList4 = new ArrayList(2);
        for (int i12 = 0; i12 < 2; i12++) {
            arrayList4.add(Float.valueOf(((Number) jVarArr2[i12].f12830a).floatValue()));
        }
        f8522d = new f0(arrayList3, arrayList4);
    }
}
