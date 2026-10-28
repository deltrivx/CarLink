package r2;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s.h0 f11363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.i0 f11364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s.h0 f11365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s.c0 f11366d;

    public p1(b3.l0 l0Var) {
        long[] jArr = s.o0.f12476a;
        this.f11363a = new s.h0();
        s.i0 i0Var = s.p0.f12478a;
        this.f11364b = new s.i0();
        this.f11365c = new s.h0();
        s.c0 c0Var = s.l0.f12469a;
        this.f11366d = new s.c0();
    }

    public final void a(ArrayList arrayList, ViewGroup viewGroup) {
        s.c0 c0Var;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            c0Var = this.f11366d;
            if (i7 >= size) {
                break;
            }
            c0Var.h(i7, (View) arrayList.get(i7));
            i7++;
        }
        int size2 = arrayList.size() - 1;
        s.i0 i0Var = this.f11364b;
        s.h0 h0Var = this.f11363a;
        if (size2 >= 0) {
            while (true) {
                int i10 = size2 - 1;
                View view = (View) arrayList.get(size2);
                int nextFocusForwardId = view.getNextFocusForwardId();
                View viewB = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : j0.b(view, viewGroup, 2);
                if (viewB != null && c0Var.d(viewB) >= 0) {
                    h0Var.m(view, viewB);
                    i0Var.a(viewB);
                }
                if (i10 < 0) {
                    break;
                } else {
                    size2 = i10;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i11 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) h0Var.g(view2)) != null && !i0Var.c(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    s.h0 h0Var2 = this.f11365c;
                    View view4 = (View) h0Var2.g(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    h0Var2.m(view2, view3);
                    view2 = (View) h0Var.g(view2);
                }
            }
            if (i11 < 0) {
                return;
            } else {
                size3 = i11;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        s.h0 h0Var = this.f11365c;
        View view3 = (View) h0Var.g(view);
        View view4 = (View) h0Var.g(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.f11363a.g(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        s.c0 c0Var = this.f11366d;
        return c0Var.e(view) < c0Var.e(view2) ? -1 : 1;
    }
}
