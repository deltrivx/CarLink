package x3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import b4.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import n3.u;
import s.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Class f14577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Constructor f14578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f14579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Method f14580g;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi24Impl", e7.getClass().getName(), e7);
            cls = null;
            method = null;
            method2 = null;
        }
        f14578e = constructor;
        f14577d = cls;
        f14579f = method2;
        f14580g = method;
    }

    public static boolean M(Object obj, ByteBuffer byteBuffer, int i7, int i10, boolean z10) {
        try {
            return ((Boolean) f14579f.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface N(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f14577d, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f14580g.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // n3.u
    public final Typeface r(Context context, w3.e eVar, Resources resources, int i7) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f14578e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (w3.f fVar : eVar.f14105a) {
                int i10 = fVar.f14111f;
                File fileI = n4.h.I(context);
                if (fileI != null) {
                    try {
                        if (n4.h.v(fileI, resources, i10)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileI);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileI.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileI.delete();
                        }
                        if (map != null && M(objNewInstance, map, fVar.f14110e, fVar.f14107b, fVar.f14108c)) {
                        }
                    } catch (Throwable th3) {
                        fileI.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return N(objNewInstance);
        }
        return null;
    }

    @Override // n3.u
    public final Typeface s(Context context, m[] mVarArr, int i7) {
        Object objNewInstance;
        try {
            objNewInstance = f14578e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            q0 q0Var = new q0(0);
            for (m mVar : mVarArr) {
                Uri uri = mVar.f1503a;
                ByteBuffer byteBufferT = (ByteBuffer) q0Var.get(uri);
                if (byteBufferT == null) {
                    byteBufferT = n4.h.T(context, uri);
                    q0Var.put(uri, byteBufferT);
                }
                if (byteBufferT != null && M(objNewInstance, byteBufferT, mVar.f1504b, mVar.f1505c, mVar.f1506d)) {
                }
            }
            Typeface typefaceN = N(objNewInstance);
            if (typefaceN != null) {
                return Typeface.create(typefaceN, i7);
            }
        }
        return null;
    }
}
