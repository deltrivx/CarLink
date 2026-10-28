package z4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s3.h f15732a = new s3.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f15733b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static n4.e f15734c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? f.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static n4.e b() {
        n4.e eVar = new n4.e(29);
        f15734c = eVar;
        s3.h hVar = f15732a;
        hVar.getClass();
        if (s3.g.f12572f.U(hVar, null, eVar)) {
            s3.g.b(hVar);
        }
        return f15734c;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    public static void c(Context context, boolean z10) {
        int i7;
        boolean z11;
        int i10;
        File file;
        boolean z12;
        File file2;
        long length;
        boolean z13;
        File file3;
        g gVarA;
        int i11;
        g gVar;
        int i12;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z10 || f15734c == null) {
            synchronized (f15733b) {
                if (z10) {
                    i7 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        long jA = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            gVarA = g.a(file3);
                        } else {
                            gVarA = null;
                        }
                        if (gVarA == null) {
                            if (!z11) {
                                i7 = 327680;
                            } else if (z12) {
                                i7 = 1;
                            } else if (z13) {
                                i7 = 2;
                            }
                        } else if (!z11) {
                            i7 = 327680;
                        } else if (z12) {
                            i7 = 1;
                        } else if (z13) {
                            i7 = 2;
                        }
                        if (z10) {
                            i7 = 2;
                        }
                        if (gVarA == null) {
                            i11 = i7;
                        } else {
                            i11 = i7;
                        }
                        gVar = new g(1, i11, jA, length);
                        if (gVarA != null) {
                            gVar.b(file3);
                        } else {
                            gVar.b(file3);
                        }
                        b();
                        return;
                    }
                    b();
                    return;
                }
                if (f15734c != null) {
                    return;
                }
                i7 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    z11 = false;
                }
                i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28 && i10 != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    try {
                        long jA2 = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                gVarA = g.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            gVarA = null;
                        }
                        if (gVarA == null && gVarA.f15730c == jA2 && (i12 = gVarA.f15729b) != 2) {
                            i7 = i12;
                        } else if (!z11) {
                            i7 = 327680;
                        } else if (z12) {
                            i7 = 1;
                        } else if (z13) {
                            i7 = 2;
                        }
                        if (z10 && z13 && i7 != 1) {
                            i7 = 2;
                        }
                        if (gVarA == null && gVarA.f15729b == 2 && i7 == 1 && length3 < gVarA.f15731d) {
                            i11 = 3;
                        } else {
                            i11 = i7;
                        }
                        gVar = new g(1, i11, jA2, length);
                        if (gVarA != null || !gVarA.equals(gVar)) {
                            try {
                                gVar.b(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        b();
                        return;
                    }
                }
                b();
                return;
                throw th;
            }
        }
    }
}
