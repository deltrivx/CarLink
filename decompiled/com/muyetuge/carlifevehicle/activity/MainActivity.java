package com.muyetuge.carlifevehicle.activity;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i0;
import b8.u0;
import c.r;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import com.muyetuge.carlifevehicle.service.BaseService;
import com.muyetuge.carlifevehicle.service.MainService;
import d8.g;
import fc.h0;
import fc.y;
import h7.b;
import i9.l;
import j.j;
import java.util.ArrayList;
import kb.d;
import kotlin.Metadata;
import n1.c;
import r2.i1;
import z6.a;
import z7.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/muyetuge/carlifevehicle/activity/MainActivity;", "Lj/j;", "<init>", "()V", "a/a", "app_baiduRelease"}, k = 1, mv = {2, 1, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class MainActivity extends j {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static MainActivity f2912y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final h0 f2913z = y.b(Boolean.FALSE);

    @Override // j.j, u3.h, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        l.e(keyEvent, "event");
        Handler handler = d8.l.f3821a;
        int keyCode = keyEvent.getKeyCode();
        int i7 = 0;
        if (d8.l.b(keyCode, false)) {
            u0 u0VarA = d8.l.a(keyCode, 2);
            u0 u0VarA2 = d8.l.a(keyCode, 1);
            u0 u0VarA3 = d8.l.a(keyCode, 0);
            z10 = (u0VarA != null && u0VarA.f1658d) || (u0VarA2 != null && u0VarA2.f1658d) || (u0VarA3 != null && u0VarA3.f1658d);
            d8.l.c(keyEvent, new g(keyCode, i7));
        } else {
            z10 = false;
        }
        return z10 || super.dispatchKeyEvent(keyEvent);
    }

    @Override // p4.l, c.o, u3.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.a(this);
        a aVar = BaseService.f2920a;
        Context contextB = n8.a.b();
        a aVar2 = BaseService.f2920a;
        if (!aVar2.v(contextB, true)) {
            b3.r rVar = new b3.r(this);
            ArrayList arrayList = (ArrayList) rVar.f1432a;
            arrayList.remove(aVar2);
            arrayList.add(aVar2);
            rVar.q(new d(23));
        }
        int i7 = MainService.f2921a;
        k8.d.a();
        c cVar = b.f6446b;
        ViewGroup.LayoutParams layoutParams = d.a.f3528a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        i1 i1Var = childAt instanceof i1 ? (i1) childAt : null;
        if (i1Var != null) {
            i1Var.setParentCompositionContext(null);
            i1Var.setContent(cVar);
            return;
        }
        i1 i1Var2 = new i1(this);
        i1Var2.setParentCompositionContext(null);
        i1Var2.setContent(cVar);
        View decorView = getWindow().getDecorView();
        if (i0.e(decorView) == null) {
            i0.h(decorView, this);
        }
        if (i0.f(decorView) == null) {
            decorView.setTag(com.baidu.carlifevehicle.R.id.view_tree_view_model_store_owner, this);
        }
        if (g5.a.E(decorView) == null) {
            decorView.setTag(com.baidu.carlifevehicle.R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(i1Var2, d.a.f3528a);
    }

    @Override // j.j, p4.l, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        super.onStart();
        f2912y = this;
        Boolean bool = Boolean.TRUE;
        h0 h0Var = f2913z;
        h0Var.getClass();
        h0Var.j(null, bool);
        Logger.INSTANCE.d("CarLife_Vehicle", "【主要活动】应用前台");
    }

    @Override // j.j, p4.l, android.app.Activity
    public final void onStop() {
        super.onStop();
        f2912y = null;
        Boolean bool = Boolean.FALSE;
        h0 h0Var = f2913z;
        h0Var.getClass();
        h0Var.j(null, bool);
        Logger.INSTANCE.d("CarLife_Vehicle", "【主要活动】应用后台");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        h0 h0Var = k.f15763m;
        if (((k) h0Var.getValue()).f15772i) {
            getWindow().getDecorView().setSystemUiVisibility(2062);
        } else if (z10) {
            z7.l.b(this, (k) h0Var.getValue());
        }
    }
}
