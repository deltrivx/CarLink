package b0;

import a8.j1;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import b1.q;
import c1.i2;
import cc.a1;
import cc.y;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.muyetuge.carlifevehicle.service.AccessService;
import ec.u;
import f1.b1;
import f1.c2;
import f1.s1;
import fc.f0;
import k2.z;
import r2.e1;
import r2.p0;
import r2.v1;
import r2.x1;
import r3.v;
import w0.t1;
import z.w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(TextClassifier textClassifier, h9.n nVar, y8.c cVar) {
        super(2, cVar);
        this.f1110a = 20;
        this.f1112c = textClassifier;
        this.f1113d = (a9.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b1 b1Var, b1 b1Var2, y8.c cVar) {
        super(2, cVar);
        this.f1110a = 19;
        this.f1113d = b1Var;
        this.f1112c = b1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(h9.n nVar, y8.c cVar) {
        super(2, cVar);
        this.f1110a = 11;
        this.f1113d = (a9.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, y8.c cVar, int i7) {
        super(2, cVar);
        this.f1110a = i7;
        this.f1112c = obj;
        this.f1113d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, y8.c cVar, int i7) {
        super(2, cVar);
        this.f1110a = i7;
        this.f1113d = obj;
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [a9.i, h9.n] */
    /* JADX WARN: Type inference failed for: r1v41, types: [a9.i, h9.n] */
    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f1110a) {
            case 0:
                return new g((k) this.f1112c, (b1) this.f1113d, cVar, 0);
            case 1:
                g gVar = new g((b1.c) this.f1113d, cVar, 1);
                gVar.f1112c = obj;
                return gVar;
            case 2:
                return new g((q) this.f1112c, (v.j) this.f1113d, cVar, 2);
            case 3:
                g gVar2 = new g((i2) this.f1113d, cVar, 3);
                gVar2.f1112c = obj;
                return gVar2;
            case 4:
                return new g((i2) this.f1112c, (b1.f) this.f1113d, cVar, 4);
            case 5:
                return new g((fc.d) this.f1112c, (s1) this.f1113d, cVar, 5);
            case 6:
                g gVar3 = new g((a8.s1) this.f1113d, cVar, 6);
                gVar3.f1112c = obj;
                return gVar3;
            case 7:
                g gVar4 = new g((fc.e) this.f1113d, cVar, 7);
                gVar4.f1112c = obj;
                return gVar4;
            case 8:
                return new g((i0.e) this.f1112c, (j1) this.f1113d, cVar, 8);
            case 9:
                return new g((AccessService) this.f1112c, (String) this.f1113d, cVar, 9);
            case 10:
                return new g((z) this.f1112c, (t1) this.f1113d, cVar, 10);
            case 11:
                g gVar5 = new g((a9.i) this.f1113d, cVar);
                gVar5.f1112c = obj;
                return gVar5;
            case 12:
                g gVar6 = new g((p0) this.f1113d, cVar, 12);
                gVar6.f1112c = obj;
                return gVar6;
            case 13:
                return new g((c2) this.f1112c, (View) this.f1113d, cVar, 13);
            case 14:
                return new g((f0) this.f1112c, (x1) this.f1113d, cVar, 14);
            case 15:
                g gVar7 = new g((v) this.f1113d, cVar, 15);
                gVar7.f1112c = obj;
                return gVar7;
            case 16:
                return new g((u0.b) this.f1112c, (u0.k) this.f1113d, cVar, 16);
            case 17:
                return new g((a1) this.f1112c, (u0.g) this.f1113d, cVar, 17);
            case 18:
                return new g((u0.l) this.f1112c, (fc.i) this.f1113d, cVar, 18);
            case 19:
                return new g((b1) this.f1113d, (b1) this.f1112c, cVar);
            case 20:
                return new g((TextClassifier) this.f1112c, (h9.n) this.f1113d, cVar);
            case 21:
                return new g((e1) this.f1112c, (b3.h) this.f1113d, cVar, 21);
            case 22:
                return new g((k) this.f1112c, (h) this.f1113d, cVar, 22);
            case 23:
                return new g((k) this.f1112c, (i) this.f1113d, cVar, 23);
            case 24:
                return new g((x2.c) this.f1112c, (Runnable) this.f1113d, cVar, 24);
            case 25:
                g gVar8 = new g((ec.l) this.f1113d, cVar, 25);
                gVar8.f1112c = obj;
                return gVar8;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                g gVar9 = new g((w0) this.f1113d, cVar, 26);
                gVar9.f1112c = obj;
                return gVar9;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                return new g((z.t1) this.f1112c, (h9.n) this.f1113d, cVar, 27);
            default:
                return new g((a1) this.f1112c, (z.a1) this.f1113d, cVar, 28);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f1110a) {
            case 0:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 1:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 2:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 3:
                return ((g) create((z) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 4:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 5:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 6:
                return ((g) create((u) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 7:
                return ((g) create(obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 8:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 9:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 10:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 11:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 12:
                ((g) create((v1) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 13:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 14:
                ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 15:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 16:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 17:
                ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 18:
                ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 19:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 20:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 21:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 22:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 23:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 24:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 25:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            default:
                return ((g) create((y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:224:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:226:0x03be  */
    /* JADX WARN: Code duplicated, block: B:231:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:233:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:447:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26, types: [a9.i, h9.n] */
    /* JADX WARN: Type inference failed for: r2v46, types: [a9.i, h9.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0265 -> B:152:0x0268). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x031b -> B:194:0x031e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:227:0x03cc -> B:229:0x03cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e2 -> B:46:0x00a3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
