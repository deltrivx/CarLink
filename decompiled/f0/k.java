package f0;

import cc.b0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.b1;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f4783b;

    public /* synthetic */ k(b1 b1Var, int i7) {
        this.f4782a = i7;
        this.f4783b = b1Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f4782a) {
            case 0:
                return new g((h9.k) this.f4783b.getValue());
            case 1:
                this.f4783b.setValue(Boolean.TRUE);
                return z.f12851a;
            case 2:
                this.f4783b.setValue(Boolean.FALSE);
                return z.f12851a;
            case 3:
                this.f4783b.setValue(Boolean.TRUE);
                return z.f12851a;
            case 4:
                this.f4783b.setValue(Boolean.FALSE);
                return z.f12851a;
            case 5:
                this.f4783b.setValue(Boolean.TRUE);
                return z.f12851a;
            case 6:
                this.f4783b.setValue(Boolean.FALSE);
                return z.f12851a;
            case 7:
                return new g0.h((h9.k) this.f4783b.getValue());
            case 8:
                this.f4783b.setValue(Boolean.TRUE);
                return z.f12851a;
            case 9:
                this.f4783b.setValue(Boolean.FALSE);
                return z.f12851a;
            case 10:
                return (h0.v) ((h9.a) this.f4783b.getValue()).invoke();
            case 11:
                Boolean bool = (Boolean) this.f4783b.getValue();
                bool.booleanValue();
                return bool;
            case 12:
                this.f4783b.setValue(Boolean.TRUE);
                return z.f12851a;
            case 13:
                this.f4783b.setValue(Boolean.FALSE);
                return z.f12851a;
            case 14:
                this.f4783b.setValue(Boolean.TRUE);
                return z.f12851a;
            case 15:
                this.f4783b.setValue(Boolean.FALSE);
                return z.f12851a;
            case 16:
                this.f4783b.setValue(Boolean.TRUE);
                return z.f12851a;
            case 17:
                this.f4783b.setValue(Boolean.FALSE);
                return z.f12851a;
            case 18:
                this.f4783b.setValue(Boolean.TRUE);
                return z.f12851a;
            case 19:
                this.f4783b.setValue(Boolean.FALSE);
                return z.f12851a;
            case 20:
                this.f4783b.setValue(Boolean.TRUE);
                b0.s(k7.n.f7378e, null, new k7.j(2, null), 3);
                return z.f12851a;
            case 21:
                this.f4783b.setValue(Boolean.FALSE);
                return z.f12851a;
            case 22:
                this.f4783b.setValue(Boolean.FALSE);
                return z.f12851a;
            case 23:
                this.f4783b.setValue(Boolean.FALSE);
                return z.f12851a;
            case 24:
                this.f4783b.setValue(Boolean.TRUE);
                return z.f12851a;
            case 25:
                this.f4783b.setValue(Boolean.FALSE);
                return z.f12851a;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                this.f4783b.setValue(o7.g.f9490b.i());
                return z.f12851a;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                this.f4783b.setValue(Boolean.TRUE);
                return z.f12851a;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                this.f4783b.setValue(Boolean.FALSE);
                return z.f12851a;
            default:
                this.f4783b.setValue(Boolean.TRUE);
                return z.f12851a;
        }
    }
}
