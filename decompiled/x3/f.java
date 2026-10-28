package x3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import b4.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n3.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class f extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class f14572d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Constructor f14573e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f14574f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f14575g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f14576h = false;

    public static boolean M(Object obj, String str, int i7, boolean z10) throws NoSuchMethodException {
        N();
        try {
            try {
                return ((Boolean) f14574f.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z10))).booleanValue();
            } catch (InvocationTargetException e7) {
                e = e7;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            e = e10;
        }
    }

    public static void N() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f14576h) {
            return;
        }
        f14576h = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi21Impl", e7.getClass().getName(), e7);
            method = null;
            cls = null;
            method2 = null;
        }
        f14573e = constructor;
        f14572d = cls;
        f14574f = method2;
        f14575g = method;
    }

    @Override // n3.u
    public Typeface r(Context context, w3.e eVar, Resources resources, int i7) throws NoSuchMethodException {
        N();
        try {
            Object objNewInstance = f14573e.newInstance(null);
            for (w3.f fVar : eVar.f14105a) {
                File fileI = n4.h.I(context);
                if (fileI == null) {
                    return null;
                }
                try {
                    if (!n4.h.v(fileI, resources, fVar.f14111f)) {
                        return null;
                    }
                    if (!M(objNewInstance, fileI.getPath(), fVar.f14107b, fVar.f14108c)) {
                        return null;
                    }
                    fileI.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileI.delete();
                }
            }
            N();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f14572d, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f14575g.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // n3.u
    public Typeface s(Context context, m[] mVarArr, int i7) {
        File file;
        if (mVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(x(mVarArr, i7).f1503a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceU = u(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceU;
                    } catch (Throwable th3) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
