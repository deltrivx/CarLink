package ya;

import aa.j0;
import java.util.ArrayList;
import x9.d0;
import x9.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f15171b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f15172c = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f15173d = new b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15174a;

    public /* synthetic */ b(int i7) {
        this.f15174a = i7;
    }

    public static String b(x9.h hVar) {
        String strP;
        wa.e name = hVar.getName();
        i9.l.d(name, "getName(...)");
        String strO = n3.r.O(name);
        if (!(hVar instanceof r0)) {
            x9.k kVarL = hVar.l();
            i9.l.d(kVarL, "getContainingDeclaration(...)");
            if (kVarL instanceof x9.e) {
                strP = b((x9.h) kVarL);
            } else if (kVarL instanceof d0) {
                wa.d dVar = ((j0) ((d0) kVarL)).f364e.f14240a;
                i9.l.e(dVar, "<this>");
                strP = n3.r.P(wa.d.e(dVar));
            } else {
                strP = null;
            }
            if (strP != null && !strP.equals("")) {
                return strP + '.' + strO;
            }
        }
        return strO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [x9.h, x9.k] */
    /* JADX WARN: Type inference failed for: r2v8, types: [x9.k] */
    /* JADX WARN: Type inference failed for: r2v9, types: [x9.k] */
    @Override // ya.c
    public final String a(x9.h hVar, g gVar) {
        switch (this.f15174a) {
            case 0:
                if (hVar instanceof r0) {
                    wa.e name = ((r0) hVar).getName();
                    i9.l.d(name, "getName(...)");
                    return gVar.M(name, false);
                }
                wa.d dVarG = za.d.g(hVar);
                i9.l.d(dVarG, "getFqName(...)");
                return gVar.m(n3.r.P(wa.d.e(dVarG)));
            case 1:
                if (hVar instanceof r0) {
                    wa.e name2 = ((r0) hVar).getName();
                    i9.l.d(name2, "getName(...)");
                    return gVar.M(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(hVar.getName());
                    hVar = hVar.l();
                } while (hVar instanceof x9.e);
                return n3.r.P(new u8.d0(arrayList));
            default:
                return b(hVar);
        }
    }
}
