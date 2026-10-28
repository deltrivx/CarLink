package r2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l9.b f11372f = new l9.b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f11373a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f11374b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f11375c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1 f11376d = new p1(new b3.l0(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f11377e = new ArrayList();

    public static void d(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View a(int i7, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int iIndexOf;
        int iLastIndexOf;
        int i10;
        Rect rect2 = this.f11373a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 17 || i7 == 33) {
                    d(viewGroup, rect2);
                } else if (i7 == 66 || i7 == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                d(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            d(viewGroup, rect2);
        }
        if (i7 != 1 && i7 != 2) {
            if (i7 == 17 || i7 == 33 || i7 == 66 || i7 == 130) {
                return c(i7, rect2, view, viewGroup, arrayList);
            }
            throw new IllegalArgumentException(a2.f.E(i7, "Unknown direction: "));
        }
        p1 p1Var = this.f11376d;
        try {
            p1Var.a(arrayList, viewGroup);
            Collections.sort(arrayList, p1Var);
            p1Var.f11365c.a();
            p1Var.f11364b.b();
            p1Var.f11366d.a();
            p1Var.f11363a.a();
            int size = arrayList.size();
            View viewC = null;
            if (size < 2) {
                return null;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 17 || i7 == 33 || i7 == 66 || i7 == 130) {
                        viewC = c(i7, this.f11373a, view, viewGroup, arrayList);
                    }
                } else if (size >= 2) {
                    viewC = (view == null || (iLastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i10 = iLastIndexOf + 1) >= size) ? (View) arrayList.get(0) : (View) arrayList.get(i10);
                }
            } else if (size >= 2) {
                viewC = (view == null || (iIndexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(size - 1) : (View) arrayList.get(iIndexOf - 1);
            }
            return viewC == null ? (View) arrayList.get(size - 1) : viewC;
        } catch (Throwable th) {
            p1Var.f11365c.a();
            p1Var.f11364b.b();
            p1Var.f11366d.a();
            p1Var.f11363a.a();
            throw th;
        }
    }

    public final View b(int i7, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View viewA = null;
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (parent instanceof ViewGroup) {
                    if (parent == viewGroup) {
                        if (viewGroup3 != null) {
                            viewGroup2 = viewGroup3;
                            break;
                        }
                        break;
                    }
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                }
                viewGroup2 = viewGroup;
                break;
            }
        }
        viewGroup2 = viewGroup;
        break;
        View viewB = j0.b(view, viewGroup2, i7);
        View viewB2 = viewB;
        boolean z10 = true;
        while (viewB != null) {
            if (viewB.isFocusable() && viewB.getVisibility() == 0 && (!viewB.isInTouchMode() || viewB.isFocusableInTouchMode())) {
                viewA = viewB;
                break;
            }
            viewB = j0.b(viewB, viewGroup2, i7);
            boolean z11 = !z10;
            if (!z10) {
                viewB2 = viewB2 != null ? j0.b(viewB2, viewGroup2, i7) : null;
                if (viewB2 == viewB) {
                    break;
                }
            }
            z10 = z11;
        }
        if (viewA != null) {
            return viewA;
        }
        ArrayList<View> arrayList = this.f11377e;
        try {
            arrayList.clear();
            if (Build.VERSION.SDK_INT < 26) {
                j0.d(viewGroup2, arrayList, viewGroup2.isInTouchMode());
            } else {
                viewGroup2.addFocusables(arrayList, i7, viewGroup2.isInTouchMode() ? 1 : 0);
            }
            if (!arrayList.isEmpty()) {
                viewA = a(i7, null, view, viewGroup2, arrayList);
            }
            return viewA;
        } finally {
            arrayList.clear();
        }
    }

    public final View c(int i7, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.f11374b;
        rect2.set(rect);
        if (i7 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i7 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i7 == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i7 == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = (View) arrayList.get(i10);
            if (!i9.l.a(view3, view) && !i9.l.a(view3, viewGroup)) {
                Rect rect3 = this.f11375c;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                x1.c cVarE = y1.h0.E(rect3);
                x1.c cVarE2 = y1.h0.E(rect2);
                x1.c cVarE3 = y1.h0.E(rect);
                w1.d dVarD = w1.f.D(i7);
                if (w1.f.o(cVarE, cVarE2, cVarE3, dVarD != null ? dVarD.f14034a : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}
