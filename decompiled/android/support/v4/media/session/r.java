package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.widget.EditText;
import b3.g0;
import b3.q0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.proguard.ah;
import com.tencent.bugly.proguard.al;
import f1.y1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import nb.a0;
import nb.f0;
import nb.m0;
import nb.n0;
import nb.p0;
import nb.w;
import nb.w0;
import nb.x0;
import ra.a1;
import ra.i0;
import ra.s0;
import s.c0;
import s.l0;
import t8.z;
import x9.r0;
import x9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r implements ah, fc.d, jb.a, jb.c, jb.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f602d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f605c;

    public r(int i7) {
        this.f603a = i7;
        switch (i7) {
            case 6:
                this.f604b = new kb.d(21);
                this.f605c = new s.s(16);
                break;
            case 24:
                File file = new File(System.getProperty("java.io.tmpdir"));
                this.f604b = file;
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f605c = new ArrayList();
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                this.f604b = new l2.c(0);
                this.f605c = new l2.c(0);
                break;
            default:
                this.f604b = new LinkedHashMap();
                this.f605c = new LinkedHashMap();
                break;
        }
    }

    public /* synthetic */ r(int i7, Object obj) {
        this.f603a = i7;
        this.f604b = obj;
    }

    public /* synthetic */ r(int i7, Object obj, Object obj2) {
        this.f603a = i7;
        this.f604b = obj;
        this.f605c = obj2;
    }

    public /* synthetic */ r(int i7, boolean z10) {
        this.f603a = i7;
    }

    public r(Context context) {
        ComponentName componentName;
        this.f603a = 0;
        this.f605c = new ArrayList();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty("MediaSession")) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        int i7 = y4.a.f15095a;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        PendingIntent broadcast = null;
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (listQueryBroadcastReceivers.size() > 1) {
                Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = null;
        }
        if (componentName == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            broadcast = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE : 0);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f604b = new p(context);
        } else if (i10 >= 28) {
            this.f604b = new o(context);
        } else if (i10 >= 22) {
            this.f604b = new n(context);
        } else {
            this.f604b = new m(context);
        }
        J(new h(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        ((m) this.f604b).f592a.setMediaButtonReceiver(broadcast);
        MediaSessionCompat$Token mediaSessionCompat$Token = ((m) this.f604b).f594c;
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        Collections.synchronizedSet(new HashSet());
        if (i10 >= 29) {
            new g(context, mediaSessionCompat$Token);
        } else {
            new f(context, mediaSessionCompat$Token);
        }
        if (f602d == 0) {
            f602d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public r(WindowInsetsAnimation.Bounds bounds) {
        this.f603a = 5;
        this.f604b = x3.b.c(bounds.getLowerBound());
        this.f605c = x3.b.c(bounds.getUpperBound());
    }

    public r(EditText editText) {
        this.f603a = 17;
        this.f604b = editText;
        n4.k kVar = new n4.k(editText);
        this.f605c = kVar;
        editText.addTextChangedListener(kVar);
        if (n4.a.f8768b == null) {
            synchronized (n4.a.f8767a) {
                try {
                    if (n4.a.f8768b == null) {
                        n4.a aVar = new n4.a();
                        try {
                            n4.a.f8769c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, n4.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        n4.a.f8768b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(n4.a.f8768b);
    }

    public r(com.tencent.bugly.proguard.r rVar, List list) {
        this.f603a = 3;
        this.f605c = rVar;
        this.f604b = list;
    }

    public r(h0.t tVar) {
        this.f603a = 11;
        this.f604b = tVar;
        c0 c0Var = l0.f12469a;
        this.f605c = new c0();
    }

    public r(h6.a aVar, int[] iArr) {
        this.f603a = 12;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f604b = aVar;
        int length = iArr.length;
        int i7 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f605c = iArr;
            return;
        }
        while (i7 < length && iArr[i7] == 0) {
            i7++;
        }
        if (i7 == length) {
            this.f605c = new int[]{0};
            return;
        }
        int i10 = length - i7;
        int[] iArr2 = new int[i10];
        this.f605c = iArr2;
        System.arraycopy(iArr, i7, iArr2, 0, i10);
    }

    public r(h9.k kVar) {
        this.f603a = 23;
        this.f604b = kVar;
        this.f605c = new ConcurrentHashMap();
    }

    public r(la.e eVar) {
        this.f603a = 18;
        mb.k kVar = new mb.k("Type parameter upper bound erasure results");
        this.f604b = t8.a.d(new aa.e(21, this));
        this.f605c = kVar.b(new aa.a(23, this));
    }

    public r(n4.e eVar, Activity activity, List list, Runnable runnable) {
        this.f603a = 20;
        this.f604b = eVar;
        this.f605c = runnable;
    }

    public r(oa.q qVar, String str) {
        this.f603a = 19;
        i9.l.e(str, "className");
        this.f605c = qVar;
        this.f604b = str;
    }

    public r(y yVar, da.a aVar, ib.a aVar2) {
        this.f603a = 13;
        i9.l.e(yVar, "module");
        i9.l.e(aVar2, "protocol");
        this.f604b = aVar2;
        this.f605c = new u0.k(yVar, aVar);
    }

    public r(xa.k kVar) {
        this.f603a = 26;
        Iterator it = ((s.a) kVar.f14795a.f14789a.entrySet()).iterator();
        this.f604b = it;
        if (it.hasNext()) {
            this.f605c = (Map.Entry) it.next();
        }
    }

    public static Bundle O(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        t(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void t(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(r.class.getClassLoader());
        }
    }

    public w A(r0 r0Var, la.a aVar) {
        i9.l.e(r0Var, "typeParameter");
        i9.l.e(aVar, "typeAttr");
        return (w) ((mb.e) this.f605c).invoke(new m0(r0Var, aVar));
    }

    public a5.d B() {
        a5.d dVar;
        c5.a aVar = (c5.a) this.f604b;
        synchronized (aVar.f2427c) {
            Iterator it = aVar.f2428d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                a5.d dVar2 = (a5.d) entry.getValue();
                if (i9.l.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public boolean C() {
        return ((int[]) this.f605c)[0] == 0;
    }

    public y9.c D(ra.h hVar, ta.f fVar) {
        i9.l.e(hVar, "proto");
        i9.l.e(fVar, "nameResolver");
        return ((u0.k) this.f605c).C0(hVar, fVar);
    }

    public r E(int i7) {
        int[] iArr = (int[]) this.f605c;
        h6.a aVar = (h6.a) this.f604b;
        if (i7 == 0) {
            return aVar.f6440c;
        }
        if (i7 == 1) {
            return this;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = aVar.c(iArr[i10], i7);
        }
        return new r(aVar, iArr2);
    }

    public r F(r rVar) {
        h6.a aVar = (h6.a) this.f604b;
        if (!aVar.equals((h6.a) rVar.f604b)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (C() || rVar.C()) {
            return aVar.f6440c;
        }
        int[] iArr = (int[]) this.f605c;
        int length = iArr.length;
        int[] iArr2 = (int[]) rVar.f605c;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = iArr[i7];
            for (int i11 = 0; i11 < length2; i11++) {
                int i12 = i7 + i11;
                iArr3[i12] = aVar.a(iArr3[i12], aVar.c(i10, iArr2[i11]));
            }
        }
        return new r(aVar, iArr3);
    }

    public AutofillId G(long j5) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionI = f4.c.i(this.f604b);
        f4.e eVarK0 = n3.n.k0((View) this.f605c);
        Objects.requireNonNull(eVarK0);
        return u2.a.b(contentCaptureSessionI, s1.i.f(eVarK0.f5285a), j5);
    }

    public void H(String str, a5.d dVar) {
        i9.l.e(dVar, "provider");
        c5.a aVar = (c5.a) this.f604b;
        synchronized (aVar.f2427c) {
            if (aVar.f2428d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aVar.f2428d.put(str, dVar);
        }
    }

    public void I() {
        if (!((c5.a) this.f604b).f2432h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a5.a aVar = (a5.a) this.f605c;
        if (aVar == null) {
            aVar = new a5.a(this);
        }
        this.f605c = aVar;
        try {
            androidx.lifecycle.k.class.getDeclaredConstructor(null);
            a5.a aVar2 = (a5.a) this.f605c;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f40b).add(androidx.lifecycle.k.class.getName());
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + androidx.lifecycle.k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }

    public void J(k kVar, Handler handler) {
        m mVar = (m) this.f604b;
        if (kVar == null) {
            mVar.e(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        mVar.e(kVar, handler);
    }

    public float K(int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 1;
        boolean z10 = Math.abs(i12 - i10) > Math.abs(i11 - i7);
        if (z10) {
            i14 = i7;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i7;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int iAbs = Math.abs(i15 - i13);
        int iAbs2 = Math.abs(i16 - i14);
        int i18 = (-iAbs) / 2;
        int i19 = i13 < i15 ? 1 : -1;
        int i20 = i14 < i16 ? 1 : -1;
        int i21 = i15 + i19;
        int i22 = i13;
        int i23 = i14;
        int i24 = 0;
        while (i22 != i21) {
            boolean z11 = z10;
            int i25 = iAbs;
            if ((i24 == i17) == ((t5.b) this.f604b).b(z10 ? i23 : i22, z10 ? i22 : i23)) {
                if (i24 == 2) {
                    return n3.r.x(i22, i23, i13, i14);
                }
                i24++;
            }
            i18 += iAbs2;
            if (i18 > 0) {
                if (i23 == i16) {
                    break;
                }
                i23 += i20;
                i18 -= i25;
            }
            i22 += i19;
            iAbs = i25;
            z10 = z11;
            i17 = 1;
        }
        if (i24 == 2) {
            return n3.r.x(i21, i16, i13, i14);
        }
        return Float.NaN;
    }

    public float L(int i7, int i10, int i11, int i12) {
        float f10;
        float f11;
        t5.b bVar = (t5.b) this.f604b;
        float fK = K(i7, i10, i11, i12);
        int i13 = i7 - (i11 - i7);
        int i14 = 0;
        if (i13 < 0) {
            f10 = i7 / (i7 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.f12761a;
            if (i13 >= i15) {
                float f12 = ((i15 - 1) - i7) / (i13 - i7);
                int i16 = i15 - 1;
                f10 = f12;
                i13 = i16;
            } else {
                f10 = 1.0f;
            }
        }
        float f13 = i10;
        int i17 = (int) (f13 - ((i12 - i10) * f10));
        if (i17 < 0) {
            f11 = f13 / (i10 - i17);
        } else {
            int i18 = bVar.f12762b;
            if (i17 >= i18) {
                f11 = ((i18 - 1) - i10) / (i17 - i10);
                i14 = i18 - 1;
            } else {
                i14 = i17;
                f11 = 1.0f;
            }
        }
        return (K(i7, i10, (int) (((i13 - i7) * f11) + i7), i14) + fK) - 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b5  */
    public v8.g M(nb.r0 r0Var, List list, la.a aVar) {
        w0 w0VarQ;
        v8.g gVar = new v8.g(new v8.e());
        Iterator it = list.iterator();
        if (it.hasNext()) {
            w wVar = (w) it.next();
            x9.h hVarL = wVar.D0().l();
            if (hVarL instanceof x9.e) {
                Set set = aVar.f8287e;
                w0 w0VarG0 = wVar.G0();
                if (w0VarG0 instanceof nb.p) {
                    nb.p pVar = (nb.p) w0VarG0;
                    a0 a0VarQ = pVar.f9023b;
                    if (!a0VarQ.D0().n().isEmpty() && a0VarQ.D0().l() != null) {
                        List<r0> listN = a0VarQ.D0().n();
                        i9.l.d(listN, "getParameters(...)");
                        ArrayList arrayList = new ArrayList(u8.q.a0(listN, 10));
                        for (r0 r0Var2 : listN) {
                            n0 f0Var = (n0) u8.p.n0(r0Var2.getIndex(), wVar.B0());
                            boolean z10 = set != null && set.contains(r0Var2);
                            if (f0Var == null || z10) {
                                f0Var = new f0(r0Var2);
                            } else {
                                p0 p0VarF = r0Var.f();
                                w wVarB = f0Var.b();
                                i9.l.d(wVarB, "getType(...)");
                                if (p0VarF.d(wVarB) == null) {
                                    f0Var = new f0(r0Var2);
                                }
                            }
                            arrayList.add(f0Var);
                        }
                        a0VarQ = nb.c.q(a0VarQ, arrayList, null, 2);
                    }
                    a0 a0VarQ2 = pVar.f9024c;
                    if (!a0VarQ2.D0().n().isEmpty() && a0VarQ2.D0().l() != null) {
                        List<r0> listN2 = a0VarQ2.D0().n();
                        i9.l.d(listN2, "getParameters(...)");
                        ArrayList arrayList2 = new ArrayList(u8.q.a0(listN2, 10));
                        for (r0 r0Var3 : listN2) {
                            n0 f0Var2 = (n0) u8.p.n0(r0Var3.getIndex(), wVar.B0());
                            boolean z11 = set != null && set.contains(r0Var3);
                            if (f0Var2 == null || z11) {
                                f0Var2 = new f0(r0Var3);
                            } else {
                                p0 p0VarF2 = r0Var.f();
                                w wVarB2 = f0Var2.b();
                                i9.l.d(wVarB2, "getType(...)");
                                if (p0VarF2.d(wVarB2) == null) {
                                    f0Var2 = new f0(r0Var3);
                                }
                            }
                            arrayList2.add(f0Var2);
                        }
                        a0VarQ2 = nb.c.q(a0VarQ2, arrayList2, null, 2);
                    }
                    w0VarQ = nb.c.e(a0VarQ, a0VarQ2);
                } else {
                    if (!(w0VarG0 instanceof a0)) {
                        throw new cc.s();
                    }
                    a0 a0Var = (a0) w0VarG0;
                    if (a0Var.D0().n().isEmpty() || a0Var.D0().l() == null) {
                        w0VarQ = a0Var;
                    } else {
                        List<r0> listN3 = a0Var.D0().n();
                        i9.l.d(listN3, "getParameters(...)");
                        ArrayList arrayList3 = new ArrayList(u8.q.a0(listN3, 10));
                        for (r0 r0Var4 : listN3) {
                            n0 f0Var3 = (n0) u8.p.n0(r0Var4.getIndex(), wVar.B0());
                            boolean z12 = set != null && set.contains(r0Var4);
                            if (f0Var3 == null || z12) {
                                f0Var3 = new f0(r0Var4);
                            } else {
                                p0 p0VarF3 = r0Var.f();
                                w wVarB3 = f0Var3.b();
                                i9.l.d(wVarB3, "getType(...)");
                                if (p0VarF3.d(wVarB3) == null) {
                                    f0Var3 = new f0(r0Var4);
                                }
                            }
                            arrayList3.add(f0Var3);
                        }
                        w0VarQ = nb.c.q(a0Var, arrayList3, null, 2);
                    }
                }
                gVar.add(r0Var.g(nb.c.h(w0VarQ, w0VarG0), x0.OUT_VARIANCE));
            } else if (hVarL instanceof r0) {
                Set set2 = aVar.f8287e;
                if (set2 == null || !set2.contains(hVarL)) {
                    List upperBounds = ((r0) hVarL).getUpperBounds();
                    i9.l.d(upperBounds, "getUpperBounds(...)");
                    gVar.addAll(M(r0Var, upperBounds, aVar));
                } else {
                    gVar.add(y(aVar));
                }
            }
        }
        v8.e eVar = gVar.f13683a;
        eVar.b();
        return eVar.f13676i > 0 ? gVar : v8.g.f13682b;
    }

    public r N(r rVar) {
        if (!((h6.a) this.f604b).equals((h6.a) rVar.f604b)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (rVar.C()) {
            return this;
        }
        h6.a aVar = (h6.a) rVar.f604b;
        int[] iArr = (int[]) rVar.f605c;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = iArr[i7];
            aVar.getClass();
            iArr2[i7] = (929 - i10) % 929;
        }
        return o(new r(aVar, iArr2));
    }

    public void P(int i7, d3.e eVar) throws IOException {
        Iterator it = (Iterator) this.f604b;
        while (true) {
            Map.Entry entry = (Map.Entry) this.f605c;
            if (entry == null || ((xa.l) entry.getKey()).f14796a >= i7) {
                return;
            }
            xa.l lVar = (xa.l) ((Map.Entry) this.f605c).getKey();
            Object value = ((Map.Entry) this.f605c).getValue();
            xa.h hVar = xa.h.f14788c;
            xa.m0 m0Var = lVar.f14797b;
            int i10 = lVar.f14796a;
            if (lVar.f14798c) {
                for (Object obj : (List) value) {
                    if (m0Var == xa.m0.f14806e) {
                        eVar.L(i10, 3);
                        ((xa.a) obj).d(eVar);
                        eVar.L(i10, 4);
                    } else {
                        eVar.L(i10, m0Var.f14811b);
                        xa.h.k(eVar, m0Var, obj);
                    }
                }
            } else if (m0Var == xa.m0.f14806e) {
                eVar.L(i10, 3);
                ((xa.a) value).d(eVar);
                eVar.L(i10, 4);
            } else {
                eVar.L(i10, m0Var.f14811b);
                xa.h.k(eVar, m0Var, value);
            }
            if (it.hasNext()) {
                this.f605c = (Map.Entry) it.next();
            } else {
                this.f605c = null;
            }
        }
    }

    @Override // jb.c
    public ArrayList a(s0 s0Var, ta.f fVar) {
        i9.l.e(s0Var, "proto");
        i9.l.e(fVar, "nameResolver");
        Iterable iterable = (List) s0Var.i(((ib.a) this.f604b).k);
        if (iterable == null) {
            iterable = u8.w.f13122a;
        }
        ArrayList arrayList = new ArrayList(u8.q.a0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(D((ra.h) it.next(), fVar));
        }
        return arrayList;
    }

    @Override // com.tencent.bugly.proguard.ah
    public void a(boolean z10, String str) {
        if (z10) {
            al.c("[UserInfo] Successfully uploaded user info.", new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (UserInfoBean userInfoBean : (List) this.f604b) {
                userInfoBean.f2956f = jCurrentTimeMillis;
                ((com.tencent.bugly.proguard.r) this.f605c).a(userInfoBean, true);
            }
        }
    }

    @Override // jb.c
    public List b(jb.w wVar, i0 i0Var) {
        i9.l.e(i0Var, "proto");
        ((ib.a) this.f604b).getClass();
        u8.w wVar2 = u8.w.f13122a;
        ArrayList arrayList = new ArrayList(u8.q.a0(wVar2, 10));
        Iterator<E> it = wVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(D((ra.h) it.next(), wVar.f7084a));
        }
        return arrayList;
    }

    @Override // jb.a
    public Object c(jb.w wVar, i0 i0Var, w wVar2) {
        i9.l.e(i0Var, "proto");
        return null;
    }

    @Override // jb.c
    public List d(jb.w wVar, i0 i0Var) {
        i9.l.e(i0Var, "proto");
        ((ib.a) this.f604b).getClass();
        u8.w wVar2 = u8.w.f13122a;
        ArrayList arrayList = new ArrayList(u8.q.a0(wVar2, 10));
        Iterator<E> it = wVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(D((ra.h) it.next(), wVar.f7084a));
        }
        return arrayList;
    }

    @Override // jb.c
    public List e(jb.w wVar, xa.a aVar, int i7) {
        String str;
        ib.a aVar2 = (ib.a) this.f604b;
        i9.l.e(aVar, "proto");
        a2.f.M(i7, "kind");
        if (aVar instanceof ra.a0) {
            aVar2.getClass();
        } else {
            if (!(aVar instanceof i0)) {
                throw new IllegalStateException(("Unknown message: " + aVar).toString());
            }
            int iB = e1.d.b(i7);
            if (iB != 1 && iB != 2 && iB != 3) {
                if (i7 == 1) {
                    str = "FUNCTION";
                } else if (i7 == 2) {
                    str = "PROPERTY";
                } else if (i7 != 3) {
                    str = i7 != 4 ? "null" : "PROPERTY_SETTER";
                } else {
                    str = "PROPERTY_GETTER";
                }
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(str).toString());
            }
            aVar2.getClass();
        }
        u8.w wVar2 = u8.w.f13122a;
        ArrayList arrayList = new ArrayList(u8.q.a0(wVar2, 10));
        Iterator<E> it = wVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(D((ra.h) it.next(), wVar.f7084a));
        }
        return arrayList;
    }

    @Override // jb.c
    public ArrayList f(ra.x0 x0Var, ta.f fVar) {
        i9.l.e(x0Var, "proto");
        i9.l.e(fVar, "nameResolver");
        Iterable iterable = (List) x0Var.i(((ib.a) this.f604b).f6700l);
        if (iterable == null) {
            iterable = u8.w.f13122a;
        }
        ArrayList arrayList = new ArrayList(u8.q.a0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(D((ra.h) it.next(), fVar));
        }
        return arrayList;
    }

    @Override // jb.c
    public List h(jb.w wVar, ra.v vVar) {
        i9.l.e(wVar, "container");
        Iterable iterable = (List) vVar.i(((ib.a) this.f604b).f6697h);
        if (iterable == null) {
            iterable = u8.w.f13122a;
        }
        ArrayList arrayList = new ArrayList(u8.q.a0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(D((ra.h) it.next(), wVar.f7084a));
        }
        return arrayList;
    }

    @Override // jb.a
    public Object i(jb.w wVar, i0 i0Var, w wVar2) {
        i9.l.e(i0Var, "proto");
        ra.e eVar = (ra.e) n3.n.n0(i0Var, ((ib.a) this.f604b).f6698i);
        if (eVar == null) {
            return null;
        }
        return ((u0.k) this.f605c).d1(wVar2, eVar, wVar.f7084a);
    }

    @Override // jb.e
    public jb.d j(wa.b bVar) {
        i9.l.e(bVar, "classId");
        ca.b bVar2 = (ca.b) this.f604b;
        pa.e eVar = (pa.e) this.f605c;
        eVar.c().f7020c.getClass();
        ca.c cVarY = n3.u.y(bVar2, bVar, ta.e.f12885g);
        if (cVarY == null) {
            return null;
        }
        da.d.a(cVarY.f2576a).equals(bVar);
        return eVar.g(cVarY);
    }

    @Override // jb.c
    public ArrayList k(jb.u uVar) {
        i9.l.e(uVar, "container");
        Iterable iterable = (List) uVar.f7078d.i(((ib.a) this.f604b).f6692c);
        if (iterable == null) {
            iterable = u8.w.f13122a;
        }
        ArrayList arrayList = new ArrayList(u8.q.a0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(D((ra.h) it.next(), uVar.f7084a));
        }
        return arrayList;
    }

    @Override // fc.d
    public Object l(fc.e eVar, y8.c cVar) {
        Object objL = ((gc.k) this.f604b).l(new fc.m(new i9.t(), eVar, (y1) this.f605c), cVar);
        return objL == z8.a.f15774a ? objL : z.f12851a;
    }

    @Override // jb.c
    public List m(jb.w wVar, xa.a aVar, int i7, int i10, a1 a1Var) {
        i9.l.e(aVar, "callableProto");
        a2.f.M(i7, "kind");
        Iterable iterable = (List) a1Var.i(((ib.a) this.f604b).f6699j);
        if (iterable == null) {
            iterable = u8.w.f13122a;
        }
        ArrayList arrayList = new ArrayList(u8.q.a0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(D((ra.h) it.next(), wVar.f7084a));
        }
        return arrayList;
    }

    @Override // jb.c
    public List n(jb.w wVar, xa.a aVar, int i7) {
        List list;
        ib.a aVar2 = (ib.a) this.f604b;
        i9.l.e(aVar, "proto");
        a2.f.M(i7, "kind");
        if (aVar instanceof ra.n) {
            list = (List) ((ra.n) aVar).i(aVar2.f6691b);
        } else if (aVar instanceof ra.a0) {
            list = (List) ((ra.a0) aVar).i(aVar2.f6693d);
        } else {
            if (!(aVar instanceof i0)) {
                throw new IllegalStateException(("Unknown message: " + aVar).toString());
            }
            int iB = e1.d.b(i7);
            if (iB == 1) {
                list = (List) ((i0) aVar).i(aVar2.f6694e);
            } else if (iB == 2) {
                list = (List) ((i0) aVar).i(aVar2.f6695f);
            } else {
                if (iB != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((i0) aVar).i(aVar2.f6696g);
            }
        }
        if (list == null) {
            list = u8.w.f13122a;
        }
        ArrayList arrayList = new ArrayList(u8.q.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(D((ra.h) it.next(), wVar.f7084a));
        }
        return arrayList;
    }

    public r o(r rVar) {
        h6.a aVar = (h6.a) this.f604b;
        if (!aVar.equals((h6.a) rVar.f604b)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (C()) {
            return rVar;
        }
        if (rVar.C()) {
            return this;
        }
        int[] iArr = (int[]) this.f605c;
        int[] iArr2 = (int[]) rVar.f605c;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i7 = length; i7 < iArr.length; i7++) {
            iArr3[i7] = aVar.a(iArr2[i7 - length], iArr[i7]);
        }
        return new r(aVar, iArr3);
    }

    public g3.w p(List list) throws IOException {
        g3.g gVar = null;
        try {
            int size = list.size();
            int i7 = 0;
            g3.g gVar2 = null;
            while (i7 < size) {
                try {
                    g3.g gVar3 = (g3.g) list.get(i7);
                    try {
                        gVar3.a((g3.h) this.f605c);
                        i7++;
                        gVar2 = gVar3;
                    } catch (Exception e7) {
                        e = e7;
                        gVar = gVar3;
                        StringBuilder sb2 = new StringBuilder();
                        StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb3.append(((g3.h) this.f605c).f5859a.l());
                        sb3.append(", composition=");
                        sb3.append(((g3.h) this.f605c).c());
                        sb3.append(", selection=");
                        g3.h hVar = (g3.h) this.f605c;
                        sb3.append((Object) q0.h(g0.b(hVar.f5860b, hVar.f5861c)));
                        sb3.append("):");
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        u8.p.p0(list, sb2, "\n", null, null, new c8.k(11, gVar, this), 60);
                        String string = sb2.toString();
                        i9.l.d(string, "toString(...)");
                        throw new RuntimeException(string, e);
                    }
                } catch (Exception e10) {
                    e = e10;
                    gVar = gVar2;
                }
            }
            g3.h hVar2 = (g3.h) this.f605c;
            hVar2.getClass();
            b3.h hVar3 = new b3.h(hVar2.f5859a.toString());
            g3.h hVar4 = (g3.h) this.f605c;
            long jB = g0.b(hVar4.f5860b, hVar4.f5861c);
            q0 q0Var = q0.g(((g3.w) this.f604b).f5890b) ? null : new q0(jB);
            g3.w wVar = new g3.w(hVar3, q0Var != null ? q0Var.f1430a : g0.b(q0.e(jB), q0.f(jB)), ((g3.h) this.f605c).c());
            this.f604b = wVar;
            return wVar;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public float q(l6.c cVar, l6.c cVar2) {
        int i7 = (int) cVar.f8854a;
        int i10 = (int) cVar.f8855b;
        int i11 = (int) cVar2.f8854a;
        int i12 = (int) cVar2.f8855b;
        float fL = L(i7, i10, i11, i12);
        float fL2 = L((int) cVar2.f8854a, i12, (int) cVar.f8854a, i10);
        if (Float.isNaN(fL)) {
            return fL2 / 7.0f;
        }
        return Float.isNaN(fL2) ? fL / 7.0f : (fL + fL2) / 14.0f;
    }

    public void r() {
        ArrayList<s8.e> arrayList = (ArrayList) this.f605c;
        for (s8.e eVar : arrayList) {
            try {
                s8.l.d(eVar.f12608b);
                File file = eVar.f12607a;
                if (!file.delete()) {
                    throw new Exception("could not delete temporary file: " + file.getAbsolutePath());
                }
            } catch (Exception e7) {
                s8.l.f12643g.log(Level.WARNING, "could not delete file ", (Throwable) e7);
            }
        }
        arrayList.clear();
    }

    public Bundle s(String str) {
        i9.l.e(str, "key");
        c5.a aVar = (c5.a) this.f604b;
        if (!aVar.f2431g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = aVar.f2430f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleE = bundle.containsKey(str) ? a.a.E(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            aVar.f2430f = null;
        }
        return bundleE;
    }

    public String toString() {
        switch (this.f603a) {
            case 5:
                return "Bounds{lower=" + ((x3.b) this.f604b) + " upper=" + ((x3.b) this.f605c) + "}";
            case 12:
                StringBuilder sb2 = new StringBuilder(z() * 8);
                for (int iZ = z(); iZ >= 0; iZ--) {
                    int iX = x(iZ);
                    if (iX != 0) {
                        if (iX < 0) {
                            sb2.append(" - ");
                            iX = -iX;
                        } else if (sb2.length() > 0) {
                            sb2.append(" + ");
                        }
                        if (iZ == 0 || iX != 1) {
                            sb2.append(iX);
                        }
                        if (iZ != 0) {
                            if (iZ == 1) {
                                sb2.append('x');
                            } else {
                                sb2.append("x^");
                                sb2.append(iZ);
                            }
                        }
                    }
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public int u(int i7) {
        h6.a aVar = (h6.a) this.f604b;
        int[] iArr = (int[]) this.f605c;
        if (i7 == 0) {
            return x(0);
        }
        if (i7 == 1) {
            int iA = 0;
            for (int i10 : iArr) {
                iA = aVar.a(iA, i10);
            }
            return iA;
        }
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            iA2 = aVar.a(aVar.c(i7, iA2), iArr[i11]);
        }
        return iA2;
    }

    public l6.a v(float f10, int i7, int i10, float f11) throws n5.i {
        l6.a aVarB;
        l6.a aVarB2;
        int i11 = (int) (f11 * f10);
        int iMax = Math.max(0, i7 - i11);
        t5.b bVar = (t5.b) this.f604b;
        int iMin = Math.min(bVar.f12761a - 1, i7 + i11) - iMax;
        float f12 = 3.0f * f10;
        if (iMin < f12) {
            throw n5.i.f8833c;
        }
        int iMax2 = Math.max(0, i10 - i11);
        int iMin2 = Math.min(bVar.f12762b - 1, i10 + i11) - iMax2;
        if (iMin2 < f12) {
            throw n5.i.f8833c;
        }
        t5.b bVar2 = (t5.b) this.f604b;
        l6.b bVar3 = new l6.b(bVar2, iMax, iMax2, iMin, iMin2, f10, (n5.p) this.f605c);
        int i12 = bVar3.f8064e;
        int i13 = bVar3.f8062c;
        int i14 = i12 + i13;
        int i15 = bVar3.f8065f;
        int i16 = (i15 / 2) + bVar3.f8063d;
        int[] iArr = new int[3];
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = ((i17 & 1) == 0 ? (i17 + 1) / 2 : -((i17 + 1) / 2)) + i16;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i19 = i13;
            while (i19 < i14 && !bVar2.b(i19, i18)) {
                i19++;
            }
            int i20 = 0;
            while (i19 < i14) {
                if (!bVar2.b(i19, i18)) {
                    if (i20 == 1) {
                        i20++;
                    }
                    iArr[i20] = iArr[i20] + 1;
                } else if (i20 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i20 != 2) {
                    i20++;
                    iArr[i20] = iArr[i20] + 1;
                } else {
                    if (bVar3.a(iArr) && (aVarB2 = bVar3.b(i18, i19, iArr)) != null) {
                        return aVarB2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i20 = 1;
                }
                i19++;
            }
            if (bVar3.a(iArr) && (aVarB = bVar3.b(i18, i14, iArr)) != null) {
                return aVarB;
            }
        }
        ArrayList arrayList = bVar3.f8061b;
        if (arrayList.isEmpty()) {
            throw n5.i.f8833c;
        }
        return (l6.a) arrayList.get(0);
    }

    public void w(String str, String str2, h9.k kVar) {
        LinkedHashMap linkedHashMap = ((oa.q) this.f605c).f9620a;
        oa.p pVar = new oa.p(this, str, str2);
        kVar.invoke(pVar);
        String str3 = (String) this.f604b;
        ArrayList arrayList = pVar.f9618b;
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((t8.j) it.next()).f12830a);
        }
        String str4 = (String) pVar.f9619c.f12830a;
        i9.l.e(str4, "ret");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('(');
        sb2.append(u8.p.q0(arrayList2, "", null, null, pa.q.f10354a, 30));
        sb2.append(')');
        if (str4.length() > 1) {
            str4 = "L" + str4 + ';';
        }
        sb2.append(str4);
        String string = sb2.toString();
        i9.l.e(str3, "internalName");
        i9.l.e(string, "jvmDescriptor");
        String str5 = str3 + '.' + string;
        oa.t tVar = (oa.t) pVar.f9619c.f12831b;
        ArrayList arrayList3 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((oa.t) ((t8.j) it2.next()).f12831b);
        }
        linkedHashMap.put(str5, new oa.n(tVar, arrayList3, pVar.f9617a));
    }

    public int x(int i7) {
        int[] iArr = (int[]) this.f605c;
        return iArr[(iArr.length - 1) - i7];
    }

    public w0 y(la.a aVar) {
        w0 w0VarI0;
        a0 a0Var = aVar.f8288f;
        return (a0Var == null || (w0VarI0 = n3.n.I0(a0Var)) == null) ? (pb.i) ((t8.o) this.f604b).getValue() : w0VarI0;
    }

    public int z() {
        return ((int[]) this.f605c).length - 1;
    }
}
