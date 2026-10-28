package s1;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import l0.o0;
import r2.u;
import s.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f12540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2.o f12541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f12542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z2.a f12543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f12545f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AutofillId f12546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f12547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12548i;

    public c(o0 o0Var, y2.o oVar, u uVar, z2.a aVar, String str) {
        this.f12540a = o0Var;
        this.f12541b = oVar;
        this.f12542c = uVar;
        this.f12543d = aVar;
        this.f12544e = str;
        uVar.setImportantForAutofill(1);
        f4.e eVarK0 = n3.n.k0(uVar);
        AutofillId autofillIdF = eVarK0 != null ? i.f(eVarK0.f5285a) : null;
        if (autofillIdF == null) {
            throw ob.a.o("Required value was null.");
        }
        this.f12546g = autofillIdF;
        this.f12547h = new x();
    }
}
