package c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p4.l f1761b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p4.l lVar, int i7) {
        super(0);
        this.f1760a = i7;
        this.f1761b = lVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f1760a) {
            case 0:
                p4.l lVar = this.f1761b;
                return new androidx.lifecycle.m0(lVar.getApplication(), lVar, lVar.getIntent() != null ? lVar.getIntent().getExtras() : null);
            case 1:
                this.f1761b.reportFullyDrawn();
                return t8.z.f12851a;
            case 2:
                p4.l lVar2 = this.f1761b;
                return new y(lVar2.f1776f, new m(lVar2, 1));
            default:
                p4.l lVar3 = this.f1761b;
                l0 l0Var = new l0(new d(lVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (i9.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                        lVar3.f13057a.a(new h(0, l0Var, lVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new n(0, lVar3, l0Var));
                    }
                }
                return l0Var;
        }
    }
}
