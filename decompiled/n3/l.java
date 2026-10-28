package n3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.DragEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.HandwritingGesture;
import android.widget.EdgeEffect;
import b3.g0;
import b3.q0;
import c8.b0;
import e2.i0;
import e2.k0;
import e2.l0;
import f1.k1;
import f1.q1;
import f1.u1;
import f1.w0;
import f1.w1;
import i9.y;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import jb.v;
import jb.w;
import l0.o0;
import o2.m0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q2.a0;
import r2.j1;
import r9.n1;
import r9.r1;
import t8.z;
import u8.f0;
import x.o1;
import x.v0;
import x9.n0;
import y1.h0;
import z.b1;
import z.c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e2.f f8745a;

    public static int A(List list) {
        i9.l.e(list, "<this>");
        return list.size() - 1;
    }

    public static final long B(o0 o0Var) {
        DragEvent dragEvent = (DragEvent) o0Var.f7772b;
        float x8 = dragEvent.getX();
        float y5 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x8)) << 32) | (((long) Float.floatToRawIntBits(y5)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static ca.c C(w wVar, boolean z10, boolean z11, Boolean bool, boolean z12, ca.b bVar, ta.e eVar) {
        pa.g gVar;
        ca.c cVar;
        jb.u uVar;
        ra.j jVar;
        i9.l.e(wVar, "container");
        n0 n0Var = wVar.f7086c;
        i9.l.e(eVar, "metadataVersion");
        ra.j jVar2 = ra.j.INTERFACE;
        if (z10) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + wVar + ')').toString());
            }
            if (wVar instanceof jb.u) {
                jb.u uVar2 = (jb.u) wVar;
                if (uVar2.f7081g == jVar2) {
                    return u.y(bVar, uVar2.f7080f.d(wa.e.e("DefaultImpls")), eVar);
                }
            }
            if (bool.booleanValue() && (wVar instanceof v)) {
                pa.g gVar2 = n0Var instanceof pa.g ? (pa.g) n0Var : null;
                eb.b bVar2 = gVar2 != null ? gVar2.f10339b : null;
                if (bVar2 != null) {
                    String strD = bVar2.d();
                    i9.l.d(strD, "getInternalName(...)");
                    wa.c cVar2 = new wa.c(zb.q.m0(strD, '/', '.'));
                    return u.y(bVar, new wa.b(cVar2.b(), cVar2.f14240a.f()), eVar);
                }
            }
        }
        if (z11 && (wVar instanceof jb.u)) {
            jb.u uVar3 = (jb.u) wVar;
            if (uVar3.f7081g == ra.j.COMPANION_OBJECT && (uVar = uVar3.f7079e) != null && ((jVar = uVar.f7081g) == ra.j.CLASS || jVar == ra.j.ENUM_CLASS || (z12 && (jVar == jVar2 || jVar == ra.j.ANNOTATION_CLASS)))) {
                n0 n0Var2 = uVar.f7086c;
                pa.o oVar = n0Var2 instanceof pa.o ? (pa.o) n0Var2 : null;
                if (oVar != null) {
                    return oVar.f10352a;
                }
            } else if (wVar instanceof v) {
                gVar = (pa.g) n0Var;
                cVar = gVar.f10340c;
                if (cVar == null) {
                    return u.y(bVar, gVar.a(), eVar);
                }
                return cVar;
            }
        } else if ((wVar instanceof v) && (n0Var instanceof pa.g)) {
            gVar = (pa.g) n0Var;
            cVar = gVar.f10340c;
            if (cVar == null) {
                return u.y(bVar, gVar.a(), eVar);
            }
            return cVar;
        }
        return null;
    }

    public static String D(String str) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                String line = bufferedReader2.readLine();
                if (line != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused) {
                    }
                    return line;
                }
                try {
                    bufferedReader2.close();
                } catch (IOException unused2) {
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String E(String str) throws Throwable {
        String property;
        if (str != null && !str.isEmpty()) {
            FileInputStream fileInputStream = null;
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                property = (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
            } catch (Exception unused) {
                property = null;
            }
            if (property != null && !property.isEmpty()) {
                return property;
            }
            try {
                property = D(str);
            } catch (IOException unused2) {
            }
            if (property != null && !property.isEmpty()) {
                return property;
            }
            try {
                try {
                    Properties properties = new Properties();
                    FileInputStream fileInputStream2 = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
                    try {
                        properties.load(fileInputStream2);
                        property = properties.getProperty(str, "");
                        fileInputStream2.close();
                        if (property != null && !property.isEmpty()) {
                            return property;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused4) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return "";
    }

    public static boolean F(String[] strArr) {
        for (String str : strArr) {
            if (!TextUtils.isEmpty(E(str))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean G(int i7, String str) {
        char cCharAt = str.charAt(i7);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static boolean H(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static List I(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        i9.l.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List J(Object... objArr) {
        i9.l.e(objArr, "elements");
        return objArr.length > 0 ? u8.l.j0(objArr) : u8.w.f13122a;
    }

    public static List K(Object obj) {
        return obj != null ? I(obj) : u8.w.f13122a;
    }

    public static ArrayList L(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new u8.j(objArr, true));
    }

    public static final List M(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : I(list.get(0));
        }
        return u8.w.f13122a;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x036d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0370  */
    /* JADX WARN: Code duplicated, block: B:138:0x0382  */
    /* JADX WARN: Code duplicated, block: B:140:0x0385  */
    /* JADX WARN: Code duplicated, block: B:141:0x0388  */
    /* JADX WARN: Code duplicated, block: B:142:0x038b  */
    /* JADX WARN: Code duplicated, block: B:145:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:161:0x041a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x041c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0424  */
    /* JADX WARN: Code duplicated, block: B:167:0x0434  */
    /* JADX WARN: Code duplicated, block: B:168:0x0437  */
    /* JADX WARN: Code duplicated, block: B:171:0x043d  */
    /* JADX WARN: Code duplicated, block: B:53:0x014a  */
    public static final d2.b N(int i7, f1.s sVar) throws XmlPullParserException, IOException {
        TypedValue typedValue;
        long jC;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        g7.l lVarB;
        int i15;
        Shader shader;
        y1.m n0Var;
        Shader shader2;
        y1.m n0Var2;
        y1.m mVar;
        int i16;
        Context context = (Context) sVar.j(r2.n0.f11343b);
        Resources resources = (Resources) sVar.j(r2.n0.f11344c);
        w2.d dVar = (w2.d) sVar.j(r2.n0.f11346e);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.f14090a.b(i7);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i7, typedValue, true);
                s.w wVar = dVar.f14090a;
                int iD = wVar.d(i7);
                Object[] objArr = wVar.f12463c;
                Object obj = objArr[iD];
                wVar.f12462b[iD] = i7;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !zb.j.v0(charSequence, ".xml")) {
            sVar.W(-1771631096);
            boolean zF = sVar.f(context.getTheme()) | sVar.f(charSequence) | sVar.d(i7);
            Object objK = sVar.K();
            if (zF || objK == f1.n.f5051a) {
                try {
                    Drawable drawable = resources.getDrawable(i7, null);
                    i9.l.c(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objK = new y1.f(((BitmapDrawable) drawable).getBitmap());
                    sVar.h0(objK);
                } catch (Exception e7) {
                    throw new cc.s("Error attempting to load resource: " + ((Object) charSequence), e7);
                }
            }
            y1.f fVar = (y1.f) objK;
            d2.a aVar = new d2.a(fVar, (((long) fVar.f14890a.getHeight()) & 4294967295L) | (((long) fVar.f14890a.getWidth()) << 32));
            sVar.p(false);
            return aVar;
        }
        sVar.W(-1771786530);
        Resources.Theme theme = context.getTheme();
        int i17 = typedValue.changingConfigurations;
        w2.c cVar = (w2.c) sVar.j(r2.n0.f11345d);
        w2.b bVar = new w2.b(theme, i7);
        WeakReference weakReference = (WeakReference) cVar.f14089a.get(bVar);
        w2.a aVar2 = weakReference != null ? (w2.a) weakReference.get() : null;
        if (aVar2 == null) {
            XmlResourceParser xml = resources.getXml(i7);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!i9.l.a(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            f2.a aVar3 = new f2.a(xml);
            TypedArray typedArrayG = w3.b.g(resources, theme, attributeSetAsAttributeSet, f2.b.f5243a);
            aVar3.b(typedArrayG.getChangingConfigurations());
            boolean z10 = !w3.b.d(xml, "autoMirrored") ? false : typedArrayG.getBoolean(5, false);
            aVar3.b(typedArrayG.getChangingConfigurations());
            float fA = aVar3.a(typedArrayG, "viewportWidth", 7, 0.0f);
            float fA2 = aVar3.a(typedArrayG, "viewportHeight", 8, 0.0f);
            if (fA <= 0.0f) {
                throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fA2 <= 0.0f) {
                throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArrayG.getDimension(3, 0.0f);
            aVar3.b(typedArrayG.getChangingConfigurations());
            float dimension2 = typedArrayG.getDimension(2, 0.0f);
            aVar3.b(typedArrayG.getChangingConfigurations());
            if (typedArrayG.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayG.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jC = y1.q.f14958m;
                } else {
                    ColorStateList colorStateListA = w3.b.a(typedArrayG, xml, theme);
                    aVar3.b(typedArrayG.getChangingConfigurations());
                    jC = colorStateListA != null ? h0.c(colorStateListA.getDefaultColor()) : y1.q.f14958m;
                }
            } else {
                jC = y1.q.f14958m;
            }
            long j5 = jC;
            int i18 = typedArrayG.getInt(6, -1);
            aVar3.b(typedArrayG.getChangingConfigurations());
            if (i18 == -1) {
                i10 = 5;
            } else if (i18 == 3) {
                i10 = 3;
            } else if (i18 == 5) {
                i10 = 5;
            } else if (i18 != 9) {
                switch (i18) {
                    case 14:
                        i10 = 13;
                        break;
                    case 15:
                        i10 = 14;
                        break;
                    case 16:
                        i10 = 12;
                        break;
                    default:
                        i10 = 5;
                        break;
                }
            } else {
                i10 = 9;
            }
            float f10 = dimension / resources.getDisplayMetrics().density;
            float f11 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayG.recycle();
            e2.e eVar = new e2.e(null, f10, f11, fA, fA2, j5, i10, z10, 1);
            int i19 = 0;
            for (int i20 = 3; xml.getEventType() != 1 && (xml.getDepth() >= 1 || xml.getEventType() != i20); i20 = 3) {
                List listS = u8.w.f13122a;
                XmlPullParser xmlPullParser = aVar3.f5240a;
                a2.d dVar2 = aVar3.f5242c;
                XmlResourceParser xmlResourceParser = xml;
                int eventType = xmlPullParser.getEventType();
                int i21 = i17;
                if (eventType != 2) {
                    if (eventType == i20 && "group".equals(xmlPullParser.getName())) {
                        int i22 = i19 + 1;
                        for (int i23 = 0; i23 < i22; i23++) {
                            ArrayList arrayList = eVar.f4142i;
                            if (eVar.k) {
                                n2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            e2.d dVar3 = (e2.d) arrayList.remove(arrayList.size() - 1);
                            ((e2.d) arrayList.get(arrayList.size() - 1)).f4132j.add(new e2.h0(dVar3.f4123a, dVar3.f4124b, dVar3.f4125c, dVar3.f4126d, dVar3.f4127e, dVar3.f4128f, dVar3.f4129g, dVar3.f4130h, dVar3.f4131i, dVar3.f4132j));
                        }
                        i19 = 0;
                    }
                    i11 = i19;
                    i19 = i11;
                } else {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            i11 = i19;
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    TypedArray typedArrayG2 = w3.b.g(resources, theme, attributeSetAsAttributeSet, f2.b.f5244b);
                                    aVar3.b(typedArrayG2.getChangingConfigurations());
                                    float fA3 = aVar3.a(typedArrayG2, "rotation", 5, 0.0f);
                                    float f12 = typedArrayG2.getFloat(1, 0.0f);
                                    aVar3.b(typedArrayG2.getChangingConfigurations());
                                    float f13 = typedArrayG2.getFloat(2, 0.0f);
                                    aVar3.b(typedArrayG2.getChangingConfigurations());
                                    float fA4 = aVar3.a(typedArrayG2, "scaleX", 3, 1.0f);
                                    float fA5 = aVar3.a(typedArrayG2, "scaleY", 4, 1.0f);
                                    float fA6 = aVar3.a(typedArrayG2, "translateX", 6, 0.0f);
                                    float fA7 = aVar3.a(typedArrayG2, "translateY", 7, 0.0f);
                                    String string = typedArrayG2.getString(0);
                                    aVar3.b(typedArrayG2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayG2.recycle();
                                    int i24 = i0.f4202a;
                                    if (eVar.k) {
                                        n2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    eVar.f4142i.add(new e2.d(str, fA3, f12, f13, fA4, fA5, fA6, fA7, listS, 512));
                                    i19 = i11;
                                }
                            } else if (name.equals("path")) {
                                TypedArray typedArrayG3 = w3.b.g(resources, theme, attributeSetAsAttributeSet, f2.b.f5245c);
                                aVar3.b(typedArrayG3.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    throw new IllegalArgumentException("No path data available");
                                }
                                String string2 = typedArrayG3.getString(0);
                                aVar3.b(typedArrayG3.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayG3.getString(2);
                                aVar3.b(typedArrayG3.getChangingConfigurations());
                                if (string3 == null) {
                                    int i25 = i0.f4202a;
                                } else {
                                    listS = a2.d.s(dVar2, string3);
                                }
                                List list = listS;
                                g7.l lVarB2 = w3.b.b(typedArrayG3, aVar3.f5240a, theme, "fillColor", 1);
                                aVar3.b(typedArrayG3.getChangingConfigurations());
                                float fA8 = aVar3.a(typedArrayG3, "fillAlpha", 12, 1.0f);
                                int i26 = !w3.b.d(aVar3.f5240a, "strokeLineCap") ? -1 : typedArrayG3.getInt(8, -1);
                                aVar3.b(typedArrayG3.getChangingConfigurations());
                                if (i26 != 0) {
                                    if (i26 == 1) {
                                        i12 = 1;
                                    } else if (i26 == 2) {
                                        i12 = 2;
                                    }
                                    if (w3.b.d(aVar3.f5240a, "strokeLineJoin")) {
                                        i13 = typedArrayG3.getInt(9, -1);
                                    } else {
                                        i13 = -1;
                                    }
                                    aVar3.b(typedArrayG3.getChangingConfigurations());
                                    if (i13 != 0) {
                                        i14 = 0;
                                    } else if (i13 != 1) {
                                        i14 = 2;
                                    } else {
                                        i14 = 1;
                                    }
                                    float fA9 = aVar3.a(typedArrayG3, "strokeMiterLimit", 10, 1.0f);
                                    lVarB = w3.b.b(typedArrayG3, aVar3.f5240a, theme, "strokeColor", 3);
                                    aVar3.b(typedArrayG3.getChangingConfigurations());
                                    float fA10 = aVar3.a(typedArrayG3, "strokeAlpha", 11, 1.0f);
                                    float fA11 = aVar3.a(typedArrayG3, "strokeWidth", 4, 1.0f);
                                    float fA12 = aVar3.a(typedArrayG3, "trimPathEnd", 6, 1.0f);
                                    float fA13 = aVar3.a(typedArrayG3, "trimPathOffset", 7, 0.0f);
                                    float fA14 = aVar3.a(typedArrayG3, "trimPathStart", 5, 0.0f);
                                    if (w3.b.d(aVar3.f5240a, "fillType")) {
                                        i15 = typedArrayG3.getInt(13, 0);
                                    } else {
                                        i15 = 0;
                                    }
                                    aVar3.b(typedArrayG3.getChangingConfigurations());
                                    typedArrayG3.recycle();
                                    shader = (Shader) lVarB2.f5999c;
                                    if (shader == null && lVarB2.f5998b == 0) {
                                        n0Var = null;
                                    } else if (shader != null) {
                                        n0Var = new y1.n(shader);
                                    } else {
                                        n0Var = new y1.n0(h0.c(lVarB2.f5998b));
                                    }
                                    shader2 = (Shader) lVarB.f5999c;
                                    if (shader2 != null && lVarB.f5998b == 0) {
                                        mVar = null;
                                    } else {
                                        if (shader2 != null) {
                                            n0Var2 = new y1.n(shader2);
                                        } else {
                                            n0Var2 = new y1.n0(h0.c(lVarB.f5998b));
                                        }
                                        mVar = n0Var2;
                                    }
                                    if (i15 == 0) {
                                        i16 = 0;
                                    } else {
                                        i16 = 1;
                                    }
                                    if (eVar.k) {
                                        n2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ArrayList arrayList2 = eVar.f4142i;
                                    ((e2.d) arrayList2.get(arrayList2.size() - 1)).f4132j.add(new l0(str2, list, i16, n0Var, fA8, mVar, fA10, fA11, i12, i14, fA9, fA14, fA12, fA13));
                                    i19 = i11;
                                }
                                i12 = 0;
                                if (w3.b.d(aVar3.f5240a, "strokeLineJoin")) {
                                    i13 = -1;
                                } else {
                                    i13 = typedArrayG3.getInt(9, -1);
                                }
                                aVar3.b(typedArrayG3.getChangingConfigurations());
                                if (i13 != 0) {
                                    i14 = 0;
                                } else if (i13 != 1) {
                                    i14 = 2;
                                } else {
                                    i14 = 1;
                                }
                                float fA15 = aVar3.a(typedArrayG3, "strokeMiterLimit", 10, 1.0f);
                                lVarB = w3.b.b(typedArrayG3, aVar3.f5240a, theme, "strokeColor", 3);
                                aVar3.b(typedArrayG3.getChangingConfigurations());
                                float fA16 = aVar3.a(typedArrayG3, "strokeAlpha", 11, 1.0f);
                                float fA17 = aVar3.a(typedArrayG3, "strokeWidth", 4, 1.0f);
                                float fA18 = aVar3.a(typedArrayG3, "trimPathEnd", 6, 1.0f);
                                float fA19 = aVar3.a(typedArrayG3, "trimPathOffset", 7, 0.0f);
                                float fA110 = aVar3.a(typedArrayG3, "trimPathStart", 5, 0.0f);
                                if (w3.b.d(aVar3.f5240a, "fillType")) {
                                    i15 = 0;
                                } else {
                                    i15 = typedArrayG3.getInt(13, 0);
                                }
                                aVar3.b(typedArrayG3.getChangingConfigurations());
                                typedArrayG3.recycle();
                                shader = (Shader) lVarB2.f5999c;
                                if (shader == null) {
                                    n0Var = null;
                                } else if (shader != null) {
                                    n0Var = new y1.n(shader);
                                } else {
                                    n0Var = new y1.n0(h0.c(lVarB2.f5998b));
                                }
                                shader2 = (Shader) lVarB.f5999c;
                                if (shader2 != null) {
                                    if (shader2 != null) {
                                        n0Var2 = new y1.n(shader2);
                                    } else {
                                        n0Var2 = new y1.n0(h0.c(lVarB.f5998b));
                                    }
                                    mVar = n0Var2;
                                } else {
                                    mVar = null;
                                }
                                if (i15 == 0) {
                                    i16 = 0;
                                } else {
                                    i16 = 1;
                                }
                                if (eVar.k) {
                                    n2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ArrayList arrayList3 = eVar.f4142i;
                                ((e2.d) arrayList3.get(arrayList3.size() - 1)).f4132j.add(new l0(str2, list, i16, n0Var, fA8, mVar, fA16, fA17, i12, i14, fA15, fA110, fA18, fA19));
                                i19 = i11;
                            }
                        } else {
                            i11 = i19;
                            if (name.equals("clip-path")) {
                                TypedArray typedArrayG4 = w3.b.g(resources, theme, attributeSetAsAttributeSet, f2.b.f5246d);
                                aVar3.b(typedArrayG4.getChangingConfigurations());
                                String string4 = typedArrayG4.getString(0);
                                aVar3.b(typedArrayG4.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                String string5 = typedArrayG4.getString(1);
                                aVar3.b(typedArrayG4.getChangingConfigurations());
                                if (string5 == null) {
                                    int i27 = i0.f4202a;
                                } else {
                                    listS = a2.d.s(dVar2, string5);
                                }
                                List list2 = listS;
                                typedArrayG4.recycle();
                                if (eVar.k) {
                                    n2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                eVar.f4142i.add(new e2.d(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                i19 = i11 + 1;
                            } else {
                                i19 = i11;
                            }
                        }
                    } else {
                        i11 = i19;
                    }
                    i19 = i11;
                }
                xmlResourceParser.next();
                xml = xmlResourceParser;
                i17 = i21;
            }
            aVar2 = new w2.a(eVar.b(), i17 | aVar3.f5241b);
            cVar.f14089a.put(bVar, new WeakReference(aVar2));
        }
        k0 k0VarC = e2.b.c(aVar2.f14085a, sVar);
        sVar.p(false);
        return k0VarC;
    }

    public static void O(long j5, b3.h hVar, boolean z10, s0.d dVar) {
        if (z10) {
            int i7 = q0.f1429c;
            int iCharCount = (int) (j5 >> 32);
            int iCharCount2 = (int) (j5 & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(hVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < hVar.f1353b.length() ? Character.codePointAt(hVar, iCharCount2) : 10;
            if (n.D0(iCodePointBefore) && (n.C0(iCodePointAt) || n.B0(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(hVar, iCharCount);
                    }
                } while (n.D0(iCodePointBefore));
                j5 = g0.b(iCharCount, iCharCount2);
            } else if (n.D0(iCodePointAt) && (n.C0(iCodePointBefore) || n.B0(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == hVar.f1353b.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(hVar, iCharCount2);
                    }
                } while (n.D0(iCodePointAt));
                j5 = g0.b(iCharCount, iCharCount2);
            }
        }
        int i10 = (int) (4294967295L & j5);
        dVar.invoke(new u0.j(new g3.g[]{new g3.v(i10, i10), new g3.e(q0.d(j5), 0)}));
    }

    public static final r1.p P(r1.p pVar, float f10) {
        return f10 == 0.0f ? pVar : androidx.compose.ui.graphics.a.b(pVar, 0.0f, f10, null, 524031);
    }

    public static final k Q(x1.c cVar) {
        return new k(Math.round(cVar.f14523a), Math.round(cVar.f14524b), Math.round(cVar.f14525c), Math.round(cVar.f14526d));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00da  */
    /* JADX WARN: Code duplicated, block: B:86:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00e0 A[SYNTHETIC] */
    public static t5.b R(t5.b bVar, int i7, int i10, t5.f fVar) throws n5.i {
        int i11 = i10;
        if (i7 <= 0 || i11 <= 0) {
            throw n5.i.f8833c;
        }
        t5.b bVar2 = new t5.b(i7, i11);
        int i12 = i7 * 2;
        float[] fArr = new float[i12];
        int i13 = 0;
        while (i13 < i11) {
            float f10 = i13 + 0.5f;
            for (int i14 = 0; i14 < i12; i14 += 2) {
                fArr[i14] = (i14 / 2) + 0.5f;
                fArr[i14 + 1] = f10;
            }
            float f11 = fVar.f12782a;
            float f12 = fVar.f12783b;
            float f13 = fVar.f12784c;
            float f14 = fVar.f12785d;
            float f15 = fVar.f12786e;
            float f16 = fVar.f12787f;
            float f17 = fVar.f12788g;
            float f18 = fVar.f12789h;
            float f19 = fVar.f12790i;
            int i15 = i12 - 1;
            for (int i16 = 0; i16 < i15; i16 += 2) {
                float f20 = fArr[i16];
                int i17 = i16 + 1;
                float f21 = fArr[i17];
                float f22 = (f16 * f21) + (f13 * f20) + f19;
                fArr[i16] = (((f14 * f21) + (f11 * f20)) + f17) / f22;
                fArr[i17] = (((f21 * f15) + (f20 * f12)) + f18) / f22;
            }
            int i18 = bVar.f12761a;
            int i19 = bVar.f12762b;
            boolean z10 = true;
            for (int i20 = 0; i20 < i15 && z10; i20 += 2) {
                int i21 = (int) fArr[i20];
                int i22 = i20 + 1;
                int i23 = (int) fArr[i22];
                if (i21 < -1 || i21 > i18 || i23 < -1 || i23 > i19) {
                    throw n5.i.f8833c;
                }
                if (i21 == -1) {
                    fArr[i20] = 0.0f;
                } else {
                    if (i21 == i18) {
                        fArr[i20] = i18 - 1;
                    } else {
                        z10 = false;
                    }
                    if (i23 == -1) {
                        fArr[i22] = 0.0f;
                    } else {
                        if (i23 == i19) {
                            fArr[i22] = i19 - 1;
                        }
                    }
                    z10 = true;
                }
                z10 = true;
                if (i23 == -1) {
                    fArr[i22] = 0.0f;
                } else {
                    if (i23 == i19) {
                        fArr[i22] = i19 - 1;
                    }
                }
                z10 = true;
            }
            boolean z11 = true;
            for (int i24 = i12 - 2; i24 >= 0 && z11; i24 -= 2) {
                int i25 = (int) fArr[i24];
                int i26 = i24 + 1;
                int i27 = (int) fArr[i26];
                if (i25 < -1 || i25 > i18 || i27 < -1 || i27 > i19) {
                    throw n5.i.f8833c;
                }
                if (i25 == -1) {
                    fArr[i24] = 0.0f;
                } else {
                    if (i25 == i18) {
                        fArr[i24] = i18 - 1;
                    } else {
                        z11 = false;
                    }
                    if (i27 == -1) {
                        fArr[i26] = 0.0f;
                    } else {
                        if (i27 == i19) {
                            fArr[i26] = i19 - 1;
                        }
                    }
                    z11 = true;
                }
                z11 = true;
                if (i27 == -1) {
                    fArr[i26] = 0.0f;
                } else {
                    if (i27 == i19) {
                        fArr[i26] = i19 - 1;
                    }
                }
                z11 = true;
            }
            for (int i28 = 0; i28 < i12; i28 += 2) {
                try {
                    if (bVar.b((int) fArr[i28], (int) fArr[i28 + 1])) {
                        bVar2.f(i28 / 2, i13);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw n5.i.f8833c;
                }
            }
            i13++;
            i11 = i10;
        }
        return bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object S(o1 o1Var, float f10, a9.c cVar) {
        b1 b1Var;
        i9.u uVar;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i7 = b1Var.f15314c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                b1Var.f15314c = i7 - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(cVar);
            }
        } else {
            b1Var = new b1(cVar);
        }
        Object obj = b1Var.f15313b;
        int i10 = b1Var.f15314c;
        if (i10 == 0) {
            t8.a.e(obj);
            i9.u uVar2 = new i9.u();
            h9.n c1Var = new c1(uVar2, f10, null);
            b1Var.f15312a = uVar2;
            b1Var.f15314c = 1;
            Object objC = o1Var.c(v0.f14491a, c1Var, b1Var);
            Object obj2 = z8.a.f15774a;
            if (objC == obj2) {
                return obj2;
            }
            uVar = uVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = b1Var.f15312a;
            t8.a.e(obj);
        }
        return new Float(uVar.f6685a);
    }

    public static final Object T(Set set, Enum r8, Enum r10, Enum r11, boolean z10) {
        Enum r12;
        if (!z10) {
            if (r11 != null) {
                set = u8.p.M0(f0.h0(set, r11));
            }
            return u8.p.B0(set);
        }
        if (set.contains(r8)) {
            r12 = r8;
        } else {
            r12 = set.contains(r10) ? r10 : null;
        }
        if (i9.l.a(r12, r8) && i9.l.a(r11, r10)) {
            return null;
        }
        return r11 == null ? r12 : r11;
    }

    public static final void U(f4.f fVar, y2.m mVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f5287a;
        Object objG = mVar.k().f15011a.g(y2.r.f15055f);
        if (objG == null) {
            objG = null;
        }
        y2.b bVar = (y2.b) objG;
        if (bVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bVar.f14971a, bVar.f14972b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = mVar.k().f15011a.g(y2.r.f15054e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listJ = y2.m.j(4, mVar);
            int size = listJ.size();
            for (int i7 = 0; i7 < size; i7++) {
                y2.m mVar2 = (y2.m) listJ.get(i7);
                if (mVar2.k().f15011a.c(y2.r.H)) {
                    arrayList.add(mVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zO = o(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zO ? 1 : arrayList.size(), zO ? arrayList.size() : 1, false, 0));
    }

    public static final void V(f4.f fVar, y2.m mVar) {
        Object objG = mVar.k().f15011a.g(y2.r.f15056g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            throw new ClassCastException();
        }
        y2.m mVarL = mVar.l();
        if (mVarL == null) {
            return;
        }
        Object objG2 = mVarL.k().f15011a.g(y2.r.f15054e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = mVarL.k().f15011a.g(y2.r.f15055f);
            y2.b bVar = (y2.b) (objG3 != null ? objG3 : null);
            if (bVar == null || (bVar.f14971a >= 0 && bVar.f14972b >= 0)) {
                if (mVar.k().f15011a.c(y2.r.H)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = y2.m.j(4, mVarL);
                    int size = listJ.size();
                    int i7 = 0;
                    for (int i10 = 0; i10 < size; i10++) {
                        y2.m mVar2 = (y2.m) listJ.get(i10);
                        if (mVar2.k().f15011a.c(y2.r.H)) {
                            arrayList.add(mVar2);
                            if (mVar2.f15019c.w() < mVar.f15019c.w()) {
                                i7++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zO = o(arrayList);
                    int i11 = zO ? 0 : i7;
                    int i12 = zO ? i7 : 0;
                    Object objG4 = mVar.k().f15011a.g(y2.r.H);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    fVar.f5287a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i11, 1, i12, 1, false, ((Boolean) objG4).booleanValue()));
                }
            }
        }
    }

    public static final String W(x9.e eVar, String str) {
        i9.l.e(eVar, "classDescriptor");
        i9.l.e(str, "jvmDescriptor");
        String str2 = w9.d.f14177a;
        wa.b bVarF = w9.d.f(db.e.g(eVar).f14240a);
        String strE = bVarF != null ? eb.b.e(bVarF) : r.o(eVar, pa.f.f10337d);
        i9.l.e(strE, "internalName");
        return strE + '.' + str;
    }

    public static final wa.c X(wa.c cVar, wa.c cVar2) {
        i9.l.e(cVar, "<this>");
        wa.d dVar = cVar.f14240a;
        i9.l.e(cVar2, "prefix");
        wa.d dVar2 = cVar2.f14240a;
        if (!cVar.equals(cVar2) && !dVar2.c()) {
            String str = dVar.f14243a;
            String str2 = dVar2.f14243a;
            if (!zb.q.o0(str, str2) || str.charAt(str2.length()) != '.') {
                return cVar;
            }
        }
        if (dVar2.c()) {
            return cVar;
        }
        if (cVar.equals(cVar2)) {
            return wa.c.f14239c;
        }
        String strSubstring = dVar.f14243a.substring(dVar2.f14243a.length() + 1);
        i9.l.d(strSubstring, "substring(...)");
        return new wa.c(strSubstring);
    }

    public static void Y() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final String Z(String str) {
        i9.l.e(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        i9.l.d(string, "toString(...)");
        return string;
    }

    public static long a(float f10) {
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
    }

    public static final void b(h9.a aVar, r3.s sVar, n1.c cVar, f1.s sVar2, int i7, int i10) {
        int i11;
        r3.s sVar3;
        int i12;
        r3.s sVar4;
        sVar2.Y(826668973);
        if ((i7 & 6) == 0) {
            i11 = i7 | (sVar2.h(aVar) ? 4 : 2);
        } else {
            i11 = i7;
        }
        int i13 = i10 & 2;
        if (i13 != 0) {
            i12 = i11 | 48;
            sVar3 = sVar;
        } else {
            sVar3 = sVar;
            i12 = i11 | (sVar2.f(sVar3) ? 32 : 16);
        }
        int i14 = i12;
        if (sVar2.N(i14 & 1, (i14 & 147) != 146)) {
            sVar4 = i13 != 0 ? new r3.s(7, false) : sVar3;
            View view = (View) sVar2.j(r2.n0.f11347f);
            c cVar2 = (c) sVar2.j(j1.f11276h);
            o oVar = (o) sVar2.j(j1.f11281n);
            f1.q qVarU = f1.b.u(sVar2);
            f1.b1 b1VarV = f1.b.v(cVar, sVar2);
            Object[] objArr = new Object[0];
            Object objK = sVar2.K();
            Object obj = f1.n.f5051a;
            if (objK == obj) {
                objK = r3.e.f11546b;
                sVar2.h0(objK);
            }
            UUID uuid = (UUID) o1.k.c(Arrays.copyOf(objArr, 0), o1.k.f9286a, (h9.a) objK, sVar2, 3456);
            boolean zF = sVar2.f(view) | sVar2.f(cVar2);
            Object objK2 = sVar2.K();
            if (zF || objK2 == obj) {
                r3.t tVar = new r3.t(aVar, sVar4, view, oVar, cVar2, uuid);
                n1.c cVar3 = new n1.c(new c1.n(4, b1VarV), 346960332, true);
                r3.r rVar = tVar.f11593g;
                rVar.setParentCompositionContext(qVarU);
                rVar.f11580j.setValue(cVar3);
                rVar.f11583n = true;
                if (rVar.f11135d == null && !rVar.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                rVar.c();
                sVar2.h0(tVar);
                objK2 = tVar;
            }
            r3.t tVar2 = (r3.t) objK2;
            boolean zH = sVar2.h(tVar2);
            Object objK3 = sVar2.K();
            if (zH || objK3 == obj) {
                objK3 = new b0(tVar2, null, 4);
                sVar2.h0(objK3);
            }
            f1.b.f(sVar2, (h9.n) objK3, z.f12851a);
            boolean zH2 = sVar2.h(tVar2);
            Object objK4 = sVar2.K();
            if (zH2 || objK4 == obj) {
                objK4 = new r3.a(tVar2, 0);
                sVar2.h0(objK4);
            }
            f1.b.c(tVar2, (h9.k) objK4, sVar2);
            boolean zH3 = sVar2.h(tVar2) | ((i14 & 14) == 4) | ((i14 & 112) == 32) | sVar2.d(oVar.ordinal());
            Object objK5 = sVar2.K();
            if (zH3 || objK5 == obj) {
                objK5 = new r3.b(tVar2, aVar, sVar4, oVar);
                sVar2.h0(objK5);
            }
            f1.b.h((h9.a) objK5, sVar2);
        } else {
            sVar2.Q();
            sVar4 = sVar3;
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new r3.c(aVar, sVar4, cVar, i7, i10);
        }
    }

    public static void c(f1.s sVar) {
        sVar.W(-911979777);
        sVar.p(false);
    }

    public static void d(f1.s sVar) {
        sVar.W(-928336112);
        sVar.p(false);
    }

    public static final void e(r1.p pVar, n1.c cVar, f1.s sVar, int i7) {
        int i10;
        sVar.Y(790527681);
        int i11 = 4;
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(cVar) ? 32 : 16;
        }
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                k1 k1Var = new k1(null, w0.f5184c);
                sVar.h0(k1Var);
                objK = k1Var;
            }
            f1.b1 b1Var = (f1.b1) objK;
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new o7.o(b1Var, 7);
                sVar.h0(objK2);
            }
            h9.a aVar = (h9.a) objK2;
            r3.z zVar = q0.k.f10564a;
            s0.c cVarE = r.e(q0.i.f10559b, sVar, 6);
            f1.b.b(new u1[]{s0.g.f12535b.a(n4.h.c0(aVar, sVar, 2)), s0.g.f12534a.a(cVarE)}, n1.h.e(1070596993, new a8.s(pVar, b1Var, cVar, cVarE, aVar, 10), sVar), sVar, 56);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new q0.g(pVar, cVar, i7, i11);
        }
    }

    public static final void f(r1.p pVar, n1.c cVar, f1.s sVar, int i7) {
        int i10;
        sVar.Y(155925518);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(cVar) ? 32 : 16;
        }
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            boolean z10 = sVar.j(s0.g.f12534a) != null;
            boolean z11 = sVar.j(s0.g.f12535b) != null;
            if (z10 && z11) {
                sVar.W(-1977156178);
                m0 m0VarD = d0.m.d(r1.c.f11092a, true);
                long j5 = sVar.T;
                int i11 = (int) ((j5 >>> 32) ^ j5);
                q1 q1VarL = sVar.l();
                r1.p pVarC = r1.a.c(sVar, pVar);
                q2.j.f10719d0.getClass();
                a0 a0Var = q2.i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, q2.i.f10708e, m0VarD);
                f1.b.w(sVar, q2.i.f10707d, q1VarL);
                q2.h hVar = q2.i.f10709f;
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i11))) {
                    ob.a.w(i11, sVar, i11, hVar);
                }
                f1.b.w(sVar, q2.i.f10706c, pVarC);
                cVar.invoke(sVar, Integer.valueOf((i10 >> 3) & 14));
                sVar.p(true);
                sVar.p(false);
            } else if (z10) {
                sVar.W(-1976965962);
                n4.h.c(pVar, cVar, sVar, i10 & 126);
                sVar.p(false);
            } else if (z11) {
                sVar.W(-1976815178);
                q0.k.d(pVar, cVar, sVar, i10 & 126);
                sVar.p(false);
            } else {
                sVar.W(-1976684761);
                e(pVar, cVar, sVar, i10 & 126);
                sVar.p(false);
            }
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new q0.g(pVar, cVar, i7, 3);
        }
    }

    public static void g(f1.s sVar) {
        sVar.W(-2009981534);
        sVar.p(false);
    }

    public static final long h(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static float i(EdgeEffect edgeEffect, float f10, float f11, c cVar) {
        float f12 = x.a0.f14303a;
        double dA = cVar.a() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f10) * 0.35f;
        double d10 = ((double) x.a0.f14303a) * dA;
        float fExp = (float) (Math.exp((x.a0.f14304b / x.a0.f14305c) * Math.log(dAbs / d10)) * d10);
        int i7 = Build.VERSION.SDK_INT;
        if (fExp > (i7 >= 31 ? x.k.b(edgeEffect) : 0.0f) * f11) {
            return 0.0f;
        }
        int iM = k9.a.M(f10);
        if (i7 >= 31) {
            edgeEffect.onAbsorb(iM);
            return f10;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iM);
        }
        return f10;
    }

    public static final void j(r1.p pVar, h9.n nVar, f1.s sVar, int i7) {
        int i10;
        sVar.Y(1090521195);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(nVar) ? 32 : 16;
        }
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = r3.f.f11550b;
                sVar.h0(objK);
            }
            m0 m0Var = (m0) objK;
            long j5 = sVar.T;
            int i11 = (int) ((j5 >>> 32) ^ j5);
            q1 q1VarL = sVar.l();
            r1.p pVarC = r1.a.c(sVar, pVar);
            q2.j.f10719d0.getClass();
            a0 a0Var = q2.i.f10705b;
            int i12 = (((((i10 << 3) & 112) | (((i10 >> 3) & 14) | 384)) << 6) & 896) | 6;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, m0Var);
            f1.b.w(sVar, q2.i.f10707d, q1VarL);
            q2.h hVar = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i11))) {
                ob.a.w(i11, sVar, i11, hVar);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC);
            nVar.invoke(sVar, Integer.valueOf((i12 >> 6) & 14));
            sVar.p(true);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new q3.l(pVar, nVar, i7);
        }
    }

    public static final String k(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        i9.l.d(parameterTypes, "getParameterTypes(...)");
        sb2.append(u8.l.F0(parameterTypes, "", "(", ")", r9.b.f11659j, 24));
        Class<?> returnType = method.getReturnType();
        i9.l.d(returnType, "getReturnType(...)");
        sb2.append(da.d.b(returnType));
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int l(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.l.l(int, int, int, boolean):int");
    }

    public static ArrayList m(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new u8.j(objArr, true));
    }

    public static v8.b n(v8.b bVar) {
        bVar.o();
        bVar.f13662c = true;
        return bVar.f13661b > 0 ? bVar : v8.b.f13659d;
    }

    public static final boolean o(ArrayList arrayList) {
        List list;
        long j5;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = u8.w.f13122a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iA = A(arrayList);
                int i7 = 0;
                while (i7 < iA) {
                    i7++;
                    Object obj2 = arrayList.get(i7);
                    y2.m mVar = (y2.m) obj2;
                    y2.m mVar2 = (y2.m) obj;
                    float fAbs = Math.abs(Float.intBitsToFloat((int) (mVar2.g().b() >> 32)) - Float.intBitsToFloat((int) (mVar.g().b() >> 32)));
                    float fAbs2 = Math.abs(Float.intBitsToFloat((int) (mVar2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (mVar.g().b() & 4294967295L)));
                    arrayList2.add(new x1.b((((long) Float.floatToRawIntBits(fAbs)) << 32) | (((long) Float.floatToRawIntBits(fAbs2)) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j5 = ((x1.b) u8.p.k0(list)).f14521a;
            } else {
                if (list.isEmpty()) {
                    p3.a.b("Empty collection can't be reduced.");
                }
                Object objK0 = u8.p.k0(list);
                int iA2 = A(list);
                if (1 <= iA2) {
                    int i10 = 1;
                    while (true) {
                        objK0 = new x1.b(x1.b.h(((x1.b) objK0).f14521a, ((x1.b) list.get(i10)).f14521a));
                        if (i10 == iA2) {
                            break;
                        }
                        i10++;
                    }
                }
                j5 = ((x1.b) objK0).f14521a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j5)) >= Float.intBitsToFloat((int) (j5 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final String p(String str) {
        char cCharAt;
        i9.l.e(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(cCharAt));
        sb2.append((CharSequence) str, 1, str.length());
        return sb2.toString();
    }

    public static void q(int i7) {
        if (2 > i7 || i7 >= 37) {
            StringBuilder sbT = ob.a.t("radix ", " was not in valid range ", i7);
            sbT.append(new n9.d(2, 36, 1));
            throw new IllegalArgumentException(sbT.toString());
        }
    }

    public static final y9.h r(y9.h hVar, y9.h hVar2) {
        i9.l.e(hVar, "first");
        i9.l.e(hVar2, "second");
        if (hVar.isEmpty()) {
            return hVar2;
        }
        return hVar2.isEmpty() ? hVar : new y9.i(new y9.h[]{hVar, hVar2});
    }

    public static final boolean t(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static int u(HandwritingGesture handwritingGesture, s0.d dVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        dVar.invoke(new g3.a(1, fallbackText));
        return 5;
    }

    public static final int w(s9.g gVar) {
        i9.l.e(gVar, "<this>");
        return gVar.q().size();
    }

    public static final long x(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final o9.c y(i9.m mVar) {
        o9.d dVarC = ((n1) mVar).c();
        if (dVarC != null) {
            return z(dVarC);
        }
        throw new cc.a0(2, "Cannot calculate JVM erasure for type: " + mVar);
    }

    public static final o9.c z(o9.d dVar) {
        Object obj;
        if (dVar instanceof o9.c) {
            return (o9.c) dVar;
        }
        if (!(dVar instanceof o9.v)) {
            throw new cc.a0(2, "Cannot calculate JVM erasure for type: " + dVar);
        }
        r1 r1Var = ((r9.o1) ((o9.v) dVar)).f11737b;
        o9.u uVar = r9.o1.f11735d[0];
        Object objInvoke = r1Var.invoke();
        i9.l.d(objInvoke, "getValue(...)");
        List list = (List) objInvoke;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i9.m mVar = (i9.m) next;
            i9.l.c(mVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            x9.h hVarL = ((n1) mVar).f11727a.D0().l();
            x9.e eVar = hVarL instanceof x9.e ? (x9.e) hVarL : null;
            if (eVar != null && eVar.f() != x9.f.f14702b && eVar.f() != x9.f.f14705e) {
                obj = next;
                break;
            }
        }
        i9.m mVar2 = (i9.m) obj;
        if (mVar2 == null) {
            mVar2 = (i9.m) u8.p.m0(list);
        }
        return mVar2 != null ? y(mVar2) : y.f6689a.b(Object.class);
    }

    public abstract boolean s(p2.f fVar);

    public abstract Object v(p2.f fVar);
}
