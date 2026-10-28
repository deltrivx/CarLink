package g7;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import h0.p;
import h0.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import r2.b1;
import r2.r2;
import s.c0;
import s.l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6000d;

    public l() {
        this.f5997a = 1;
        this.f5999c = new h1.e(new h0.i[16]);
    }

    public /* synthetic */ l(int i7) {
        this.f5997a = i7;
    }

    public l(Shader shader, ColorStateList colorStateList, int i7) {
        this.f5997a = 6;
        this.f5999c = shader;
        this.f6000d = colorStateList;
        this.f5998b = i7;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    public l(n9.d dVar, z zVar) {
        Object gVar;
        this.f5997a = 2;
        l lVarK = zVar.k();
        int i7 = dVar.f8965a;
        if (i7 < 0) {
            c0.b.c("negative nearestRange.first");
        }
        int iMin = Math.min(dVar.f8966b, lVarK.f5998b - 1);
        if (iMin < i7) {
            c0 c0Var = l0.f12469a;
            i9.l.c(c0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f5999c = c0Var;
            this.f6000d = new Object[0];
            this.f5998b = 0;
            return;
        }
        int i10 = (iMin - i7) + 1;
        this.f6000d = new Object[i10];
        this.f5998b = i7;
        c0 c0Var2 = new c0(i10);
        h1.e eVar = (h1.e) lVarK.f5999c;
        if (i7 < 0 || i7 >= lVarK.f5998b) {
            StringBuilder sbT = ob.a.t("Index ", ", size ", i7);
            sbT.append(lVarK.f5998b);
            c0.b.e(sbT.toString());
        }
        if (iMin < 0 || iMin >= lVarK.f5998b) {
            StringBuilder sbT2 = ob.a.t("Index ", ", size ", iMin);
            sbT2.append(lVarK.f5998b);
            c0.b.e(sbT2.toString());
        }
        if (iMin < i7) {
            c0.b.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i7 + ')');
        }
        int iE = z.e(i7, eVar);
        int i11 = ((h0.i) eVar.f6421a[iE]).f6320a;
        while (i11 <= iMin) {
            h0.i iVar = (h0.i) eVar.f6421a[iE];
            h9.k key = iVar.f6322c.getKey();
            int i12 = iVar.f6320a;
            int iMax = Math.max(i7, i12);
            int iMin2 = Math.min(iMin, (iVar.f6321b + i12) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        gVar = key.invoke(Integer.valueOf(iMax - i12));
                        gVar = gVar == null ? new h0.g(iMax) : gVar;
                    }
                    c0Var2.h(iMax, gVar);
                    ((Object[]) this.f6000d)[iMax - this.f5998b] = gVar;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i11 += iVar.f6321b;
            iE++;
        }
        this.f5999c = c0Var2;
    }

    public l(r2 r2Var) {
        this.f5997a = 5;
        this.f5999c = r2Var;
    }

    public static l b(Resources resources, int i7, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f10;
        float f11;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i7);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = w3.c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new l(null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayG = w3.b.g(resources, theme, attributeSetAsAttributeSet, t3.a.f12757d);
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayG.getFloat(8, 0.0f) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayG.getFloat(9, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayG.getFloat(10, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayG.getFloat(11, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayG.getFloat(3, 0.0f) : 0.0f;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayG.getFloat(4, 0.0f) : 0.0f;
        int i10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayG.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayG.getColor(0, 0) : 0;
        boolean z10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayG.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayG.getColor(1, 0) : 0;
        int i11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayG.getInt(6, 0) : 0;
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayG.getFloat(5, 0.0f) : 0.0f;
        typedArrayG.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f19 = f18;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f10 = f14;
            if (next2 == 1) {
                f11 = f15;
                break;
            }
            int depth2 = xml.getDepth();
            f11 = f15;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayG2 = w3.b.g(resources, theme, attributeSetAsAttributeSet, t3.a.f12758e);
                boolean zHasValue = typedArrayG2.hasValue(0);
                boolean zHasValue2 = typedArrayG2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayG2.getColor(0, 0);
                float f20 = typedArrayG2.getFloat(1, 0.0f);
                typedArrayG2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f20));
            }
            f14 = f10;
            f15 = f11;
        }
        b1 b1Var = arrayList2.size() > 0 ? new b1(arrayList2, arrayList) : null;
        if (b1Var == null) {
            b1Var = z10 ? new b1(color, color2, color3) : new b1(color, color3);
        }
        if (i10 != 1) {
            if (i10 != 2) {
                int[] iArr = b1Var.f11191a;
                float[] fArr = b1Var.f11192b;
                if (i11 != 1) {
                    tileMode2 = i11 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f12, f13, f10, f11, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f16, f17, b1Var.f11191a, b1Var.f11192b);
            }
        } else {
            if (f19 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = b1Var.f11191a;
            float[] fArr2 = b1Var.f11192b;
            if (i11 != 1) {
                tileMode = i11 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f16, f17, f19, iArr2, fArr2, tileMode);
        }
        return new l(radialGradient, null, 0);
    }

    public void a(int i7, p pVar) {
        if (i7 < 0) {
            c0.b.a("size should be >=0");
        }
        if (i7 == 0) {
            return;
        }
        h0.i iVar = new h0.i(this.f5998b, i7, pVar);
        this.f5998b += i7;
        ((h1.e) this.f5999c).b(iVar);
    }

    public h0.i c(int i7) {
        if (i7 < 0 || i7 >= this.f5998b) {
            StringBuilder sbT = ob.a.t("Index ", ", size ", i7);
            sbT.append(this.f5998b);
            c0.b.e(sbT.toString());
        }
        h0.i iVar = (h0.i) this.f6000d;
        if (iVar != null) {
            int i10 = iVar.f6320a;
            if (i7 < iVar.f6321b + i10 && i10 <= i7) {
                return iVar;
            }
        }
        h1.e eVar = (h1.e) this.f5999c;
        h0.i iVar2 = (h0.i) eVar.f6421a[z.e(i7, eVar)];
        this.f6000d = iVar2;
        return iVar2;
    }

    public int d(Object obj) {
        c0 c0Var = (c0) this.f5999c;
        int iD = c0Var.d(obj);
        if (iD >= 0) {
            return c0Var.f12399c[iD];
        }
        return -1;
    }

    public String e() {
        StringBuilder sb2 = new StringBuilder("$");
        int i7 = this.f5998b + 1;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = ((Object[]) this.f5999c)[i10];
            if (obj instanceof nc.e) {
                nc.e eVar = (nc.e) obj;
                if (!i9.l.a(eVar.f(), nc.i.f9091d)) {
                    int i11 = ((int[]) this.f6000d)[i10];
                    if (i11 >= 0) {
                        sb2.append(".");
                        sb2.append(eVar.l(i11));
                    }
                } else if (((int[]) this.f6000d)[i10] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.f6000d)[i10]);
                    sb2.append("]");
                }
            } else if (obj != rc.k.f12327a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        return sb2.toString();
    }

    public void f(int i7, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        long[] jArr = (long[]) this.f5999c;
        int i15 = this.f5998b;
        int i16 = i15 + 3;
        this.f5998b = i16;
        int length = jArr.length;
        if (length <= i16) {
            int iMax = Math.max(length * 2, i16);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            i9.l.d(jArrCopyOf, "copyOf(...)");
            this.f5999c = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.f6000d, iMax);
            i9.l.d(jArrCopyOf2, "copyOf(...)");
            this.f6000d = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.f5999c;
        jArr2[i15] = (((long) i10) << 32) | (((long) i11) & 4294967295L);
        jArr2[i15 + 1] = (((long) i12) << 32) | (((long) i13) & 4294967295L);
        int i17 = i14 & 67108863;
        jArr2[i15 + 2] = ((z11 ? 1L : 0L) << 63) | ((z10 ? 1L : 0L) << 62) | (((long) 1) << 61) | (((long) 0) << 52) | (((long) i17) << 26) | ((long) (i7 & 67108863));
        if (i14 < 0) {
            return;
        }
        for (int i18 = i15 - 3; i18 >= 0; i18 -= 3) {
            int i19 = i18 + 2;
            long j5 = jArr2[i19];
            if ((((int) j5) & 67108863) == i17) {
                jArr2[i19] = (j5 & (-2301339409586323457L)) | (((long) ((i15 - i18) & 511)) << 52);
                return;
            }
        }
    }

    public boolean g() {
        ColorStateList colorStateList;
        return ((Shader) this.f5999c) == null && (colorStateList = (ColorStateList) this.f6000d) != null && colorStateList.isStateful();
    }

    public void h() {
        int i7 = this.f5998b * 2;
        Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f5999c, i7);
        i9.l.d(objArrCopyOf, "copyOf(...)");
        this.f5999c = objArrCopyOf;
        int[] iArr = new int[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            iArr[i10] = -1;
        }
        u8.l.q0(0, 0, 14, (int[]) this.f6000d, iArr);
        this.f6000d = iArr;
    }

    public void i(int i7, h9.p pVar) {
        int i10 = i7 & 67108863;
        long[] jArr = (long[]) this.f5999c;
        int i11 = this.f5998b;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            if ((((int) jArr[i12 + 2]) & 67108863) == i10) {
                long j5 = jArr[i12];
                long j10 = jArr[i12 + 1];
                pVar.a(Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) j5), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10));
                return;
            }
        }
    }

    public String toString() {
        switch (this.f5997a) {
            case 4:
                return e();
            default:
                return super.toString();
        }
    }
}
