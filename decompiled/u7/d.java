package u7;

import android.content.Context;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.q1;
import f1.x2;
import fc.h0;
import h9.k;
import i9.l;
import n3.j;
import q2.j0;
import r2.j1;
import r2.n0;
import t8.z;
import v.m;
import v.o;
import w0.d1;
import w0.t0;
import x.b1;
import x.c1;
import x.i;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13078a;

    public /* synthetic */ d(int i7) {
        this.f13078a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        Object value;
        h hVar;
        Object value2;
        h hVar2;
        Object value3;
        h hVar3;
        int i7 = this.f13078a;
        z zVar = z.f12851a;
        switch (i7) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                h0 h0Var = h.f13084n;
                h0 h0Var2 = h.f13084n;
                do {
                    value = h0Var2.getValue();
                    hVar = (h) value;
                    l.e(hVar, "$this$update");
                } while (!h0Var2.f(value, h.a(hVar, false, 0, null, 0, 0, iIntValue, null, null, 0, false, 0, 0, 0, 16351)));
                return zVar;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                h0 h0Var3 = h.f13084n;
                h0 h0Var4 = h.f13084n;
                do {
                    value2 = h0Var4.getValue();
                    hVar2 = (h) value2;
                    l.e(hVar2, "$this$update");
                } while (!h0Var4.f(value2, h.a(hVar2, false, 0, null, 0, 0, 0, null, null, 0, false, 0, iIntValue2, 0, 14335)));
                return zVar;
            case 2:
                int iIntValue3 = ((Integer) obj).intValue();
                h0 h0Var5 = h.f13084n;
                h0 h0Var6 = h.f13084n;
                do {
                    value3 = h0Var6.getValue();
                    hVar3 = (h) value3;
                    l.e(hVar3, "$this$update");
                } while (!h0Var6.f(value3, h.a(hVar3, false, 0, null, 0, 0, 0, null, null, 0, false, 0, 0, iIntValue3, 12287)));
                return zVar;
            case 3:
                return zVar;
            case 4:
                ((h9.a) obj).invoke();
                return zVar;
            case 5:
                return new v.l(((Float) obj).floatValue());
            case 6:
                return new v.l(((Integer) obj).intValue());
            case 7:
                return Integer.valueOf((int) ((v.l) obj).f13394a);
            case 8:
                return new v.l(((n3.f) obj).f8736a);
            case 9:
                return new n3.f(((v.l) obj).f13394a);
            case 10:
                n3.g gVar = (n3.g) obj;
                return new m(Float.intBitsToFloat((int) (gVar.f8737a >> 32)), Float.intBitsToFloat((int) (4294967295L & gVar.f8737a)));
            case 11:
                m mVar = (m) obj;
                return new n3.g((((long) Float.floatToRawIntBits(mVar.f13401a)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(mVar.f13402b))));
            case 12:
                x1.e eVar = (x1.e) obj;
                return new m(Float.intBitsToFloat((int) (eVar.f14535a >> 32)), Float.intBitsToFloat((int) (4294967295L & eVar.f14535a)));
            case 13:
                m mVar2 = (m) obj;
                return new x1.e((((long) Float.floatToRawIntBits(mVar2.f13401a)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(mVar2.f13402b))));
            case 14:
                x1.b bVar = (x1.b) obj;
                return new m(Float.intBitsToFloat((int) (bVar.f14521a >> 32)), Float.intBitsToFloat((int) (4294967295L & bVar.f14521a)));
            case 15:
                m mVar3 = (m) obj;
                return new x1.b((((long) Float.floatToRawIntBits(mVar3.f13401a)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(mVar3.f13402b))));
            case 16:
                long j5 = ((j) obj).f8739a;
                return new m((int) (j5 >> 32), (int) (4294967295L & j5));
            case 17:
                m mVar4 = (m) obj;
                return new j((((long) Math.round(mVar4.f13401a)) << 32) | (4294967295L & ((long) Math.round(mVar4.f13402b))));
            case 18:
                long j10 = ((n3.m) obj).f8746a;
                return new m((int) (j10 >> 32), (int) (4294967295L & j10));
            case 19:
                m mVar5 = (m) obj;
                int iRound = Math.round(mVar5.f13401a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(mVar5.f13402b);
                return new n3.m((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
            case 20:
                x1.c cVar = (x1.c) obj;
                return new o(cVar.f14523a, cVar.f14524b, cVar.f14525c, cVar.f14526d);
            case 21:
                o oVar = (o) obj;
                return new x1.c(oVar.f13417a, oVar.f13418b, oVar.f13419c, oVar.f13420d);
            case 22:
                return Float.valueOf(((v.l) obj).f13394a);
            case 23:
                x1.b bVar2 = (x1.b) obj;
                long j11 = bVar2.f14521a;
                return (9223372034707292159L & j11) != 9205357640488583168L ? new m(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (4294967295L & bVar2.f14521a))) : t0.f13935a;
            case 24:
                m mVar6 = (m) obj;
                return new x1.b((((long) Float.floatToRawIntBits(mVar6.f13401a)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(mVar6.f13402b))));
            case 25:
                return new d1(((Long) obj).longValue());
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                ((j0) obj).b();
                return zVar;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                return zVar;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                ((Long) obj).getClass();
                return zVar;
            default:
                int i10 = x.j.f14394a;
                x2 x2Var = n0.f11343b;
                n1.g gVar2 = (n1.g) ((q1) obj);
                gVar2.getClass();
                Context context = (Context) f1.b.t(gVar2, x2Var);
                n3.c cVar2 = (n3.c) f1.b.t(gVar2, j1.f11276h);
                b1 b1Var = (b1) f1.b.t(gVar2, c1.f14337a);
                if (b1Var == null) {
                    return null;
                }
                return new i(context, cVar2, b1Var.f14324a, b1Var.f14325b);
        }
    }
}
