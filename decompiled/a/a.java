package a;

import a2.f;
import a8.e0;
import a8.f1;
import aa.j0;
import aa.y0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.r;
import android.util.Log;
import android.widget.PopupWindow;
import androidx.compose.foundation.layout.LayoutWeightElement;
import b3.h;
import b3.i0;
import b3.q0;
import c1.g1;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.muyetuge.carlifevehicle.activity.MainActivity;
import d0.g;
import d0.n0;
import e4.s0;
import f0.m;
import f1.b1;
import f1.h1;
import f1.n;
import f1.q1;
import f1.s;
import f1.w0;
import f1.w1;
import f1.w2;
import f7.q;
import g0.c;
import g0.d;
import g0.v;
import g0.y;
import g3.w;
import gb.o;
import h0.l0;
import h9.k;
import i9.l;
import ia.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l0.t0;
import m5.i;
import p.b0;
import q2.a0;
import r2.j1;
import t8.j;
import t8.z;
import u8.p;
import u8.u;
import x9.b;
import x9.d0;
import x9.t;
import y1.h0;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static r f1a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f2b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f3c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f4d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f5e;

    public static boolean A(b bVar, b bVar2) {
        l.e(bVar, "superDescriptor");
        l.e(bVar2, "subDescriptor");
        if (!(bVar2 instanceof e) || !(bVar instanceof t)) {
            return false;
        }
        e eVar = (e) bVar2;
        eVar.X().size();
        t tVar = (t) bVar;
        tVar.X().size();
        List listX = eVar.a().X();
        l.d(listX, "getValueParameters(...)");
        List listX2 = tVar.a().X();
        l.d(listX2, "getValueParameters(...)");
        for (j jVar : p.O0(listX, listX2)) {
            y0 y0Var = (y0) jVar.f12830a;
            y0 y0Var2 = (y0) jVar.f12831b;
            l.b(y0Var);
            boolean z10 = L((t) bVar2, y0Var) instanceof pa.j;
            l.b(y0Var2);
            if (z10 != (L(tVar, y0Var2) instanceof pa.j)) {
                return true;
            }
        }
        return false;
    }

    public static final HashSet C(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setE = ((o) it.next()).e();
            if (setE == null) {
                return null;
            }
            u.c0(setE, hashSet);
        }
        return hashSet;
    }

    public static int D(int[] iArr, int i7, boolean z10) {
        int[] iArr2 = iArr;
        int i10 = 0;
        for (int i11 : iArr2) {
            i10 += i11;
        }
        int length = iArr2.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = length - 1;
            if (i12 >= i15) {
                return i13;
            }
            int i16 = 1 << i12;
            i14 |= i16;
            int i17 = 1;
            while (i17 < iArr2[i12]) {
                int i18 = i10 - i17;
                int i19 = length - i12;
                int i20 = i19 - 2;
                int iS = s(i18 - 1, i20);
                if (z10 && i14 == 0) {
                    int i21 = i19 - 1;
                    if (i18 - i21 >= i21) {
                        iS -= s(i18 - i19, i20);
                    }
                }
                if (i19 - 1 > 1) {
                    int iS2 = 0;
                    for (int i22 = i18 - i20; i22 > i7; i22--) {
                        iS2 += s((i18 - i22) - 1, i19 - 3);
                    }
                    iS -= (i15 - i12) * iS2;
                } else if (i18 > i7) {
                    iS--;
                }
                i13 += iS;
                i17++;
                i14 &= ~i16;
                iArr2 = iArr;
            }
            i10 -= i17;
            i12++;
            iArr2 = iArr;
        }
    }

    public static final Bundle E(String str, Bundle bundle) {
        l.e(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(f.G("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final h F(w wVar) {
        h hVar = wVar.f5889a;
        long j5 = wVar.f5890b;
        hVar.getClass();
        return hVar.subSequence(q0.f(j5), q0.e(j5));
    }

    public static final long G(y1.f fVar) {
        l.e(fVar, "<this>");
        Bitmap bitmap = fVar.f14890a;
        return (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L);
    }

    public static final h H(w wVar, int i7) {
        h hVar = wVar.f5889a;
        long j5 = wVar.f5890b;
        return hVar.subSequence(q0.e(j5), Math.min(q0.e(j5) + i7, wVar.f5889a.f1353b.length()));
    }

    public static final h I(w wVar, int i7) {
        h hVar = wVar.f5889a;
        long j5 = wVar.f5890b;
        return hVar.subSequence(Math.max(0, q0.f(j5) - i7), q0.f(j5));
    }

    public static final int J(int i7, int i10) {
        return (i7 >> i10) & 31;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX WARN: Code duplicated, block: B:47:0x0107  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
    
        if (db.e.g(r0).equals(db.e.g(r2)) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static pa.k L(x9.t r8, aa.y0 r9) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.L(x9.t, aa.y0):pa.k");
    }

    public static final int M(g0.o oVar, x0 x0Var) {
        return (int) (x0Var == x0.f15591a ? oVar.f5706o & 4294967295L : oVar.f5706o >> 32);
    }

    public static void N() {
        if (((Boolean) MainActivity.f2913z.getValue()).booleanValue()) {
            return;
        }
        Intent intent = new Intent(n8.a.b(), (Class<?>) MainActivity.class);
        intent.setFlags(268435456);
        n8.a.b().startActivity(intent);
    }

    public static m4.b P(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j5;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i7 = byteBufferDuplicate.getShort() & 65535;
        if (i7 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i10 = 0;
        while (true) {
            if (i10 >= i7) {
                j5 = -1;
                break;
            }
            int i11 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j5 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i11) {
                break;
            }
            i10++;
        }
        if (j5 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j5 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j10 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i12 = 0; i12 < j10; i12++) {
                int i13 = byteBufferDuplicate.getInt();
                long j11 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i13 || 1701669481 == i13) {
                    byteBufferDuplicate.position((int) (j11 + j5));
                    m4.b bVar = new m4.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f4320d = byteBufferDuplicate;
                    bVar.f4317a = iPosition;
                    int i14 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f4318b = i14;
                    bVar.f4319c = ((ByteBuffer) bVar.f4320d).getShort(i14);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void Q(fa.a aVar, fa.b bVar, d0 d0Var, wa.e eVar) {
        l.e(aVar, "<this>");
        l.e(bVar, "from");
        l.e(d0Var, "scopeOwner");
        l.e(eVar, "name");
        String str = ((j0) d0Var).f364e.f14240a.f14243a;
        l.d(eVar.b(), "asString(...)");
        l.e(str, "packageFqName");
    }

    public static void S(b0 b0Var, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            i4.b.q(b0Var, z10);
            return;
        }
        if (!f5e) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f4d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e7);
            }
            f5e = true;
        }
        Field field = f4d;
        if (field != null) {
            try {
                field.set(b0Var, Boolean.valueOf(z10));
            } catch (IllegalAccessException e10) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e10);
            }
        }
    }

    public static void T(PopupWindow popupWindow, int i7) {
        if (Build.VERSION.SDK_INT >= 23) {
            i4.b.t(popupWindow, i7);
            return;
        }
        if (!f3c) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f2b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f3c = true;
        }
        Method method = f2b;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i7));
            } catch (Exception unused2) {
            }
        }
    }

    public static final void d(final r1.p pVar, final m5.l lVar, float f10, float f11, long j5, float f12, long j10, float f13, q qVar, s sVar, final int i7) {
        int i10;
        float f14;
        long j11;
        long j12;
        float f15;
        int i11;
        float f16;
        float f17;
        q qVar2;
        final q qVar3;
        final float f18;
        final long j13;
        final float f19;
        final long j14;
        final float f20;
        final float f21;
        l.e(lVar, "controller");
        sVar.Y(713000284);
        if ((i7 & 14) == 0) {
            i10 = i7 | (sVar.f(pVar) ? 4 : 2);
        } else {
            i10 = i7;
        }
        if ((i7 & 112) == 0) {
            i10 |= sVar.f(lVar) ? 32 : 16;
        }
        int i12 = i10 | 383348096;
        if ((1533916891 & i12) == 306783378 && sVar.z()) {
            sVar.Q();
            f21 = f10;
            f20 = f11;
            j14 = j5;
            f19 = f12;
            j13 = j10;
            f18 = f13;
            qVar3 = qVar;
        } else {
            sVar.S();
            if ((i7 & 1) == 0 || sVar.x()) {
                f14 = 6;
                j11 = y1.q.f14950d;
                j12 = y1.q.f14951e;
                q qVarH = h0.h();
                qVarH.k(j12);
                f15 = 1.0f;
                qVarH.i(1.0f);
                i11 = i12 & (-1879048193);
                f16 = 5;
                f17 = 12;
                qVar2 = qVarH;
            } else {
                sVar.Q();
                f14 = f10;
                j11 = j5;
                f17 = f12;
                j12 = j10;
                f15 = f13;
                qVar2 = qVar;
                i11 = i12 & (-1879048193);
                f16 = f11;
            }
            sVar.q();
            sVar.X(-1857524615);
            int i13 = i11 & 112;
            boolean z10 = i13 == 32;
            Object objK = sVar.K();
            if (z10 || objK == n.f5051a) {
                objK = new m5.a(lVar, 1);
                sVar.h0(objK);
            }
            sVar.p(false);
            f1.b.h((h9.a) objK, sVar);
            long j15 = j12;
            float f22 = f14;
            long j16 = j11;
            float f23 = f15;
            g5.a.d(pVar, lVar, f22, f16, j16, f17, j15, f23, qVar2, null, new t0(13), i.f8477i, m5.e.f8455c, new t0(14), sVar, (i11 & 234881024) | i13 | (i11 & 14) | 1074003968 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (3670016 & i11) | (29360128 & i11), 221574, 2048);
            qVar3 = qVar2;
            f18 = f23;
            j13 = j15;
            f19 = f17;
            j14 = j16;
            f20 = f16;
            f21 = f22;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: m5.h
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l lVar2 = lVar;
                    i9.l.e(lVar2, "$controller");
                    a.a.d(pVar, lVar2, f21, f20, j14, f19, j13, f18, qVar3, (f1.s) obj, f1.b.y(i7 | 1));
                    return z.f12851a;
                }
            };
        }
    }

    public static final n3.e e(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        o3.a aVarA = o3.b.a(f10);
        if (aVarA == null) {
            aVarA = new n3.p(f10);
        }
        return new n3.e(f11, f10, aVarA);
    }

    /* JADX WARN: Code duplicated, block: B:177:0x026c  */
    public static final void f(final r1.p pVar, v vVar, final c cVar, final d0.h0 h0Var, final z.h hVar, final boolean z10, final x.h hVar2, final g gVar, final d0.e eVar, final k kVar, s sVar, final int i7, final int i10) {
        int i11;
        int i12;
        v vVar2;
        boolean z11;
        Object mVar;
        v vVar3;
        boolean z12;
        boolean z13;
        o9.r rVar;
        r1.p pVarA;
        sVar.Y(708740370);
        if ((i7 & 6) == 0) {
            i11 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i11 = i7;
        }
        if ((i7 & 48) == 0) {
            i11 |= sVar.f(vVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i11 |= (i7 & 512) == 0 ? sVar.f(cVar) : sVar.h(cVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i11 |= sVar.f(h0Var) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i11 |= sVar.g(false) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((i7 & 196608) == 0) {
            i11 |= sVar.g(true) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i11 |= sVar.f(hVar) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i11 |= sVar.g(z10) ? 8388608 : 4194304;
        }
        if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR) == 0) {
            i11 |= sVar.f(hVar2) ? 67108864 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
        }
        if ((i7 & 805306368) == 0) {
            i11 |= sVar.f(gVar) ? 536870912 : 268435456;
        }
        if ((i10 & 6) == 0) {
            i12 = i10 | (sVar.f(eVar) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= sVar.h(kVar) ? 32 : 16;
        }
        if (sVar.N(i11 & 1, ((i11 & 306783379) == 306783378 && (i12 & 19) == 18) ? false : true)) {
            sVar.S();
            if ((i7 & 1) != 0 && !sVar.x()) {
                sVar.Q();
            }
            sVar.q();
            int i13 = i11 >> 3;
            int i14 = i13 & 14;
            int i15 = i14 | (i12 & 112);
            b1 b1VarV = f1.b.v(kVar, sVar);
            int i16 = i11;
            boolean z14 = (((i15 & 14) ^ 6) > 4 && sVar.f(vVar)) || (i15 & 6) == 4;
            Object objK = sVar.K();
            Object obj = n.f5051a;
            if (z14 || objK == obj) {
                w0 w0Var = w0.f5185d;
                objK = new c1.q0(0, 2, w2.class, f1.b.n(w0Var, new f1(4, f1.b.n(w0Var, new f0.k(b1VarV, 7)), vVar)), "value", "getValue()Ljava/lang/Object;");
                sVar.h0(objK);
            }
            o9.r rVar2 = (o9.r) objK;
            int i17 = i14 | ((i16 >> 9) & 112);
            boolean z15 = ((((i17 & 14) ^ 6) > 4 && sVar.f(vVar)) || (i17 & 6) == 4) | ((((i17 & 112) ^ 48) > 32 && sVar.g(false)) || (i17 & 48) == 32);
            Object objK2 = sVar.K();
            if (z15 || objK2 == obj) {
                objK2 = new y(vVar);
                sVar.h0(objK2);
            }
            y yVar = (y) objK2;
            Object objK3 = sVar.K();
            if (objK3 == obj) {
                objK3 = f1.b.l(sVar);
                sVar.h0(objK3);
            }
            cc.y yVar2 = (cc.y) objK3;
            y1.v vVar4 = (y1.v) sVar.j(j1.f11275g);
            h0.b0 b0Var = !((Boolean) sVar.j(j1.f11289v)).booleanValue() ? h0.x0.f6408a : null;
            int i18 = (i16 & 524272) | ((i12 << 18) & 3670016) | ((i16 >> 6) & 29360128);
            boolean z16 = ((((i18 & 896) ^ 384) > 256 && sVar.f(cVar)) || (i18 & 384) == 256) | ((((i18 & 112) ^ 48) > 32 && sVar.f(vVar)) || (i18 & 48) == 32) | ((((i18 & 7168) ^ 3072) > 2048 && sVar.f(h0Var)) || (i18 & 3072) == 2048);
            if (((57344 & i18) ^ 24576) > 16384 && sVar.g(false)) {
                z11 = true;
            } else if ((i18 & 24576) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zF = ((((i18 & 29360128) ^ 12582912) > 8388608 && sVar.f(gVar)) || (i18 & 12582912) == 8388608) | z16 | z11 | ((((458752 & i18) ^ 196608) > 131072 && sVar.g(true)) || (i18 & 196608) == 131072) | ((((i18 & 3670016) ^ 1572864) > 1048576 && sVar.f(eVar)) || (i18 & 1572864) == 1048576) | sVar.f(vVar4);
            Object objK4 = sVar.K();
            if (zF || objK4 == obj) {
                vVar3 = vVar;
                z12 = false;
                z13 = true;
                mVar = new m(vVar3, h0Var, rVar2, cVar, gVar, eVar, yVar2, vVar4, b0Var);
                rVar = rVar2;
                sVar.h0(mVar);
            } else {
                mVar = objK4;
                rVar = rVar2;
                z12 = false;
                z13 = true;
                vVar3 = vVar;
            }
            m mVar2 = (m) mVar;
            x0 x0Var = x0.f15591a;
            if (z10) {
                sVar.W(27343139);
                if (((i14 ^ 6) <= 4 || !sVar.f(vVar3)) && (i13 & 6) != 4) {
                    z13 = false;
                }
                Object objK5 = sVar.K();
                if (z13 || objK5 == obj) {
                    objK5 = new d(vVar3);
                    sVar.h0(objK5);
                }
                pVarA = androidx.compose.foundation.lazy.layout.a.a((d) objK5, vVar3.f5750n, x0Var);
                sVar.p(z12);
            } else {
                sVar.W(27639344);
                sVar.p(z12);
                pVarA = r1.m.f11116a;
            }
            vVar2 = vVar3;
            h0.z.a(rVar, androidx.compose.foundation.a.i(androidx.compose.foundation.lazy.layout.a.b(pVar.a(vVar3.k).a(vVar3.f5748l), rVar, yVar, x0Var, z10).a(pVarA).a(vVar3.f5749m.f846i), vVar3, x0Var, z10, hVar, vVar3.f5743f, false, hVar2), vVar2.f5751o, mVar2, sVar, 0);
        } else {
            vVar2 = vVar;
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            final v vVar5 = vVar2;
            w1VarR.f5192d = new h9.n() { // from class: g0.k
                @Override // h9.n
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    a.a.f(pVar, vVar5, cVar, h0Var, hVar, z10, hVar2, gVar, eVar, kVar, (f1.s) obj2, f1.b.y(i7 | 1), f1.b.y(i10));
                    return z.f12851a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0291  */
    public static final void g(int i7, int i10, g gVar, d0.h0 h0Var, f0.u uVar, s sVar, k kVar, r1.f fVar, r1.p pVar, x.h hVar, z.h hVar2, boolean z10) {
        int i11;
        int i12;
        k kVar2;
        f0.u uVar2;
        boolean z11;
        Object mVar;
        f0.u uVar3;
        o9.r rVar;
        r1.p pVarA;
        sVar.Y(924924659);
        if ((i7 & 6) == 0) {
            i11 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i11 = i7;
        }
        if ((i7 & 48) == 0) {
            i11 |= sVar.f(uVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i11 |= sVar.f(h0Var) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i11 |= sVar.g(false) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i11 |= sVar.g(true) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((196608 & i7) == 0) {
            i11 |= sVar.f(hVar2) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i11 |= sVar.g(z10) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i11 |= sVar.f(hVar) ? 8388608 : 4194304;
        }
        if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR) == 0) {
            i11 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
        }
        if ((i7 & 805306368) == 0) {
            i11 |= sVar.f(fVar) ? 536870912 : 268435456;
        }
        if ((i10 & 6) == 0) {
            i12 = i10 | (sVar.f(gVar) ? 4 : 2);
        } else {
            i12 = i10;
        }
        int i13 = i12 | 432;
        if ((i10 & 3072) == 0) {
            i13 |= sVar.h(kVar) ? 2048 : 1024;
        }
        if (sVar.N(i11 & 1, ((306783379 & i11) == 306783378 && (i13 & 1171) == 1170) ? false : true)) {
            sVar.S();
            if ((i7 & 1) != 0 && !sVar.x()) {
                sVar.Q();
            }
            int i14 = i11 & (-234881025);
            sVar.q();
            int i15 = i14 >> 3;
            int i16 = i15 & 14;
            int i17 = i16 | ((i13 >> 6) & 112);
            kVar2 = kVar;
            b1 b1VarV = f1.b.v(kVar2, sVar);
            boolean z12 = (((i17 & 14) ^ 6) > 4 && sVar.f(uVar)) || (i17 & 6) == 4;
            Object objK = sVar.K();
            Object obj = n.f5051a;
            if (z12 || objK == obj) {
                f0.c cVar = new f0.c();
                cVar.f4764a = new h1(Integer.MAX_VALUE);
                cVar.f4765b = new h1(Integer.MAX_VALUE);
                w0 w0Var = w0.f5185d;
                objK = new c1.q0(0, 1, w2.class, f1.b.n(w0Var, new a8.j1(f1.b.n(w0Var, new f0.k(b1VarV, 0)), uVar, cVar, 3)), "value", "getValue()Ljava/lang/Object;");
                sVar.h0(objK);
            }
            o9.r rVar2 = (o9.r) objK;
            int i18 = i14 >> 9;
            int i19 = i16 | (i18 & 112);
            boolean z13 = ((((i19 & 112) ^ 48) > 32 && sVar.g(true)) || (i19 & 48) == 32) | ((((i19 & 14) ^ 6) > 4 && sVar.f(uVar)) || (i19 & 6) == 4);
            Object objK2 = sVar.K();
            if (z13 || objK2 == obj) {
                objK2 = new f0.d(uVar);
                sVar.h0(objK2);
            }
            l0 l0Var = (l0) objK2;
            Object objK3 = sVar.K();
            if (objK3 == obj) {
                objK3 = f1.b.l(sVar);
                sVar.h0(objK3);
            }
            cc.y yVar = (cc.y) objK3;
            y1.v vVar = (y1.v) sVar.j(j1.f11275g);
            h0.b0 b0Var = !((Boolean) sVar.j(j1.f11289v)).booleanValue() ? h0.x0.f6408a : null;
            int i20 = i13 << 18;
            int i21 = (i14 & 65520) | (i18 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | ((i13 << 27) & 1879048192);
            boolean z14 = ((((i21 & 112) ^ 48) > 32 && sVar.f(uVar)) || (i21 & 48) == 32) | ((((i21 & 896) ^ 384) > 256 && sVar.f(h0Var)) || (i21 & 384) == 256) | ((((i21 & 7168) ^ 3072) > 2048 && sVar.g(false)) || (i21 & 3072) == 2048);
            if (((57344 & i21) ^ 24576) > 16384 && sVar.g(true)) {
                z11 = true;
            } else if ((i21 & 24576) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zD = (((i21 & 234881024) ^ ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR) > 67108864 && sVar.f(null)) | z14 | z11 | sVar.d(0) | ((((i21 & 3670016) ^ 1572864) > 1048576 && sVar.f(fVar)) || (i21 & 1572864) == 1048576) | (((i21 & 29360128) ^ 12582912) > 8388608 && sVar.f(null)) | ((((i21 & 1879048192) ^ 805306368) > 536870912 && sVar.f(gVar)) || (i21 & 805306368) == 536870912) | sVar.f(vVar) | sVar.f(b0Var);
            Object objK4 = sVar.K();
            if (zD || objK4 == obj) {
                uVar3 = uVar;
                mVar = new m(uVar3, h0Var, rVar2, gVar, yVar, vVar, b0Var, fVar);
                rVar = rVar2;
                sVar.h0(mVar);
            } else {
                mVar = objK4;
                rVar = rVar2;
                uVar3 = uVar;
            }
            m mVar2 = (m) mVar;
            x0 x0Var = x0.f15591a;
            if (z10) {
                sVar.W(-2077085864);
                boolean zD2 = sVar.d(0) | ((((i15 & 14) ^ 6) > 4 && sVar.f(uVar3)) || (i15 & 6) == 4);
                Object objK5 = sVar.K();
                if (zD2 || objK5 == obj) {
                    objK5 = new f0.e(uVar3);
                    sVar.h0(objK5);
                }
                pVarA = androidx.compose.foundation.lazy.layout.a.a((f0.e) objK5, uVar3.f4865o, x0Var);
                sVar.p(false);
            } else {
                sVar.W(-2076657041);
                sVar.p(false);
                pVarA = r1.m.f11116a;
            }
            uVar2 = uVar3;
            h0.z.a(rVar, androidx.compose.foundation.a.i(androidx.compose.foundation.lazy.layout.a.b(pVar.a(uVar3.f4862l).a(uVar3.f4863m), rVar, l0Var, x0Var, z10).a(pVarA).a(uVar3.f4864n.f846i), uVar3, x0Var, z10, hVar2, uVar3.f4858g, false, hVar), uVar2.f4866p, mVar2, sVar, 0);
        } else {
            kVar2 = kVar;
            uVar2 = uVar;
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new f0.b(pVar, uVar2, h0Var, hVar2, z10, hVar, fVar, gVar, kVar2, i7, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0237  */
    /* JADX WARN: Code duplicated, block: B:104:0x023b  */
    /* JADX WARN: Code duplicated, block: B:108:0x024d  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    /* JADX WARN: Code duplicated, block: B:73:0x013c  */
    /* JADX WARN: Code duplicated, block: B:75:0x014a  */
    /* JADX WARN: Code duplicated, block: B:79:0x015d  */
    /* JADX WARN: Code duplicated, block: B:82:0x019b  */
    /* JADX WARN: Code duplicated, block: B:83:0x019f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x020a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0218  */
    public static final void h(h9.n nVar, h9.n nVar2, boolean z10, h9.a aVar, s sVar, int i7, int i10) {
        int i11;
        boolean z11;
        int i12;
        h9.a aVar2;
        int i13;
        w0 w0Var;
        h9.a aVar3;
        Object objK;
        boolean z12;
        Object objK2;
        int i14;
        a0 a0Var;
        q2.h hVar;
        int i15;
        int i16;
        Boolean boolValueOf;
        h9.a aVar4;
        Object objK3;
        boolean z13;
        w1 w1VarR;
        l.e(nVar, "titleContent");
        l.e(nVar2, "descriptionContent");
        sVar.Y(-241687210);
        if ((i7 & 6) == 0) {
            i11 = (sVar.h(nVar) ? 4 : 2) | i7;
        } else {
            i11 = i7;
        }
        if ((i7 & 48) == 0) {
            i11 |= sVar.h(nVar2) ? 32 : 16;
        }
        int i17 = i10 & 4;
        if (i17 == 0) {
            if ((i7 & 384) == 0) {
                z11 = z10;
                i11 |= sVar.g(z11) ? 256 : 128;
            }
            i12 = i10 & 8;
            if (i12 != 0) {
                if ((i7 & 3072) == 0) {
                    aVar2 = aVar;
                    if (sVar.h(aVar2)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i11 |= i13;
                }
                if ((i11 & 1171) == 1170 || !sVar.z()) {
                    if (i17 != 0) {
                        z11 = true;
                    }
                    w0Var = n.f5051a;
                    if (i12 != 0) {
                        sVar.W(1849434622);
                        objK3 = sVar.K();
                        if (objK3 == w0Var) {
                            objK3 = new i0(14);
                            sVar.h0(objK3);
                        }
                        aVar3 = (h9.a) objK3;
                        sVar.p(false);
                    } else {
                        aVar3 = aVar2;
                    }
                    r1.g gVar = r1.c.k;
                    d0.d dVar = d0.h.f3570e;
                    r1.p pVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.f820a, 0.0f, g5.a.n(10, sVar), 1);
                    sVar.W(1849434622);
                    objK = sVar.K();
                    if (objK == w0Var) {
                        objK = ob.a.m(sVar);
                    }
                    b0.k kVar = (b0.k) objK;
                    sVar.p(false);
                    sVar.W(5004770);
                    if ((i11 & 7168) == 2048) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objK2 = sVar.K();
                    if (z12 || objK2 == w0Var) {
                        objK2 = new l8.y(aVar3, 0);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    r1.p pVarC = androidx.compose.foundation.a.c(pVarJ, kVar, null, false, (h9.a) objK2, 28);
                    n0 n0VarA = d0.l0.a(dVar, gVar, sVar, 54);
                    long j5 = sVar.T;
                    i14 = (int) (j5 ^ (j5 >>> 32));
                    q1 q1VarL = sVar.l();
                    r1.p pVarC2 = r1.a.c(sVar, pVarC);
                    q2.j.f10719d0.getClass();
                    a0Var = q2.i.f10705b;
                    sVar.a0();
                    if (sVar.S) {
                        sVar.k(a0Var);
                    } else {
                        sVar.k0();
                    }
                    q2.h hVar2 = q2.i.f10708e;
                    f1.b.w(sVar, hVar2, n0VarA);
                    q2.h hVar3 = q2.i.f10707d;
                    f1.b.w(sVar, hVar3, q1VarL);
                    hVar = q2.i.f10709f;
                    if (sVar.S || !l.a(sVar.K(), Integer.valueOf(i14))) {
                        ob.a.w(i14, sVar, i14, hVar);
                    }
                    q2.h hVar4 = q2.i.f10706c;
                    f1.b.w(sVar, hVar4, pVarC2);
                    if (1.0f <= 0.0d) {
                        e0.a.a("invalid weight; must be greater than zero");
                    }
                    r1.p pVarK = androidx.compose.foundation.layout.a.k(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, g5.a.n(16, sVar), 0.0f, 11);
                    d0.s sVarA = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
                    long j10 = sVar.T;
                    i15 = (int) (j10 ^ (j10 >>> 32));
                    q1 q1VarL2 = sVar.l();
                    r1.p pVarC3 = r1.a.c(sVar, pVarK);
                    sVar.a0();
                    if (sVar.S) {
                        sVar.k(a0Var);
                    } else {
                        sVar.k0();
                    }
                    f1.b.w(sVar, hVar2, sVarA);
                    f1.b.w(sVar, hVar3, q1VarL2);
                    if (sVar.S || !l.a(sVar.K(), Integer.valueOf(i15))) {
                        ob.a.w(i15, sVar, i15, hVar);
                    }
                    f1.b.w(sVar, hVar4, pVarC3);
                    nVar.invoke(sVar, Integer.valueOf(i11 & 14));
                    sVar.p(true);
                    d0.b bVar = d0.h.f3567b;
                    r1.p pVarL = androidx.compose.foundation.layout.c.l(g5.a.n(100, sVar), 0.0f, 2);
                    n0 n0VarA2 = d0.l0.a(bVar, gVar, sVar, 54);
                    long j11 = sVar.T;
                    i16 = (int) (j11 ^ (j11 >>> 32));
                    q1 q1VarL3 = sVar.l();
                    r1.p pVarC4 = r1.a.c(sVar, pVarL);
                    sVar.a0();
                    if (sVar.S) {
                        sVar.k(a0Var);
                    } else {
                        sVar.k0();
                    }
                    f1.b.w(sVar, hVar2, n0VarA2);
                    f1.b.w(sVar, hVar3, q1VarL3);
                    if (sVar.S || !l.a(sVar.K(), Integer.valueOf(i16))) {
                        ob.a.w(i16, sVar, i16, hVar);
                    }
                    f1.b.w(sVar, hVar4, pVarC4);
                    nVar2.invoke(sVar, Integer.valueOf((i11 >> 3) & 14));
                    sVar.p(true);
                    sVar.p(true);
                    boolValueOf = Boolean.valueOf(z11);
                    if (!z11) {
                        boolValueOf = null;
                    }
                    if (boolValueOf != null) {
                        g1.d(null, 1, 0L, sVar, 48);
                    }
                    aVar4 = aVar3;
                } else {
                    sVar.Q();
                    aVar4 = aVar2;
                }
                z13 = z11;
                w1VarR = sVar.r();
                if (w1VarR != null) {
                    w1VarR.f5192d = new l8.z(nVar, nVar2, z13, aVar4, i7, i10, 0);
                }
            }
            i11 |= 3072;
            aVar2 = aVar;
            if ((i11 & 1171) == 1170) {
                if (i17 != 0) {
                    z11 = true;
                }
                w0Var = n.f5051a;
                if (i12 != 0) {
                    sVar.W(1849434622);
                    objK3 = sVar.K();
                    if (objK3 == w0Var) {
                        objK3 = new i0(14);
                        sVar.h0(objK3);
                    }
                    aVar3 = (h9.a) objK3;
                    sVar.p(false);
                } else {
                    aVar3 = aVar2;
                }
                r1.g gVar2 = r1.c.k;
                d0.d dVar2 = d0.h.f3570e;
                r1.p pVarJ2 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.f820a, 0.0f, g5.a.n(10, sVar), 1);
                sVar.W(1849434622);
                objK = sVar.K();
                if (objK == w0Var) {
                    objK = ob.a.m(sVar);
                }
                b0.k kVar2 = (b0.k) objK;
                sVar.p(false);
                sVar.W(5004770);
                if ((i11 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objK2 = sVar.K();
                if (z12) {
                    objK2 = new l8.y(aVar3, 0);
                    sVar.h0(objK2);
                } else {
                    objK2 = new l8.y(aVar3, 0);
                    sVar.h0(objK2);
                }
                sVar.p(false);
                r1.p pVarC5 = androidx.compose.foundation.a.c(pVarJ2, kVar2, null, false, (h9.a) objK2, 28);
                n0 n0VarA3 = d0.l0.a(dVar2, gVar2, sVar, 54);
                long j12 = sVar.T;
                i14 = (int) (j12 ^ (j12 >>> 32));
                q1 q1VarL4 = sVar.l();
                r1.p pVarC6 = r1.a.c(sVar, pVarC5);
                q2.j.f10719d0.getClass();
                a0Var = q2.i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                q2.h hVar5 = q2.i.f10708e;
                f1.b.w(sVar, hVar5, n0VarA3);
                q2.h hVar6 = q2.i.f10707d;
                f1.b.w(sVar, hVar6, q1VarL4);
                hVar = q2.i.f10709f;
                if (sVar.S) {
                    ob.a.w(i14, sVar, i14, hVar);
                } else {
                    ob.a.w(i14, sVar, i14, hVar);
                }
                q2.h hVar7 = q2.i.f10706c;
                f1.b.w(sVar, hVar7, pVarC6);
                if (1.0f <= 0.0d) {
                    e0.a.a("invalid weight; must be greater than zero");
                }
                r1.p pVarK2 = androidx.compose.foundation.layout.a.k(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, g5.a.n(16, sVar), 0.0f, 11);
                d0.s sVarA2 = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
                long j13 = sVar.T;
                i15 = (int) (j13 ^ (j13 >>> 32));
                q1 q1VarL5 = sVar.l();
                r1.p pVarC7 = r1.a.c(sVar, pVarK2);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar5, sVarA2);
                f1.b.w(sVar, hVar6, q1VarL5);
                if (sVar.S) {
                    ob.a.w(i15, sVar, i15, hVar);
                } else {
                    ob.a.w(i15, sVar, i15, hVar);
                }
                f1.b.w(sVar, hVar7, pVarC7);
                nVar.invoke(sVar, Integer.valueOf(i11 & 14));
                sVar.p(true);
                d0.b bVar2 = d0.h.f3567b;
                r1.p pVarL2 = androidx.compose.foundation.layout.c.l(g5.a.n(100, sVar), 0.0f, 2);
                n0 n0VarA4 = d0.l0.a(bVar2, gVar2, sVar, 54);
                long j14 = sVar.T;
                i16 = (int) (j14 ^ (j14 >>> 32));
                q1 q1VarL6 = sVar.l();
                r1.p pVarC8 = r1.a.c(sVar, pVarL2);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar5, n0VarA4);
                f1.b.w(sVar, hVar6, q1VarL6);
                if (sVar.S) {
                    ob.a.w(i16, sVar, i16, hVar);
                } else {
                    ob.a.w(i16, sVar, i16, hVar);
                }
                f1.b.w(sVar, hVar7, pVarC8);
                nVar2.invoke(sVar, Integer.valueOf((i11 >> 3) & 14));
                sVar.p(true);
                sVar.p(true);
                boolValueOf = Boolean.valueOf(z11);
                if (!z11) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    g1.d(null, 1, 0L, sVar, 48);
                }
                aVar4 = aVar3;
            } else {
                if (i17 != 0) {
                    z11 = true;
                }
                w0Var = n.f5051a;
                if (i12 != 0) {
                    sVar.W(1849434622);
                    objK3 = sVar.K();
                    if (objK3 == w0Var) {
                        objK3 = new i0(14);
                        sVar.h0(objK3);
                    }
                    aVar3 = (h9.a) objK3;
                    sVar.p(false);
                } else {
                    aVar3 = aVar2;
                }
                r1.g gVar3 = r1.c.k;
                d0.d dVar3 = d0.h.f3570e;
                r1.p pVarJ3 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.f820a, 0.0f, g5.a.n(10, sVar), 1);
                sVar.W(1849434622);
                objK = sVar.K();
                if (objK == w0Var) {
                    objK = ob.a.m(sVar);
                }
                b0.k kVar3 = (b0.k) objK;
                sVar.p(false);
                sVar.W(5004770);
                if ((i11 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objK2 = sVar.K();
                if (z12) {
                    objK2 = new l8.y(aVar3, 0);
                    sVar.h0(objK2);
                } else {
                    objK2 = new l8.y(aVar3, 0);
                    sVar.h0(objK2);
                }
                sVar.p(false);
                r1.p pVarC9 = androidx.compose.foundation.a.c(pVarJ3, kVar3, null, false, (h9.a) objK2, 28);
                n0 n0VarA5 = d0.l0.a(dVar3, gVar3, sVar, 54);
                long j15 = sVar.T;
                i14 = (int) (j15 ^ (j15 >>> 32));
                q1 q1VarL7 = sVar.l();
                r1.p pVarC10 = r1.a.c(sVar, pVarC9);
                q2.j.f10719d0.getClass();
                a0Var = q2.i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                q2.h hVar8 = q2.i.f10708e;
                f1.b.w(sVar, hVar8, n0VarA5);
                q2.h hVar9 = q2.i.f10707d;
                f1.b.w(sVar, hVar9, q1VarL7);
                hVar = q2.i.f10709f;
                if (sVar.S) {
                    ob.a.w(i14, sVar, i14, hVar);
                } else {
                    ob.a.w(i14, sVar, i14, hVar);
                }
                q2.h hVar10 = q2.i.f10706c;
                f1.b.w(sVar, hVar10, pVarC10);
                if (1.0f <= 0.0d) {
                    e0.a.a("invalid weight; must be greater than zero");
                }
                r1.p pVarK3 = androidx.compose.foundation.layout.a.k(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, g5.a.n(16, sVar), 0.0f, 11);
                d0.s sVarA3 = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
                long j16 = sVar.T;
                i15 = (int) (j16 ^ (j16 >>> 32));
                q1 q1VarL8 = sVar.l();
                r1.p pVarC11 = r1.a.c(sVar, pVarK3);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar8, sVarA3);
                f1.b.w(sVar, hVar9, q1VarL8);
                if (sVar.S) {
                    ob.a.w(i15, sVar, i15, hVar);
                } else {
                    ob.a.w(i15, sVar, i15, hVar);
                }
                f1.b.w(sVar, hVar10, pVarC11);
                nVar.invoke(sVar, Integer.valueOf(i11 & 14));
                sVar.p(true);
                d0.b bVar3 = d0.h.f3567b;
                r1.p pVarL3 = androidx.compose.foundation.layout.c.l(g5.a.n(100, sVar), 0.0f, 2);
                n0 n0VarA6 = d0.l0.a(bVar3, gVar3, sVar, 54);
                long j17 = sVar.T;
                i16 = (int) (j17 ^ (j17 >>> 32));
                q1 q1VarL9 = sVar.l();
                r1.p pVarC12 = r1.a.c(sVar, pVarL3);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar8, n0VarA6);
                f1.b.w(sVar, hVar9, q1VarL9);
                if (sVar.S) {
                    ob.a.w(i16, sVar, i16, hVar);
                } else {
                    ob.a.w(i16, sVar, i16, hVar);
                }
                f1.b.w(sVar, hVar10, pVarC12);
                nVar2.invoke(sVar, Integer.valueOf((i11 >> 3) & 14));
                sVar.p(true);
                sVar.p(true);
                boolValueOf = Boolean.valueOf(z11);
                if (!z11) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    g1.d(null, 1, 0L, sVar, 48);
                }
                aVar4 = aVar3;
            }
            z13 = z11;
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new l8.z(nVar, nVar2, z13, aVar4, i7, i10, 0);
            }
        }
        i11 |= 384;
        z11 = z10;
        i12 = i10 & 8;
        if (i12 != 0) {
            if ((i7 & 3072) == 0) {
                aVar2 = aVar;
                if (sVar.h(aVar2)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i11 |= i13;
            }
            if ((i11 & 1171) == 1170) {
                if (i17 != 0) {
                    z11 = true;
                }
                w0Var = n.f5051a;
                if (i12 != 0) {
                    sVar.W(1849434622);
                    objK3 = sVar.K();
                    if (objK3 == w0Var) {
                        objK3 = new i0(14);
                        sVar.h0(objK3);
                    }
                    aVar3 = (h9.a) objK3;
                    sVar.p(false);
                } else {
                    aVar3 = aVar2;
                }
                r1.g gVar4 = r1.c.k;
                d0.d dVar4 = d0.h.f3570e;
                r1.p pVarJ4 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.f820a, 0.0f, g5.a.n(10, sVar), 1);
                sVar.W(1849434622);
                objK = sVar.K();
                if (objK == w0Var) {
                    objK = ob.a.m(sVar);
                }
                b0.k kVar4 = (b0.k) objK;
                sVar.p(false);
                sVar.W(5004770);
                if ((i11 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objK2 = sVar.K();
                if (z12) {
                    objK2 = new l8.y(aVar3, 0);
                    sVar.h0(objK2);
                } else {
                    objK2 = new l8.y(aVar3, 0);
                    sVar.h0(objK2);
                }
                sVar.p(false);
                r1.p pVarC13 = androidx.compose.foundation.a.c(pVarJ4, kVar4, null, false, (h9.a) objK2, 28);
                n0 n0VarA7 = d0.l0.a(dVar4, gVar4, sVar, 54);
                long j18 = sVar.T;
                i14 = (int) (j18 ^ (j18 >>> 32));
                q1 q1VarL10 = sVar.l();
                r1.p pVarC14 = r1.a.c(sVar, pVarC13);
                q2.j.f10719d0.getClass();
                a0Var = q2.i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                q2.h hVar11 = q2.i.f10708e;
                f1.b.w(sVar, hVar11, n0VarA7);
                q2.h hVar12 = q2.i.f10707d;
                f1.b.w(sVar, hVar12, q1VarL10);
                hVar = q2.i.f10709f;
                if (sVar.S) {
                    ob.a.w(i14, sVar, i14, hVar);
                } else {
                    ob.a.w(i14, sVar, i14, hVar);
                }
                q2.h hVar13 = q2.i.f10706c;
                f1.b.w(sVar, hVar13, pVarC14);
                if (1.0f <= 0.0d) {
                    e0.a.a("invalid weight; must be greater than zero");
                }
                r1.p pVarK4 = androidx.compose.foundation.layout.a.k(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, g5.a.n(16, sVar), 0.0f, 11);
                d0.s sVarA4 = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
                long j19 = sVar.T;
                i15 = (int) (j19 ^ (j19 >>> 32));
                q1 q1VarL11 = sVar.l();
                r1.p pVarC15 = r1.a.c(sVar, pVarK4);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar11, sVarA4);
                f1.b.w(sVar, hVar12, q1VarL11);
                if (sVar.S) {
                    ob.a.w(i15, sVar, i15, hVar);
                } else {
                    ob.a.w(i15, sVar, i15, hVar);
                }
                f1.b.w(sVar, hVar13, pVarC15);
                nVar.invoke(sVar, Integer.valueOf(i11 & 14));
                sVar.p(true);
                d0.b bVar4 = d0.h.f3567b;
                r1.p pVarL4 = androidx.compose.foundation.layout.c.l(g5.a.n(100, sVar), 0.0f, 2);
                n0 n0VarA8 = d0.l0.a(bVar4, gVar4, sVar, 54);
                long j110 = sVar.T;
                i16 = (int) (j110 ^ (j110 >>> 32));
                q1 q1VarL12 = sVar.l();
                r1.p pVarC16 = r1.a.c(sVar, pVarL4);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar11, n0VarA8);
                f1.b.w(sVar, hVar12, q1VarL12);
                if (sVar.S) {
                    ob.a.w(i16, sVar, i16, hVar);
                } else {
                    ob.a.w(i16, sVar, i16, hVar);
                }
                f1.b.w(sVar, hVar13, pVarC16);
                nVar2.invoke(sVar, Integer.valueOf((i11 >> 3) & 14));
                sVar.p(true);
                sVar.p(true);
                boolValueOf = Boolean.valueOf(z11);
                if (!z11) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    g1.d(null, 1, 0L, sVar, 48);
                }
                aVar4 = aVar3;
            } else {
                if (i17 != 0) {
                    z11 = true;
                }
                w0Var = n.f5051a;
                if (i12 != 0) {
                    sVar.W(1849434622);
                    objK3 = sVar.K();
                    if (objK3 == w0Var) {
                        objK3 = new i0(14);
                        sVar.h0(objK3);
                    }
                    aVar3 = (h9.a) objK3;
                    sVar.p(false);
                } else {
                    aVar3 = aVar2;
                }
                r1.g gVar5 = r1.c.k;
                d0.d dVar5 = d0.h.f3570e;
                r1.p pVarJ5 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.f820a, 0.0f, g5.a.n(10, sVar), 1);
                sVar.W(1849434622);
                objK = sVar.K();
                if (objK == w0Var) {
                    objK = ob.a.m(sVar);
                }
                b0.k kVar5 = (b0.k) objK;
                sVar.p(false);
                sVar.W(5004770);
                if ((i11 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objK2 = sVar.K();
                if (z12) {
                    objK2 = new l8.y(aVar3, 0);
                    sVar.h0(objK2);
                } else {
                    objK2 = new l8.y(aVar3, 0);
                    sVar.h0(objK2);
                }
                sVar.p(false);
                r1.p pVarC17 = androidx.compose.foundation.a.c(pVarJ5, kVar5, null, false, (h9.a) objK2, 28);
                n0 n0VarA9 = d0.l0.a(dVar5, gVar5, sVar, 54);
                long j111 = sVar.T;
                i14 = (int) (j111 ^ (j111 >>> 32));
                q1 q1VarL13 = sVar.l();
                r1.p pVarC18 = r1.a.c(sVar, pVarC17);
                q2.j.f10719d0.getClass();
                a0Var = q2.i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                q2.h hVar14 = q2.i.f10708e;
                f1.b.w(sVar, hVar14, n0VarA9);
                q2.h hVar15 = q2.i.f10707d;
                f1.b.w(sVar, hVar15, q1VarL13);
                hVar = q2.i.f10709f;
                if (sVar.S) {
                    ob.a.w(i14, sVar, i14, hVar);
                } else {
                    ob.a.w(i14, sVar, i14, hVar);
                }
                q2.h hVar16 = q2.i.f10706c;
                f1.b.w(sVar, hVar16, pVarC18);
                if (1.0f <= 0.0d) {
                    e0.a.a("invalid weight; must be greater than zero");
                }
                r1.p pVarK5 = androidx.compose.foundation.layout.a.k(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, g5.a.n(16, sVar), 0.0f, 11);
                d0.s sVarA5 = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
                long j112 = sVar.T;
                i15 = (int) (j112 ^ (j112 >>> 32));
                q1 q1VarL14 = sVar.l();
                r1.p pVarC19 = r1.a.c(sVar, pVarK5);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar14, sVarA5);
                f1.b.w(sVar, hVar15, q1VarL14);
                if (sVar.S) {
                    ob.a.w(i15, sVar, i15, hVar);
                } else {
                    ob.a.w(i15, sVar, i15, hVar);
                }
                f1.b.w(sVar, hVar16, pVarC19);
                nVar.invoke(sVar, Integer.valueOf(i11 & 14));
                sVar.p(true);
                d0.b bVar5 = d0.h.f3567b;
                r1.p pVarL5 = androidx.compose.foundation.layout.c.l(g5.a.n(100, sVar), 0.0f, 2);
                n0 n0VarA10 = d0.l0.a(bVar5, gVar5, sVar, 54);
                long j113 = sVar.T;
                i16 = (int) (j113 ^ (j113 >>> 32));
                q1 q1VarL15 = sVar.l();
                r1.p pVarC110 = r1.a.c(sVar, pVarL5);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar14, n0VarA10);
                f1.b.w(sVar, hVar15, q1VarL15);
                if (sVar.S) {
                    ob.a.w(i16, sVar, i16, hVar);
                } else {
                    ob.a.w(i16, sVar, i16, hVar);
                }
                f1.b.w(sVar, hVar16, pVarC110);
                nVar2.invoke(sVar, Integer.valueOf((i11 >> 3) & 14));
                sVar.p(true);
                sVar.p(true);
                boolValueOf = Boolean.valueOf(z11);
                if (!z11) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    g1.d(null, 1, 0L, sVar, 48);
                }
                aVar4 = aVar3;
            }
            z13 = z11;
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new l8.z(nVar, nVar2, z13, aVar4, i7, i10, 0);
            }
        }
        i11 |= 3072;
        aVar2 = aVar;
        if ((i11 & 1171) == 1170) {
            if (i17 != 0) {
                z11 = true;
            }
            w0Var = n.f5051a;
            if (i12 != 0) {
                sVar.W(1849434622);
                objK3 = sVar.K();
                if (objK3 == w0Var) {
                    objK3 = new i0(14);
                    sVar.h0(objK3);
                }
                aVar3 = (h9.a) objK3;
                sVar.p(false);
            } else {
                aVar3 = aVar2;
            }
            r1.g gVar6 = r1.c.k;
            d0.d dVar6 = d0.h.f3570e;
            r1.p pVarJ6 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.f820a, 0.0f, g5.a.n(10, sVar), 1);
            sVar.W(1849434622);
            objK = sVar.K();
            if (objK == w0Var) {
                objK = ob.a.m(sVar);
            }
            b0.k kVar6 = (b0.k) objK;
            sVar.p(false);
            sVar.W(5004770);
            if ((i11 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            objK2 = sVar.K();
            if (z12) {
                objK2 = new l8.y(aVar3, 0);
                sVar.h0(objK2);
            } else {
                objK2 = new l8.y(aVar3, 0);
                sVar.h0(objK2);
            }
            sVar.p(false);
            r1.p pVarC111 = androidx.compose.foundation.a.c(pVarJ6, kVar6, null, false, (h9.a) objK2, 28);
            n0 n0VarA11 = d0.l0.a(dVar6, gVar6, sVar, 54);
            long j114 = sVar.T;
            i14 = (int) (j114 ^ (j114 >>> 32));
            q1 q1VarL16 = sVar.l();
            r1.p pVarC112 = r1.a.c(sVar, pVarC111);
            q2.j.f10719d0.getClass();
            a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            q2.h hVar17 = q2.i.f10708e;
            f1.b.w(sVar, hVar17, n0VarA11);
            q2.h hVar18 = q2.i.f10707d;
            f1.b.w(sVar, hVar18, q1VarL16);
            hVar = q2.i.f10709f;
            if (sVar.S) {
                ob.a.w(i14, sVar, i14, hVar);
            } else {
                ob.a.w(i14, sVar, i14, hVar);
            }
            q2.h hVar19 = q2.i.f10706c;
            f1.b.w(sVar, hVar19, pVarC112);
            if (1.0f <= 0.0d) {
                e0.a.a("invalid weight; must be greater than zero");
            }
            r1.p pVarK6 = androidx.compose.foundation.layout.a.k(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, g5.a.n(16, sVar), 0.0f, 11);
            d0.s sVarA6 = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
            long j115 = sVar.T;
            i15 = (int) (j115 ^ (j115 >>> 32));
            q1 q1VarL17 = sVar.l();
            r1.p pVarC113 = r1.a.c(sVar, pVarK6);
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, hVar17, sVarA6);
            f1.b.w(sVar, hVar18, q1VarL17);
            if (sVar.S) {
                ob.a.w(i15, sVar, i15, hVar);
            } else {
                ob.a.w(i15, sVar, i15, hVar);
            }
            f1.b.w(sVar, hVar19, pVarC113);
            nVar.invoke(sVar, Integer.valueOf(i11 & 14));
            sVar.p(true);
            d0.b bVar6 = d0.h.f3567b;
            r1.p pVarL6 = androidx.compose.foundation.layout.c.l(g5.a.n(100, sVar), 0.0f, 2);
            n0 n0VarA12 = d0.l0.a(bVar6, gVar6, sVar, 54);
            long j116 = sVar.T;
            i16 = (int) (j116 ^ (j116 >>> 32));
            q1 q1VarL18 = sVar.l();
            r1.p pVarC114 = r1.a.c(sVar, pVarL6);
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, hVar17, n0VarA12);
            f1.b.w(sVar, hVar18, q1VarL18);
            if (sVar.S) {
                ob.a.w(i16, sVar, i16, hVar);
            } else {
                ob.a.w(i16, sVar, i16, hVar);
            }
            f1.b.w(sVar, hVar19, pVarC114);
            nVar2.invoke(sVar, Integer.valueOf((i11 >> 3) & 14));
            sVar.p(true);
            sVar.p(true);
            boolValueOf = Boolean.valueOf(z11);
            if (!z11) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                g1.d(null, 1, 0L, sVar, 48);
            }
            aVar4 = aVar3;
        } else {
            if (i17 != 0) {
                z11 = true;
            }
            w0Var = n.f5051a;
            if (i12 != 0) {
                sVar.W(1849434622);
                objK3 = sVar.K();
                if (objK3 == w0Var) {
                    objK3 = new i0(14);
                    sVar.h0(objK3);
                }
                aVar3 = (h9.a) objK3;
                sVar.p(false);
            } else {
                aVar3 = aVar2;
            }
            r1.g gVar7 = r1.c.k;
            d0.d dVar7 = d0.h.f3570e;
            r1.p pVarJ7 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.f820a, 0.0f, g5.a.n(10, sVar), 1);
            sVar.W(1849434622);
            objK = sVar.K();
            if (objK == w0Var) {
                objK = ob.a.m(sVar);
            }
            b0.k kVar7 = (b0.k) objK;
            sVar.p(false);
            sVar.W(5004770);
            if ((i11 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            objK2 = sVar.K();
            if (z12) {
                objK2 = new l8.y(aVar3, 0);
                sVar.h0(objK2);
            } else {
                objK2 = new l8.y(aVar3, 0);
                sVar.h0(objK2);
            }
            sVar.p(false);
            r1.p pVarC115 = androidx.compose.foundation.a.c(pVarJ7, kVar7, null, false, (h9.a) objK2, 28);
            n0 n0VarA13 = d0.l0.a(dVar7, gVar7, sVar, 54);
            long j117 = sVar.T;
            i14 = (int) (j117 ^ (j117 >>> 32));
            q1 q1VarL19 = sVar.l();
            r1.p pVarC116 = r1.a.c(sVar, pVarC115);
            q2.j.f10719d0.getClass();
            a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            q2.h hVar110 = q2.i.f10708e;
            f1.b.w(sVar, hVar110, n0VarA13);
            q2.h hVar111 = q2.i.f10707d;
            f1.b.w(sVar, hVar111, q1VarL19);
            hVar = q2.i.f10709f;
            if (sVar.S) {
                ob.a.w(i14, sVar, i14, hVar);
            } else {
                ob.a.w(i14, sVar, i14, hVar);
            }
            q2.h hVar112 = q2.i.f10706c;
            f1.b.w(sVar, hVar112, pVarC116);
            if (1.0f <= 0.0d) {
                e0.a.a("invalid weight; must be greater than zero");
            }
            r1.p pVarK7 = androidx.compose.foundation.layout.a.k(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, g5.a.n(16, sVar), 0.0f, 11);
            d0.s sVarA7 = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
            long j118 = sVar.T;
            i15 = (int) (j118 ^ (j118 >>> 32));
            q1 q1VarL110 = sVar.l();
            r1.p pVarC117 = r1.a.c(sVar, pVarK7);
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, hVar110, sVarA7);
            f1.b.w(sVar, hVar111, q1VarL110);
            if (sVar.S) {
                ob.a.w(i15, sVar, i15, hVar);
            } else {
                ob.a.w(i15, sVar, i15, hVar);
            }
            f1.b.w(sVar, hVar112, pVarC117);
            nVar.invoke(sVar, Integer.valueOf(i11 & 14));
            sVar.p(true);
            d0.b bVar7 = d0.h.f3567b;
            r1.p pVarL7 = androidx.compose.foundation.layout.c.l(g5.a.n(100, sVar), 0.0f, 2);
            n0 n0VarA14 = d0.l0.a(bVar7, gVar7, sVar, 54);
            long j119 = sVar.T;
            i16 = (int) (j119 ^ (j119 >>> 32));
            q1 q1VarL111 = sVar.l();
            r1.p pVarC118 = r1.a.c(sVar, pVarL7);
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, hVar110, n0VarA14);
            f1.b.w(sVar, hVar111, q1VarL111);
            if (sVar.S) {
                ob.a.w(i16, sVar, i16, hVar);
            } else {
                ob.a.w(i16, sVar, i16, hVar);
            }
            f1.b.w(sVar, hVar112, pVarC118);
            nVar2.invoke(sVar, Integer.valueOf((i11 >> 3) & 14));
            sVar.p(true);
            sVar.p(true);
            boolValueOf = Boolean.valueOf(z11);
            if (!z11) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                g1.d(null, 1, 0L, sVar, 48);
            }
            aVar4 = aVar3;
        }
        z13 = z11;
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new l8.z(nVar, nVar2, z13, aVar4, i7, i10, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x006c, please report this as an issue */
    public static final void i(final List list, final j jVar, final j jVar2, boolean z10, final k kVar, s sVar, final int i7, final int i10) {
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        Object objK;
        w0 w0Var;
        Object objC;
        h1 h1Var;
        boolean z13;
        Object objK2;
        final boolean z14;
        w1 w1VarR;
        Object obj = jVar.f12831b;
        sVar.Y(1255268856);
        if ((i7 & 6) == 0) {
            i11 = (sVar.h(list) ? 4 : 2) | i7;
        } else {
            i11 = i7;
        }
        int i13 = i11 | (sVar.f(jVar) ? 32 : 16) | (sVar.f(jVar2) ? 256 : 128);
        int i14 = i10 & 8;
        if (i14 == 0) {
            if ((i7 & 3072) == 0) {
                z11 = z10;
                i13 |= sVar.g(z11) ? 2048 : 1024;
            }
            i12 = i13;
            if ((i12 & 9363) == 9362 || !sVar.z()) {
                if (i14 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                sVar.W(1849434622);
                objK = sVar.K();
                w0Var = n.f5051a;
                if (objK == w0Var) {
                    h1 h1Var2 = new h1(((Number) obj).intValue());
                    sVar.h0(h1Var2);
                    objK = h1Var2;
                }
                h1 h1Var3 = (h1) objK;
                objC = f.C(sVar, false, 1849434622);
                if (objC == w0Var) {
                    objC = new h1(((Number) obj).intValue());
                    sVar.h0(objC);
                }
                h1Var = (h1) objC;
                sVar.p(false);
                Integer numValueOf = Integer.valueOf(h1Var.f());
                sVar.W(-1746271574);
                z13 = (i12 & 112) == 32;
                objK2 = sVar.K();
                if (z13 || objK2 == w0Var) {
                    e0 e0Var = new e0(kVar, jVar, h1Var, null, 4);
                    sVar.h0(e0Var);
                    objK2 = e0Var;
                }
                sVar.p(false);
                f1.b.f(sVar, (h9.n) objK2, numValueOf);
                z14 = z12;
                h(n1.h.e(1893340833, new l8.b0(list, jVar2, h1Var3, h1Var), sVar), n1.h.e(2037750528, new l8.b0(jVar2, h1Var3, h1Var, list), sVar), z14, null, sVar, ((i12 >> 3) & 896) | 54, 8);
            } else {
                sVar.Q();
                z14 = z11;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new h9.n() { // from class: l8.a0
                    @Override // h9.n
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        a.a.i(list, jVar, jVar2, z14, kVar, (f1.s) obj2, f1.b.y(i7 | 1), i10);
                        return t8.z.f12851a;
                    }
                };
            }
        }
        i13 |= 3072;
        z11 = z10;
        i12 = i13;
        if ((i12 & 9363) == 9362) {
            if (i14 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            sVar.W(1849434622);
            objK = sVar.K();
            w0Var = n.f5051a;
            if (objK == w0Var) {
                h1 h1Var4 = new h1(((Number) obj).intValue());
                sVar.h0(h1Var4);
                objK = h1Var4;
            }
            h1 h1Var5 = (h1) objK;
            objC = f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = new h1(((Number) obj).intValue());
                sVar.h0(objC);
            }
            h1Var = (h1) objC;
            sVar.p(false);
            Integer numValueOf2 = Integer.valueOf(h1Var.f());
            sVar.W(-1746271574);
            if ((i12 & 112) == 32) {
            }
            objK2 = sVar.K();
            if (z13) {
                e0 e0Var2 = new e0(kVar, jVar, h1Var, null, 4);
                sVar.h0(e0Var2);
                objK2 = e0Var2;
            } else {
                e0 e0Var3 = new e0(kVar, jVar, h1Var, null, 4);
                sVar.h0(e0Var3);
                objK2 = e0Var3;
            }
            sVar.p(false);
            f1.b.f(sVar, (h9.n) objK2, numValueOf2);
            z14 = z12;
            h(n1.h.e(1893340833, new l8.b0(list, jVar2, h1Var5, h1Var), sVar), n1.h.e(2037750528, new l8.b0(jVar2, h1Var5, h1Var, list), sVar), z14, null, sVar, ((i12 >> 3) & 896) | 54, 8);
        } else {
            if (i14 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            sVar.W(1849434622);
            objK = sVar.K();
            w0Var = n.f5051a;
            if (objK == w0Var) {
                h1 h1Var6 = new h1(((Number) obj).intValue());
                sVar.h0(h1Var6);
                objK = h1Var6;
            }
            h1 h1Var7 = (h1) objK;
            objC = f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = new h1(((Number) obj).intValue());
                sVar.h0(objC);
            }
            h1Var = (h1) objC;
            sVar.p(false);
            Integer numValueOf3 = Integer.valueOf(h1Var.f());
            sVar.W(-1746271574);
            if ((i12 & 112) == 32) {
            }
            objK2 = sVar.K();
            if (z13) {
                e0 e0Var4 = new e0(kVar, jVar, h1Var, null, 4);
                sVar.h0(e0Var4);
                objK2 = e0Var4;
            } else {
                e0 e0Var5 = new e0(kVar, jVar, h1Var, null, 4);
                sVar.h0(e0Var5);
                objK2 = e0Var5;
            }
            sVar.p(false);
            f1.b.f(sVar, (h9.n) objK2, numValueOf3);
            z14 = z12;
            h(n1.h.e(1893340833, new l8.b0(list, jVar2, h1Var7, h1Var), sVar), n1.h.e(2037750528, new l8.b0(jVar2, h1Var7, h1Var, list), sVar), z14, null, sVar, ((i12 >> 3) & 896) | 54, 8);
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: l8.a0
                @Override // h9.n
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    a.a.i(list, jVar, jVar2, z14, kVar, (f1.s) obj2, f1.b.y(i7 | 1), i10);
                    return t8.z.f12851a;
                }
            };
        }
    }

    public static final Object[] j(Object[] objArr, int i7, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        u8.l.r0(objArr, objArr2, 0, i7, 6);
        u8.l.p0(objArr, objArr2, i7 + 2, i7, objArr.length);
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] k(Object[] objArr, int i7) {
        Object[] objArr2 = new Object[objArr.length - 2];
        u8.l.r0(objArr, objArr2, 0, i7, 6);
        u8.l.p0(objArr, objArr2, i7, i7 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] l(Object[] objArr, int i7) {
        Object[] objArr2 = new Object[objArr.length - 1];
        u8.l.r0(objArr, objArr2, 0, i7, 6);
        u8.l.p0(objArr, objArr2, i7, i7 + 1, objArr.length);
        return objArr2;
    }

    public static final void n(int i7, int i10) {
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(f.D(i7, i10, "index: ", ", size: "));
        }
    }

    public static final void o(int i7, int i10) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(f.D(i7, i10, "index: ", ", size: "));
        }
    }

    public static final void p(int i7, int i10, int i11) {
        if (i7 >= 0 && i10 <= i11) {
            if (i7 > i10) {
                throw new IllegalArgumentException(f.D(i7, i10, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i10 + ", size: " + i11);
    }

    public static da.a q(da.a aVar, x9.g gVar, da.o oVar, int i7) {
        if ((i7 & 2) != 0) {
            oVar = null;
        }
        l.e(aVar, "<this>");
        return new da.a((ja.a) aVar.f3847b, oVar != null ? new ja.e(aVar, gVar, oVar, 0) : (ja.f) aVar.f3848c, t8.a.c(t8.i.f12828b, new aa.j(5, aVar, gVar)));
    }

    public static final b1 r(b0.k kVar, s sVar, int i7) {
        Object objK = sVar.K();
        w0 w0Var = n.f5051a;
        if (objK == w0Var) {
            objK = f1.b.s(Boolean.FALSE);
            sVar.h0(objK);
        }
        b1 b1Var = (b1) objK;
        boolean z10 = (((i7 & 14) ^ 6) > 4 && sVar.f(kVar)) || (i7 & 6) == 4;
        Object objK2 = sVar.K();
        if (z10 || objK2 == w0Var) {
            objK2 = new b0.g(kVar, b1Var, null, 0);
            sVar.h0(objK2);
        }
        f1.b.f(sVar, (h9.n) objK2, kVar);
        return b1Var;
    }

    public static int s(int i7, int i10) {
        int i11 = i7 - i10;
        if (i11 > i10) {
            i11 = i10;
            i10 = i11;
        }
        int i12 = 1;
        int i13 = 1;
        while (i7 > i10) {
            i12 *= i7;
            if (i13 <= i11) {
                i12 /= i13;
                i13++;
            }
            i7--;
        }
        while (i13 <= i11) {
            i12 /= i13;
            i13++;
        }
        return i12;
    }

    public static final boolean t(x1.c cVar, float f10, float f11) {
        float f12 = cVar.f14523a;
        if (f10 > cVar.f14525c || f12 > f10) {
            return false;
        }
        return f11 <= cVar.f14526d && cVar.f14524b <= f11;
    }

    public static final long u(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT];
        int i7 = inputStream.read(bArr);
        long j5 = 0;
        while (i7 >= 0) {
            outputStream.write(bArr, 0, i7);
            j5 += (long) i7;
            i7 = inputStream.read(bArr);
        }
        return j5;
    }

    public static final da.a v(da.a aVar, y9.h hVar) {
        l.e(aVar, "<this>");
        l.e(hVar, "additionalAnnotations");
        if (hVar.isEmpty()) {
            return aVar;
        }
        return new da.a((ja.a) aVar.f3847b, (ja.f) aVar.f3848c, t8.a.c(t8.i.f12828b, new aa.j(6, aVar, hVar)));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    public static ca.c w(Class cls) throws InvocationTargetException {
        qa.b bVar;
        qa.d dVar;
        qa.a aVar;
        l.e(cls, "klass");
        qa.f fVar = new qa.f();
        fVar.f11014a = null;
        fVar.f11015b = null;
        fVar.f11016c = 0;
        fVar.f11017d = null;
        fVar.f11018e = null;
        fVar.f11019f = null;
        fVar.f11020g = null;
        fVar.f11021h = null;
        i9.b bVarH = l.h(cls.getDeclaredAnnotations());
        while (bVarH.hasNext()) {
            Annotation annotation = (Annotation) bVarH.next();
            l.b(annotation);
            Class clsL = g5.a.L(g5.a.G(annotation));
            wa.b bVarA = da.d.a(clsL);
            wa.c cVarA = bVarA.a();
            if (cVarA.equals(ga.y.f6126a)) {
                dVar = new qa.d(fVar, 0);
            } else if (cVarA.equals(ga.y.f6139o)) {
                dVar = new qa.d(fVar, 1);
            } else if (qa.f.f11012i || fVar.f11020g != null || (aVar = (qa.a) qa.f.f11013j.get(bVarA)) == null) {
                dVar = null;
            } else {
                fVar.f11020g = aVar;
                dVar = new qa.d(fVar, 2);
            }
            if (dVar != null) {
                k9.a.J(dVar, annotation, clsL);
            }
        }
        ta.e eVar = ta.e.f12885g;
        if (fVar.f11020g == null || fVar.f11014a == null) {
            bVar = null;
        } else {
            ta.e eVar2 = new ta.e(fVar.f11014a, (fVar.f11016c & 8) != 0);
            if (eVar2.b(eVar)) {
                qa.a aVar2 = fVar.f11020g;
                if ((aVar2 == qa.a.CLASS || aVar2 == qa.a.FILE_FACADE || aVar2 == qa.a.MULTIFILE_CLASS_PART) && fVar.f11017d == null) {
                    bVar = null;
                }
            } else {
                fVar.f11019f = fVar.f11017d;
                fVar.f11017d = null;
            }
            String[] strArr = fVar.f11021h;
            if (strArr != null) {
                va.a.a(strArr);
            }
            bVar = new qa.b(fVar.f11020g, eVar2, fVar.f11017d, fVar.f11019f, fVar.f11018e, fVar.f11015b, fVar.f11016c);
        }
        if (bVar == null) {
            return null;
        }
        return new ca.c(cls, bVar);
    }

    public static String y(ByteBuffer byteBuffer, int i7, int i10) throws com.google.protobuf.w0 {
        if ((i7 | i10 | ((byteBuffer.limit() - i7) - i10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i10)));
        }
        int i11 = i7 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i7 < i11) {
            byte b10 = byteBuffer.get(i7);
            if (b10 < 0) {
                break;
            }
            i7++;
            cArr[i12] = (char) b10;
            i12++;
        }
        int i13 = i12;
        while (i7 < i11) {
            int i14 = i7 + 1;
            byte b11 = byteBuffer.get(i7);
            if (b11 >= 0) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b11;
                while (i14 < i11) {
                    byte b12 = byteBuffer.get(i14);
                    if (b12 < 0) {
                        break;
                    }
                    i14++;
                    cArr[i15] = (char) b12;
                    i15++;
                }
                i13 = i15;
                i7 = i14;
            } else if (b11 < -32) {
                if (i14 >= i11) {
                    throw com.google.protobuf.w0.b();
                }
                i7 += 2;
                o9.e0.h(b11, byteBuffer.get(i14), cArr, i13);
                i13++;
            } else if (b11 < -16) {
                if (i14 >= i11 - 1) {
                    throw com.google.protobuf.w0.b();
                }
                int i16 = i7 + 2;
                i7 += 3;
                o9.e0.i(b11, byteBuffer.get(i14), byteBuffer.get(i16), cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw com.google.protobuf.w0.b();
                }
                byte b13 = byteBuffer.get(i14);
                int i17 = i7 + 3;
                byte b14 = byteBuffer.get(i7 + 2);
                i7 += 4;
                o9.e0.g(b11, b13, b14, byteBuffer.get(i17), cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    public abstract int B(String str, byte[] bArr, int i7, int i10);

    public boolean K(byte[] bArr, int i7, int i10) {
        return O(bArr, i7, i10) == 0;
    }

    public abstract int O(byte[] bArr, int i7, int i10);

    public void R() {
    }

    public abstract void U();

    public abstract void V();

    @Override // e4.s0
    public void a() {
    }

    @Override // e4.s0
    public void b() {
    }

    public boolean m() {
        return false;
    }

    public abstract String x(byte[] bArr, int i7, int i10);

    public abstract String z(ByteBuffer byteBuffer, int i7, int i10);
}
