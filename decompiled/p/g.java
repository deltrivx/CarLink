package p;

import android.content.Context;
import android.view.View;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends o.w {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9743l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f9744m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Context context, o.e0 e0Var, View view) {
        super(context, e0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f9744m = kVar;
        if ((e0Var.A.f9224x & 32) != 32) {
            View view2 = kVar.f9806i;
            this.f9242e = view2 == null ? (View) kVar.f9805h : view2;
        }
        l0.o0 o0Var = kVar.f9819w;
        this.f9245h = o0Var;
        o.u uVar = this.f9246i;
        if (uVar != null) {
            uVar.j(o0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Context context, o.m mVar, View view) {
        super(context, mVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f9744m = kVar;
        this.f9243f = 8388613;
        l0.o0 o0Var = kVar.f9819w;
        this.f9245h = o0Var;
        o.u uVar = this.f9246i;
        if (uVar != null) {
            uVar.j(o0Var);
        }
    }

    @Override // o.w
    public final void c() {
        switch (this.f9743l) {
            case 0:
                k kVar = this.f9744m;
                kVar.f9816t = null;
                kVar.getClass();
                super.c();
                break;
            default:
                k kVar2 = this.f9744m;
                o.m mVar = kVar2.f9800c;
                if (mVar != null) {
                    mVar.c(true);
                }
                kVar2.f9815s = null;
                super.c();
                break;
        }
    }
}
