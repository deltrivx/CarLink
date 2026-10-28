package d1;

import i9.x;
import o2.u0;
import o2.v0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, int i10, Object obj) {
        super(1);
        this.f3679a = i10;
        this.f3681c = obj;
        this.f3680b = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f3679a) {
            case 0:
                u0.f((u0) obj, (v0) this.f3681c, -this.f3680b, 0);
                return z.f12851a;
            default:
                x xVar = (x) this.f3681c;
                Boolean boolValueOf = Boolean.valueOf(((w1.s) obj).E0(this.f3680b));
                xVar.f6688a = boolValueOf;
                return boolValueOf;
        }
    }
}
