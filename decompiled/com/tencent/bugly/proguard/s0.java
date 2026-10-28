package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.bugly.CrashModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f3493c;

    public /* synthetic */ s0(u uVar, int i7, int i10) {
        this.f3491a = i10;
        this.f3493c = uVar;
        this.f3492b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar;
        switch (this.f3491a) {
            case 0:
                Integer numValueOf = Integer.valueOf(CrashModule.MODULE_ID);
                u uVar = this.f3493c;
                try {
                    if (!TextUtils.isEmpty(uVar.f3509d)) {
                        List<t> listD = uVar.d(CrashModule.MODULE_ID);
                        if (listD == null) {
                            listD = new ArrayList();
                        }
                        if (uVar.f3510e.get(numValueOf) == null) {
                            uVar.f3510e.put(numValueOf, new HashMap());
                        }
                        Object obj = ((Map) uVar.f3510e.get(numValueOf)).get(uVar.f3509d);
                        int i7 = this.f3492b;
                        if (obj == null) {
                            tVar = new t();
                            tVar.f3494a = CrashModule.MODULE_ID;
                            tVar.f3500g = u.f3506a;
                            tVar.f3495b = uVar.f3509d;
                            tVar.f3499f = aa.b().f3064o;
                            tVar.f3498e = aa.b().f3058h;
                            tVar.f3496c = System.currentTimeMillis();
                            tVar.f3497d = i7;
                            ((Map) uVar.f3510e.get(numValueOf)).put(uVar.f3509d, tVar);
                        } else {
                            tVar = (t) ((Map) uVar.f3510e.get(numValueOf)).get(uVar.f3509d);
                            tVar.f3497d = i7;
                        }
                        ArrayList arrayList = new ArrayList();
                        boolean z10 = false;
                        for (t tVar2 : listD) {
                            if (u.a(tVar2, tVar)) {
                                tVar2.f3497d = tVar.f3497d;
                                z10 = true;
                            }
                            if (u.b(tVar2, tVar)) {
                                arrayList.add(tVar2);
                            }
                        }
                        listD.removeAll(arrayList);
                        if (!z10) {
                            listD.add(tVar);
                        }
                        uVar.a(CrashModule.MODULE_ID, listD);
                    }
                } catch (Exception unused) {
                    al.e("saveCrashRecord failed", new Object[0]);
                    return;
                }
                break;
            default:
                u uVar2 = this.f3493c;
                int i10 = this.f3492b;
                boolean zC = uVar2.c(i10);
                uVar2.f3511f.edit().putBoolean(i10 + "_" + uVar2.f3509d, !zC).commit();
                break;
        }
    }
}
