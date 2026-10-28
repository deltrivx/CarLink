package m5;

import y1.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f7.q f8478a = h0.h();

    public static final void a(y1.o oVar, long j5, f7.q qVar) {
        i9.l.e(oVar, "$this$drawRect");
        oVar.d(0.0f, 0.0f, (int) (j5 >> 32), (int) (j5 & 4294967295L), qVar);
    }

    public static final void b(y1.o oVar, long j5, float f10, f7.q qVar) {
        i9.l.e(oVar, "$this$drawRoundRect");
        oVar.c(0.0f, 0.0f, (int) (j5 >> 32), (int) (j5 & 4294967295L), f10, f10, qVar);
    }
}
