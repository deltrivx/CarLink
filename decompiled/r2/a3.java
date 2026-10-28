package r2;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f11158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f11159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f11161h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(ec.l lVar, v.c cVar, f1.b1 b1Var, f1.b1 b1Var2, y8.c cVar2) {
        super(2, cVar2);
        this.f11154a = 1;
        this.f11158e = lVar;
        this.f11159f = cVar;
        this.f11160g = b1Var;
        this.f11161h = b1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, y8.c cVar, int i7) {
        super(2, cVar);
        this.f11154a = i7;
        this.f11157d = obj;
        this.f11158e = obj2;
        this.f11159f = obj3;
        this.f11160g = obj4;
        this.f11161h = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a3(v.c0 c0Var, h9.k kVar, y8.c cVar) {
        super(2, cVar);
        this.f11154a = 2;
        this.f11160g = c0Var;
        this.f11161h = (a9.i) kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a3(x.z0 z0Var, h9.k kVar, y8.c cVar) {
        super(2, cVar);
        this.f11154a = 3;
        this.f11160g = z0Var;
        this.f11161h = (a9.i) kVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [a9.i, h9.k] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a9.i, h9.k] */
    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f11154a) {
            case 0:
                a3 a3Var = new a3((i9.x) this.f11157d, (f1.c2) this.f11158e, (androidx.lifecycle.t) this.f11159f, (b3) this.f11160g, (View) this.f11161h, cVar, 0);
                a3Var.f11156c = obj;
                return a3Var;
            case 1:
                a3 a3Var2 = new a3((ec.l) this.f11158e, (v.c) this.f11159f, (f1.b1) this.f11160g, (f1.b1) this.f11161h, cVar);
                a3Var2.f11156c = obj;
                return a3Var2;
            case 2:
                a3 a3Var3 = new a3((v.c0) this.f11160g, (h9.k) this.f11161h, cVar);
                a3Var3.f11159f = obj;
                return a3Var3;
            case 3:
                a3 a3Var4 = new a3((x.z0) this.f11160g, (h9.k) this.f11161h, cVar);
                a3Var4.f11159f = obj;
                return a3Var4;
            default:
                a3 a3Var5 = new a3((k2.z) this.f11157d, (h9.o) this.f11158e, (h9.k) this.f11159f, (h9.k) this.f11160g, (h9.k) this.f11161h, cVar, 4);
                a3Var5.f11156c = obj;
                return a3Var5;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f11154a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((a3) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:126:0x025c  */
    /* JADX WARN: Code duplicated, block: B:128:0x026a  */
    /* JADX WARN: Code duplicated, block: B:129:0x026c  */
    /* JADX WARN: Code duplicated, block: B:163:0x032a  */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [h9.k] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [h9.k] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0251 -> B:124:0x0254). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.a3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
