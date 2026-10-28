package n8;

import android.os.Build;
import r2.i1;
import r2.j0;
import s.d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8919a;

    public /* synthetic */ k(int i7) {
        this.f8919a = i7;
    }

    public /* synthetic */ k(int i7, d3.e eVar) {
        this.f8919a = 2;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8919a) {
            case 0:
                i1 i1Var = (i1) n.f8929c.get("FLOAT_ICON_SWITCH");
                if (i1Var != null) {
                    i1Var.setVisibility(8);
                    return;
                }
                return;
            case 1:
                d0 d0Var = r2.u.R0;
                synchronized (d0Var) {
                    try {
                        int i7 = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = d0Var.f12407a;
                            int i10 = d0Var.f12408b;
                            while (i7 < i10) {
                                r2.u uVar = (r2.u) objArr[i7];
                                boolean showLayoutBounds = uVar.getShowLayoutBounds();
                                Class cls = r2.u.O0;
                                uVar.setShowLayoutBounds(j0.n());
                                if (showLayoutBounds != uVar.getShowLayoutBounds()) {
                                    r2.u.r(uVar.getRoot());
                                }
                                i7++;
                            }
                        } else {
                            Object[] objArr2 = d0Var.f12407a;
                            int i11 = d0Var.f12408b;
                            while (i7 < i11) {
                                r2.u.r(((r2.u) objArr2[i7]).getRoot());
                                i7++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }
}
