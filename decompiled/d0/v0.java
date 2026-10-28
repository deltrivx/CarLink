package d0;

import android.view.View;
import com.baidu.carlifevehicle.R;
import e4.s1;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f3641u = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3642a = b.d(4, "captionBar");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f3644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f3645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f3646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f3647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f3648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f3649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f3650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s0 f3651j;
    public final s0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s0 f3652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s0 f3653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s0 f3654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s0 f3655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s0 f3656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s0 f3657q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f3658r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3659s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f3660t;

    public v0(View view) {
        a aVarD = b.d(128, "displayCutout");
        this.f3643b = aVarD;
        a aVarD2 = b.d(8, "ime");
        this.f3644c = aVarD2;
        a aVarD3 = b.d(32, "mandatorySystemGestures");
        this.f3645d = aVarD3;
        this.f3646e = b.d(2, "navigationBars");
        this.f3647f = b.d(1, "statusBars");
        a aVarD4 = b.d(519, "systemBars");
        this.f3648g = aVarD4;
        a aVarD5 = b.d(16, "systemGestures");
        this.f3649h = aVarD5;
        a aVarD6 = b.d(64, "tappableElement");
        this.f3650i = aVarD6;
        s0 s0Var = new s0(new b0(0, 0, 0, 0), "waterfall");
        this.f3651j = s0Var;
        new q0(new q0(aVarD4, aVarD2), aVarD);
        new q0(new q0(new q0(aVarD6, aVarD3), aVarD5), s0Var);
        this.k = b.e(4, "captionBarIgnoringVisibility");
        this.f3652l = b.e(2, "navigationBarsIgnoringVisibility");
        this.f3653m = b.e(1, "statusBarsIgnoringVisibility");
        this.f3654n = b.e(519, "systemBarsIgnoringVisibility");
        this.f3655o = b.e(64, "tappableElementIgnoringVisibility");
        this.f3656p = b.e(8, "imeAnimationTarget");
        this.f3657q = b.e(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f3658r = bool != null ? bool.booleanValue() : false;
        this.f3660t = new y(this);
    }

    public static void a(v0 v0Var, s1 s1Var) {
        boolean z10 = false;
        v0Var.f3642a.f(s1Var, 0);
        v0Var.f3644c.f(s1Var, 0);
        v0Var.f3643b.f(s1Var, 0);
        v0Var.f3646e.f(s1Var, 0);
        v0Var.f3647f.f(s1Var, 0);
        v0Var.f3648g.f(s1Var, 0);
        v0Var.f3649h.f(s1Var, 0);
        v0Var.f3650i.f(s1Var, 0);
        v0Var.f3645d.f(s1Var, 0);
        v0Var.k.f(c.e(s1Var.f4398a.h(4)));
        v0Var.f3652l.f(c.e(s1Var.f4398a.h(2)));
        v0Var.f3653m.f(c.e(s1Var.f4398a.h(1)));
        v0Var.f3654n.f(c.e(s1Var.f4398a.h(519)));
        v0Var.f3655o.f(c.e(s1Var.f4398a.h(64)));
        e4.i iVarF = s1Var.f4398a.f();
        if (iVarF != null) {
            v0Var.f3651j.f(c.e(iVarF.a()));
        }
        synchronized (p1.l.f10057c) {
            s.i0 i0Var = p1.l.f10064j.f10004h;
            if (i0Var != null && i0Var.h()) {
                z10 = true;
            }
        }
        if (z10) {
            p1.l.a();
        }
    }
}
