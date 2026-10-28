package y2;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f14975b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f14976c = new e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f14977d = new e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14978a;

    public /* synthetic */ e(int i7) {
        this.f14978a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14978a) {
            case 0:
                x1.c cVarH = ((m) obj).h();
                x1.c cVarH2 = ((m) obj2).h();
                int iCompare = Float.compare(cVarH.f14523a, cVarH2.f14523a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(cVarH.f14524b, cVarH2.f14524b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(cVarH.f14526d, cVarH2.f14526d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(cVarH.f14525c, cVarH2.f14525c);
            case 1:
                x1.c cVarH3 = ((m) obj).h();
                x1.c cVarH4 = ((m) obj2).h();
                int iCompare4 = Float.compare(cVarH4.f14525c, cVarH3.f14525c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(cVarH3.f14524b, cVarH4.f14524b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(cVarH3.f14526d, cVarH4.f14526d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(cVarH4.f14523a, cVarH3.f14523a);
            default:
                t8.j jVar = (t8.j) obj;
                t8.j jVar2 = (t8.j) obj2;
                int iCompare7 = Float.compare(((x1.c) jVar.f12830a).f14524b, ((x1.c) jVar2.f12830a).f14524b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((x1.c) jVar.f12830a).f14526d, ((x1.c) jVar2.f12830a).f14526d);
        }
    }
}
