package com.tencent.bugly.proguard;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import java.util.List;
import java.util.WeakHashMap;
import p.s1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3400b;

    public /* synthetic */ c0(int i7, Object obj) {
        this.f3399a = i7;
        this.f3400b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.k kVar;
        int i7 = this.f3399a;
        Object obj = this.f3400b;
        switch (i7) {
            case 0:
                ag.c((List) obj);
                return;
            case 1:
                au.a((au) obj);
                return;
            case 2:
                i4.e eVar = (i4.e) obj;
                s1 s1Var = eVar.f6629c;
                i4.a aVar = eVar.f6627a;
                if (eVar.f6640o) {
                    if (eVar.f6638m) {
                        eVar.f6638m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f6621e = jCurrentAnimationTimeMillis;
                        aVar.f6623g = -1L;
                        aVar.f6622f = jCurrentAnimationTimeMillis;
                        aVar.f6624h = 0.5f;
                    }
                    if ((aVar.f6623g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f6623g + ((long) aVar.f6625i)) || !eVar.e()) {
                        eVar.f6640o = false;
                        return;
                    }
                    if (eVar.f6639n) {
                        eVar.f6639n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        s1Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f6622f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j5 = jCurrentAnimationTimeMillis2 - aVar.f6622f;
                    aVar.f6622f = jCurrentAnimationTimeMillis2;
                    eVar.f6642q.scrollListBy((int) (j5 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f6620d));
                    WeakHashMap weakHashMap = e4.l0.f4369a;
                    s1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                l.e eVar2 = (l.e) obj;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 4:
                s1 s1Var2 = (s1) obj;
                s1Var2.f9907l = null;
                s1Var2.drawableStateChanged();
                return;
            case 5:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.f713f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f713f = false;
                    return;
                }
                return;
            case 6:
                ActionMenuView actionMenuView = ((Toolbar) obj).f715a;
                if (actionMenuView == null || (kVar = actionMenuView.f693t) == null) {
                    return;
                }
                kVar.l();
                return;
            case 7:
                ((p4.u) obj).w(true);
                return;
            default:
                r2.u uVar = (r2.u) obj;
                uVar.removeCallbacks(this);
                MotionEvent motionEvent = uVar.z0;
                if (motionEvent != null) {
                    boolean z10 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z10) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    r2.u uVar2 = (r2.u) obj;
                    uVar2.N(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, uVar2.A0, false);
                    return;
                }
                return;
        }
    }
}
