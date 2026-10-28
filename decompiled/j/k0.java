package j;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import e4.l0;
import e4.r0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.e3;
import p.l1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends a.a implements p.d {
    public static final AccelerateInterpolator D = new AccelerateInterpolator();
    public static final DecelerateInterpolator E = new DecelerateInterpolator();
    public final i0 A;
    public final i0 B;
    public final a2.d C;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f6813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f6814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ActionBarOverlayLayout f6815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ActionBarContainer f6816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l1 f6817j;
    public ActionBarContextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f6818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j0 f6820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j0 f6821o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u0.k f6822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f6824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6827u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6828v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n.j f6830x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6831y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6832z;

    public k0(Activity activity, boolean z10) {
        new ArrayList();
        this.f6824r = new ArrayList();
        this.f6825s = 0;
        this.f6826t = true;
        this.f6829w = true;
        this.A = new i0(this, 0);
        this.B = new i0(this, 1);
        this.C = new a2.d(25, this);
        View decorView = activity.getWindow().getDecorView();
        Y(decorView);
        if (z10) {
            return;
        }
        this.f6818l = decorView.findViewById(R.id.content);
    }

    public k0(Dialog dialog) {
        new ArrayList();
        this.f6824r = new ArrayList();
        this.f6825s = 0;
        this.f6826t = true;
        this.f6829w = true;
        this.A = new i0(this, 0);
        this.B = new i0(this, 1);
        this.C = new a2.d(25, this);
        Y(dialog.getWindow().getDecorView());
    }

    public final void W(boolean z10) {
        r0 r0VarI;
        r0 r0VarI2;
        if (z10) {
            if (!this.f6828v) {
                this.f6828v = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6815h;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                b0(false);
            }
        } else if (this.f6828v) {
            this.f6828v = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6815h;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            b0(false);
        }
        if (!this.f6816i.isLaidOut()) {
            if (z10) {
                ((e3) this.f6817j).f9704a.setVisibility(4);
                this.k.setVisibility(0);
                return;
            } else {
                ((e3) this.f6817j).f9704a.setVisibility(0);
                this.k.setVisibility(8);
                return;
            }
        }
        if (z10) {
            e3 e3Var = (e3) this.f6817j;
            r0VarI = l0.a(e3Var.f9704a);
            r0VarI.a(0.0f);
            r0VarI.c(100L);
            r0VarI.d(new n.i(e3Var, 4));
            r0VarI2 = this.k.i(0, 200L);
        } else {
            e3 e3Var2 = (e3) this.f6817j;
            r0 r0VarA = l0.a(e3Var2.f9704a);
            r0VarA.a(1.0f);
            r0VarA.c(200L);
            r0VarA.d(new n.i(e3Var2, 0));
            r0VarI = this.k.i(8, 100L);
            r0VarI2 = r0VarA;
        }
        n.j jVar = new n.j();
        ArrayList arrayList = jVar.f8694a;
        arrayList.add(r0VarI);
        View view = (View) r0VarI.f4396a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) r0VarI2.f4396a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(r0VarI2);
        jVar.b();
    }

    public final Context X() {
        if (this.f6814g == null) {
            TypedValue typedValue = new TypedValue();
            this.f6813f.getTheme().resolveAttribute(com.baidu.carlifevehicle.R.attr.actionBarWidgetTheme, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                this.f6814g = new ContextThemeWrapper(this.f6813f, i7);
            } else {
                this.f6814g = this.f6813f;
            }
        }
        return this.f6814g;
    }

    public final void Y(View view) {
        l1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.baidu.carlifevehicle.R.id.decor_content_parent);
        this.f6815h = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.baidu.carlifevehicle.R.id.action_bar);
        if (callbackFindViewById instanceof l1) {
            wrapper = (l1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f6817j = wrapper;
        this.k = (ActionBarContextView) view.findViewById(com.baidu.carlifevehicle.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.baidu.carlifevehicle.R.id.action_bar_container);
        this.f6816i = actionBarContainer;
        l1 l1Var = this.f6817j;
        if (l1Var == null || this.k == null || actionBarContainer == null) {
            throw new IllegalStateException(k0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((e3) l1Var).f9704a.getContext();
        this.f6813f = context;
        if ((((e3) this.f6817j).f9705b & 4) != 0) {
            this.f6819m = true;
        }
        int i7 = context.getApplicationInfo().targetSdkVersion;
        this.f6817j.getClass();
        a0(context.getResources().getBoolean(com.baidu.carlifevehicle.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f6813f.obtainStyledAttributes(null, i.a.f6544a, com.baidu.carlifevehicle.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6815h;
            if (!actionBarOverlayLayout2.f670g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f6832z = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f6816i;
            WeakHashMap weakHashMap = l0.f4369a;
            e4.e0.h(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void Z(boolean z10) {
        if (this.f6819m) {
            return;
        }
        int i7 = z10 ? 4 : 0;
        e3 e3Var = (e3) this.f6817j;
        int i10 = e3Var.f9705b;
        this.f6819m = true;
        e3Var.a((i7 & 4) | (i10 & (-5)));
    }

    public final void a0(boolean z10) {
        if (z10) {
            this.f6816i.setTabContainer(null);
            ((e3) this.f6817j).getClass();
        } else {
            ((e3) this.f6817j).getClass();
            this.f6816i.setTabContainer(null);
        }
        this.f6817j.getClass();
        ((e3) this.f6817j).f9704a.setCollapsible(false);
        this.f6815h.setHasNonEmbeddedTabs(false);
    }

    public final void b0(boolean z10) {
        boolean z11 = this.f6827u;
        boolean z12 = this.f6828v;
        final a2.d dVar = this.C;
        View view = this.f6818l;
        if (!z12 && z11) {
            if (this.f6829w) {
                this.f6829w = false;
                n.j jVar = this.f6830x;
                if (jVar != null) {
                    jVar.a();
                }
                int i7 = this.f6825s;
                i0 i0Var = this.A;
                if (i7 != 0 || (!this.f6831y && !z10)) {
                    i0Var.c();
                    return;
                }
                this.f6816i.setAlpha(1.0f);
                this.f6816i.setTransitioning(true);
                n.j jVar2 = new n.j();
                float f10 = -this.f6816i.getHeight();
                if (z10) {
                    int[] iArr = {0, 0};
                    this.f6816i.getLocationInWindow(iArr);
                    f10 -= iArr[1];
                }
                r0 r0VarA = l0.a(this.f6816i);
                r0VarA.e(f10);
                final View view2 = (View) r0VarA.f4396a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(dVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: e4.p0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((j.k0) dVar.f20b).f6816i.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z13 = jVar2.f8698e;
                ArrayList arrayList = jVar2.f8694a;
                if (!z13) {
                    arrayList.add(r0VarA);
                }
                if (this.f6826t && view != null) {
                    r0 r0VarA2 = l0.a(view);
                    r0VarA2.e(f10);
                    if (!jVar2.f8698e) {
                        arrayList.add(r0VarA2);
                    }
                }
                boolean z14 = jVar2.f8698e;
                if (!z14) {
                    jVar2.f8696c = D;
                }
                if (!z14) {
                    jVar2.f8695b = 250L;
                }
                if (!z14) {
                    jVar2.f8697d = i0Var;
                }
                this.f6830x = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f6829w) {
            return;
        }
        this.f6829w = true;
        n.j jVar3 = this.f6830x;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f6816i.setVisibility(0);
        int i10 = this.f6825s;
        i0 i0Var2 = this.B;
        if (i10 == 0 && (this.f6831y || z10)) {
            this.f6816i.setTranslationY(0.0f);
            float f11 = -this.f6816i.getHeight();
            if (z10) {
                int[] iArr2 = {0, 0};
                this.f6816i.getLocationInWindow(iArr2);
                f11 -= iArr2[1];
            }
            this.f6816i.setTranslationY(f11);
            n.j jVar4 = new n.j();
            r0 r0VarA3 = l0.a(this.f6816i);
            r0VarA3.e(0.0f);
            final View view3 = (View) r0VarA3.f4396a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(dVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: e4.p0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((j.k0) dVar.f20b).f6816i.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z15 = jVar4.f8698e;
            ArrayList arrayList2 = jVar4.f8694a;
            if (!z15) {
                arrayList2.add(r0VarA3);
            }
            if (this.f6826t && view != null) {
                view.setTranslationY(f11);
                r0 r0VarA4 = l0.a(view);
                r0VarA4.e(0.0f);
                if (!jVar4.f8698e) {
                    arrayList2.add(r0VarA4);
                }
            }
            boolean z16 = jVar4.f8698e;
            if (!z16) {
                jVar4.f8696c = E;
            }
            if (!z16) {
                jVar4.f8695b = 250L;
            }
            if (!z16) {
                jVar4.f8697d = i0Var2;
            }
            this.f6830x = jVar4;
            jVar4.b();
        } else {
            this.f6816i.setAlpha(1.0f);
            this.f6816i.setTranslationY(0.0f);
            if (this.f6826t && view != null) {
                view.setTranslationY(0.0f);
            }
            i0Var2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6815h;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = l0.f4369a;
            e4.c0.c(actionBarOverlayLayout);
        }
    }
}
