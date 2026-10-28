package c1;

import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.k f2192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q2 f2193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y1.l0 f2194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(boolean z10, boolean z11, b0.k kVar, q2 q2Var, y1.l0 l0Var) {
        super(2);
        this.f2190a = z10;
        this.f2191b = z11;
        this.f2192c = kVar;
        this.f2193d = q2Var;
        this.f2194e = l0Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            t0.f2160a.a(this.f2190a, this.f2191b, this.f2192c, null, this.f2193d, this.f2194e, 0.0f, 0.0f, sVar, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR, Constants.MSG_RESPONSE_SUCCESS);
        }
        return t8.z.f12851a;
    }
}
