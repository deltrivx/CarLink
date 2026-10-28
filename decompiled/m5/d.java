package m5;

import f1.g1;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d extends i9.j implements h9.o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f8453i = new d(3, l.class, "setAlpha", "setAlpha(FZ)V", 0);

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l lVar = (l) obj;
        float fFloatValue = ((Number) obj2).floatValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        i9.l.e(lVar, "p0");
        g1 g1Var = lVar.f8489h;
        if (((Boolean) lVar.f8494n.getValue()).booleanValue() && ((Number) g1Var.getValue()).floatValue() != fFloatValue) {
            g1Var.setValue(Float.valueOf(fFloatValue));
            lVar.f8486e.setValue(new y1.q(y1.q.b(fFloatValue, ((y1.q) lVar.f8487f.getValue()).f14960a)));
            lVar.a(zBooleanValue);
        }
        return z.f12851a;
    }
}
