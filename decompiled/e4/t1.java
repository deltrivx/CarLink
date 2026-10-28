package e4;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class t1 extends k9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Window f4403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4404e;

    public t1(Window window, a2.d dVar, int i7) {
        this.f4402c = i7;
        switch (i7) {
            case 1:
                this.f4404e = window.getInsetsController();
                this.f4403d = window;
                break;
            default:
                this.f4403d = window;
                this.f4404e = dVar;
                break;
        }
    }

    @Override // k9.a
    public final void C(int i7) {
        switch (this.f4402c) {
            case 0:
                for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                    if ((i7 & i10) != 0) {
                        if (i10 == 1) {
                            V(4);
                        } else if (i10 == 2) {
                            V(2);
                        } else if (i10 == 8) {
                            ((a2.d) ((a2.d) this.f4404e).f20b).p();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f4404e).hide(i7 & (-9));
                break;
        }
    }

    @Override // k9.a
    public void O(boolean z10) {
        switch (this.f4402c) {
            case 1:
                Window window = this.f4403d;
                if (!z10) {
                    if (window != null) {
                        W(16);
                    }
                    ((WindowInsetsController) this.f4404e).setSystemBarsAppearance(0, 16);
                } else {
                    if (window != null) {
                        V(16);
                    }
                    ((WindowInsetsController) this.f4404e).setSystemBarsAppearance(16, 16);
                }
                break;
        }
    }

    @Override // k9.a
    public void P(boolean z10) {
        switch (this.f4402c) {
            case 1:
                Window window = this.f4403d;
                if (!z10) {
                    if (window != null) {
                        W(ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
                    }
                    ((WindowInsetsController) this.f4404e).setSystemBarsAppearance(0, 8);
                } else {
                    if (window != null) {
                        V(ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
                    }
                    ((WindowInsetsController) this.f4404e).setSystemBarsAppearance(8, 8);
                }
                break;
        }
    }

    @Override // k9.a
    public void S() {
        switch (this.f4402c) {
            case 0:
                this.f4403d.getDecorView().setTag(356039078, 2);
                W(2048);
                V(ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT);
                break;
            default:
                Window window = this.f4403d;
                if (window == null) {
                    ((WindowInsetsController) this.f4404e).setSystemBarsBehavior(2);
                } else {
                    window.getDecorView().setTag(356039078, 2);
                    W(2048);
                    V(ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT);
                }
                break;
        }
    }

    @Override // k9.a
    public final void T(int i7) {
        switch (this.f4402c) {
            case 0:
                for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                    if ((i7 & i10) != 0) {
                        if (i10 == 1) {
                            W(4);
                            this.f4403d.clearFlags(1024);
                        } else if (i10 == 2) {
                            W(2);
                        } else if (i10 == 8) {
                            ((a2.d) ((a2.d) this.f4404e).f20b).A();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f4404e).show(i7 & (-9));
                break;
        }
    }

    public final void V(int i7) {
        switch (this.f4402c) {
            case 0:
                View decorView = this.f4403d.getDecorView();
                decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
                break;
            default:
                View decorView2 = this.f4403d.getDecorView();
                decorView2.setSystemUiVisibility(i7 | decorView2.getSystemUiVisibility());
                break;
        }
    }

    public final void W(int i7) {
        switch (this.f4402c) {
            case 0:
                View decorView = this.f4403d.getDecorView();
                decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
                break;
            default:
                View decorView2 = this.f4403d.getDecorView();
                decorView2.setSystemUiVisibility((~i7) & decorView2.getSystemUiVisibility());
                break;
        }
    }
}
