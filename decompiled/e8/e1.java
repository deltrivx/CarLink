package e8;

import android.app.PendingIntent;
import b8.m1;
import b8.m2;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4524g;

    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f4518a = i7;
        this.f4519b = obj;
        this.f4520c = obj2;
        this.f4521d = obj3;
        this.f4522e = obj4;
        this.f4523f = obj5;
        this.f4524g = obj6;
    }

    @Override // h9.a
    public final Object invoke() throws PendingIntent.CanceledException, IOException {
        boolean z10;
        switch (this.f4518a) {
            case 0:
                h9.k kVar = (h9.k) this.f4519b;
                f1 f1Var = (f1) this.f4520c;
                f1.b1 b1Var = (f1.b1) this.f4521d;
                f1.b1 b1Var2 = (f1.b1) this.f4522e;
                f1.b1 b1Var3 = (f1.b1) this.f4523f;
                f1.b1 b1Var4 = (f1.b1) this.f4524g;
                String str = f1Var.f4535a;
                String str2 = f1Var.f4536b;
                String str3 = ((Boolean) b1Var.getValue()).booleanValue() ? "日出至日落" : "日落至日出";
                kVar.invoke(new m2(str, str2, str3 + " " + u8.p.q0(u8.p.J0(u8.p.L0(n3.l.J((String) b1Var2.getValue(), (String) b1Var3.getValue()))), "", null, null, null, 62), new m1(((Boolean) b1Var.getValue()).booleanValue(), ((Number) ((t8.j) b1Var4.getValue()).f12830a).doubleValue(), ((Number) ((t8.j) b1Var4.getValue()).f12831b).doubleValue())));
                break;
            default:
                o1.a aVar = (o1.a) this.f4519b;
                o1.j jVar = (o1.j) this.f4520c;
                o1.f fVar = (o1.f) this.f4521d;
                String str4 = (String) this.f4522e;
                Object[] objArr = (Object[]) this.f4524g;
                boolean z11 = true;
                if (aVar.f9264b != fVar) {
                    aVar.f9264b = fVar;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i9.l.a(aVar.f9265c, str4)) {
                    z11 = z10;
                } else {
                    aVar.f9265c = str4;
                }
                aVar.f9263a = jVar;
                aVar.f9266d = this.f4523f;
                aVar.f9267e = objArr;
                o1.e eVar = aVar.f9268f;
                if (eVar != null && z11) {
                    ((a2.b) eVar).e0();
                    aVar.f9268f = null;
                    aVar.a();
                }
                break;
        }
        return t8.z.f12851a;
    }
}
