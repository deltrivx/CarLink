package m5;

import f1.g1;
import f1.k1;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i extends i9.j implements h9.o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f8477i = new i(3, l.class, "setBrightness", "setBrightness(FZ)V", 0);

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l lVar = (l) obj;
        float fFloatValue = ((Number) obj2).floatValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        i9.l.e(lVar, "p0");
        g1 g1Var = lVar.f8490i;
        if (((Boolean) lVar.f8494n.getValue()).booleanValue() && ((Number) g1Var.getValue()).floatValue() != fFloatValue) {
            g1Var.setValue(Float.valueOf(fFloatValue));
            t8.p pVarP0 = g5.a.p0(((y1.q) lVar.f8488g.getValue()).f14960a);
            float fFloatValue2 = ((Number) pVarP0.f12839a).floatValue();
            float fFloatValue3 = ((Number) pVarP0.f12840b).floatValue();
            k1 k1Var = lVar.f8486e;
            int i7 = y1.q.f14959n;
            k1Var.setValue(new y1.q(n4.e.i(fFloatValue2, fFloatValue3, fFloatValue, ((Number) lVar.f8489h.getValue()).floatValue(), 16)));
            lVar.a(zBooleanValue);
        }
        return z.f12851a;
    }
}
