package r2;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f1.k1 f11265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11266j;

    public i1(Context context) {
        super(context);
        this.f11265i = f1.b.s(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // r2.a
    public final void a(int i7, f1.s sVar) {
        sVar.Y(420213850);
        int i10 = (sVar.h(this) ? 4 : 2) | i7;
        if (sVar.N(i10 & 1, (i10 & 3) != 2)) {
            h9.n nVar = (h9.n) this.f11265i.getValue();
            if (nVar == null) {
                sVar.W(-1238798753);
            } else {
                sVar.W(98586082);
                nVar.invoke(sVar, 0);
            }
            sVar.p(false);
        } else {
            sVar.Q();
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c1.n(this, i7, 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return i1.class.getName();
    }

    @Override // r2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f11266j;
    }

    public final void setContent(h9.n nVar) {
        this.f11266j = true;
        this.f11265i.setValue(nVar);
        if (isAttachedToWindow()) {
            if (this.f11135d == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }
}
