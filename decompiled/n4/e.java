package n4;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import b3.r;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n3.t;
import o.m;
import o.x;
import p1.e0;
import p1.f0;
import p4.w;
import s.i0;
import u8.p;
import y1.h0;
import y1.q;
import y1.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements x, q0, y8.g, j2.a, z4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8776a;

    public /* synthetic */ e(int i7) {
        this.f8776a = i7;
    }

    public e(b1.a aVar) {
        this.f8776a = 15;
    }

    public static final float g(float f10, float[] fArr, float[] fArr2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float fAbs = Math.abs(f10);
        float fSignum = Math.signum(f10);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i7 = -(iBinarySearch + 1);
        int i10 = i7 - 1;
        if (i10 >= fArr.length - 1) {
            float f15 = fArr[fArr.length - 1];
            float f16 = fArr2[fArr.length - 1];
            if (f15 == 0.0f) {
                return 0.0f;
            }
            return (f16 / f15) * f10;
        }
        if (i10 == -1) {
            float f17 = fArr[0];
            f13 = fArr2[0];
            f14 = f17;
            f12 = 0.0f;
            f11 = 0.0f;
        } else {
            float f18 = fArr[i10];
            float f19 = fArr[i7];
            f11 = fArr2[i10];
            f12 = f18;
            f13 = fArr2[i7];
            f14 = f19;
        }
        return (((f13 - f11) * Math.max(0.0f, Math.min(1.0f, f12 == f14 ? 0.0f : (fAbs - f12) / (f14 - f12)))) + f11) * fSignum;
    }

    public static p1.f h() {
        return (p1.f) p1.l.f10056b.y();
    }

    public static long i(float f10, float f11, float f12, float f13, int i7) {
        int i10 = q.f14959n;
        if ((i7 & 8) != 0) {
            f13 = 1.0f;
        }
        z1.q qVar = z1.d.f15625e;
        if (0.0f > f10 || f10 > 360.0f || 0.0f > f11 || f11 > 1.0f || 0.0f > f12 || f12 > 1.0f) {
            y.a("HSV (" + f10 + ", " + f11 + ", " + f12 + ") must be in range (0..360, 0..1, 0..1)");
        }
        return h0.b(j(f10, f11, f12, 5), j(f10, f11, f12, 3), j(f10, f11, f12, 1), f13, qVar);
    }

    public static float j(float f10, float f11, float f12, int i7) {
        float f13 = ((f10 / 60.0f) + i7) % 6.0f;
        return f12 - (Math.max(0.0f, Math.min(f13, Math.min(4 - f13, 1.0f))) * (f11 * f12));
    }

    public static p1.f k(p1.f fVar) {
        if (fVar instanceof e0) {
            e0 e0Var = (e0) fVar;
            if (e0Var.f10029t == n1.h.b()) {
                e0Var.f10027r = null;
                return fVar;
            }
        }
        if (fVar instanceof f0) {
            f0 f0Var = (f0) fVar;
            if (f0Var.f10038i == n1.h.b()) {
                f0Var.f10037h = null;
                return fVar;
            }
        }
        p1.f fVarH = p1.l.h(fVar, null, false);
        fVarH.j();
        return fVarH;
    }

    public static Object m(h9.a aVar, h9.k kVar) {
        p1.f e0Var;
        if (kVar == null) {
            return aVar.invoke();
        }
        p1.f fVar = (p1.f) p1.l.f10056b.y();
        if (fVar instanceof e0) {
            e0 e0Var2 = (e0) fVar;
            if (e0Var2.f10029t == n1.h.b()) {
                h9.k kVar2 = e0Var2.f10027r;
                h9.k kVar3 = e0Var2.f10028s;
                try {
                    ((e0) fVar).f10027r = p1.l.l(kVar, kVar2, true);
                    ((e0) fVar).f10028s = kVar3;
                    return aVar.invoke();
                } finally {
                    e0Var2.f10027r = kVar2;
                    e0Var2.f10028s = kVar3;
                }
            }
        }
        if (fVar == null || (fVar instanceof p1.b)) {
            e0Var = new e0(fVar instanceof p1.b ? (p1.b) fVar : null, kVar, null, true, false);
        } else {
            if (kVar == null) {
                return aVar.invoke();
            }
            e0Var = fVar.u(kVar);
        }
        try {
            p1.f fVarJ = e0Var.j();
            try {
                Object objInvoke = aVar.invoke();
                p1.f.q(fVarJ);
                e0Var.c();
                return objInvoke;
            } catch (Throwable th) {
                p1.f.q(fVarJ);
                throw th;
            }
        } catch (Throwable th2) {
            e0Var.c();
            throw th2;
        }
    }

    private final void n() {
    }

    private final void p(int i7, Object obj) {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    public static g4.e q(b3.a aVar) {
        p1.l.f(p1.l.f10055a);
        synchronized (p1.l.f10057c) {
            p1.l.f10062h = p.y0(p1.l.f10062h, aVar);
        }
        return new g4.e(aVar);
    }

    public static void r(p1.f fVar, p1.f fVar2, h9.k kVar) {
        if (fVar != fVar2) {
            fVar2.getClass();
            p1.f.q(fVar);
            fVar2.c();
        } else if (fVar instanceof e0) {
            ((e0) fVar).f10027r = kVar;
        } else if (fVar instanceof f0) {
            ((f0) fVar).f10037h = kVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + fVar).toString());
        }
    }

    public static void s() {
        boolean z10;
        synchronized (p1.l.f10057c) {
            i0 i0Var = p1.l.f10064j.f10004h;
            z10 = false;
            if (i0Var != null && i0Var.h()) {
                z10 = true;
            }
        }
        if (z10) {
            p1.l.a();
        }
    }

    @Override // j2.a
    public /* synthetic */ long G(int i7, long j5) {
        return 0L;
    }

    @Override // o.x
    public boolean J(m mVar) {
        return false;
    }

    @Override // androidx.lifecycle.q0
    public o0 a(Class cls) {
        switch (this.f8776a) {
            case 7:
                return new w(true);
            default:
                return new w4.a();
        }
    }

    @Override // o.x
    public void b(m mVar, boolean z10) {
    }

    @Override // androidx.lifecycle.q0
    public o0 c(Class cls, u4.c cVar) {
        switch (this.f8776a) {
            case 7:
                break;
        }
        return a(cls);
    }

    @Override // z4.d
    public void d() {
        switch (this.f8776a) {
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // z4.d
    public void e(int i7, Object obj) {
        String str;
        switch (this.f8776a) {
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                break;
            default:
                switch (i7) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i7 == 6 || i7 == 7 || i7 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // androidx.lifecycle.q0
    public o0 f(o9.c cVar, u4.c cVar2) {
        switch (this.f8776a) {
        }
        return c(g5.a.L(cVar), cVar2);
    }

    @Override // j2.a
    public /* synthetic */ long f0(long j5, long j10, int i7) {
        return 0L;
    }

    @Override // j2.a
    public Object l(long j5, long j10, y8.c cVar) {
        return new t(0L);
    }

    public void o(Activity activity, ArrayList arrayList, e6.f fVar, e eVar, o6.a aVar) {
        r rVar = new r(activity, arrayList, fVar, this, eVar, aVar);
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int i7 = 0;
        while (true) {
            ArrayList arrayList4 = null;
            if (i7 >= arrayList.size()) {
                break;
            }
            z6.a aVar2 = (z6.a) arrayList.get(i7);
            if (!d7.a.e(arrayList3, aVar2)) {
                arrayList3.add(aVar2);
                if (aVar2.z(activity) && !aVar2.v(activity, true)) {
                    if (aVar2.l(activity) == 2) {
                        arrayList2.add(d7.a.b(aVar2));
                    } else {
                        String strM = aVar2.m();
                        if (TextUtils.isEmpty(strM)) {
                            arrayList2.add(d7.a.b(aVar2));
                        } else {
                            ArrayList arrayList5 = null;
                            for (int i10 = i7; i10 < arrayList.size(); i10++) {
                                z6.a aVar3 = (z6.a) arrayList.get(i10);
                                if (d7.a.f(aVar3.m(), strM) && aVar3.z(activity) && !aVar3.v(activity, true)) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(aVar3);
                                    if (!d7.a.e(arrayList3, aVar3)) {
                                        arrayList3.add(aVar3);
                                    }
                                }
                            }
                            if (arrayList5 != null && !arrayList5.isEmpty() && !d7.a.u(activity, arrayList5)) {
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    z6.a aVar4 = (z6.a) it.next();
                                    if (aVar4.r(activity)) {
                                        it.remove();
                                        arrayList4 = new ArrayList();
                                        arrayList4.add(aVar4);
                                        break;
                                    }
                                }
                                if (!arrayList5.isEmpty()) {
                                    arrayList2.add(arrayList5);
                                }
                                if (arrayList4 != null && !arrayList4.isEmpty()) {
                                    arrayList2.add(arrayList4);
                                }
                            }
                        }
                    }
                }
            }
            i7++;
        }
        if (arrayList2.isEmpty()) {
            rVar.o();
            return;
        }
        Iterator it2 = arrayList2.iterator();
        List list = null;
        while (it2.hasNext() && (list == null || list.isEmpty())) {
            list = (List) it2.next();
        }
        if (list == null || list.isEmpty()) {
            rVar.o();
            return;
        }
        Activity activity2 = (Activity) rVar.f1433b;
        e6.f fVar2 = (e6.f) rVar.f1434c;
        e eVar2 = (e) rVar.f1435d;
        HashMap map = u6.a.f13070a;
        synchronized (u6.a.class) {
            try {
                if (activity2.getRequestedOrientation() == -1) {
                    try {
                        int i11 = activity2.getResources().getConfiguration().orientation;
                        if (i11 == 1) {
                            int i12 = u6.a.a(activity2) ? 9 : 1;
                            activity2.setRequestedOrientation(i12);
                            u6.a.f13070a.put(Integer.valueOf(activity2.hashCode()), Integer.valueOf(i12));
                        } else if (i11 == 2) {
                            int i13 = u6.a.a(activity2) ? 8 : 0;
                            activity2.setRequestedOrientation(i13);
                            u6.a.f13070a.put(Integer.valueOf(activity2.hashCode()), Integer.valueOf(i13));
                        }
                    } catch (IllegalStateException e7) {
                        e7.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        r.r(activity2, list, fVar2, eVar2, new p6.e(rVar, it2, activity2, fVar2, eVar2));
    }

    public String toString() {
        switch (this.f8776a) {
            case 8:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // j2.a
    public Object u(long j5, y8.c cVar) {
        return new t(0L);
    }
}
