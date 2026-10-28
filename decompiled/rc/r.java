package rc;

import a8.f1;
import android.app.PendingIntent;
import i9.y;
import i9.z;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import l0.o0;
import o9.e0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends n3.n implements qc.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qc.b f12350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f12351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ja.e f12352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n4.e f12353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public hc.s f12355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final oa.r f12356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f12357j;

    public r(qc.b bVar, v vVar, ja.e eVar, nc.e eVar2, hc.s sVar) {
        i9.l.e(eVar2, "descriptor");
        this.f12350c = bVar;
        this.f12351d = vVar;
        this.f12352e = eVar;
        this.f12353f = bVar.f11034b;
        this.f12354g = -1;
        this.f12355h = sVar;
        oa.r rVar = bVar.f11033a;
        this.f12356i = rVar;
        this.f12357j = rVar.f9622b ? null : new i(eVar2);
    }

    @Override // n3.n, oc.b
    public final double A() {
        ja.e eVar = this.f12352e;
        String strK = eVar.k();
        try {
            double d10 = Double.parseDouble(strK);
            this.f12350c.f11033a.getClass();
            if (Math.abs(d10) <= Double.MAX_VALUE) {
                return d10;
            }
            j.o(eVar, Double.valueOf(d10));
            throw null;
        } catch (IllegalArgumentException unused) {
            ja.e.n(eVar, "Failed to parse type 'double' for input '" + strK + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // n3.n, oc.b
    public final boolean b() {
        boolean z10;
        boolean z11;
        ja.e eVar = this.f12352e;
        int iT = eVar.t();
        String str = (String) eVar.f7000f;
        if (iT == str.length()) {
            ja.e.n(eVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iT) == '\"') {
            iT++;
            z10 = true;
        } else {
            z10 = false;
        }
        int iS = eVar.s(iT);
        if (iS >= str.length() || iS == -1) {
            ja.e.n(eVar, "EOF", 0, null, 6);
            throw null;
        }
        int i7 = iS + 1;
        int iCharAt = str.charAt(iS) | ' ';
        if (iCharAt == 102) {
            eVar.d(i7, "alse");
            z11 = false;
        } else {
            if (iCharAt != 116) {
                ja.e.n(eVar, "Expected valid boolean literal prefix, but had '" + eVar.k() + '\'', 0, null, 6);
                throw null;
            }
            eVar.d(i7, "rue");
            z11 = true;
        }
        if (!z10) {
            return z11;
        }
        if (eVar.f6996b == str.length()) {
            ja.e.n(eVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(eVar.f6996b) == '\"') {
            eVar.f6996b++;
            return z11;
        }
        ja.e.n(eVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // n3.n, oc.b
    public final char c() {
        ja.e eVar = this.f12352e;
        String strK = eVar.k();
        if (strK.length() == 1) {
            return strK.charAt(0);
        }
        ja.e.n(eVar, "Expected single char, but got '" + strK + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x012b  */
    /* JADX WARN: Code duplicated, block: B:41:0x012c  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x012c, please report this as an issue */
    @Override // n3.n
    public final Object d0(mc.a aVar) {
        String message;
        qc.b bVar = this.f12350c;
        ja.e eVar = this.f12352e;
        g7.l lVar = (g7.l) eVar.f6997c;
        i9.l.e(aVar, "deserializer");
        try {
            if (!(aVar instanceof mc.d)) {
                return aVar.c(this);
            }
            bVar.f11033a.getClass();
            String strH = j.h(((mc.d) aVar).d(), bVar);
            this.f12356i.getClass();
            String strP = eVar.p(strH);
            String strC = null;
            if (strP != null) {
                try {
                    mc.a aVarU = e0.u((mc.d) aVar, this, strP);
                    hc.s sVar = new hc.s();
                    sVar.f6538b = strH;
                    this.f12355h = sVar;
                    return aVarU.c(this);
                } catch (mc.e e7) {
                    String message2 = e7.getMessage();
                    i9.l.b(message2);
                    String strI0 = zb.j.I0(zb.j.O0('\n', message2), ".");
                    String message3 = e7.getMessage();
                    i9.l.b(message3);
                    ja.e.n(eVar, strI0, 0, zb.j.L0(message3, '\n', ""), 2);
                    throw null;
                }
            }
            if (!(aVar instanceof mc.d)) {
                return aVar.c(this);
            }
            bVar.f11033a.getClass();
            String strH2 = j.h(((mc.d) aVar).d(), bVar);
            qc.j jVarG = g();
            String strH3 = ((mc.d) aVar).d().h();
            if (!(jVarG instanceof qc.u)) {
                StringBuilder sb2 = new StringBuilder("Expected ");
                z zVar = y.f6689a;
                sb2.append(zVar.b(qc.u.class).l());
                sb2.append(", but had ");
                sb2.append(zVar.b(jVarG.getClass()).l());
                sb2.append(" as the serialized body of ");
                sb2.append(strH3);
                sb2.append(" at element: ");
                sb2.append(lVar.e());
                throw j.e(sb2.toString(), jVarG.toString(), -1);
            }
            qc.u uVar = (qc.u) jVarG;
            qc.j jVar = (qc.j) uVar.get(strH2);
            if (jVar != null) {
                qc.y yVarA = qc.k.a(jVar);
                if (!(yVarA instanceof qc.r)) {
                    strC = yVarA.c();
                }
            }
            try {
                return j.m(bVar, strH2, uVar, e0.u((mc.d) aVar, this, strC));
            } catch (mc.e e10) {
                String message4 = e10.getMessage();
                i9.l.b(message4);
                throw j.e(message4, uVar.toString(), -1);
            }
            message = e.getMessage();
            i9.l.b(message);
            if (zb.j.r0(message, "at path", false)) {
                throw e;
            }
            throw new mc.b(e.f8631a, e.getMessage() + " at path: " + lVar.e(), e);
        } catch (mc.b e11) {
            message = e11.getMessage();
            i9.l.b(message);
            if (zb.j.r0(message, "at path", false)) {
                throw e11;
            }
            throw new mc.b(e11.f8631a, e11.getMessage() + " at path: " + lVar.e(), e11);
        }
    }

    @Override // qc.h
    public final qc.j g() {
        return new j.g(this.f12350c.f11033a, this.f12352e).f();
    }

    @Override // n3.n, oc.b
    public final int h() {
        ja.e eVar = this.f12352e;
        long jI = eVar.i();
        int i7 = (int) jI;
        if (jI == i7) {
            return i7;
        }
        ja.e.n(eVar, "Failed to parse int for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // oc.a
    public final n4.e j() {
        return this.f12353f;
    }

    @Override // n3.n, oc.b
    public final String l() {
        this.f12356i.getClass();
        return this.f12352e.j();
    }

    @Override // n3.n, oc.b
    public final oc.a m(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        qc.b bVar = this.f12350c;
        v vVarN = j.n(eVar, bVar);
        ja.e eVar2 = this.f12352e;
        g7.l lVar = (g7.l) eVar2.f6997c;
        int i7 = lVar.f5998b + 1;
        lVar.f5998b = i7;
        if (i7 == ((Object[]) lVar.f5999c).length) {
            lVar.h();
        }
        ((Object[]) lVar.f5999c)[i7] = eVar;
        eVar2.h(vVarN.f12376a);
        if (eVar2.q() == 4) {
            ja.e.n(eVar2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = vVarN.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new r(bVar, vVarN, eVar2, eVar, this.f12355h);
        }
        return (this.f12351d == vVarN && bVar.f11033a.f9622b) ? this : new r(bVar, vVarN, eVar2, eVar, this.f12355h);
    }

    @Override // n3.n, oc.b
    public final long n() {
        return this.f12352e.i();
    }

    @Override // n3.n, oc.b
    public final boolean o() {
        i iVar = this.f12357j;
        if (!(iVar != null ? iVar.f12325b : false)) {
            ja.e eVar = this.f12352e;
            int iS = eVar.s(eVar.t());
            String str = (String) eVar.f7000f;
            int length = str.length() - iS;
            boolean z10 = false;
            if (length >= 4 && iS != -1) {
                for (int i7 = 0; i7 < 4; i7++) {
                    if ("null".charAt(i7) == str.charAt(iS + i7)) {
                    }
                }
                if (length <= 4 || j.g(str.charAt(iS + 4)) != 0) {
                    z10 = true;
                    eVar.f6996b = iS + 4;
                }
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    @Override // n3.n, oc.a
    public final void p(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        int iK = eVar.k();
        qc.b bVar = this.f12350c;
        if (iK == 0 && j.i(eVar, bVar)) {
            while (w(eVar) != -1) {
            }
        }
        ja.e eVar2 = this.f12352e;
        if (eVar2.u()) {
            bVar.f11033a.getClass();
            j.j(eVar2, "");
            throw null;
        }
        eVar2.h(this.f12351d.f12377b);
        g7.l lVar = (g7.l) eVar2.f6997c;
        int i7 = lVar.f5998b;
        int[] iArr = (int[]) lVar.f6000d;
        if (iArr[i7] == -2) {
            iArr[i7] = -1;
            lVar.f5998b = i7 - 1;
        }
        int i10 = lVar.f5998b;
        if (i10 != -1) {
            lVar.f5998b = i10 - 1;
        }
    }

    @Override // n3.n, oc.b
    public final oc.b r(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        return t.a(eVar) ? new g(this.f12352e, this.f12350c) : this;
    }

    @Override // n3.n, oc.a
    public final Object t(nc.e eVar, int i7, mc.a aVar, Object obj) {
        g7.l lVar = (g7.l) this.f12352e.f6997c;
        i9.l.e(eVar, "descriptor");
        i9.l.e(aVar, "deserializer");
        boolean z10 = this.f12351d == v.MAP && (i7 & 1) == 0;
        if (z10) {
            int[] iArr = (int[]) lVar.f6000d;
            int i10 = lVar.f5998b;
            if (iArr[i10] == -2) {
                ((Object[]) lVar.f5999c)[i10] = k.f12327a;
            }
        }
        Object objT = super.t(eVar, i7, aVar, obj);
        if (z10) {
            int[] iArr2 = (int[]) lVar.f6000d;
            int i11 = lVar.f5998b;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                lVar.f5998b = i12;
                if (i12 == ((Object[]) lVar.f5999c).length) {
                    lVar.h();
                }
            }
            Object[] objArr = (Object[]) lVar.f5999c;
            int i13 = lVar.f5998b;
            objArr[i13] = objT;
            ((int[]) lVar.f6000d)[i13] = -2;
        }
        return objT;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0307 A[EDGE_INSN: B:156:0x0307->B:157:0x0308 BREAK  A[LOOP:0: B:48:0x00a4->B:133:0x0286]] */
    @Override // oc.a
    public final int w(nc.e eVar) throws PendingIntent.CanceledException {
        qc.b bVar = this.f12350c;
        oa.r rVar = bVar.f11033a;
        ja.e eVar2 = this.f12352e;
        g7.l lVar = (g7.l) eVar2.f6997c;
        String str = (String) eVar2.f7000f;
        i9.l.e(eVar, "descriptor");
        v vVar = this.f12351d;
        int iOrdinal = vVar.ordinal();
        char c10 = ':';
        boolean zU = false;
        int i7 = -1;
        if (iOrdinal == 0) {
            boolean zU2 = eVar2.u();
            while (true) {
                boolean zC = eVar2.c();
                i iVar = this.f12357j;
                if (zC) {
                    this.f12356i.getClass();
                    String strE = eVar2.e();
                    eVar2.h(c10);
                    i9.l.e(eVar, "<this>");
                    i9.l.e(bVar, "json");
                    i9.l.e(strE, "name");
                    oa.r rVar2 = bVar.f11033a;
                    rVar2.getClass();
                    j.l(eVar, bVar);
                    int iJ = eVar.j(strE);
                    if (iJ == -3 && rVar2.f9623c) {
                        o0 o0Var = bVar.f11035c;
                        f1 f1Var = new f1(17, eVar, bVar);
                        o0Var.getClass();
                        k kVar = j.f12326a;
                        Object objW = o0Var.W(eVar, kVar);
                        if (objW == null) {
                            Object objInvoke = f1Var.invoke();
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) o0Var.f7772b;
                            Object obj = concurrentHashMap.get(eVar);
                            if (obj == null) {
                                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(2);
                                concurrentHashMap.put(eVar, concurrentHashMap2);
                                obj = concurrentHashMap2;
                            }
                            ((Map) obj).put(kVar, objInvoke);
                            objW = objInvoke;
                        }
                        Integer num = (Integer) ((Map) objW).get(strE);
                        iJ = num != null ? num.intValue() : -3;
                    }
                    if (iJ != -3) {
                        if (iVar != null) {
                            pc.s sVar = iVar.f12324a;
                            if (iJ < 64) {
                                sVar.f10502c |= 1 << iJ;
                            } else {
                                int i10 = (iJ >>> 6) - 1;
                                long[] jArr = sVar.f10503d;
                                jArr[i10] = (1 << (iJ & 63)) | jArr[i10];
                            }
                        }
                        i7 = iJ;
                        break;
                    }
                    if (!j.i(eVar, bVar)) {
                        hc.s sVar2 = this.f12355h;
                        if (sVar2 == null || !i9.l.a(sVar2.f6538b, strE)) {
                            int i11 = lVar.f5998b;
                            int[] iArr = (int[]) lVar.f6000d;
                            if (iArr[i11] == -2) {
                                iArr[i11] = -1;
                                lVar.f5998b = i11 - 1;
                            }
                            int i12 = lVar.f5998b;
                            if (i12 != -1) {
                                lVar.f5998b = i12 - 1;
                            }
                            int iE0 = zb.j.E0(0, 6, str.subSequence(0, eVar2.f6996b).toString(), strE);
                            throw new h(0, "Encountered an unknown key '" + strE + "' at offset " + iE0 + " at path: " + lVar.e() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) j.k(str, iE0)));
                        }
                        sVar2.f6538b = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte bQ = eVar2.q();
                    byte b10 = 6;
                    if (bQ == 8 || bQ == 6) {
                        while (true) {
                            byte bQ2 = eVar2.q();
                            if (bQ2 == 1) {
                                eVar2.e();
                            } else {
                                if (bQ2 == 8 || bQ2 == b10) {
                                    arrayList.add(Byte.valueOf(bQ2));
                                } else if (bQ2 == 9) {
                                    if (((Number) u8.p.s0(arrayList)).byteValue() != 8) {
                                        throw j.e("found ] instead of } at path: " + lVar, str, eVar2.f6996b);
                                    }
                                    if (arrayList.isEmpty()) {
                                        throw new NoSuchElementException("List is empty.");
                                    }
                                    arrayList.remove(n3.l.A(arrayList));
                                } else if (bQ2 == 7) {
                                    if (((Number) u8.p.s0(arrayList)).byteValue() != 6) {
                                        throw j.e("found } instead of ] at path: " + lVar, str, eVar2.f6996b);
                                    }
                                    if (arrayList.isEmpty()) {
                                        throw new NoSuchElementException("List is empty.");
                                    }
                                    arrayList.remove(n3.l.A(arrayList));
                                } else if (bQ2 == 10) {
                                    ja.e.n(eVar2, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                    throw null;
                                }
                                eVar2.f();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                                b10 = 6;
                            }
                        }
                    } else {
                        eVar2.k();
                    }
                    zU2 = eVar2.u();
                    c10 = ':';
                } else if (!zU2) {
                    if (iVar == null) {
                        i7 = -1;
                        break;
                    }
                    pc.s sVar3 = iVar.f12324a;
                    ob.t tVar = sVar3.f10501b;
                    nc.e eVar3 = sVar3.f10500a;
                    int iK = eVar3.k();
                    while (true) {
                        long j5 = sVar3.f10502c;
                        long j10 = -1;
                        if (j5 == -1) {
                            if (iK <= 64) {
                                i7 = -1;
                                break;
                            }
                            long[] jArr2 = sVar3.f10503d;
                            int length = jArr2.length;
                            int i13 = 0;
                            loop3: while (true) {
                                if (i13 >= length) {
                                    i7 = -1;
                                    break;
                                }
                                int i14 = i13 + 1;
                                int i15 = i14 * 64;
                                long j11 = jArr2[i13];
                                while (true) {
                                    if (j11 != j10) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j11);
                                        j11 |= 1 << iNumberOfTrailingZeros;
                                        int i16 = iNumberOfTrailingZeros + i15;
                                        tVar.invoke(eVar3, Integer.valueOf(i16));
                                        if (Boolean.FALSE.booleanValue()) {
                                            jArr2[i13] = j11;
                                            i7 = i16;
                                            break;
                                        }
                                        j10 = -1;
                                    } else {
                                        jArr2[i13] = j11;
                                        i13 = i14;
                                        j10 = -1;
                                    }
                                }
                            }
                        } else {
                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j5);
                            sVar3.f10502c |= 1 << iNumberOfTrailingZeros2;
                            tVar.invoke(eVar3, Integer.valueOf(iNumberOfTrailingZeros2));
                            if (Boolean.FALSE.booleanValue()) {
                                i7 = iNumberOfTrailingZeros2;
                                break;
                            }
                        }
                    }
                } else {
                    rVar.getClass();
                    j.j(eVar2, "object");
                    throw null;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zU3 = eVar2.u();
            if (eVar2.c()) {
                int i17 = this.f12354g;
                if (i17 != -1 && !zU3) {
                    ja.e.n(eVar2, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i7 = i17 + 1;
                this.f12354g = i7;
            } else if (zU3) {
                rVar.getClass();
                j.j(eVar2, "array");
                throw null;
            }
        } else {
            int i18 = this.f12354g;
            boolean z10 = i18 % 2 != 0;
            if (!z10) {
                eVar2.h(':');
            } else if (i18 != -1) {
                zU = eVar2.u();
            }
            if (eVar2.c()) {
                if (z10) {
                    if (this.f12354g == -1) {
                        int i19 = eVar2.f6996b;
                        if (zU) {
                            ja.e.n(eVar2, "Unexpected leading comma", i19, null, 4);
                            throw null;
                        }
                    } else {
                        int i20 = eVar2.f6996b;
                        if (!zU) {
                            ja.e.n(eVar2, "Expected comma after the key-value pair", i20, null, 4);
                            throw null;
                        }
                    }
                }
                i7 = this.f12354g + 1;
                this.f12354g = i7;
            } else if (zU) {
                rVar.getClass();
                j.j(eVar2, "object");
                throw null;
            }
        }
        if (vVar != v.MAP) {
            ((int[]) lVar.f6000d)[lVar.f5998b] = i7;
        }
        return i7;
    }

    @Override // n3.n, oc.b
    public final byte x() {
        ja.e eVar = this.f12352e;
        long jI = eVar.i();
        byte b10 = (byte) jI;
        if (jI == b10) {
            return b10;
        }
        ja.e.n(eVar, "Failed to parse byte for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // n3.n, oc.b
    public final short y() {
        ja.e eVar = this.f12352e;
        long jI = eVar.i();
        short s2 = (short) jI;
        if (jI == s2) {
            return s2;
        }
        ja.e.n(eVar, "Failed to parse short for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // n3.n, oc.b
    public final float z() {
        ja.e eVar = this.f12352e;
        String strK = eVar.k();
        try {
            float f10 = Float.parseFloat(strK);
            this.f12350c.f11033a.getClass();
            if (Math.abs(f10) <= Float.MAX_VALUE) {
                return f10;
            }
            j.o(eVar, Float.valueOf(f10));
            throw null;
        } catch (IllegalArgumentException unused) {
            ja.e.n(eVar, "Failed to parse type 'float' for input '" + strK + '\'', 0, null, 6);
            throw null;
        }
    }
}
