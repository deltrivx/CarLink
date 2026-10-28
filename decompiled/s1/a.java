package s1;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import l0.o0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i9.n implements h9.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f12536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12537b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i7) {
        super(4);
        this.f12536a = cVar;
        this.f12537b = i7;
    }

    @Override // h9.p
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        c cVar = this.f12536a;
        o0 o0Var = cVar.f12540a;
        ((AutofillManager) o0Var.f7772b).notifyViewEntered(cVar.f12542c, this.f12537b, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return z.f12851a;
    }
}
