package n4;

import a8.a1;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.InputFilter;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import cc.d1;
import cc.s;
import f1.b1;
import f1.k1;
import f1.w0;
import f1.w1;
import gb.o;
import i9.b0;
import i9.y;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import k2.l0;
import k2.m0;
import k2.v;
import k2.z;
import l0.x0;
import n3.u;
import nb.a0;
import nb.n0;
import nb.w;
import org.xmlpull.v1.XmlPullParserException;
import q2.h0;
import q2.t;
import r2.j0;
import r9.r;
import r9.r1;
import r9.x1;
import s.d0;
import u8.c0;
import u8.p;
import u8.q;
import u8.x;
import u9.n;
import v9.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e2.f f8782b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8783a;

    public /* synthetic */ h(int i7) {
        this.f8783a = i7;
    }

    public static final boolean A(long j5, long j10) {
        return j5 == j10;
    }

    public static final wa.e B(w wVar) {
        String str;
        y9.b bVarG = wVar.getAnnotations().g(n.f13188r);
        if (bVarG != null) {
            Object objB0 = p.B0(bVarG.b().values());
            bb.w wVar2 = objB0 instanceof bb.w ? (bb.w) objB0 : null;
            if (wVar2 != null && (str = (String) wVar2.f1683a) != null) {
                if (!wa.e.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return wa.e.e(str);
                }
            }
        }
        return null;
    }

    public static y9.b C(y9.h hVar, wa.c cVar) {
        Object next;
        i9.l.e(cVar, "fqName");
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (i9.l.a(((y9.b) next).a(), cVar)) {
                return (y9.b) next;
            }
        }
        next = null;
        return (y9.b) next;
    }

    public static pa.p D(u uVar) {
        if (uVar instanceof va.e) {
            va.e eVar = (va.e) uVar;
            String str = eVar.f13712d;
            String str2 = eVar.f13713e;
            i9.l.e(str, "name");
            i9.l.e(str2, "desc");
            return new pa.p(str.concat(str2));
        }
        if (!(uVar instanceof va.d)) {
            throw new s();
        }
        va.d dVar = (va.d) uVar;
        String str3 = dVar.f13710d;
        String str4 = dVar.f13711e;
        i9.l.e(str3, "name");
        i9.l.e(str4, "desc");
        return new pa.p(str3 + '#' + str4);
    }

    public static final List E(w wVar) {
        i9.l.e(wVar, "<this>");
        O(wVar);
        int iT = t(wVar);
        if (iT == 0) {
            return u8.w.f13122a;
        }
        List listSubList = wVar.B0().subList(0, iT);
        ArrayList arrayList = new ArrayList(q.a0(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((n0) it.next()).b());
        }
        return arrayList;
    }

    public static final v9.k G(x9.h hVar) {
        if (!(hVar instanceof x9.e) || !u9.i.J(hVar)) {
            return null;
        }
        wa.d dVarH = db.e.h(hVar);
        if (!dVarH.d() || dVarH.c()) {
            return null;
        }
        m mVar = m.f13705b;
        wa.c cVarB = dVarH.g().b();
        String strB = dVarH.f().b();
        i9.l.d(strB, "asString(...)");
        mVar.getClass();
        v9.l lVarA = mVar.a(strB, cVarB);
        if (lVarA != null) {
            return lVarA.f13703a;
        }
        return null;
    }

    public static final w H(w wVar) {
        i9.l.e(wVar, "<this>");
        O(wVar);
        if (wVar.getAnnotations().g(n.f13186p) == null) {
            return null;
        }
        return ((n0) wVar.B0().get(t(wVar))).b();
    }

    public static File I(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i7 = 0; i7 < 100; i7++) {
            File file = new File(cacheDir, str + i7);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static final List J(w wVar) {
        i9.l.e(wVar, "<this>");
        O(wVar);
        List listB0 = wVar.B0();
        return listB0.subList(((!O(wVar) || wVar.getAnnotations().g(n.f13186p) == null) ? 0 : 1) + t(wVar), listB0.size() - 1);
    }

    public static boolean K(y9.h hVar, wa.c cVar) {
        i9.l.e(cVar, "fqName");
        return hVar.g(cVar) != null;
    }

    public static y8.c L(y8.c cVar) {
        y8.c cVarIntercepted;
        i9.l.e(cVar, "<this>");
        a9.c cVar2 = cVar instanceof a9.c ? (a9.c) cVar : null;
        return (cVar2 == null || (cVarIntercepted = cVar2.intercepted()) == null) ? cVar : cVarIntercepted;
    }

    public static String M(tb.e eVar, ia.e eVar2) {
        if (eVar.b(eVar2)) {
            return null;
        }
        return eVar.a();
    }

    public static final boolean N(o9.b bVar) {
        s9.g gVarG;
        s9.g gVarI;
        if (bVar instanceof o9.l) {
            o9.u uVar = (o9.u) bVar;
            Field fieldQ0 = n3.n.q0(uVar);
            if (!(fieldQ0 != null ? fieldQ0.isAccessible() : true)) {
                return false;
            }
            Method methodR0 = n3.n.r0(uVar.b());
            if (!(methodR0 != null ? methodR0.isAccessible() : true)) {
                return false;
            }
            Method methodR1 = n3.n.r0(((o9.l) bVar).c());
            if (!(methodR1 != null ? methodR1.isAccessible() : true)) {
                return false;
            }
        } else if (bVar instanceof o9.u) {
            o9.u uVar2 = (o9.u) bVar;
            Field fieldQ1 = n3.n.q0(uVar2);
            if (!(fieldQ1 != null ? fieldQ1.isAccessible() : true)) {
                return false;
            }
            Method methodR2 = n3.n.r0(uVar2.b());
            if (!(methodR2 != null ? methodR2.isAccessible() : true)) {
                return false;
            }
        } else if (bVar instanceof o9.p) {
            Field fieldQ2 = n3.n.q0(((o9.p) bVar).e());
            if (!(fieldQ2 != null ? fieldQ2.isAccessible() : true)) {
                return false;
            }
            Method methodR3 = n3.n.r0((o9.f) bVar);
            if (!(methodR3 != null ? methodR3.isAccessible() : true)) {
                return false;
            }
        } else if (bVar instanceof o9.g) {
            Field fieldQ3 = n3.n.q0(((o9.g) bVar).e());
            if (!(fieldQ3 != null ? fieldQ3.isAccessible() : true)) {
                return false;
            }
            Method methodR4 = n3.n.r0((o9.f) bVar);
            if (!(methodR4 != null ? methodR4.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(bVar instanceof o9.f)) {
                throw new UnsupportedOperationException("Unknown callable: " + bVar + " (" + bVar.getClass() + ')');
            }
            o9.f fVar = (o9.f) bVar;
            Method methodR5 = n3.n.r0(fVar);
            if (!(methodR5 != null ? methodR5.isAccessible() : true)) {
                return false;
            }
            r rVarA = x1.a(bVar);
            Object objR = (rVarA == null || (gVarI = rVarA.i()) == null) ? null : gVarI.r();
            AccessibleObject accessibleObject = objR instanceof AccessibleObject ? (AccessibleObject) objR : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            r rVarA2 = x1.a(fVar);
            Member memberR = (rVarA2 == null || (gVarG = rVarA2.g()) == null) ? null : gVarG.r();
            Constructor constructor = memberR instanceof Constructor ? (Constructor) memberR : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean O(w wVar) {
        i9.l.e(wVar, "<this>");
        x9.h hVarL = wVar.D0().l();
        if (hVarL == null) {
            return false;
        }
        v9.k kVarG = G(hVarL);
        return i9.l.a(kVarG, v9.g.f13697c) || i9.l.a(kVarG, v9.j.f13700c);
    }

    public static final boolean P(x1.d dVar) {
        long j5 = dVar.f14531e;
        return (j5 >>> 32) == (4294967295L & j5) && j5 == dVar.f14532f && j5 == dVar.f14533g && j5 == dVar.f14534h;
    }

    public static final boolean Q(w wVar) {
        i9.l.e(wVar, "<this>");
        x9.h hVarL = wVar.D0().l();
        return i9.l.a(hVarL != null ? G(hVarL) : null, v9.j.f13700c);
    }

    public static r1 R(x9.c cVar, h9.a aVar) {
        if (aVar != null) {
            return new r1(cVar, aVar);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }

    public static final wb.g S(ArrayList arrayList) {
        wb.g gVar = new wb.g();
        for (Object obj : arrayList) {
            o oVar = (o) obj;
            if (oVar != null && oVar != gb.n.f6198b) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    public static MappedByteBuffer T(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static w6.a W(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        w6.a aVar = new w6.a();
        xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        xmlResourceParser.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "supportsPictureInPicture", false);
        while (true) {
            int next = xmlResourceParser.next();
            String name = xmlResourceParser.getName();
            if (next == 3 && (d7.a.f("activity", name) || d7.a.f("activity-alias", name))) {
                break;
            }
            if (next == 2 && d7.a.f("intent-filter", name)) {
                if (aVar.f14139a == null) {
                    aVar.f14139a = new ArrayList();
                }
                aVar.f14139a.add(Z(xmlResourceParser));
            } else if (next == 2 && d7.a.f("meta-data", name)) {
                if (aVar.f14140b == null) {
                    aVar.f14140b = new ArrayList();
                }
                aVar.f14140b.add(a0(xmlResourceParser));
            }
        }
        return aVar;
    }

    public static v6.a X(Context context, int i7) {
        e2.g gVar;
        v6.a aVar = new v6.a();
        XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser(i7, "AndroidManifest.xml");
        do {
            try {
                if (xmlResourceParserOpenXmlResourceParser.getEventType() == 2) {
                    String name = xmlResourceParserOpenXmlResourceParser.getName();
                    if (d7.a.f("manifest", name)) {
                        String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(null, "package");
                        if (attributeValue == null) {
                            attributeValue = "";
                        }
                        aVar.f13625a = attributeValue;
                    }
                    if (d7.a.f("uses-sdk", name)) {
                        tb.p pVar = new tb.p();
                        pVar.f12922a = xmlResourceParserOpenXmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minSdkVersion", 0);
                        aVar.f13626b = pVar;
                    }
                    if (d7.a.f("uses-permission", name) || d7.a.f("uses-permission-sdk-23", name) || d7.a.f("uses-permission-sdk-m", name)) {
                        ArrayList arrayList = aVar.f13627c;
                        w6.c cVar = new w6.c();
                        cVar.f14145b = Integer.MAX_VALUE;
                        cVar.f14144a = xmlResourceParserOpenXmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
                        cVar.f14145b = xmlResourceParserOpenXmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxSdkVersion", Integer.MAX_VALUE);
                        cVar.f14146c = xmlResourceParserOpenXmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", "usesPermissionFlags", 0);
                        arrayList.add(cVar);
                    }
                    if (d7.a.f("queries", name)) {
                        ArrayList arrayList2 = aVar.f13628d;
                        String attributeValue2 = xmlResourceParserOpenXmlResourceParser.getAttributeValue(null, "package");
                        arrayList2.add(attributeValue2 != null ? attributeValue2 : "");
                    }
                    if (d7.a.f("application", name)) {
                        e2.g gVar2 = new e2.g();
                        xmlResourceParserOpenXmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
                        xmlResourceParserOpenXmlResourceParser.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "requestLegacyExternalStorage", false);
                        aVar.f13629e = gVar2;
                    }
                    if (d7.a.f("activity", name) || d7.a.f("activity-alias", name)) {
                        aVar.f13630f.add(W(xmlResourceParserOpenXmlResourceParser));
                    }
                    if (d7.a.f("service", name)) {
                        aVar.f13631g.add(b0(xmlResourceParserOpenXmlResourceParser));
                    }
                    if (d7.a.f("receiver", name)) {
                        aVar.f13632h.add(Y(xmlResourceParserOpenXmlResourceParser));
                    }
                    if (d7.a.f("meta-data", name) && (gVar = aVar.f13629e) != null) {
                        if (gVar.f4168a == null) {
                            gVar.f4168a = new ArrayList();
                        }
                        aVar.f13629e.f4168a.add(a0(xmlResourceParserOpenXmlResourceParser));
                    }
                }
            } catch (Throwable th) {
                if (xmlResourceParserOpenXmlResourceParser != null) {
                    try {
                        xmlResourceParserOpenXmlResourceParser.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } while (xmlResourceParserOpenXmlResourceParser.next() != 1);
        xmlResourceParserOpenXmlResourceParser.close();
        return aVar;
    }

    public static w6.b Y(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        w6.b bVar = new w6.b();
        xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "permission");
        while (true) {
            int next = xmlResourceParser.next();
            String name = xmlResourceParser.getName();
            if (next == 3 && d7.a.f("receiver", name)) {
                return bVar;
            }
            if (next == 2 && d7.a.f("intent-filter", name)) {
                if (bVar.f14141a == null) {
                    bVar.f14141a = new ArrayList();
                }
                bVar.f14141a.add(Z(xmlResourceParser));
            } else if (next == 2 && d7.a.f("meta-data", name)) {
                if (bVar.f14142b == null) {
                    bVar.f14142b = new ArrayList();
                }
                bVar.f14142b.add(a0(xmlResourceParser));
            }
        }
    }

    public static w6.a Z(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        w6.a aVar = new w6.a();
        aVar.f14139a = new ArrayList();
        aVar.f14140b = new ArrayList();
        while (true) {
            int next = xmlResourceParser.next();
            String name = xmlResourceParser.getName();
            if (next == 3 && d7.a.f("intent-filter", name)) {
                return aVar;
            }
            if (next == 2) {
                if (d7.a.f("action", name)) {
                    aVar.f14139a.add(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name"));
                } else if (d7.a.f("category", name)) {
                    aVar.f14140b.add(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name"));
                }
            }
        }
    }

    public static e a0(XmlResourceParser xmlResourceParser) {
        e eVar = new e(21);
        xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value");
        xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "resource", 0);
        return eVar;
    }

    public static w6.b b0(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        w6.b bVar = new w6.b();
        xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "permission");
        while (true) {
            int next = xmlResourceParser.next();
            String name = xmlResourceParser.getName();
            if (next == 3 && d7.a.f("service", name)) {
                return bVar;
            }
            if (next == 2 && d7.a.f("intent-filter", name)) {
                if (bVar.f14141a == null) {
                    bVar.f14141a = new ArrayList();
                }
                bVar.f14141a.add(Z(xmlResourceParser));
            } else if (next == 2 && d7.a.f("meta-data", name)) {
                if (bVar.f14142b == null) {
                    bVar.f14142b = new ArrayList();
                }
                bVar.f14142b.add(a0(xmlResourceParser));
            }
        }
    }

    public static final void c(r1.p pVar, n1.c cVar, f1.s sVar, int i7) {
        int i10;
        sVar.Y(2064964257);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(cVar) ? 32 : 16;
        }
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            e(pVar, cVar, sVar, ((i10 << 3) & 896) | (i10 & 14) | 48);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new q0.g(pVar, cVar, i7, 0);
        }
    }

    public static final q0.f c0(h9.a aVar, f1.s sVar, int i7) {
        View view = (View) sVar.j(r2.n0.f11347f);
        boolean zF = sVar.f(view);
        Object objK = sVar.K();
        Object obj = f1.n.f5051a;
        if (zF || objK == obj) {
            objK = new q0.f(view, null, aVar);
            sVar.h0(objK);
        }
        q0.f fVar = (q0.f) objK;
        boolean zH = sVar.h(fVar);
        Object objK2 = sVar.K();
        if (zH || objK2 == obj) {
            objK2 = new q0.a(fVar, 3);
            sVar.h0(objK2);
        }
        f1.b.c(fVar, (h9.k) objK2, sVar);
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:168:0x0355  */
    /* JADX WARN: Code duplicated, block: B:170:0x0358  */
    /* JADX WARN: Code duplicated, block: B:174:0x0366  */
    /* JADX WARN: Code duplicated, block: B:177:0x036c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0375 A[LOOP:5: B:178:0x0373->B:179:0x0375, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:193:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:195:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:? A[RETURN, SYNTHETIC] */
    public static final void d0(ViewStructure viewStructure, h0 h0Var, AutofillId autofillId, String str, z2.a aVar) {
        long j5;
        long j10;
        char c10;
        int i7;
        long j11;
        a3.a aVar2;
        y2.g gVar;
        b3.h hVar;
        s1.d dVar;
        boolean z10;
        s1.o oVar;
        Boolean bool;
        boolean z11;
        Integer num;
        Integer num2;
        List list;
        boolean z12;
        String strW;
        int size;
        String strI;
        int i10;
        String[] strArrC;
        String[] strArrC2;
        s.h0 h0Var2;
        long[] jArr;
        Object[] objArr;
        Integer num3;
        long[] jArr2;
        Object[] objArr2;
        s.h0 h0Var3;
        a3.a aVar3;
        y2.g gVar2;
        b3.h hVar2;
        char c11;
        Integer num4 = 1;
        y2.u uVar = y2.r.f15050a;
        y2.u uVar2 = y2.i.f14986a;
        y2.j jVarX = h0Var.x();
        if (jVarX == null || (h0Var3 = jVarX.f15011a) == null) {
            j5 = 128;
            j10 = 255;
            c10 = 7;
            i7 = 2;
            j11 = -9187201950435737472L;
            aVar2 = null;
            gVar = null;
            hVar = null;
            dVar = null;
            z10 = false;
            oVar = null;
            bool = null;
            z11 = false;
            num = null;
        } else {
            j5 = 128;
            Object[] objArr3 = h0Var3.f12438b;
            Object[] objArr4 = h0Var3.f12439c;
            long[] jArr3 = h0Var3.f12437a;
            j10 = 255;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                dVar = null;
                z10 = false;
                aVar3 = null;
                oVar = null;
                bool = null;
                gVar2 = null;
                z11 = false;
                num = null;
                hVar2 = null;
                c10 = 7;
                i7 = 2;
                while (true) {
                    long j12 = jArr3[i11];
                    j11 = -9187201950435737472L;
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((j12 & 255) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr3[i14];
                                Object obj2 = objArr4[i14];
                                y2.u uVar3 = (y2.u) obj;
                                if (i9.l.a(uVar3, y2.r.f15066r)) {
                                    i9.l.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    dVar = (s1.d) obj2;
                                } else if (i9.l.a(uVar3, y2.r.f15050a)) {
                                    i9.l.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    String str2 = (String) p.m0((List) obj2);
                                    if (str2 != null) {
                                        viewStructure.setContentDescription(str2);
                                    }
                                } else if (i9.l.a(uVar3, y2.r.f15065q)) {
                                    i9.l.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    oVar = (s1.o) obj2;
                                } else {
                                    if (i9.l.a(uVar3, y2.r.E)) {
                                        i9.l.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                        hVar2 = (b3.h) obj2;
                                    } else {
                                        c11 = '\b';
                                        if (i9.l.a(uVar3, y2.r.k)) {
                                            i9.l.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                            viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                        } else if (i9.l.a(uVar3, y2.r.N)) {
                                            i9.l.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                                            num = (Integer) obj2;
                                        } else if (i9.l.a(uVar3, y2.r.J)) {
                                            z11 = true;
                                        } else if (i9.l.a(uVar3, y2.r.f15072x)) {
                                            i9.l.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                            gVar2 = (y2.g) obj2;
                                        } else if (i9.l.a(uVar3, y2.r.H)) {
                                            i9.l.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                            bool = (Boolean) obj2;
                                        } else if (i9.l.a(uVar3, y2.r.I)) {
                                            i9.l.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                            aVar3 = (a3.a) obj2;
                                        } else if (i9.l.a(uVar3, y2.i.f14987b)) {
                                            viewStructure.setClickable(true);
                                        } else if (i9.l.a(uVar3, y2.i.f14988c)) {
                                            viewStructure.setLongClickable(true);
                                        } else if (i9.l.a(uVar3, y2.i.f15006v)) {
                                            viewStructure.setFocusable(true);
                                        } else if (i9.l.a(uVar3, y2.i.f14995j)) {
                                            z10 = true;
                                        }
                                    }
                                    j12 >>= c11;
                                }
                            }
                            c11 = '\b';
                            j12 >>= c11;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            } else {
                c10 = 7;
                i7 = 2;
                j11 = -9187201950435737472L;
                dVar = null;
                z10 = false;
                aVar3 = null;
                oVar = null;
                bool = null;
                gVar2 = null;
                z11 = false;
                num = null;
                hVar2 = null;
            }
            aVar2 = aVar3;
            gVar = gVar2;
            hVar = hVar2;
        }
        y2.j jVarX2 = h0Var.x();
        if (jVarX2 != null && jVarX2.f15013c && !jVarX2.f15014d) {
            jVarX2 = jVarX2.d();
            d0 d0Var = new d0(((h1.e) ((h1.b) h0Var.n()).f6413b).f6423c);
            d0Var.b(h0Var.n());
            while (d0Var.h()) {
                h0 h0Var4 = (h0) d0Var.j(d0Var.f12408b - 1);
                y2.j jVarX3 = h0Var4.x();
                if (jVarX3 != null && !jVarX3.f15013c) {
                    jVarX2.m(jVarX3);
                    if (!jVarX3.f15014d) {
                        d0Var.b(h0Var4.n());
                    }
                }
            }
        }
        if (jVarX2 == null || (h0Var2 = jVarX2.f15011a) == null) {
            num2 = num4;
            list = null;
        } else {
            Object[] objArr5 = h0Var2.f12438b;
            Object[] objArr6 = h0Var2.f12439c;
            long[] jArr4 = h0Var2.f12437a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i15 = 0;
                list = null;
                while (true) {
                    long j13 = jArr4[i15];
                    if ((((~j13) << c10) & j13 & j11) != j11) {
                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j13 & j10) < j5) {
                                int i18 = (i15 << 3) + i17;
                                Object obj3 = objArr5[i18];
                                num3 = num4;
                                Object obj4 = objArr6[i18];
                                jArr2 = jArr4;
                                y2.u uVar4 = (y2.u) obj3;
                                objArr2 = objArr5;
                                if (i9.l.a(uVar4, y2.r.f15058i)) {
                                    viewStructure.setEnabled(false);
                                } else if (i9.l.a(uVar4, y2.r.A)) {
                                    i9.l.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                num3 = num4;
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j13 >>= 8;
                            i17++;
                            jArr4 = jArr2;
                            objArr5 = objArr2;
                            num4 = num3;
                        }
                        num2 = num4;
                        jArr = jArr4;
                        objArr = objArr5;
                        if (i16 != 8) {
                            break;
                        }
                    } else {
                        num2 = num4;
                        jArr = jArr4;
                        objArr = objArr5;
                    }
                    if (i15 == length2) {
                        break;
                    }
                    i15++;
                    jArr4 = jArr;
                    objArr5 = objArr;
                    num4 = num2;
                }
            } else {
                num2 = num4;
                list = null;
            }
        }
        Integer numValueOf = Integer.valueOf(h0Var.f10668b);
        if (h0Var.v() == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        Integer numValueOf2 = (dVar == null && !z10) ? aVar2 != null ? Integer.valueOf(i7) : null : num2;
        if (numValueOf2 != null) {
            viewStructure.setAutofillType(numValueOf2.intValue());
        }
        if (oVar != null && (strArrC2 = u.C(oVar)) != null) {
            viewStructure.setAutofillHints(strArrC2);
        }
        aVar.f15694a.i(h0Var.f10668b, new s1.p(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (aVar2 != null) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(aVar2 == a3.a.f28a);
        } else if (bool != null && (gVar == null || gVar.f14983a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        s1.o.f12555a.getClass();
        String str3 = (String) u8.l.w0(u.C(s1.n.f12554b));
        if (oVar != null && (strArrC = u.C(oVar)) != null) {
            boolean z13 = u8.l.l0(str3, strArrC);
            if (!z11 || z13) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                viewStructure.setDataIsSensitive(true);
            }
            viewStructure.setVisibility(h0Var.E.f10615d.O0() ? 4 : 0);
            if (list != null) {
                size = list.size();
                strI = "";
                for (i10 = 0; i10 < size; i10++) {
                    b3.h hVar3 = (b3.h) list.get(i10);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strI);
                    strI = a2.f.I(sb2, hVar3.f1353b, '\n');
                }
                viewStructure.setText(strI);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((h1.b) h0Var.n()).isEmpty() && gVar != null && (strW = j0.w(gVar.f14983a)) != null) {
                viewStructure.setClassName(strW);
            }
            if (z10) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (hVar != null) {
                    viewStructure.setAutofillValue(AutofillValue.forText(hVar.f1353b));
                }
                if (z12) {
                    viewStructure.setInputType(129);
                }
            }
        }
        if (z11) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (z12) {
            viewStructure.setDataIsSensitive(true);
        }
        viewStructure.setVisibility(h0Var.E.f10615d.O0() ? 4 : 0);
        if (list != null) {
            size = list.size();
            strI = "";
            while (i10 < size) {
                b3.h hVar4 = (b3.h) list.get(i10);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strI);
                strI = a2.f.I(sb3, hVar4.f1353b, '\n');
            }
            viewStructure.setText(strI);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((h1.b) h0Var.n()).isEmpty()) {
            viewStructure.setClassName(strW);
        }
        if (z10) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (hVar != null) {
                viewStructure.setAutofillValue(AutofillValue.forText(hVar.f1353b));
            }
            if (z12) {
                viewStructure.setInputType(129);
            }
        }
    }

    public static final void e(r1.p pVar, n1.c cVar, f1.s sVar, int i7) {
        int i10;
        sVar.Y(771959668);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(null) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.h(cVar) ? 256 : 128;
        }
        if (sVar.N(i10 & 1, (i10 & 147) != 146)) {
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                k1 k1Var = new k1(null, w0.f5184c);
                sVar.h0(k1Var);
                objK = k1Var;
            }
            b1 b1Var = (b1) objK;
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new o7.o(b1Var, 6);
                sVar.h0(objK2);
            }
            f1.b.a(s0.g.f12535b.a(c0((h9.a) objK2, sVar, 0)), n1.h.e(-291176396, new a1(pVar, b1Var, cVar, 10), sVar), sVar, 56);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new q0.g(pVar, cVar, i7, 1);
        }
    }

    public static final x1.d f(float f10, float f11, float f12, float f13, long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new x1.d(f10, f11, f12, f13, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static String g0(long j5) {
        int i7 = (int) (j5 >> 32);
        int i10 = (int) (j5 & 4294967295L);
        if (Float.intBitsToFloat(i7) == Float.intBitsToFloat(i10)) {
            return "CornerRadius.circular(" + n3.n.N0(Float.intBitsToFloat(i7)) + ')';
        }
        return "CornerRadius.elliptical(" + n3.n.N0(Float.intBitsToFloat(i7)) + ", " + n3.n.N0(Float.intBitsToFloat(i10)) + ')';
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0032 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0051
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(k2.l0 r7, a9.a r8) {
        /*
            boolean r0 = r8 instanceof p0.a
            if (r0 == 0) goto L13
            r0 = r8
            p0.a r0 = (p0.a) r0
            int r1 = r0.f9994c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9994c = r1
            goto L18
        L13:
            p0.a r0 = new p0.a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f9993b
            int r1 = r0.f9994c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            k2.l0 r7 = r0.f9992a
            t8.a.e(r8)
            goto L3f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            t8.a.e(r8)
        L32:
            r0.f9992a = r7
            r0.f9994c = r2
            java.lang.Object r8 = a2.f.q(r7, r0)
            z8.a r1 = z8.a.f15774a
            if (r8 != r1) goto L3f
            return r1
        L3f:
            k2.n r8 = (k2.n) r8
            int r1 = r8.f7267d
            java.lang.Object r8 = r8.f7264a
            r1 = r1 & 66
            if (r1 == 0) goto L32
            int r1 = r8.size()
            r3 = 0
            r4 = 0
        L4f:
            if (r4 >= r1) goto L68
            java.lang.Object r5 = r8.get(r4)
            k2.v r5 = (k2.v) r5
            boolean r6 = r5.b()
            if (r6 != 0) goto L32
            boolean r6 = r5.f7285h
            if (r6 != 0) goto L32
            boolean r5 = r5.f7281d
            if (r5 == 0) goto L32
            int r4 = r4 + 1
            goto L4f
        L68:
            java.lang.Object r7 = r8.get(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.h.h(k2.l0, a9.a):java.lang.Object");
    }

    public static wa.c h0(wa.e eVar) {
        i9.l.e(eVar, "shortName");
        String strB = eVar.b();
        i9.l.d(strB, "asString(...)");
        return new wa.c(new wa.d(strB, wa.c.f14239c.f14240a, eVar));
    }

    public static final boolean i(u1.d dVar, long j5) {
        if (!dVar.f11117a.f11129n) {
            return false;
        }
        t tVar = q2.f.v(dVar).E.f10614c;
        if (!tVar.O.f11129n) {
            return false;
        }
        long jE = tVar.E(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        long j10 = dVar.f13042q;
        float f10 = ((int) (j10 >> 32)) + fIntBitsToFloat;
        float f11 = ((int) (j10 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j5 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f10) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f11;
    }

    public static Object i0(h9.n nVar, Object obj, y8.c cVar) {
        i9.l.e(nVar, "<this>");
        y8.h context = cVar.getContext();
        Object dVar = context == y8.i.f15108a ? new z8.d(cVar) : new z8.e(cVar, context);
        b0.d(2, nVar);
        return nVar.invoke(obj, dVar);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean j(l0 l0Var) {
        ?? r8 = l0Var.f7251f.f7258s.f7264a;
        int size = r8.size();
        boolean z10 = false;
        for (int i7 = 0; i7 < size; i7++) {
            if (((v) r8.get(i7)).f7281d) {
                z10 = true;
                break;
            }
        }
        return !z10;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[LOOP:0: B:20:0x0055->B:24:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x003d A[EDGE_INSN: B:28:0x003d->B:16:0x003d BREAK  A[LOOP:0: B:20:0x0055->B:24:0x0062], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:19:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object k(k2.l0 r6, k2.o r7, a9.a r8) {
        /*
            boolean r0 = r8 instanceof z.k0
            if (r0 == 0) goto L13
            r0 = r8
            z.k0 r0 = (z.k0) r0
            int r1 = r0.f15423d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15423d = r1
            goto L18
        L13:
            z.k0 r0 = new z.k0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15422c
            int r1 = r0.f15423d
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            k2.o r6 = r0.f15421b
            k2.l0 r7 = r0.f15420a
            t8.a.e(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            t8.a.e(r8)
            boolean r8 = j(r6)
            if (r8 != 0) goto L65
        L3d:
            r0.f15420a = r6
            r0.f15421b = r7
            r0.f15423d = r2
            java.lang.Object r8 = r6.b(r7, r0)
            z8.a r1 = z8.a.f15774a
            if (r8 != r1) goto L4c
            return r1
        L4c:
            k2.n r8 = (k2.n) r8
            java.lang.Object r8 = r8.f7264a
            int r1 = r8.size()
            r3 = 0
        L55:
            if (r3 >= r1) goto L65
            java.lang.Object r4 = r8.get(r3)
            k2.v r4 = (k2.v) r4
            boolean r4 = r4.f7281d
            if (r4 == 0) goto L62
            goto L3d
        L62:
            int r3 = r3 + 1
            goto L55
        L65:
            t8.z r6 = t8.z.f12851a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.h.k(k2.l0, k2.o, a9.a):java.lang.Object");
    }

    public static final Object l(z zVar, h9.n nVar, y8.c cVar) {
        Object objA0 = ((m0) zVar).A0(new x0(cVar.getContext(), nVar, (y8.c) null), cVar);
        return objA0 == z8.a.f15774a ? objA0 : t8.z.f12851a;
    }

    public static void m(s9.g gVar, Object[] objArr) {
        i9.l.e(objArr, "args");
        if (n3.l.w(gVar) == objArr.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + n3.l.w(gVar) + " arguments, but " + objArr.length + " were provided.");
    }

    public static final void n(long j5, z.x0 x0Var) {
        if (x0Var == z.x0.f15591a) {
            if (n3.a.g(j5) != Integer.MAX_VALUE) {
                return;
            }
            c0.b.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (n3.a.h(j5) != Integer.MAX_VALUE) {
                return;
            }
            c0.b.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final r1.p o(r1.p pVar, y1.l0 l0Var) {
        return androidx.compose.ui.graphics.a.b(pVar, 0.0f, 0.0f, l0Var, 518143);
    }

    public static final r1.p p(r1.p pVar) {
        return androidx.compose.ui.graphics.a.b(pVar, 0.0f, 0.0f, null, 520191);
    }

    public static void q(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final o0.c r(q2.l lVar) {
        o0.f fVar;
        n0.a aVar = new n0.a();
        q2.f.y(lVar, r0.c.f11077a, new c8.k(29, new c8.k(28, aVar), new d1(1, aVar, n0.a.class, "addFilter", "addFilter$foundation_release(Lkotlin/jvm/functions/Function1;)V", 0, 0, 6)));
        d0 d0Var = new d0();
        d0 d0Var2 = aVar.f8700a;
        Object[] objArr = d0Var2.f12407a;
        int i7 = d0Var2.f12408b;
        o0.b bVar = null;
        int i10 = 0;
        boolean z10 = true;
        while (true) {
            fVar = o0.f.f9260b;
            if (i10 >= i7) {
                break;
            }
            o0.b bVar2 = (o0.b) objArr[i10];
            if (!z10 || bVar2 != fVar) {
                if (bVar2 != fVar || bVar != fVar) {
                    if (bVar2 != fVar) {
                        d0 d0Var3 = aVar.f8701b;
                        Object[] objArr2 = d0Var3.f12407a;
                        int i11 = d0Var3.f12408b;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= i11) {
                                d0Var.a(bVar2);
                                bVar = bVar2;
                                break;
                            }
                            if (!((Boolean) ((h9.k) objArr2[i12]).invoke(bVar2)).booleanValue()) {
                                break;
                            }
                            i12++;
                        }
                    } else {
                        d0Var.a(bVar2);
                        bVar = bVar2;
                        break;
                    }
                }
                z10 = false;
            }
            i10++;
        }
        if (((o0.b) (d0Var.g() ? null : d0Var.f12407a[d0Var.f12408b - 1])) == fVar) {
            d0Var.j(d0Var.f12408b - 1);
        }
        h1.b bVar3 = d0Var.f12409c;
        if (bVar3 == null) {
            bVar3 = new h1.b(1, d0Var);
            d0Var.f12409c = bVar3;
        }
        return new o0.c(bVar3);
    }

    public static final Collection s(Collection collection, Collection collection2) {
        i9.l.e(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final int t(w wVar) {
        i9.l.e(wVar, "<this>");
        y9.b bVarG = wVar.getAnnotations().g(n.f13187q);
        if (bVarG == null) {
            return 0;
        }
        bb.g gVar = (bb.g) u8.b0.V0(u9.o.f13201e, bVarG.b());
        i9.l.c(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((bb.k) gVar).f1683a).intValue();
    }

    public static final void u(int i7, int i10) {
        if (i7 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is greater than size (" + i10 + ").");
    }

    public static boolean v(File file, Resources resources, int i7) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i7);
            try {
                boolean zW = w(file, inputStreamOpenRawResource);
                q(inputStreamOpenRawResource);
                return zW;
            } catch (Throwable th) {
                th = th;
                q(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean w(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i7 = inputStream.read(bArr);
                        if (i7 == -1) {
                            q(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i7);
                    }
                } catch (IOException e7) {
                    e = e7;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    q(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    q(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static y8.c x(h9.n nVar, y8.c cVar, y8.c cVar2) {
        i9.l.e(nVar, "<this>");
        if (nVar instanceof a9.a) {
            return ((a9.a) nVar).create(cVar, cVar2);
        }
        y8.h context = cVar2.getContext();
        return context == y8.i.f15108a ? new z8.b(nVar, cVar2, cVar) : new z8.c(cVar2, context, nVar, cVar);
    }

    public static final a0 y(u9.i iVar, y9.h hVar, w wVar, List list, ArrayList arrayList, w wVar2, boolean z10) {
        x9.e eVarK;
        int i7 = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (wVar != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(q.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(n3.n.Q((w) it.next()));
        }
        arrayList2.addAll(arrayList3);
        wb.l.a(arrayList2, wVar != null ? n3.n.Q(wVar) : null);
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                n3.l.Y();
                throw null;
            }
            arrayList2.add(n3.n.Q((w) obj));
            i10 = i11;
        }
        arrayList2.add(n3.n.Q(wVar2));
        int size = list.size() + arrayList.size() + (wVar == null ? 0 : 1);
        if (z10) {
            eVarK = iVar.w(size);
        } else {
            wa.e eVar = u9.o.f13197a;
            eVarK = iVar.k("Function" + size);
        }
        y9.h iVar2 = y9.g.f15129a;
        if (wVar != null) {
            wa.c cVar = n.f13186p;
            if (!hVar.i(cVar)) {
                ArrayList arrayListW0 = p.w0(hVar, new y9.j(iVar, cVar, x.f13123a));
                hVar = arrayListW0.isEmpty() ? iVar2 : new y9.i(i7, arrayListW0);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            wa.c cVar2 = n.f13187q;
            if (!hVar.i(cVar2)) {
                ArrayList arrayListW1 = p.w0(hVar, new y9.j(iVar, cVar2, c0.T0(new t8.j(u9.o.f13201e, new bb.k(size2)))));
                if (!arrayListW1.isEmpty()) {
                    iVar2 = new y9.i(i7, arrayListW1);
                }
                hVar = iVar2;
            }
        }
        return nb.c.s(nb.c.B(hVar), eVarK, arrayList2);
    }

    public static void z(t1.c cVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        y2.n nVar;
        y2.m mVar;
        h9.k kVar;
        int size = longSparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            long jKeyAt = longSparseArray.keyAt(i7);
            ViewTranslationResponse viewTranslationResponseO = c3.c.o(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseO != null && (value = viewTranslationResponseO.getValue("android:text")) != null && (text = value.getText()) != null && (nVar = (y2.n) cVar.k().b((int) jKeyAt)) != null && (mVar = nVar.f15024a) != null) {
                Object objG = mVar.f15020d.f15011a.g(y2.i.k);
                if (objG == null) {
                    objG = null;
                }
                y2.a aVar = (y2.a) objG;
                if (aVar != null && (kVar = (h9.k) aVar.f14970b) != null) {
                }
            }
        }
    }

    public abstract InputFilter[] F(InputFilter[] inputFilterArr);

    public abstract View U(int i7);

    public abstract boolean V();

    public abstract void e0(boolean z10);

    public abstract void f0(boolean z10);

    public int hashCode() {
        switch (this.f8783a) {
            case 1:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f8783a) {
            case 1:
                String strL = y.f6689a.b(getClass()).l();
                i9.l.b(strL);
                return strL;
            default:
                return super.toString();
        }
    }
}
