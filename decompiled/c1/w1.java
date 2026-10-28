package c1;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends i9.n implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f2268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(m1 m1Var, boolean z10) {
        super(3);
        this.f2267a = z10;
        this.f2268b = m1Var;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj3).intValue();
        t1 t1Var = t1.f2165a;
        int i7 = (iIntValue & 14) | ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR;
        t1Var.b((i2) obj, null, this.f2267a, this.f2268b, null, null, 0.0f, 0.0f, (f1.s) obj2, i7);
        return t8.z.f12851a;
    }
}
