package q3;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import q2.q1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f10933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.k f10934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.q f10935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o1.f f10936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f10938f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, h9.k kVar, f1.q qVar, o1.f fVar, int i7, View view) {
        super(0);
        this.f10933a = context;
        this.f10934b = kVar;
        this.f10935c = qVar;
        this.f10936d = fVar;
        this.f10937e = i7;
        this.f10938f = view;
    }

    @Override // h9.a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f10938f;
        i9.l.c(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new q(this.f10933a, this.f10934b, this.f10935c, this.f10936d, this.f10937e, (q1) callback).getLayoutNode();
    }
}
