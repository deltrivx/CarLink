package x3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import b4.m;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import n3.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends u {
    public static Font M(FontFamily fontFamily, int i7) {
        FontStyle fontStyle = new FontStyle((i7 & 1) != 0 ? 700 : 400, (i7 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iO = O(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int iO2 = O(fontStyle, font2.getStyle());
            if (iO2 < iO) {
                font = font2;
                iO = iO2;
            }
        }
        return font;
    }

    public static FontFamily N(m[] mVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (m mVar : mVarArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(mVar.f1503a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(mVar.f1505c).setSlant(mVar.f1506d ? 1 : 0).setTtcIndex(mVar.f1504b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (IOException e7) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int O(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // n3.u
    public final Typeface r(Context context, w3.e eVar, Resources resources, int i7) {
        try {
            FontFamily.Builder builder = null;
            for (w3.f fVar : eVar.f14105a) {
                try {
                    Font fontBuild = new Font.Builder(resources, fVar.f14111f).setWeight(fVar.f14107b).setSlant(fVar.f14108c ? 1 : 0).setTtcIndex(fVar.f14110e).setFontVariationSettings(fVar.f14109d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(M(fontFamilyBuild, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // n3.u
    public final Typeface s(Context context, m[] mVarArr, int i7) {
        try {
            FontFamily fontFamilyN = N(mVarArr, context.getContentResolver());
            if (fontFamilyN == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyN).setStyle(M(fontFamilyN, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // n3.u
    public final Typeface t(Context context, List list, int i7) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyN = N((m[]) list.get(0), contentResolver);
            if (fontFamilyN == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyN);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily fontFamilyN2 = N((m[]) list.get(i10), contentResolver);
                if (fontFamilyN2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyN2);
                }
            }
            return customFallbackBuilder.setStyle(M(fontFamilyN, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // n3.u
    public final Typeface u(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // n3.u
    public final Typeface v(Context context, Resources resources, int i7, String str, int i10) {
        try {
            Font fontBuild = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // n3.u
    public final m x(m[] mVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
