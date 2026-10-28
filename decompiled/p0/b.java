package p0;

import a9.h;
import h9.k;
import h9.n;
import k2.l0;
import t8.z;
import y8.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, c cVar, int i7) {
        super(2, cVar);
        this.f9995b = i7;
        this.f9998e = obj;
    }

    @Override // a9.a
    public final c create(Object obj, c cVar) {
        switch (this.f9995b) {
            case 0:
                b bVar = new b((k) this.f9998e, cVar, 0);
                bVar.f9997d = obj;
                return bVar;
            case 1:
                b bVar2 = new b((k) this.f9998e, cVar, 1);
                bVar2.f9997d = obj;
                return bVar2;
            default:
                b bVar3 = new b((x.h) this.f9998e, cVar, 2);
                bVar3.f9997d = obj;
                return bVar3;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        c cVar = (c) obj2;
        switch (this.f9995b) {
            case 0:
                return ((b) create(l0Var, cVar)).invokeSuspend(z.f12851a);
            case 1:
                ((b) create(l0Var, cVar)).invokeSuspend(z.f12851a);
                return z8.a.f15774a;
            default:
                return ((b) create(l0Var, cVar)).invokeSuspend(z.f12851a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00e5 -> B:51:0x00e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x00ba
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
