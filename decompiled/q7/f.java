package q7;

import g7.l;
import h9.n;
import i9.t;
import i9.w;
import k2.l0;
import l0.b1;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a9.h implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10973g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, y8.c cVar, int i7) {
        super(2, cVar);
        this.f10968b = i7;
        this.f10971e = obj;
        this.f10972f = obj2;
        this.f10973g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t0.a aVar, y8.c cVar) {
        super(2, cVar);
        this.f10968b = 1;
        this.f10973g = aVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f10968b) {
            case 0:
                f fVar = new f((t) this.f10971e, (w) this.f10972f, (h9.a) this.f10973g, cVar, 0);
                fVar.f10970d = obj;
                return fVar;
            case 1:
                f fVar2 = new f((t0.a) this.f10973g, cVar);
                fVar2.f10970d = obj;
                return fVar2;
            default:
                f fVar3 = new f((w0.n) this.f10971e, (l) this.f10972f, (b1) this.f10973g, cVar, 2);
                fVar3.f10970d = obj;
                return fVar3;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f10968b) {
            case 0:
                ((f) create(l0Var, cVar)).invokeSuspend(z.f12851a);
                return z8.a.f15774a;
            case 1:
                return ((f) create(l0Var, cVar)).invokeSuspend(z.f12851a);
            default:
                return ((f) create(l0Var, cVar)).invokeSuspend(z.f12851a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:205:0x035a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:208:0x0362  */
    /* JADX WARN: Code duplicated, block: B:211:0x036a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0375  */
    /* JADX WARN: Code duplicated, block: B:223:0x038f  */
    /* JADX WARN: Code duplicated, block: B:227:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:230:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:276:0x037f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x036f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x02e3 -> B:178:0x02e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:204:0x0358 -> B:206:0x035b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0160 -> B:75:0x0163). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:223:0x038f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
