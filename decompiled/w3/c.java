package w3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.baidu.carlifevehicle.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f14104a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        int i7;
        int iE;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r8 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r8 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = t3.a.f12754a;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i10, i10);
                int resourceId = typedArrayObtainAttributes.getResourceId(i10, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f14104a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, (boolean) r8);
                    int i12 = typedValue.type;
                    if (i12 < 28 || i12 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(i10, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(i10, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(i10, -65281);
                }
                float f10 = typedArrayObtainAttributes.hasValue(r8) ? typedArrayObtainAttributes.getFloat(r8, 1.0f) : typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f11 = (Build.VERSION.SDK_INT < 31 || !typedArrayObtainAttributes.hasValue(2)) ? typedArrayObtainAttributes.getFloat(4, -1.0f) : typedArrayObtainAttributes.getFloat(2, -1.0f);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i13 = 0;
                for (int i14 = 0; i14 < attributeCount; i14++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i14);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i15 = i13 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i14, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i13] = attributeNameResource;
                        i13 = i15;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i13);
                boolean z10 = f11 >= 0.0f && f11 <= 100.0f;
                if (f10 != 1.0f || z10) {
                    int iAlpha = (int) ((Color.alpha(color) * f10) + 0.5f);
                    if (iAlpha < 0) {
                        i7 = 0;
                    } else {
                        i7 = 255;
                        if (iAlpha <= 255) {
                            i7 = iAlpha;
                        }
                    }
                    if (z10) {
                        a aVarA = a.a(color);
                        float f12 = aVarA.f14091a;
                        float f13 = aVarA.f14092b;
                        m mVar = m.k;
                        if (f13 >= 1.0d && Math.round(f11) > 0.0d && Math.round(f11) < 100.0d) {
                            float fMin = f12 < 0.0f ? 0.0f : Math.min(360.0f, f12);
                            float f14 = f13;
                            a aVar = null;
                            boolean z11 = true;
                            float f15 = 0.0f;
                            while (true) {
                                if (Math.abs(f15 - f13) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (aVar != null) {
                                        iE = aVar.c(mVar);
                                        break;
                                    }
                                    iE = b.e(f11);
                                    break;
                                }
                                float f16 = 1000.0f;
                                float f17 = 1000.0f;
                                float f18 = 0.0f;
                                float f19 = 100.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f18 - f19) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        break;
                                    }
                                    float f20 = ((f19 - f18) / 2.0f) + f18;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iC = a.b(f20, f14, fMin).c(m.k);
                                    float f21 = b.f(Color.red(iC));
                                    float f22 = b.f(Color.green(iC));
                                    float f23 = b.f(Color.blue(iC));
                                    float[] fArr = b.f14100d[1];
                                    float f24 = ((f23 * fArr[2]) + ((f22 * fArr[1]) + (f21 * fArr[0]))) / 100.0f;
                                    float fCbrt = f24 <= 0.008856452f ? f24 * 903.2963f : (((float) Math.cbrt(f24)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f11 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC);
                                        a aVarB = a.b(aVarA2.f14093c, aVarA2.f14092b, fMin);
                                        float f25 = aVarA2.f14094d - aVarB.f14094d;
                                        float f26 = aVarA2.f14095e - aVarB.f14095e;
                                        float f27 = aVarA2.f14096f - aVarB.f14096f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f27 * f27) + (f26 * f26) + (f25 * f25)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f17 = fPow;
                                            f16 = fAbs;
                                            aVar2 = aVarA2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f16 == 0.0f && f17 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f11) {
                                        f18 = f20;
                                    } else {
                                        f19 = f20;
                                    }
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                a aVar3 = aVar2;
                                if (!z11) {
                                    if (aVar3 == null) {
                                        f13 = f14;
                                    } else {
                                        aVar = aVar3;
                                        f15 = f14;
                                    }
                                    f14 = ((f13 - f15) / 2.0f) + f15;
                                } else {
                                    if (aVar3 != null) {
                                        iE = aVar3.c(mVar);
                                        break;
                                    }
                                    f14 = ((f13 - f15) / 2.0f) + f15;
                                    z11 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iE = b.e(f11);
                        }
                        color = iE;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (i7 << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i16 = i11 + 1;
                if (i16 > iArr.length) {
                    int[] iArr4 = new int[i11 <= 4 ? 8 : i11 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i11);
                    iArr = iArr4;
                }
                iArr[i11] = color;
                if (i16 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11 > 4 ? i11 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i11);
                    objArr = objArr2;
                }
                objArr[i11] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i11 = i16;
                depth2 = depth2;
                r8 = 1;
                i10 = 0;
            } else {
                depth2 = depth2;
                r8 = 1;
                i10 = 0;
            }
        }
        int[] iArr5 = new int[i11];
        int[][] iArr6 = new int[i11][];
        System.arraycopy(iArr, 0, iArr5, 0, i11);
        System.arraycopy(objArr, 0, iArr6, 0, i11);
        return new ColorStateList(iArr6, iArr5);
    }
}
