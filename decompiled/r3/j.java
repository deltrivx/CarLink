package r3;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f11564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(v vVar, int i7) {
        super(1);
        this.f11563a = i7;
        this.f11564b = vVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f11563a) {
            case 0:
                o2.w wVarX = ((o2.w) obj).x();
                i9.l.b(wVarX);
                this.f11564b.l(wVarX);
                break;
            case 1:
                n3.m mVar = new n3.m(((n3.m) obj).f8746a);
                v vVar = this.f11564b;
                vVar.m34setPopupContentSizefhxjrPA(mVar);
                vVar.m();
                break;
            default:
                h9.a aVar = (h9.a) obj;
                v vVar2 = this.f11564b;
                Handler handler = vVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = vVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new com.baidu.carlife.sdk.internal.a(aVar, 7));
                    }
                }
                break;
        }
        return t8.z.f12851a;
    }
}
