package x3;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import b4.m;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class h extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class f14581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Constructor f14582j;
    public final Method k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f14583l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f14584m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Method f14585n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f14586o;

    public h() throws NoSuchMethodException {
        Method methodS;
        Constructor<?> constructor;
        Method methodR;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodR = R(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodS = S(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e7.getClass().getName()), e7);
            methodS = null;
            constructor = null;
            methodR = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f14581i = cls;
        this.f14582j = constructor;
        this.k = methodR;
        this.f14583l = method;
        this.f14584m = method2;
        this.f14585n = method3;
        this.f14586o = methodS;
    }

    public static Method R(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final boolean O(Context context, Object obj, String str, int i7, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.k.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface P(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f14581i, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f14586o.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean Q(Object obj) {
        try {
            return ((Boolean) this.f14584m.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method S(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // x3.f, n3.u
    public final Typeface r(Context context, w3.e eVar, Resources resources, int i7) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.k;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.r(context, eVar, resources, i7);
        }
        try {
            objNewInstance = this.f14582j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            w3.f[] fVarArr = eVar.f14105a;
            int length = fVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                w3.f fVar = fVarArr[i10];
                Context context2 = context;
                if (O(context2, objNewInstance, fVar.f14106a, fVar.f14110e, fVar.f14107b, fVar.f14108c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f14109d))) {
                    i10++;
                    context = context2;
                } else {
                    try {
                        this.f14585n.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            if (Q(objNewInstance)) {
                return P(objNewInstance);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    @Override // x3.f, n3.u
    public final Typeface s(Context context, m[] mVarArr, int i7) throws IOException {
        Object objNewInstance;
        Typeface typefaceP;
        boolean zBooleanValue;
        if (mVarArr.length >= 1) {
            Method method = this.k;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (m mVar : mVarArr) {
                        if (mVar.f1507e == 0) {
                            Uri uri = mVar.f1503a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, n4.h.T(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f14582j.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = mVarArr.length;
                        int i10 = 0;
                        boolean z10 = false;
                        while (true) {
                            Method method2 = this.f14585n;
                            if (i10 >= length) {
                                if (!z10) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!Q(objNewInstance) || (typefaceP = P(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceP, i7);
                            }
                            m mVar2 = mVarArr[i10];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(mVar2.f1503a);
                            if (byteBuffer != null) {
                                try {
                                    try {
                                        zBooleanValue = ((Boolean) this.f14583l.invoke(objNewInstance, byteBuffer, Integer.valueOf(mVar2.f1504b), null, Integer.valueOf(mVar2.f1505c), Integer.valueOf(mVar2.f1506d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z10 = true;
                            }
                            i10++;
                        }
                    }
                } else {
                    m mVarX = x(mVarArr, i7);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mVarX.f1503a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(mVarX.f1505c).setItalic(mVarX.f1506d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            }
        }
        return null;
    }

    @Override // n3.u
    public final Typeface v(Context context, Resources resources, int i7, String str, int i10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.k;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.v(context, resources, i7, str, i10);
        }
        try {
            objNewInstance = this.f14582j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!O(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f14585n.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (Q(objNewInstance)) {
                return P(objNewInstance);
            }
        }
        return null;
    }
}
