package db;

import h9.k;
import i9.x;
import java.io.Serializable;
import w9.o;
import wb.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f3898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3899d;

    public d(x xVar, k kVar) {
        this.f3897b = 0;
        this.f3898c = xVar;
        this.f3899d = kVar;
    }

    public /* synthetic */ d(Object obj, Serializable serializable, int i7) {
        this.f3897b = i7;
        this.f3899d = obj;
        this.f3898c = serializable;
    }

    @Override // wb.l
    public void b(Object obj) {
        switch (this.f3897b) {
            case 0:
                x9.c cVar = (x9.c) obj;
                i9.l.e(cVar, "current");
                x xVar = (x) this.f3898c;
                if (xVar.f6688a == null && ((Boolean) ((k) this.f3899d).invoke(cVar)).booleanValue()) {
                    xVar.f6688a = cVar;
                    break;
                }
                break;
        }
    }

    @Override // wb.l
    public final boolean c(Object obj) {
        switch (this.f3897b) {
            case 0:
                i9.l.e((x9.c) obj, "current");
                return ((x) this.f3898c).f6688a == null;
            case 1:
                x9.e eVar = (x9.e) obj;
                x xVar = (x) this.f3898c;
                i9.l.e(eVar, "javaClassDescriptor");
                String strW = n3.l.W(eVar, (String) this.f3899d);
                if (o.f14228b.contains(strW)) {
                    xVar.f6688a = w9.k.f14207a;
                } else if (o.f14230d.contains(strW)) {
                    xVar.f6688a = w9.k.f14208b;
                } else if (o.f14229c.contains(strW)) {
                    xVar.f6688a = w9.k.f14209c;
                } else if (o.f14227a.contains(strW)) {
                    xVar.f6688a = w9.k.f14211e;
                }
                return xVar.f6688a == null;
            default:
                boolean[] zArr = (boolean[]) this.f3898c;
                if (((Boolean) ((k) this.f3899d).invoke(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
        }
    }

    @Override // wb.l
    public final Object j() {
        switch (this.f3897b) {
            case 0:
                return (x9.c) ((x) this.f3898c).f6688a;
            case 1:
                w9.k kVar = (w9.k) ((x) this.f3898c).f6688a;
                return kVar == null ? w9.k.f14210d : kVar;
            default:
                return Boolean.valueOf(((boolean[]) this.f3898c)[0]);
        }
    }
}
