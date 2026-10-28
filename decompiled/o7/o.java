package o7;

import f1.b1;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f9507b;

    public /* synthetic */ o(b1 b1Var, int i7) {
        this.f9506a = i7;
        this.f9507b = b1Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f9506a) {
            case 0:
                this.f9507b.setValue(Boolean.TRUE);
                break;
            case 1:
                this.f9507b.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f9507b.setValue(Boolean.TRUE);
                break;
            case 3:
                this.f9507b.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f9507b.setValue(Boolean.TRUE);
                break;
            case 5:
                this.f9507b.setValue(Boolean.FALSE);
                break;
            case 6:
                o2.w wVar = (o2.w) this.f9507b.getValue();
                if (wVar != null) {
                    return wVar;
                }
                c0.b.d("Required value was null.");
                throw new cc.s();
            case 7:
                o2.w wVar2 = (o2.w) this.f9507b.getValue();
                if (wVar2 != null) {
                    return wVar2;
                }
                c0.b.d("Required value was null.");
                throw new cc.s();
            case 8:
                o2.w wVar3 = (o2.w) this.f9507b.getValue();
                if (wVar3 != null) {
                    return wVar3;
                }
                c0.b.d("Required value was null.");
                throw new cc.s();
            case 9:
                this.f9507b.setValue(Boolean.TRUE);
                break;
            case 10:
                this.f9507b.setValue(Boolean.FALSE);
                break;
            case 11:
                this.f9507b.setValue(null);
                break;
            case 12:
                this.f9507b.setValue(Boolean.TRUE);
                break;
            case 13:
                this.f9507b.setValue(Boolean.FALSE);
                break;
            case 14:
                this.f9507b.setValue(Boolean.TRUE);
                break;
            case 15:
                this.f9507b.setValue(Boolean.TRUE);
                break;
            case 16:
                this.f9507b.setValue(Boolean.FALSE);
                break;
            case 17:
                this.f9507b.setValue(Boolean.TRUE);
                break;
            case 18:
                this.f9507b.setValue(Boolean.FALSE);
                break;
            case 19:
                this.f9507b.setValue(Boolean.FALSE);
                break;
            case 20:
                this.f9507b.setValue(Boolean.TRUE);
                break;
            default:
                this.f9507b.setValue(Boolean.FALSE);
                break;
        }
        return z.f12851a;
    }
}
