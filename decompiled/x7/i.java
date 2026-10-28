package x7;

import f1.b1;
import f1.h0;
import n8.w;
import n8.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f14653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f14654c;

    public /* synthetic */ i(b1 b1Var, b1 b1Var2, int i7) {
        this.f14652a = i7;
        this.f14653b = b1Var;
        this.f14654c = b1Var2;
    }

    @Override // f1.h0
    public final void a() {
        switch (this.f14652a) {
            case 0:
                b1 b1Var = this.f14653b;
                w wVar = (w) b1Var.getValue();
                if (wVar != null) {
                    wVar.a();
                }
                b1Var.setValue(null);
                b1 b1Var2 = this.f14654c;
                y yVar = (y) b1Var2.getValue();
                if (yVar != null && yVar.isShowing()) {
                    y yVar2 = (y) b1Var2.getValue();
                    if (yVar2 != null) {
                        yVar2.dismiss();
                    }
                    b1Var2.setValue(null);
                    break;
                }
                break;
            default:
                b1 b1Var3 = this.f14653b;
                w wVar2 = (w) b1Var3.getValue();
                if (wVar2 != null) {
                    wVar2.a();
                }
                b1Var3.setValue(null);
                b1 b1Var4 = this.f14654c;
                y yVar3 = (y) b1Var4.getValue();
                if (yVar3 != null && yVar3.isShowing()) {
                    y yVar4 = (y) b1Var4.getValue();
                    if (yVar4 != null) {
                        yVar4.dismiss();
                    }
                    b1Var4.setValue(null);
                    break;
                }
                break;
        }
    }
}
