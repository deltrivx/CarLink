package z1;

import s.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f15652a;

    static {
        q qVar = d.f15625e;
        int i7 = qVar.f15620c;
        e eVar = new e(qVar, qVar, 1);
        int i10 = qVar.f15620c;
        l lVar = d.f15643x;
        int i11 = (lVar.f15620c << 6) | i10;
        g gVar = new g(qVar, lVar, 0);
        int i12 = (i10 << 6) | lVar.f15620c;
        g gVar2 = new g(lVar, qVar, 0);
        w wVar = s.l.f12468a;
        w wVar2 = new w();
        wVar2.h(i7 | (i7 << 6), eVar);
        wVar2.h(i11, gVar);
        wVar2.h(i12, gVar2);
        f15652a = wVar2;
    }
}
