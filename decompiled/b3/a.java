package b3;

import android.content.Context;
import android.graphics.RectF;
import cc.a1;
import cc.h1;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.c2;
import f1.e2;
import f1.w1;
import f1.x1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import l0.b1;
import w0.d1;
import w0.f1;
import w0.t1;
import w0.w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1305b;

    public /* synthetic */ a(int i7, int i10, Object obj) {
        this.f1304a = i10;
        this.f1305b = obj;
    }

    public /* synthetic */ a(int i7, Object obj) {
        this.f1304a = i7;
        this.f1305b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:183:0x0452 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0454 A[Catch: all -> 0x0446, LOOP:7: B:167:0x0417->B:184:0x0454, LOOP_END, TryCatch #0 {all -> 0x0446, blocks: (B:160:0x03f4, B:162:0x0404, B:164:0x040a, B:167:0x0417, B:169:0x0423, B:171:0x042d, B:173:0x0433, B:175:0x043c, B:180:0x0448, B:181:0x044b, B:184:0x0454, B:194:0x047a, B:185:0x0458, B:186:0x045e, B:188:0x0464, B:190:0x046c, B:193:0x0476), top: B:247:0x03f4 }] */
    /* JADX WARN: Code duplicated, block: B:279:0x047a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x02ac  */
    /* JADX WARN: Instruction removed from duplicated block: B:107:0x02c7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        boolean zG;
        o1.f fVar;
        Collection collectionX0;
        Object objB = null;
        char c10 = 7;
        switch (this.f1304a) {
            case 0:
                l0 l0Var = (l0) this.f1305b;
                x1.c cVarF = y1.h0.F((RectF) obj);
                x1.c cVarF2 = y1.h0.F((RectF) obj2);
                switch (l0Var.f1388a) {
                    case 0:
                        zG = cVarF.g(cVarF2);
                        break;
                    default:
                        long jB = cVarF.b();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L));
                        zG = (fIntBitsToFloat < cVarF2.f14525c ? 1 : 0) & (fIntBitsToFloat >= cVarF2.f14523a ? 1 : 0) & (fIntBitsToFloat2 >= cVarF2.f14524b ? 1 : 0) & (fIntBitsToFloat2 < cVarF2.f14526d ? 1 : 0);
                        break;
                }
                return Boolean.valueOf(zG);
            case 1:
                ((Integer) obj2).getClass();
                ((c8.d) this.f1305b).b(f1.b.y(1), (f1.s) obj);
                return t8.z.f12851a;
            case 2:
                ((Integer) obj2).getClass();
                d0.m.a((r1.p) this.f1305b, (f1.s) obj, f1.b.y(1));
                return t8.z.f12851a;
            case 3:
                return new n3.j((((long) 0) & 4294967295L) | (((long) ((r1.f) this.f1305b).a(0, (int) (((n3.m) obj).f8746a >> 32), (n3.o) obj2)) << 32));
            case 4:
                return new n3.j((((long) 0) << 32) | (((long) ((r1.g) this.f1305b).a(0, (int) (((n3.m) obj).f8746a & 4294967295L))) & 4294967295L));
            case 5:
                return new n3.j(((r1.d) this.f1305b).a(0L, ((n3.m) obj).f8746a, (n3.o) obj2));
            case 6:
                n1.i iVar = (n1.i) this.f1305b;
                ((Integer) obj).getClass();
                if (obj2 instanceof f1.j) {
                    f1.j jVar = (f1.j) obj2;
                    s.i0 i0Var = iVar.f8722h;
                    if (i0Var == null) {
                        s.i0 i0Var2 = s.p0.f12478a;
                        i0Var = new s.i0();
                        iVar.f8722h = i0Var;
                    }
                    i0Var.j(jVar);
                    iVar.f8720f.b(jVar);
                }
                if (obj2 instanceof e2) {
                    iVar.e((e2) obj2);
                }
                if (obj2 instanceof w1) {
                    ((w1) obj2).d();
                }
                return t8.z.f12851a;
            case 7:
                c2 c2Var = (c2) this.f1305b;
                Set set = (Set) obj;
                synchronized (c2Var.f4904b) {
                    try {
                        if (((x1) c2Var.f4921t.getValue()).compareTo(x1.f5201e) >= 0) {
                            s.i0 i0Var3 = c2Var.f4909g;
                            if (set instanceof h1.h) {
                                s.i0 i0Var4 = ((h1.h) set).f6434a;
                                Object[] objArr = i0Var4.f12445b;
                                long[] jArr = i0Var4.f12444a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j5 = jArr[i7];
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i7 - length)) >>> 31);
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                if ((j5 & 255) < 128) {
                                                    Object obj3 = objArr[(i7 << 3) + i11];
                                                    if (!(obj3 instanceof p1.a0) || ((p1.a0) obj3).b(1)) {
                                                        i0Var3.a(obj3);
                                                    }
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i10 == 8) {
                                                if (i7 != length) {
                                                    i7++;
                                                }
                                            }
                                        } else if (i7 != length) {
                                            i7++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof p1.a0) || ((p1.a0) obj4).b(1)) {
                                        i0Var3.a(obj4);
                                    }
                                }
                            }
                            objB = c2Var.B();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (objB != null) {
                    ((cc.l) objB).resumeWith(t8.z.f12851a);
                }
                return t8.z.f12851a;
            case 8:
                ec.h hVar = (ec.h) this.f1305b;
                Set set2 = (Set) obj;
                if (set2 instanceof h1.h) {
                    s.i0 i0Var5 = ((h1.h) set2).f6434a;
                    Object[] objArr2 = i0Var5.f12445b;
                    long[] jArr2 = i0Var5.f12444a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j10 = jArr2[i12];
                            if ((((~j10) << c10) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                int i14 = 0;
                                while (true) {
                                    if (i14 < i13) {
                                        if ((j10 & 255) < 128) {
                                            Object obj5 = objArr2[(i12 << 3) + i14];
                                            if (!(obj5 instanceof p1.a0) || ((p1.a0) obj5).b(4)) {
                                            }
                                        }
                                        j10 >>= 8;
                                        i14++;
                                    } else if (i13 == 8) {
                                    }
                                }
                            }
                            if (i12 != length2) {
                                i12++;
                                c10 = 7;
                            }
                        }
                        hVar.x(set2);
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj6 : set3) {
                            if (!(obj6 instanceof p1.a0) || ((p1.a0) obj6).b(4)) {
                                hVar.x(set2);
                            }
                        }
                    }
                }
                return t8.z.f12851a;
            case 9:
                ((Integer) obj2).getClass();
                ((f8.e) this.f1305b).b(f1.b.y(1), (f1.s) obj);
                return t8.z.f12851a;
            case 10:
                ((Integer) obj2).getClass();
                ((f8.i) this.f1305b).d(f1.b.y(9), (f1.s) obj);
                return t8.z.f12851a;
            case 11:
                ((Integer) obj2).getClass();
                ((g8.d) this.f1305b).a(f1.b.y(7), (f1.s) obj);
                return t8.z.f12851a;
            case 12:
                gc.u uVar = (gc.u) this.f1305b;
                int iIntValue = ((Integer) obj).intValue();
                y8.f fVar2 = (y8.f) obj2;
                y8.g key = fVar2.getKey();
                y8.f fVarL = uVar.f6268b.l(key);
                if (key == cc.v.f2678b) {
                    a1 a1Var = (a1) fVarL;
                    a1 parent = (a1) fVar2;
                    while (parent != null) {
                        if (parent != a1Var && (parent instanceof hc.p)) {
                            cc.o oVar = (cc.o) h1.f2629b.get((hc.p) parent);
                            parent = oVar != null ? oVar.getParent() : null;
                        } else {
                            objB = parent;
                            if (objB == a1Var) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + objB + ", expected child of " + a1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (a1Var != null) {
                                iIntValue++;
                            }
                        }
                    }
                    if (objB == a1Var) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + objB + ", expected child of " + a1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (a1Var != null) {
                        iIntValue++;
                    }
                } else if (fVar2 != fVarL) {
                    iIntValue = Integer.MIN_VALUE;
                } else {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
            case 13:
                ((Integer) obj2).getClass();
                h0.z.c((n1.c) this.f1305b, (f1.s) obj, f1.b.y(7));
                return t8.z.f12851a;
            case 14:
                Long l10 = (Long) obj2;
                if (f1.a((d1) this.f1305b, l10.longValue())) {
                    return l10;
                }
                return null;
            case 15:
                ((Integer) obj2).getClass();
                l0.q0.h((t1) this.f1305b, (f1.s) obj, f1.b.y(1));
                return t8.z.f12851a;
            case 16:
                ((b1) this.f1305b).e(((x1.b) obj2).f14521a);
                return t8.z.f12851a;
            case 17:
                ((Integer) obj2).getClass();
                ((m7.b) this.f1305b).i(f1.b.y(1), (f1.s) obj);
                return t8.z.f12851a;
            case 18:
                o1.a aVar = (o1.a) obj;
                List list = (List) ((h9.n) this.f1305b).invoke(aVar, obj2);
                int size = list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    Object obj7 = list.get(i15);
                    if (obj7 != null && (fVar = aVar.f9264b) != null && !fVar.a(obj7)) {
                        throw new IllegalArgumentException(("item at index " + i15 + " can't be saved: " + obj7).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 19:
                p1.u uVar2 = (p1.u) this.f1305b;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = uVar2.f10089b;
                while (true) {
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        collectionX0 = collection;
                    } else if (obj8 instanceof Set) {
                        collectionX0 = n3.l.J(obj8, collection);
                    } else {
                        if (!(obj8 instanceof List)) {
                            f1.t.d("Unexpected notification");
                            throw new cc.s();
                        }
                        collectionX0 = u8.p.x0(n3.l.I(collection), (Collection) obj8);
                    }
                    do {
                        if (atomicReference.compareAndSet(obj8, collectionX0)) {
                            if (uVar2.b()) {
                                uVar2.f10088a.invoke(new a5.e(19, uVar2));
                            }
                            return t8.z.f12851a;
                        }
                    } while (atomicReference.get() == obj8);
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((p7.c) this.f1305b).i(f1.b.y(1), (f1.s) obj);
                return t8.z.f12851a;
            case 21:
                ((Integer) obj2).getClass();
                ((r7.a) this.f1305b).c(f1.b.y(1), (f1.s) obj);
                return t8.z.f12851a;
            case 22:
                ((Integer) obj2).getClass();
                ((v7.c) this.f1305b).a(f1.b.y(7), (f1.s) obj);
                return t8.z.f12851a;
            case 23:
                ((Integer) obj2).getClass();
                ((v7.d) this.f1305b).c(f1.b.y(1), (f1.s) obj);
                return t8.z.f12851a;
            case 24:
                w0 w0Var = (w0) this.f1305b;
                n0.a aVar2 = (n0.a) obj;
                Context context = (Context) obj2;
                t8.j jVarE = w0Var.e();
                w0.v.a(aVar2, context, false, jVarE != null ? (h) jVarE.f12830a : null, jVarE != null ? (q0) jVarE.f12831b : null, w0Var.f14000w, new c8.p(21, w0Var, context));
                return t8.z.f12851a;
            case 25:
                o2.w wVar = (o2.w) this.f1305b;
                o2.w wVarC = ((w0.p) obj).c();
                o2.w wVarC2 = ((w0.p) obj2).c();
                long jN = wVarC != null ? wVar.n(wVarC, 0L) : 0L;
                long jN2 = wVarC2 != null ? wVar.n(wVarC2, 0L) : 0L;
                int i16 = (int) (jN & 4294967295L);
                int i17 = (int) (jN2 & 4294967295L);
                return Integer.valueOf(Float.intBitsToFloat(i16) == Float.intBitsToFloat(i17) ? n3.n.X(Float.valueOf(Float.intBitsToFloat((int) (jN >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jN2 >> 32)))) : n3.n.X(Float.valueOf(Float.intBitsToFloat(i16)), Float.valueOf(Float.intBitsToFloat(i17))));
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                ((Integer) obj2).getClass();
                ((w7.c) this.f1305b).b(f1.b.y(1), (f1.s) obj);
                return t8.z.f12851a;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                ((Integer) obj2).getClass();
                ((w7.f) this.f1305b).d(f1.b.y(7), (f1.s) obj);
                return t8.z.f12851a;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                ((Integer) obj2).getClass();
                ((x7.c) this.f1305b).i(f1.b.y(1), (f1.s) obj);
                return t8.z.f12851a;
            default:
                ((Integer) obj2).getClass();
                ((x7.f) this.f1305b).a(f1.b.y(1), (f1.s) obj);
                return t8.z.f12851a;
        }
    }
}
