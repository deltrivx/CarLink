package x3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import b4.p;
import b4.q;
import c.n;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n3.u;
import o9.e0;
import s.q0;
import s.s;
import u0.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f14570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f14571b;

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    static {
        e0.m("TypefaceCompat static init");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f14570a = new j();
        } else if (i7 >= 28) {
            f14570a = new i();
        } else if (i7 >= 26) {
            f14570a = new h();
        } else if (i7 < 24) {
            f14570a = new f();
        } else {
            Method method = g.f14579f;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f14570a = new g();
            } else {
                f14570a = new f();
            }
        }
        f14571b = new s(16);
        Trace.endSection();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    public static Typeface a(Context context, w3.d dVar, Resources resources, int i7, String str, int i10, int i11, d3.e eVar, boolean z10) {
        Typeface typefaceR;
        Typeface typefaceCreate;
        List listUnmodifiableList;
        int i12 = 6;
        if (dVar instanceof w3.g) {
            w3.g gVar = (w3.g) dVar;
            String str2 = gVar.f14116e;
            Typeface typeface = null;
            int i13 = 0;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (eVar != null) {
                    new Handler(Looper.getMainLooper()).post(new n(i12, eVar, typefaceCreate));
                }
                return typefaceCreate;
            }
            int i14 = 1;
            boolean z11 = !z10 ? eVar != null : gVar.f14115d != 0;
            int i15 = z10 ? gVar.f14114c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            wb.b bVar = new wb.b();
            bVar.f14284a = eVar;
            b4.g gVar2 = gVar.f14113b;
            int i16 = 2;
            if (gVar2 != null) {
                Object[] objArr = {gVar.f14112a, gVar2};
                ArrayList arrayList = new ArrayList(2);
                for (int i17 = 0; i17 < 2; i17++) {
                    Object obj = objArr[i17];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                Object[] objArr2 = {gVar.f14112a};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            p pVar = new p(handler);
            k kVar = new k(i16, bVar, pVar);
            if (!z11) {
                String strA = b4.k.a(i11, listUnmodifiableList);
                Typeface typeface2 = (Typeface) b4.k.f1497a.a(strA);
                if (typeface2 != null) {
                    pVar.execute(new b4.a(i13, bVar, typeface2));
                    typeface = typeface2;
                } else {
                    b4.i iVar = new b4.i(i13, kVar);
                    synchronized (b4.k.f1499c) {
                        try {
                            q0 q0Var = b4.k.f1500d;
                            ArrayList arrayList3 = (ArrayList) q0Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(iVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(iVar);
                                q0Var.put(strA, arrayList4);
                                b4.h hVar = new b4.h(strA, context, listUnmodifiableList, i11, 1);
                                ThreadPoolExecutor threadPoolExecutor = b4.k.f1498b;
                                b4.i iVar2 = new b4.i(i14, strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                q qVar = new q();
                                qVar.f1512b = hVar;
                                qVar.f1513c = iVar2;
                                qVar.f1514d = handler2;
                                threadPoolExecutor.execute(qVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (listUnmodifiableList.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                b4.g gVar3 = (b4.g) listUnmodifiableList.get(0);
                s sVar = b4.k.f1497a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{gVar3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String strA2 = b4.k.a(i11, Collections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) b4.k.f1497a.a(strA2);
                if (typeface3 != null) {
                    pVar.execute(new b4.a(i13, bVar, typeface3));
                    typeface = typeface3;
                } else if (i15 == -1) {
                    Object[] objArr3 = {gVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr3[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    b4.j jVarB = b4.k.b(strA2, context, Collections.unmodifiableList(arrayList6), i11);
                    kVar.c1(jVarB);
                    typeface = jVarB.f1495a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    b4.j jVar = (b4.j) b4.k.f1498b.submit(new b4.h(strA2, context, gVar3, i11, 0)).get(i15, TimeUnit.MILLISECONDS);
                                    kVar.c1(jVar);
                                    typeface = jVar.f1495a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e7) {
                                throw e7;
                            }
                        } catch (ExecutionException e10) {
                            throw new RuntimeException(e10);
                        }
                    } catch (InterruptedException unused2) {
                        ((p) kVar.f12991c).execute(new b4.b((wb.b) kVar.f12990b, -3));
                    }
                }
            }
            typefaceR = typeface;
        } else {
            typefaceR = f14570a.r(context, (w3.e) dVar, resources, i11);
            if (eVar != null) {
                if (typefaceR != null) {
                    new Handler(Looper.getMainLooper()).post(new n(i12, eVar, typefaceR));
                } else {
                    eVar.a(-3);
                }
            }
        }
        if (typefaceR != null) {
            f14571b.b(b(resources, i7, str, i10, i11), typefaceR);
        }
        return typefaceR;
    }

    public static String b(Resources resources, int i7, String str, int i10, int i11) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i10 + '-' + i7 + '-' + i11;
    }
}
