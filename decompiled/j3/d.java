package j3;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import b3.h0;
import b3.r0;
import b3.u;
import b3.v;
import b3.x;
import b3.z;
import f1.w2;
import f3.n;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import m3.o;
import m3.p;
import m3.q;
import m3.s;
import n3.r;
import r2.g0;
import y1.j0;
import y1.k0;
import y1.m;
import y1.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f6924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f3.d f6927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n3.c f6928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f6929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f6930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c3.h f6931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a2.b f6932j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6933l;

    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    /* JADX WARN: Code duplicated, block: B:224:0x0460  */
    /* JADX WARN: Code duplicated, block: B:236:0x049f  */
    /* JADX WARN: Code duplicated, block: B:237:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:239:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:240:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:243:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:244:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:246:0x04db  */
    /* JADX WARN: Code duplicated, block: B:247:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:249:0x0501  */
    /* JADX WARN: Code duplicated, block: B:252:0x0514  */
    /* JADX WARN: Code duplicated, block: B:254:0x0520  */
    /* JADX WARN: Code duplicated, block: B:256:0x0527  */
    /* JADX WARN: Code duplicated, block: B:262:0x0532  */
    /* JADX WARN: Code duplicated, block: B:264:0x0535  */
    /* JADX WARN: Code duplicated, block: B:266:0x053b  */
    /* JADX WARN: Code duplicated, block: B:270:0x0547  */
    /* JADX WARN: Code duplicated, block: B:276:0x0552  */
    /* JADX WARN: Code duplicated, block: B:278:0x0555  */
    /* JADX WARN: Code duplicated, block: B:282:0x055d  */
    /* JADX WARN: Code duplicated, block: B:285:0x0598  */
    /* JADX WARN: Code duplicated, block: B:287:0x059e  */
    /* JADX WARN: Code duplicated, block: B:290:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:293:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:295:0x05dd A[LOOP:8: B:294:0x05db->B:295:0x05dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:298:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:300:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:302:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:304:0x0603  */
    /* JADX WARN: Code duplicated, block: B:305:0x060c  */
    /* JADX WARN: Code duplicated, block: B:307:0x0615  */
    /* JADX WARN: Code duplicated, block: B:309:0x0629  */
    /* JADX WARN: Code duplicated, block: B:318:0x064d  */
    /* JADX WARN: Code duplicated, block: B:323:0x066a  */
    /* JADX WARN: Code duplicated, block: B:325:0x0676  */
    /* JADX WARN: Code duplicated, block: B:327:0x067c  */
    /* JADX WARN: Code duplicated, block: B:332:0x068a  */
    /* JADX WARN: Code duplicated, block: B:386:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:388:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:390:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:392:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:397:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:411:0x0849  */
    /* JADX WARN: Code duplicated, block: B:413:0x085a  */
    /* JADX WARN: Code duplicated, block: B:414:0x085e  */
    /* JADX WARN: Code duplicated, block: B:416:0x0869  */
    /* JADX WARN: Code duplicated, block: B:419:0x0873 A[LOOP:6: B:418:0x0871->B:419:0x0873, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:422:0x0884  */
    /* JADX WARN: Code duplicated, block: B:424:0x088f  */
    /* JADX WARN: Code duplicated, block: B:426:0x089d A[LOOP:7: B:425:0x089b->B:426:0x089d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:429:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:433:0x08be  */
    /* JADX WARN: Code duplicated, block: B:445:0x053e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:0x063c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:424:0x088f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public d(String str, r0 r0Var, List list, List list2, f3.d dVar, n3.c cVar) {
        Locale locale;
        int i7;
        Object obj;
        Typeface typeface;
        ?? arrayList;
        CharSequence charSequence;
        q qVar;
        v vVar;
        ArrayList arrayList2;
        int size;
        int i10;
        h0 h0Var;
        n nVar;
        boolean z10;
        h0 h0Var2;
        k3.a aVar;
        int size2;
        int i11;
        int[] iArr;
        int size3;
        int i12;
        int i13;
        int i14;
        int i15;
        int size4;
        int i16;
        ArrayList arrayList3;
        v vVar2;
        int i17;
        int i18;
        int i19;
        v vVar3;
        int size5;
        boolean z11;
        int i20;
        n3.c cVar2;
        n3.c cVar3;
        q qVar2;
        int size6;
        int i21;
        b3.f fVar;
        int i22;
        long j5;
        long jB;
        int size7;
        int i23;
        b3.f fVar2;
        b3.c cVar4;
        int i24;
        n3.c cVar5;
        int i25;
        Object eVar;
        b3.f fVar3;
        Object obj2;
        v vVar4;
        int i26;
        int i27;
        b3.f fVar4;
        Object obj3;
        h0 h0Var3;
        boolean z12;
        long j10;
        long j11;
        long jB2;
        float fC;
        long jB3;
        float fC2;
        x xVar;
        CharSequence charSequence2;
        this.f6923a = str;
        this.f6924b = r0Var;
        this.f6925c = list;
        this.f6926d = list2;
        this.f6927e = dVar;
        this.f6928f = cVar;
        float fA = cVar.a();
        f fVar5 = new f(1);
        ((TextPaint) fVar5).density = fA;
        fVar5.f6937b = m3.l.f8420b;
        fVar5.f6938c = 3;
        fVar5.f6939d = k0.f14924d;
        this.f6929g = fVar5;
        z zVar = r0Var.f1440c;
        h0 h0Var4 = r0Var.f1438a;
        v vVar5 = r0Var.f1439b;
        a2.d dVar2 = j.f6949a;
        a2.d dVar3 = j.f6949a;
        w2 w2VarO = (w2) dVar3.f20b;
        if (w2VarO == null) {
            if (l4.j.d()) {
                w2VarO = dVar3.o();
                dVar3.f20b = w2VarO;
            } else {
                w2VarO = k.f6950a;
            }
        }
        this.k = ((Boolean) w2VarO.getValue()).booleanValue();
        int i28 = vVar5.f1454b;
        i3.b bVar = h0Var4.k;
        int i29 = 0;
        if (i28 == 4) {
            i7 = 2;
        } else if (i28 == 5) {
            i7 = 3;
        } else if (i28 == 1) {
            i7 = 0;
        } else if (i28 == 2) {
            i7 = 1;
        } else {
            if (i28 != 3 && i28 != Integer.MIN_VALUE) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar == null || (locale = bVar.c().f6612a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i7 = 2;
            } else {
                i7 = 3;
            }
        }
        this.f6933l = i7;
        c cVar6 = new c(i29, this);
        s sVar = vVar5.f1461i;
        sVar = sVar == null ? s.f8433c : sVar;
        fVar5.setFlags(sVar.f8436b ? fVar5.getFlags() | 128 : fVar5.getFlags() & (-129));
        int i30 = sVar.f8435a;
        if (i30 == 1) {
            fVar5.setFlags(fVar5.getFlags() | 64);
            fVar5.setHinting(0);
        } else if (i30 == 2) {
            fVar5.getFlags();
            fVar5.setHinting(1);
        } else if (i30 == 3) {
            fVar5.getFlags();
            fVar5.setHinting(0);
        } else {
            fVar5.getFlags();
        }
        int size8 = list.size();
        int i31 = 0;
        while (true) {
            if (i31 >= size8) {
                obj = null;
                break;
            }
            obj = list.get(i31);
            if (((b3.f) obj).f1324a instanceof h0) {
                break;
            } else {
                i31++;
            }
        }
        boolean z13 = obj != null;
        long j12 = h0Var4.f1357b;
        f3.k kVar = h0Var4.f1358c;
        f3.i iVar = h0Var4.f1359d;
        String str2 = h0Var4.f1362g;
        o oVar = h0Var4.f1356a;
        p pVar = h0Var4.f1365j;
        i3.b bVar2 = h0Var4.k;
        long j13 = h0Var4.f1363h;
        long jB4 = n3.q.b(j12);
        boolean z14 = z13;
        if (n3.s.a(jB4, 4294967296L)) {
            fVar5.setTextSize(cVar.h0(j12));
        } else if (n3.s.a(jB4, 8589934592L)) {
            fVar5.setTextSize(n3.q.c(j12) * fVar5.getTextSize());
        }
        n nVar2 = h0Var4.f1361f;
        if (nVar2 != null || iVar != null || kVar != null) {
            f3.k kVar2 = kVar == null ? f3.k.f5258c : kVar;
            int i32 = iVar != null ? iVar.f5255a : 0;
            f3.j jVar = h0Var4.f1360e;
            int i33 = jVar != null ? jVar.f5256a : 65535;
            d dVar4 = (d) cVar6.f6922b;
            f3.p pVarB = ((f3.e) dVar4.f6927e).b(nVar2, kVar2, i32, i33);
            if (pVarB instanceof f3.p) {
                Object obj4 = pVarB.f5270a;
                i9.l.c(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                typeface = (Typeface) obj4;
            } else {
                a2.b bVar3 = new a2.b(pVarB, dVar4.f6932j);
                dVar4.f6932j = bVar3;
                Object obj5 = bVar3.f14d;
                i9.l.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                typeface = (Typeface) obj5;
            }
            fVar5.setTypeface(typeface);
        }
        if (bVar2 != null) {
            List list3 = bVar2.f6614a;
            i3.b bVar4 = i3.b.f6613c;
            i3.c cVar7 = i3.d.f6616a;
            if (!bVar2.equals(cVar7.n())) {
                if (Build.VERSION.SDK_INT >= 24) {
                    ArrayList arrayList4 = new ArrayList(u8.q.a0(bVar2, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(((i3.a) it.next()).f6612a);
                    }
                    Locale[] localeArr = (Locale[]) arrayList4.toArray(new Locale[0]);
                    fVar5.setTextLocales(g0.c((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                } else {
                    fVar5.setTextLocale((list3.isEmpty() ? cVar7.n().c() : bVar2.c()).f6612a);
                }
            }
        }
        if (str2 != null && !str2.equals("")) {
            fVar5.setFontFeatureSettings(str2);
        }
        if (pVar != null && !pVar.equals(p.f8426c)) {
            fVar5.setTextScaleX(fVar5.getTextScaleX() * pVar.f8427a);
            fVar5.setTextSkewX(fVar5.getTextSkewX() + pVar.f8428b);
        }
        fVar5.d(oVar.b());
        fVar5.c(oVar.e(), 9205357640488583168L, oVar.a());
        fVar5.f(h0Var4.f1368n);
        fVar5.g(h0Var4.f1367m);
        fVar5.e(h0Var4.f1370p);
        if (n3.s.a(n3.q.b(j13), 4294967296L) && n3.q.c(j13) != 0.0f) {
            float textScaleX = fVar5.getTextScaleX() * fVar5.getTextSize();
            float fH0 = cVar.h0(j13);
            if (textScaleX != 0.0f) {
                fVar5.setLetterSpacing(fH0 / textScaleX);
            }
        } else if (n3.s.a(n3.q.b(j13), 8589934592L)) {
            fVar5.setLetterSpacing(n3.q.c(j13));
        }
        long j14 = h0Var4.f1366l;
        m3.a aVar2 = h0Var4.f1364i;
        boolean z15 = z14 && n3.s.a(n3.q.b(j13), 4294967296L) && n3.q.c(j13) != 0.0f;
        long j15 = y1.q.f14958m;
        boolean z16 = (y1.q.c(j14, j15) || y1.q.c(j14, y1.q.f14957l)) ? false : true;
        boolean z17 = (aVar2 == null || Float.compare(aVar2.f8401a, 0.0f) == 0) ? false : true;
        h0 h0Var5 = (z15 || z16 || z17) ? new h0(0L, 0L, (f3.k) null, (f3.i) null, (f3.j) null, (n) null, (String) null, z15 ? j13 : n3.q.f8754c, z17 ? aVar2 : null, (p) null, (i3.b) null, z16 ? j14 : j15, (m3.l) null, (k0) null, 63103) : null;
        if (h0Var5 != null) {
            int size9 = this.f6925c.size() + 1;
            arrayList = new ArrayList(size9);
            int i34 = 0;
            while (i34 < size9) {
                arrayList.add(i34 == 0 ? new b3.f(0, this.f6923a.length(), h0Var5) : (b3.f) this.f6925c.get(i34 - 1));
                i34++;
            }
        } else {
            arrayList = this.f6925c;
        }
        String str3 = this.f6923a;
        float textSize = this.f6929g.getTextSize();
        r0 r0Var2 = this.f6924b;
        List list4 = this.f6926d;
        n3.c cVar8 = this.f6928f;
        boolean z18 = this.k;
        a aVar3 = b.f6920a;
        if (z18 && l4.j.d()) {
            z zVar2 = r0Var2.f1440c;
            if (zVar2 != null) {
                x xVar2 = zVar2.f1468b;
            }
            CharSequence charSequenceG = l4.j.a().g(0, str3.length(), 0, str3);
            i9.l.b(charSequenceG);
            charSequence = charSequenceG;
        } else {
            charSequence = str3;
        }
        if (!arrayList.isEmpty() || !list4.isEmpty() || !i9.l.a(r0Var2.f1439b.f1456d, q.f8429c) || (r0Var2.f1439b.f1455c & 1095216660480L) != 0) {
            charSequence2 = charSequence;
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            h0 h0Var6 = r0Var2.f1438a;
            v vVar6 = r0Var2.f1439b;
            if (i9.l.a(h0Var6.f1367m, m3.l.f8421c)) {
                spannableString.setSpan(b.f6920a, 0, str3.length(), 33);
            }
            z zVar3 = r0Var2.f1440c;
            if (((zVar3 == null || (xVar = zVar3.f1468b) == null) ? false : xVar.f1465a) && vVar6.f1458f == null) {
                float fC0 = g5.a.c0(vVar6.f1455c, textSize, cVar8);
                if (!Float.isNaN(fC0)) {
                    spannableString.setSpan(new e3.g(fC0), 0, spannableString.length(), 33);
                }
            } else {
                m3.i iVar2 = vVar6.f1458f;
                iVar2 = iVar2 == null ? m3.i.f8413c : iVar2;
                float fC1 = g5.a.c0(vVar6.f1455c, textSize, cVar8);
                if (!Float.isNaN(fC1)) {
                    int length = (spannableString.length() == 0 || zb.j.C0(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i35 = iVar2.f8415b;
                    spannableString.setSpan(new e3.h(fC1, length, (i35 & 1) > 0, (i35 & 16) > 0, iVar2.f8414a, false), 0, spannableString.length(), 33);
                }
                qVar = vVar6.f1456d;
                if (qVar != null) {
                    j10 = qVar.f8430a;
                    j11 = qVar.f8431b;
                    vVar = vVar6;
                    if ((n3.q.a(j10, r.D(0)) || !n3.q.a(j11, r.D(0))) && (j10 & 1095216660480L) != r13 && (j11 & 1095216660480L) != 0) {
                        jB2 = n3.q.b(j10);
                        if (n3.s.a(jB2, 4294967296L)) {
                            fC = cVar8.h0(j10);
                        } else if (n3.s.a(jB2, 8589934592L)) {
                            fC = n3.q.c(j10) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                        jB3 = n3.q.b(j11);
                        if (n3.s.a(jB3, 4294967296L)) {
                            fC2 = cVar8.h0(j11);
                        } else if (n3.s.a(jB3, 8589934592L)) {
                            fC2 = n3.q.c(j11) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                    }
                    arrayList2 = new ArrayList(arrayList.size());
                    size = arrayList.size();
                    for (i10 = 0; i10 < size; i10++) {
                        fVar4 = (b3.f) arrayList.get(i10);
                        obj3 = fVar4.f1324a;
                        if (obj3 instanceof h0) {
                            h0Var3 = (h0) obj3;
                            if (h0Var3.f1361f != null && h0Var3.f1359d == null && h0Var3.f1358c == null) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (z12 || ((h0) obj3).f1360e != null) {
                                arrayList2.add(fVar4);
                            }
                        }
                    }
                    h0Var = r0Var2.f1438a;
                    nVar = h0Var.f1361f;
                    if (nVar != null && h0Var.f1359d == null && h0Var.f1358c == null) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && h0Var.f1360e == null) {
                        h0Var2 = null;
                    } else {
                        h0Var2 = new h0(0L, 0L, h0Var.f1358c, h0Var.f1359d, h0Var.f1360e, nVar, (String) null, 0L, (m3.a) null, (p) null, (i3.b) null, 0L, (m3.l) null, (k0) null, 65475);
                    }
                    aVar = new k3.a(0, spannableString, cVar6);
                    if (arrayList2.size() <= 1) {
                        size2 = arrayList2.size();
                        i11 = size2 * 2;
                        iArr = new int[i11];
                        size3 = arrayList2.size();
                        for (i12 = 0; i12 < size3; i12++) {
                            b3.f fVar6 = (b3.f) arrayList2.get(i12);
                            iArr[i12] = fVar6.f1325b;
                            iArr[i12 + size2] = fVar6.f1326c;
                        }
                        if (i11 > 1) {
                            Arrays.sort(iArr);
                        }
                        if (i11 != 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        i13 = iArr[0];
                        i14 = 0;
                        while (i14 < i11) {
                            i15 = iArr[i14];
                            if (i15 == i13) {
                                arrayList3 = arrayList2;
                                vVar2 = vVar;
                                i17 = i14;
                            } else {
                                size4 = arrayList2.size();
                                i16 = 0;
                                while (i16 < size4) {
                                    ArrayList arrayList5 = arrayList2;
                                    b3.f fVar7 = (b3.f) arrayList2.get(i16);
                                    v vVar7 = vVar;
                                    i18 = fVar7.f1325b;
                                    int i36 = i14;
                                    i19 = fVar7.f1326c;
                                    if (i18 == i19 && b3.i.b(i13, i15, i18, i19)) {
                                        h0 h0Var7 = (h0) fVar7.f1324a;
                                        h0Var2 = h0Var2 != null ? h0Var2.c(h0Var7) : h0Var7;
                                    }
                                    i16++;
                                    arrayList2 = arrayList5;
                                    vVar = vVar7;
                                    i14 = i36;
                                }
                                arrayList3 = arrayList2;
                                vVar2 = vVar;
                                i17 = i14;
                                if (h0Var2 != null) {
                                    aVar.invoke(h0Var2, Integer.valueOf(i13), Integer.valueOf(i15));
                                }
                                i13 = i15;
                            }
                            i14 = i17 + 1;
                            h0Var2 = h0Var2;
                            arrayList2 = arrayList3;
                            vVar = vVar2;
                        }
                    } else if (!arrayList2.isEmpty()) {
                        h0 h0Var8 = (h0) ((b3.f) arrayList2.get(0)).f1324a;
                        aVar.invoke(h0Var2 != null ? h0Var2.c(h0Var8) : h0Var8, Integer.valueOf(((b3.f) arrayList2.get(0)).f1325b), Integer.valueOf(((b3.f) arrayList2.get(0)).f1326c));
                    }
                    vVar3 = vVar;
                    size5 = arrayList.size();
                    z11 = false;
                    i20 = 0;
                    while (i20 < size5) {
                        fVar3 = (b3.f) arrayList.get(i20);
                        obj2 = fVar3.f1324a;
                        if (obj2 instanceof h0) {
                            i26 = fVar3.f1325b;
                            int i37 = fVar3.f1326c;
                            if (i26 >= 0 || i26 >= spannableString.length() || i37 <= i26 || i37 > spannableString.length()) {
                                size5 = size5;
                                vVar4 = vVar3;
                                i20 = i20;
                            } else {
                                h0 h0Var9 = (h0) obj2;
                                long j16 = h0Var9.f1363h;
                                m3.a aVar4 = h0Var9.f1364i;
                                o oVar2 = h0Var9.f1356a;
                                if (aVar4 != null) {
                                    spannableString.setSpan(new e3.a(aVar4.f8401a, 0), i26, i37, 33);
                                }
                                g5.a.h0(spannableString, oVar2.b(), i26, i37);
                                m mVarE = oVar2.e();
                                float fA2 = oVar2.a();
                                if (mVarE != null) {
                                    if (mVarE instanceof n0) {
                                        g5.a.h0(spannableString, ((n0) mVarE).f14942a, i26, i37);
                                    } else {
                                        spannableString.setSpan(new l3.b((j0) mVarE, fA2), i26, i37, 33);
                                    }
                                }
                                m3.l lVar = h0Var9.f1367m;
                                if (lVar != null) {
                                    int i38 = lVar.f8423a;
                                    spannableString.setSpan(new e3.k((i38 | 1) == i38, (i38 | 2) == i38), i26, i37, 33);
                                }
                                vVar4 = vVar3;
                                g5.a.k0(spannableString, h0Var9.f1357b, cVar8, i26, i37);
                                String str4 = h0Var9.f1362g;
                                if (str4 != null) {
                                    spannableString.setSpan(new e3.b(0, str4), i26, i37, 33);
                                }
                                p pVar2 = h0Var9.f1365j;
                                if (pVar2 != null) {
                                    spannableString.setSpan(new ScaleXSpan(pVar2.f8427a), i26, i37, 33);
                                    spannableString.setSpan(new e3.a(pVar2.f8428b, 1), i26, i37, 33);
                                }
                                g5.a.n0(spannableString, h0Var9.k, i26, i37);
                                long j17 = h0Var9.f1366l;
                                if (j17 != 16) {
                                    spannableString.setSpan(new BackgroundColorSpan(y1.h0.C(j17)), i26, i37, 33);
                                }
                                k0 k0Var = h0Var9.f1368n;
                                if (k0Var != null) {
                                    long j18 = k0Var.f14926b;
                                    int iC = y1.h0.C(k0Var.f14925a);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j18 >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j18));
                                    float f10 = k0Var.f14927c;
                                    e3.j jVar2 = new e3.j(fIntBitsToFloat, fIntBitsToFloat2, f10 == 0.0f ? Float.MIN_VALUE : f10, iC);
                                    i27 = 33;
                                    spannableString.setSpan(jVar2, i26, i37, 33);
                                } else {
                                    i27 = 33;
                                }
                                a2.h hVar = h0Var9.f1370p;
                                if (hVar != null) {
                                    spannableString.setSpan(new l3.a(hVar), i26, i37, i27);
                                }
                                z11 = (n3.s.a(n3.q.b(r2), 4294967296L) || n3.s.a(n3.q.b(j16), 8589934592L)) ? true : z11;
                            }
                            z11 = z11;
                        } else {
                            size5 = size5;
                            vVar4 = vVar3;
                            i20 = i20;
                            z11 = z11;
                        }
                        i20++;
                        vVar3 = vVar4;
                        cVar8 = cVar8;
                        size5 = size5;
                    }
                    cVar2 = cVar8;
                    v vVar8 = vVar3;
                    if (z11) {
                        size7 = arrayList.size();
                        i23 = 0;
                        while (i23 < size7) {
                            fVar2 = (b3.f) arrayList.get(i23);
                            cVar4 = (b3.c) fVar2.f1324a;
                            if (cVar4 instanceof h0) {
                                i25 = fVar2.f1325b;
                                int i39 = fVar2.f1326c;
                                if (i25 >= 0 || i25 >= spannableString.length() || i39 <= i25 || i39 > spannableString.length()) {
                                    i24 = i23;
                                    cVar5 = cVar2;
                                } else {
                                    long j19 = ((h0) cVar4).f1363h;
                                    long jB5 = n3.q.b(j19);
                                    i24 = i23;
                                    if (n3.s.a(jB5, 4294967296L)) {
                                        cVar5 = cVar2;
                                        eVar = new e3.f(cVar5.h0(j19));
                                    } else {
                                        cVar5 = cVar2;
                                        eVar = n3.s.a(jB5, 8589934592L) ? new e3.e(n3.q.c(j19)) : null;
                                    }
                                    if (eVar != null) {
                                        spannableString.setSpan(eVar, i25, i39, 33);
                                    }
                                }
                            } else {
                                i24 = i23;
                                cVar5 = cVar2;
                            }
                            i23 = i24 + 1;
                            cVar2 = cVar5;
                        }
                    }
                    cVar3 = cVar2;
                    qVar2 = vVar8.f1456d;
                    if (qVar2 != null) {
                        j5 = qVar2.f8430a;
                        jB = n3.q.b(j5);
                        if (n3.s.a(jB, 4294967296L)) {
                            cVar3.h0(j5);
                        } else if (n3.s.a(jB, 8589934592L)) {
                            n3.q.c(j5);
                        }
                    }
                    size6 = arrayList.size();
                    for (i21 = 0; i21 < size6; i21++) {
                        Object obj6 = ((b3.f) arrayList.get(i21)).f1324a;
                    }
                    charSequence2 = spannableString;
                    if (list4.size() > 0) {
                        fVar = (b3.f) list4.get(0);
                        if (fVar.f1324a == null) {
                            throw new ClassCastException();
                        }
                        for (Object obj7 : spannableString.getSpans(fVar.f1325b, fVar.f1326c, l4.x.class)) {
                            spannableString.removeSpan((l4.x) obj7);
                        }
                        throw null;
                    }
                } else {
                    vVar = vVar6;
                }
                arrayList2 = new ArrayList(arrayList.size());
                size = arrayList.size();
                while (i10 < size) {
                    fVar4 = (b3.f) arrayList.get(i10);
                    obj3 = fVar4.f1324a;
                    if (obj3 instanceof h0) {
                        h0Var3 = (h0) obj3;
                        if (h0Var3.f1361f != null) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            arrayList2.add(fVar4);
                        } else {
                            arrayList2.add(fVar4);
                        }
                    }
                }
                h0Var = r0Var2.f1438a;
                nVar = h0Var.f1361f;
                if (nVar != null) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (z10) {
                    h0Var2 = new h0(0L, 0L, h0Var.f1358c, h0Var.f1359d, h0Var.f1360e, nVar, (String) null, 0L, (m3.a) null, (p) null, (i3.b) null, 0L, (m3.l) null, (k0) null, 65475);
                } else {
                    h0Var2 = new h0(0L, 0L, h0Var.f1358c, h0Var.f1359d, h0Var.f1360e, nVar, (String) null, 0L, (m3.a) null, (p) null, (i3.b) null, 0L, (m3.l) null, (k0) null, 65475);
                }
                aVar = new k3.a(0, spannableString, cVar6);
                if (arrayList2.size() <= 1) {
                    size2 = arrayList2.size();
                    i11 = size2 * 2;
                    iArr = new int[i11];
                    size3 = arrayList2.size();
                    while (i12 < size3) {
                        b3.f fVar8 = (b3.f) arrayList2.get(i12);
                        iArr[i12] = fVar8.f1325b;
                        iArr[i12 + size2] = fVar8.f1326c;
                    }
                    if (i11 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i11 != 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    i13 = iArr[0];
                    i14 = 0;
                    while (i14 < i11) {
                        i15 = iArr[i14];
                        if (i15 == i13) {
                            arrayList3 = arrayList2;
                            vVar2 = vVar;
                            i17 = i14;
                        } else {
                            size4 = arrayList2.size();
                            i16 = 0;
                            while (i16 < size4) {
                                ArrayList arrayList6 = arrayList2;
                                b3.f fVar9 = (b3.f) arrayList2.get(i16);
                                v vVar9 = vVar;
                                i18 = fVar9.f1325b;
                                int i310 = i14;
                                i19 = fVar9.f1326c;
                                if (i18 == i19) {
                                }
                                i16++;
                                arrayList2 = arrayList6;
                                vVar = vVar9;
                                i14 = i310;
                            }
                            arrayList3 = arrayList2;
                            vVar2 = vVar;
                            i17 = i14;
                            if (h0Var2 != null) {
                                aVar.invoke(h0Var2, Integer.valueOf(i13), Integer.valueOf(i15));
                            }
                            i13 = i15;
                        }
                        i14 = i17 + 1;
                        h0Var2 = h0Var2;
                        arrayList2 = arrayList3;
                        vVar = vVar2;
                    }
                } else if (!arrayList2.isEmpty()) {
                    h0 h0Var10 = (h0) ((b3.f) arrayList2.get(0)).f1324a;
                    aVar.invoke(h0Var2 != null ? h0Var2.c(h0Var10) : h0Var10, Integer.valueOf(((b3.f) arrayList2.get(0)).f1325b), Integer.valueOf(((b3.f) arrayList2.get(0)).f1326c));
                }
                vVar3 = vVar;
                size5 = arrayList.size();
                z11 = false;
                i20 = 0;
                while (i20 < size5) {
                    fVar3 = (b3.f) arrayList.get(i20);
                    obj2 = fVar3.f1324a;
                    if (obj2 instanceof h0) {
                        i26 = fVar3.f1325b;
                        int i311 = fVar3.f1326c;
                        if (i26 >= 0) {
                            size5 = size5;
                            vVar4 = vVar3;
                            i20 = i20;
                            z11 = z11;
                        } else {
                            size5 = size5;
                            vVar4 = vVar3;
                            i20 = i20;
                            z11 = z11;
                        }
                    } else {
                        size5 = size5;
                        vVar4 = vVar3;
                        i20 = i20;
                        z11 = z11;
                    }
                    i20++;
                    vVar3 = vVar4;
                    cVar8 = cVar8;
                    size5 = size5;
                }
                cVar2 = cVar8;
                v vVar10 = vVar3;
                if (z11) {
                    size7 = arrayList.size();
                    i23 = 0;
                    while (i23 < size7) {
                        fVar2 = (b3.f) arrayList.get(i23);
                        cVar4 = (b3.c) fVar2.f1324a;
                        if (cVar4 instanceof h0) {
                            i25 = fVar2.f1325b;
                            int i312 = fVar2.f1326c;
                            if (i25 >= 0) {
                                i24 = i23;
                                cVar5 = cVar2;
                            } else {
                                i24 = i23;
                                cVar5 = cVar2;
                            }
                        } else {
                            i24 = i23;
                            cVar5 = cVar2;
                        }
                        i23 = i24 + 1;
                        cVar2 = cVar5;
                    }
                }
                cVar3 = cVar2;
                qVar2 = vVar10.f1456d;
                if (qVar2 != null) {
                    j5 = qVar2.f8430a;
                    jB = n3.q.b(j5);
                    if (n3.s.a(jB, 4294967296L)) {
                        cVar3.h0(j5);
                    } else if (n3.s.a(jB, 8589934592L)) {
                        n3.q.c(j5);
                    }
                }
                size6 = arrayList.size();
                while (i21 < size6) {
                    Object obj8 = ((b3.f) arrayList.get(i21)).f1324a;
                }
                charSequence2 = spannableString;
                if (list4.size() > 0) {
                    fVar = (b3.f) list4.get(0);
                    if (fVar.f1324a == null) {
                        throw new ClassCastException();
                    }
                    while (i22 < r2) {
                        spannableString.removeSpan((l4.x) obj7);
                    }
                    throw null;
                }
            }
            qVar = vVar6.f1456d;
            if (qVar != null) {
                j10 = qVar.f8430a;
                j11 = qVar.f8431b;
                vVar = vVar6;
                if (n3.q.a(j10, r.D(0))) {
                    jB2 = n3.q.b(j10);
                    if (n3.s.a(jB2, 4294967296L)) {
                        fC = cVar8.h0(j10);
                    } else if (n3.s.a(jB2, 8589934592L)) {
                        fC = n3.q.c(j10) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = n3.q.b(j11);
                    if (n3.s.a(jB3, 4294967296L)) {
                        fC2 = cVar8.h0(j11);
                    } else if (n3.s.a(jB3, 8589934592L)) {
                        fC2 = n3.q.c(j11) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                } else {
                    jB2 = n3.q.b(j10);
                    if (n3.s.a(jB2, 4294967296L)) {
                        fC = cVar8.h0(j10);
                    } else if (n3.s.a(jB2, 8589934592L)) {
                        fC = n3.q.c(j10) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = n3.q.b(j11);
                    if (n3.s.a(jB3, 4294967296L)) {
                        fC2 = cVar8.h0(j11);
                    } else if (n3.s.a(jB3, 8589934592L)) {
                        fC2 = n3.q.c(j11) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                }
                arrayList2 = new ArrayList(arrayList.size());
                size = arrayList.size();
                while (i10 < size) {
                    fVar4 = (b3.f) arrayList.get(i10);
                    obj3 = fVar4.f1324a;
                    if (obj3 instanceof h0) {
                        h0Var3 = (h0) obj3;
                        if (h0Var3.f1361f != null) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            arrayList2.add(fVar4);
                        } else {
                            arrayList2.add(fVar4);
                        }
                    }
                }
                h0Var = r0Var2.f1438a;
                nVar = h0Var.f1361f;
                if (nVar != null) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (z10) {
                    h0Var2 = new h0(0L, 0L, h0Var.f1358c, h0Var.f1359d, h0Var.f1360e, nVar, (String) null, 0L, (m3.a) null, (p) null, (i3.b) null, 0L, (m3.l) null, (k0) null, 65475);
                } else {
                    h0Var2 = new h0(0L, 0L, h0Var.f1358c, h0Var.f1359d, h0Var.f1360e, nVar, (String) null, 0L, (m3.a) null, (p) null, (i3.b) null, 0L, (m3.l) null, (k0) null, 65475);
                }
                aVar = new k3.a(0, spannableString, cVar6);
                if (arrayList2.size() <= 1) {
                    size2 = arrayList2.size();
                    i11 = size2 * 2;
                    iArr = new int[i11];
                    size3 = arrayList2.size();
                    while (i12 < size3) {
                        b3.f fVar10 = (b3.f) arrayList2.get(i12);
                        iArr[i12] = fVar10.f1325b;
                        iArr[i12 + size2] = fVar10.f1326c;
                    }
                    if (i11 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i11 != 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    i13 = iArr[0];
                    i14 = 0;
                    while (i14 < i11) {
                        i15 = iArr[i14];
                        if (i15 == i13) {
                            arrayList3 = arrayList2;
                            vVar2 = vVar;
                            i17 = i14;
                        } else {
                            size4 = arrayList2.size();
                            i16 = 0;
                            while (i16 < size4) {
                                ArrayList arrayList7 = arrayList2;
                                b3.f fVar11 = (b3.f) arrayList2.get(i16);
                                v vVar11 = vVar;
                                i18 = fVar11.f1325b;
                                int i313 = i14;
                                i19 = fVar11.f1326c;
                                if (i18 == i19) {
                                }
                                i16++;
                                arrayList2 = arrayList7;
                                vVar = vVar11;
                                i14 = i313;
                            }
                            arrayList3 = arrayList2;
                            vVar2 = vVar;
                            i17 = i14;
                            if (h0Var2 != null) {
                                aVar.invoke(h0Var2, Integer.valueOf(i13), Integer.valueOf(i15));
                            }
                            i13 = i15;
                        }
                        i14 = i17 + 1;
                        h0Var2 = h0Var2;
                        arrayList2 = arrayList3;
                        vVar = vVar2;
                    }
                } else if (!arrayList2.isEmpty()) {
                    h0 h0Var11 = (h0) ((b3.f) arrayList2.get(0)).f1324a;
                    aVar.invoke(h0Var2 != null ? h0Var2.c(h0Var11) : h0Var11, Integer.valueOf(((b3.f) arrayList2.get(0)).f1325b), Integer.valueOf(((b3.f) arrayList2.get(0)).f1326c));
                }
                vVar3 = vVar;
                size5 = arrayList.size();
                z11 = false;
                i20 = 0;
                while (i20 < size5) {
                    fVar3 = (b3.f) arrayList.get(i20);
                    obj2 = fVar3.f1324a;
                    if (obj2 instanceof h0) {
                        i26 = fVar3.f1325b;
                        int i314 = fVar3.f1326c;
                        if (i26 >= 0) {
                            size5 = size5;
                            vVar4 = vVar3;
                            i20 = i20;
                            z11 = z11;
                        } else {
                            size5 = size5;
                            vVar4 = vVar3;
                            i20 = i20;
                            z11 = z11;
                        }
                    } else {
                        size5 = size5;
                        vVar4 = vVar3;
                        i20 = i20;
                        z11 = z11;
                    }
                    i20++;
                    vVar3 = vVar4;
                    cVar8 = cVar8;
                    size5 = size5;
                }
                cVar2 = cVar8;
                v vVar12 = vVar3;
                if (z11) {
                    size7 = arrayList.size();
                    i23 = 0;
                    while (i23 < size7) {
                        fVar2 = (b3.f) arrayList.get(i23);
                        cVar4 = (b3.c) fVar2.f1324a;
                        if (cVar4 instanceof h0) {
                            i25 = fVar2.f1325b;
                            int i315 = fVar2.f1326c;
                            if (i25 >= 0) {
                                i24 = i23;
                                cVar5 = cVar2;
                            } else {
                                i24 = i23;
                                cVar5 = cVar2;
                            }
                        } else {
                            i24 = i23;
                            cVar5 = cVar2;
                        }
                        i23 = i24 + 1;
                        cVar2 = cVar5;
                    }
                }
                cVar3 = cVar2;
                qVar2 = vVar12.f1456d;
                if (qVar2 != null) {
                    j5 = qVar2.f8430a;
                    jB = n3.q.b(j5);
                    if (n3.s.a(jB, 4294967296L)) {
                        cVar3.h0(j5);
                    } else if (n3.s.a(jB, 8589934592L)) {
                        n3.q.c(j5);
                    }
                }
                size6 = arrayList.size();
                while (i21 < size6) {
                    Object obj9 = ((b3.f) arrayList.get(i21)).f1324a;
                }
                charSequence2 = spannableString;
                if (list4.size() > 0) {
                    fVar = (b3.f) list4.get(0);
                    if (fVar.f1324a == null) {
                        throw new ClassCastException();
                    }
                    while (i22 < r2) {
                        spannableString.removeSpan((l4.x) obj7);
                    }
                    throw null;
                }
            } else {
                vVar = vVar6;
            }
            arrayList2 = new ArrayList(arrayList.size());
            size = arrayList.size();
            while (i10 < size) {
                fVar4 = (b3.f) arrayList.get(i10);
                obj3 = fVar4.f1324a;
                if (obj3 instanceof h0) {
                    h0Var3 = (h0) obj3;
                    if (h0Var3.f1361f != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        arrayList2.add(fVar4);
                    } else {
                        arrayList2.add(fVar4);
                    }
                }
            }
            h0Var = r0Var2.f1438a;
            nVar = h0Var.f1361f;
            if (nVar != null) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (z10) {
                h0Var2 = new h0(0L, 0L, h0Var.f1358c, h0Var.f1359d, h0Var.f1360e, nVar, (String) null, 0L, (m3.a) null, (p) null, (i3.b) null, 0L, (m3.l) null, (k0) null, 65475);
            } else {
                h0Var2 = new h0(0L, 0L, h0Var.f1358c, h0Var.f1359d, h0Var.f1360e, nVar, (String) null, 0L, (m3.a) null, (p) null, (i3.b) null, 0L, (m3.l) null, (k0) null, 65475);
            }
            aVar = new k3.a(0, spannableString, cVar6);
            if (arrayList2.size() <= 1) {
                size2 = arrayList2.size();
                i11 = size2 * 2;
                iArr = new int[i11];
                size3 = arrayList2.size();
                while (i12 < size3) {
                    b3.f fVar12 = (b3.f) arrayList2.get(i12);
                    iArr[i12] = fVar12.f1325b;
                    iArr[i12 + size2] = fVar12.f1326c;
                }
                if (i11 > 1) {
                    Arrays.sort(iArr);
                }
                if (i11 != 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                i13 = iArr[0];
                i14 = 0;
                while (i14 < i11) {
                    i15 = iArr[i14];
                    if (i15 == i13) {
                        arrayList3 = arrayList2;
                        vVar2 = vVar;
                        i17 = i14;
                    } else {
                        size4 = arrayList2.size();
                        i16 = 0;
                        while (i16 < size4) {
                            ArrayList arrayList8 = arrayList2;
                            b3.f fVar13 = (b3.f) arrayList2.get(i16);
                            v vVar13 = vVar;
                            i18 = fVar13.f1325b;
                            int i316 = i14;
                            i19 = fVar13.f1326c;
                            if (i18 == i19) {
                            }
                            i16++;
                            arrayList2 = arrayList8;
                            vVar = vVar13;
                            i14 = i316;
                        }
                        arrayList3 = arrayList2;
                        vVar2 = vVar;
                        i17 = i14;
                        if (h0Var2 != null) {
                            aVar.invoke(h0Var2, Integer.valueOf(i13), Integer.valueOf(i15));
                        }
                        i13 = i15;
                    }
                    i14 = i17 + 1;
                    h0Var2 = h0Var2;
                    arrayList2 = arrayList3;
                    vVar = vVar2;
                }
            } else if (!arrayList2.isEmpty()) {
                h0 h0Var12 = (h0) ((b3.f) arrayList2.get(0)).f1324a;
                aVar.invoke(h0Var2 != null ? h0Var2.c(h0Var12) : h0Var12, Integer.valueOf(((b3.f) arrayList2.get(0)).f1325b), Integer.valueOf(((b3.f) arrayList2.get(0)).f1326c));
            }
            vVar3 = vVar;
            size5 = arrayList.size();
            z11 = false;
            i20 = 0;
            while (i20 < size5) {
                fVar3 = (b3.f) arrayList.get(i20);
                obj2 = fVar3.f1324a;
                if (obj2 instanceof h0) {
                    i26 = fVar3.f1325b;
                    int i317 = fVar3.f1326c;
                    if (i26 >= 0) {
                        size5 = size5;
                        vVar4 = vVar3;
                        i20 = i20;
                        z11 = z11;
                    } else {
                        size5 = size5;
                        vVar4 = vVar3;
                        i20 = i20;
                        z11 = z11;
                    }
                } else {
                    size5 = size5;
                    vVar4 = vVar3;
                    i20 = i20;
                    z11 = z11;
                }
                i20++;
                vVar3 = vVar4;
                cVar8 = cVar8;
                size5 = size5;
            }
            cVar2 = cVar8;
            v vVar14 = vVar3;
            if (z11) {
                size7 = arrayList.size();
                i23 = 0;
                while (i23 < size7) {
                    fVar2 = (b3.f) arrayList.get(i23);
                    cVar4 = (b3.c) fVar2.f1324a;
                    if (cVar4 instanceof h0) {
                        i25 = fVar2.f1325b;
                        int i318 = fVar2.f1326c;
                        if (i25 >= 0) {
                            i24 = i23;
                            cVar5 = cVar2;
                        } else {
                            i24 = i23;
                            cVar5 = cVar2;
                        }
                    } else {
                        i24 = i23;
                        cVar5 = cVar2;
                    }
                    i23 = i24 + 1;
                    cVar2 = cVar5;
                }
            }
            cVar3 = cVar2;
            qVar2 = vVar14.f1456d;
            if (qVar2 != null) {
                j5 = qVar2.f8430a;
                jB = n3.q.b(j5);
                if (n3.s.a(jB, 4294967296L)) {
                    cVar3.h0(j5);
                } else if (n3.s.a(jB, 8589934592L)) {
                    n3.q.c(j5);
                }
            }
            size6 = arrayList.size();
            while (i21 < size6) {
                Object obj10 = ((b3.f) arrayList.get(i21)).f1324a;
            }
            charSequence2 = spannableString;
            if (list4.size() > 0) {
                fVar = (b3.f) list4.get(0);
                if (fVar.f1324a == null) {
                    throw new ClassCastException();
                }
                while (i22 < r2) {
                    spannableString.removeSpan((l4.x) obj7);
                }
                throw null;
            }
        }
        charSequence2 = charSequence;
        this.f6930h = charSequence2;
        this.f6931i = new c3.h(charSequence2, this.f6929g, this.f6933l);
    }

    @Override // b3.u
    public final boolean a() {
        a2.b bVar = this.f6932j;
        if (bVar != null ? bVar.N() : false) {
            return true;
        }
        if (!this.k) {
            z zVar = this.f6924b.f1440c;
            a2.d dVar = j.f6949a;
            a2.d dVar2 = j.f6949a;
            w2 w2VarO = (w2) dVar2.f20b;
            if (w2VarO == null) {
                if (l4.j.d()) {
                    w2VarO = dVar2.o();
                    dVar2.f20b = w2VarO;
                } else {
                    w2VarO = k.f6950a;
                }
            }
            if (((Boolean) w2VarO.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // b3.u
    public final float c() {
        float f10;
        c3.h hVar = this.f6931i;
        float f11 = hVar.f2381e;
        TextPaint textPaint = hVar.f2378b;
        if (!Float.isNaN(f11)) {
            return hVar.f2381e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = hVar.f2377a;
        lineInstance.setText(new c3.d(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new b4.c(1));
        int i7 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new t8.j(Integer.valueOf(i7), Integer.valueOf(next)));
            } else {
                t8.j jVar = (t8.j) priorityQueue.peek();
                if (jVar != null && ((Number) jVar.f12831b).intValue() - ((Number) jVar.f12830a).intValue() < next - i7) {
                    priorityQueue.poll();
                    priorityQueue.add(new t8.j(Integer.valueOf(i7), Integer.valueOf(next)));
                }
            }
            i7 = next;
        }
        if (priorityQueue.isEmpty()) {
            f10 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            t8.j jVar2 = (t8.j) it.next();
            float desiredWidth = Layout.getDesiredWidth(hVar.b(), ((Number) jVar2.f12830a).intValue(), ((Number) jVar2.f12831b).intValue(), textPaint);
            while (it.hasNext()) {
                t8.j jVar3 = (t8.j) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(hVar.b(), ((Number) jVar3.f12830a).intValue(), ((Number) jVar3.f12831b).intValue(), textPaint));
            }
            f10 = desiredWidth;
        }
        hVar.f2381e = f10;
        return f10;
    }

    @Override // b3.u
    public final float d() {
        return this.f6931i.c();
    }
}
