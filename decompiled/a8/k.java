package a8;

import b8.h2;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f155b;

    public /* synthetic */ k(h2 h2Var, f1.b1 b1Var, int i7) {
        this.f154a = i7;
        this.f155b = b1Var;
    }

    public /* synthetic */ k(f1.b1 b1Var, int i7) {
        this.f154a = i7;
        this.f155b = b1Var;
    }

    @Override // h9.a
    public final Object invoke() {
        int i7 = this.f154a;
        t8.z zVar = t8.z.f12851a;
        f1.b1 b1Var = this.f155b;
        switch (i7) {
            case 0:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 1:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 2:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 3:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 4:
                x0.f(b1Var, false);
                break;
            case 5:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 6:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 7:
                d1.d(new y0(1), ((Boolean) b1Var.getValue()).booleanValue());
                break;
            case 8:
                b1Var.setValue("https://www.baidu.com/favicon.ico");
                break;
            case 9:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 10:
                f2.d(((Boolean) b1Var.getValue()).booleanValue());
                break;
            case 11:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 12:
                c8.n nVar = c8.n.f2521a;
                b1Var.setValue(Boolean.TRUE);
                break;
            case 13:
                c8.n nVar2 = c8.n.f2521a;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 14:
                c8.n nVar3 = c8.n.f2521a;
                b1Var.setValue(Boolean.TRUE);
                break;
            case 15:
                c8.n nVar4 = c8.n.f2521a;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 16:
                c8.n nVar5 = c8.n.f2521a;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 17:
                c8.n nVar6 = c8.n.f2521a;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case 18:
                b1Var.setValue(null);
                break;
            case 19:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 20:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 21:
                b1Var.setValue(Boolean.TRUE);
                break;
            case 22:
                b1Var.setValue(Boolean.FALSE);
                break;
            case 23:
                int i10 = e8.w.f4641e;
                b1Var.setValue(Boolean.TRUE);
                break;
            case 24:
                int i11 = e8.w.f4641e;
                b1Var.setValue(Boolean.FALSE);
                break;
            case 25:
                int i12 = e8.w.f4641e;
                b1Var.setValue(Boolean.TRUE);
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                int i13 = e8.w.f4641e;
                b1Var.setValue(Boolean.FALSE);
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                int i14 = e8.b0.f4485e;
                b1Var.setValue(Boolean.FALSE);
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                b1Var.setValue(Boolean.FALSE);
                break;
            default:
                b1Var.setValue(Boolean.TRUE);
                break;
        }
        return zVar;
    }
}
