package b4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n3.u;
import o9.e0;
import s.q0;
import s.s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f1497a = new s(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f1498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q0 f1500d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new o(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1498b = threadPoolExecutor;
        f1499c = new Object();
        f1500d = new q0(0);
    }

    public static String a(int i7, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((g) list.get(i10)).f1487e);
            sb2.append("-");
            sb2.append(i7);
            if (i10 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static j b(String str, Context context, List list, int i7) {
        int i10;
        Typeface typefaceS;
        s sVar = f1497a;
        e0.m("getFontSync");
        try {
            Typeface typeface = (Typeface) sVar.a(str);
            if (typeface != null) {
                j jVar = new j(typeface);
                Trace.endSection();
                return jVar;
            }
            try {
                l lVarA = f.a(context, list);
                List list2 = lVarA.f1502b;
                int i11 = lVarA.f1501a;
                if (i11 == 0) {
                    m[] mVarArr = (m[]) list2.get(0);
                    if (mVarArr == null || mVarArr.length == 0) {
                        i10 = 1;
                    } else {
                        int length = mVarArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                i10 = 0;
                                break;
                            }
                            int i13 = mVarArr[i12].f1507e;
                            if (i13 != 0) {
                                if (i13 >= 0) {
                                    i10 = i13;
                                    break;
                                }
                                i10 = -3;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        i10 = -3;
                        break;
                    }
                    i10 = -2;
                }
                if (i10 != 0) {
                    j jVar2 = new j(i10);
                    Trace.endSection();
                    return jVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    m[] mVarArr2 = (m[]) list2.get(0);
                    u uVar = x3.e.f14570a;
                    e0.m("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceS = x3.e.f14570a.s(context, mVarArr2, i7);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    u uVar2 = x3.e.f14570a;
                    e0.m("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceS = x3.e.f14570a.t(context, list2, i7);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceS == null) {
                    j jVar3 = new j(-3);
                    Trace.endSection();
                    return jVar3;
                }
                sVar.b(str, typefaceS);
                j jVar4 = new j(typefaceS);
                Trace.endSection();
                return jVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                j jVar5 = new j(-1);
                Trace.endSection();
                return jVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
